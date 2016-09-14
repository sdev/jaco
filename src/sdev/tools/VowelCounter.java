/**
 * 
 */
package sdev.tools;
import java.io.*;

/**
 * @author sdev
 *
 */
public class VowelCounter {
	private int _srcCode = 0;
	private String _s = null;
	private File _fhdr = null;
	
	public VowelCounter(int srcCode, File file){
		this._srcCode = srcCode;
		this._s = null;
		this._fhdr = file;
	}
	
	public VowelCounter(int srcCode, String s){
		this._srcCode = srcCode;
		this._s = s;
		this._fhdr = null;		
	}

	// Calculate Number of vowels
	public int getStat(){
		int vowelCount = 0;
		
		if (this._srcCode == 1 && this._s != null && this._fhdr == null){
			return count(this._s);
		}
		else if(this._srcCode == 2 && this._fhdr != null && this._s == null) {
			try {
				BufferedReader in = new BufferedReader(
						new FileReader(this._fhdr));
				String line = in.readLine();
				while (line != null){
					vowelCount += count(line);
					line = in.readLine();
				}
				in.close();
			}
			catch (FileNotFoundException e) {
				System.out.println("File Not Found");
			}
			catch (IOException e){
				System.out.println(e);
			}
				return vowelCount;
			}
		
		return 1;
	}

	private int count(String s){
		int vowelCount = 0;
		
		for (int i = 0; i < s.length(); i++){
			char c = s.charAt(i);
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