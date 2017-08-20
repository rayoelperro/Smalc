package Test;

import smalc.Compiler.CompileJava;
import smalc.Compiler.RunJava;
import smalc.System.Console;

public class test01 {
	public static void main(String[] args){
		try {
			CompileJava jc = new CompileJava(Console.Read().GetString(), Console.Read().GetString(), Console.Read().GetString());
			new RunJava(jc, true, Console.Read().GetString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
