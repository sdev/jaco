/**
 * 
 */
package sdev.tools;
import java.io.*;
import java.util.ArrayList;

/**
 * @author superuser
 *
 */
public class Abbreviator {
	String[] seps = {"!", "@", "#", "$", "%", "^", "&", "*", "(",
	              ")", "-", "+", "_", "=", "~", "`", ":", ";"};
	              //"\"","'", ",", ".", "<", ">", "?", "/", "|",
	              //"\\"};
	
	public String abbreviate(String str) {
	// ...
		StringBuilder abbrStr = new StringBuilder("");

		ArrayList<String> strs = new ArrayList<String>();	
	
		strs.add(str);
		

		return abbrStr.toString();
	}
	
	public int wordSize(StringBuilder strbld){
	return strbld.length();
	}
}
