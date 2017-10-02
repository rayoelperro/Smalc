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
	
	public String readToEnd() throws IOException{
		String total = "";
		String ln = "";
		@SuppressWarnings("resource")
		BufferedReader r = this;
		while((ln = r.readLine()) != null){
			total += ln + "\n";
		}
		return total;
	}
}
