package smalc.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReader extends InputReader {
	public FileReader(String ruta) throws IOException {
		super(new FileInputStream(new File(ruta)));
	}
}
