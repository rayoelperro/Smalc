package smalc.Compiler;

import java.io.IOException;
import smalc.IO.*;

public class RunJava {
	private String comando;
	
	public RunJava(CompileJava compiler, boolean GotLibraries){
		if(GotLibraries){
			this.comando = "java -cp " + compiler.GetLibraries() + ";" + compiler.GetPath() + " " + compiler.GetFile();
			Exec();
		}else{
			this.comando = "java -cp " + compiler.GetPath() + " " + compiler.GetFile();
			Exec();
		}
	}
	
	public RunJava(CompileJava compiler, boolean GotLibraries, String args){
		if(GotLibraries){
			this.comando = "java -cp " + compiler.GetLibraries() + ";" + compiler.GetPath() + " " + compiler.GetFile() + " " + args;
			Exec();
		}else{
			this.comando = "java -cp " + compiler.GetPath() + " " + compiler.GetFile() + " " + args;
			Exec();
		}
	}
	
	@SuppressWarnings("resource")
	public void Exec(){
		try {
			Process p = Runtime.getRuntime().exec(comando);
			System.out.println(new InputReader(p.getInputStream()).readToEnd());
			System.out.println("Se ejecuto");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
