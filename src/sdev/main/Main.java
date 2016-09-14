package sdev.main;

import sdev.pattern.*;
import sdev.tools.*;

import java.io.*;

import java.util.*;

public class Main {
	public static void main(String[] args) {

		/*
		Singleton i1 = Singleton.getInstance();
		Singleton i2 = Singleton.getInstance();
		if (i1 == i2) {
			System.out.println("I am a duplicate");
		}
		
		PrintObjectClassInfo.printClassName(i1);
		PrintObjectClassInfo.printClassName(i2);
		PrintObjectClassInfo.printSimpleClassName(i1);
		PrintObjectClassInfo.printClassCanonicalName(i1);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = scanner.nextLine();
		VowelCounter vcStr = new VowelCounter(1, str);
		System.out.println("# of Voewls: " + vcStr.getStat());

		
		String fileName = "test_chenlong.txt";
		//System.out.println(fname);
		
		try {
			File fileHandler = new File(fileName);
			fileHandler.createNewFile();
			PrintWriter out = new PrintWriter(
					new BufferedWriter(
							new FileWriter(fileHandler)));
			System.out.print("Enter a string: ");
			String line = scanner.nextLine();
			System.out.println(line);
			out.println(line);
			out.flush();
		
			VowelCounter vcFile = new VowelCounter(2, fileHandler);
			System.out.println("# of Vowels: " + vcFile.getStat());
			out.close();
		}
		catch (FileNotFoundException e){
			System.out.println("File Not Found");
		}
		catch(IOException e){
			System.out.println(e);
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		scanner.close();
	*/
		
		
		//Show Case of FindIn
		FindIn fi = FindIn.getInstance();
		String sourceStr = "what is abchellode world! ()hello+ world!";
		String subStr = "hello";
		
		fi.searchInString(sourceStr, subStr);
		subStr = "worl";
		fi.searchInString(sourceStr, subStr);

		
		
		String fileName1 = "test_RegExp.txt";
		
		try {
			File file = new File(fileName1);
			PrintWriter wOut = new PrintWriter(
					new BufferedWriter(
							new FileWriter(file)));

			BufferedReader rIn = new BufferedReader(new FileReader(new File("test_chenlong.txt")));
			String rLine = rIn.readLine();
			while(rLine != null){
				wOut.println(rLine);
				rLine = rIn.readLine();
			}
			wOut.flush();
			wOut.close();
			
			fi.searchInFile(file, "test_");
		}
		catch (IOException e) {
			System.out.println("IOException");
		}
	}

}
