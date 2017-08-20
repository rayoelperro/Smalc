package smalc.IO;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class OutputWriter extends BufferedWriter {
	
	public OutputStream os;
	public OutputStreamWriter osr;
	
	public OutputWriter(OutputStream os){
		super(new OutputStreamWriter(os));
		this.os = os;
		osr = new OutputStreamWriter(os);
	}
	
}
