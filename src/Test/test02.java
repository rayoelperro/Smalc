package Test;

import java.io.IOException;

import smalc.IO.*;
import smalc.System.Console;

public class test02 {
	public static void main(String[] args){
		try {
			FileWriter f = new FileWriter("c:\\Users\\Usuario\\Desktop\\prueba.txt");
			f.write("Acuna patata");
			f.flush();
			f.close();
			FileReader r = new FileReader("c:\\Users\\Usuario\\Desktop\\prueba.txt");
			Console.WriteLn(r.readToEnd());
			r.close();
			Console.WriteLn("Fin");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
