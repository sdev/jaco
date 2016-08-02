/**
 * 
 */
package sdev.tools;

import java.util.Scanner;

/**
 * @author sdev
 *
 */
public class VowelCounter {
	private int _srcCode = 0;
	private String _s = null;
	
	public VowelCounter(int srcCode){
		this._srcCode = srcCode;
	}
	
	public VowelCounter(int srcCode, String s){
		
	}
	
	public void getSource(){
		switch(_srcCode) {
			case 1:
				Scanner sc = new Scanner(System.in);
				this._s = sc.nextLine();
				break;
			case 2:
				break;
			case 3:
				break; 
		}
	}
	
	public int getStat(){
		int vowelCount = 0;
		
		for (int i = 0; i < this._s.length(); i++){
			char c = this._s.charAt(i);
			if ((c == 'A') || (c == 'a') ||
					(c == 'E') || (c == 'e') ||
					(c == 'I') || (c == 'i') ||
					(c == 'O') || (c == 'o') ||
					(c == 'U') || (c == 'u') ) {
				vowelCount++;
			}
		}
		return vowelCount;
	}
}
