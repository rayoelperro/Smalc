package smalc.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputReader extends BufferedReader {
	
	public InputStream is;
	public InputStreamReader isr;
	
	public InputReader(InputStream is){
		super(new InputStreamReader(is));
		this.is = is;
		isr = new InputStreamReader(is);
	}
	
	public String readToEnd(){
		String total = "";
		String ln = "";
		BufferedReader r = this;
		try {
			while((ln = r.readLine()) != null){
				total += ln + "\n";
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return total;
	}
}
