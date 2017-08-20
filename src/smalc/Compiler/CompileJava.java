package smalc.Compiler;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

import smalc.System.Console;

public class CompileJava {
	
	private String path;
	private String name;
	private String libraries;
	
	public CompileJava(String path, String name, String libraries){
		this.path = path;
		this.name = name;
		this.libraries = libraries;
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		String[] args = {"-cp", libraries, path + name};
		int result = compiler.run(System.in, System.out, System.err, args);
		if(result == 0){
			Console.WriteLn("Se compilo");
		}
	}
	
	public CompileJava(String path, String name){
		this.path = path;
		this.name = name;
		this.libraries = "";
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		String[] args = {path + name};
		int result = compiler.run(System.in, System.out, System.err, args);
		if(result == 0){
			Console.WriteLn("Se compilo");
		}
	}
	
	public String GetFile(){
		return name.substring(0, name.length() - 5);
	}
	
	public String GetPath(){
		return path;
	}
	
	public String GetLibraries(){
		return libraries;
	}
	
}
