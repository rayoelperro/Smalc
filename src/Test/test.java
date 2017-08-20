package Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import smalc.System.*;
import smalc.IO.*;

public class test {

	public static void main(String[] args) {
		Console.Write("Di una ruta: ");
		String st = null;
		try {
			st = Console.Read().GetString();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		OutputWriter ir = null;
		try {
			ir = new OutputWriter(new FileOutputStream(new File(st)));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			ir.write("Ahí como el agua\nprueba");
			ir.flush();
			ir.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
