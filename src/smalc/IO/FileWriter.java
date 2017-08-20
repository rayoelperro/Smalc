package smalc.IO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriter extends OutputWriter {
	public FileWriter(String ruta) throws IOException {
		super(new FileOutputStream(new File(ruta)));
	}
}
