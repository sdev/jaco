/**
 * 
 */
package sdev.tools;

import java.io.*;
import java.util.regex.*;
import java.util.regex.PatternSyntaxException;

import sdev.pattern.Singleton;

/**	
 * @author superuser
 *
 */
public class FindIn extends Singleton{
	
	private static FindIn instance = null;
	
	public static FindIn getInstance(){
		if (instance == null) {
			instance = new FindIn();
			System.out.println("Created FindIn Singleton Object");
		}
		return instance;
	}
	
	public void searchInString(String sourceStr, String subStr){
		Pattern pat = this.getPattern(subStr);
		if (pat != null){
			Matcher mat = this.getMatcher(sourceStr, pat);
			while (mat.find()){
				System.out.println(sourceStr.substring(mat.start() - 1 , mat.start() + subStr.length() + 1));
			}
		}
	}
	
	public void searchInFile(File file, String subStr){
		try{
			BufferedReader in = new BufferedReader(new FileReader(file));
			String line = in.readLine();
		
		
			while(line != null){
				searchInString(line, subStr);
				line = in.readLine();
			}
			in.close();
		}
		catch (IOException e){
			System.out.println("IOException");
		}
	}
	
	private Matcher getMatcher(String sourceStr, Pattern pat){
		return pat.matcher(sourceStr);
	}
	
	private Pattern getPattern(String regExp){
		try {
			return Pattern.compile(regExp);
		}
		catch (PatternSyntaxException e) {
			System.out.println("Incorrect Pattern Syntax");
			return null;
		}
	}
	
}
