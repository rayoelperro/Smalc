package smalc.System;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Console {
	
	public static String Write(Object texto){
		System.out.print(texto);
		return texto.toString();
	}
	
	public static String WriteLn(Object texto){
		System.out.println(texto);
		return texto.toString();
	}
	
	public static void Close(){
		System.out.close();
	}
	
	public static Types Read() throws IOException{
		InputStreamReader st = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(st);
		return new Types(bf.readLine());
	}
	
	public static String Error(Object texto){
		System.err.print(texto);
		return texto.toString();
	}
	
	public static String ErrorLn(Object texto){
		System.err.println(texto);
		return texto.toString();
	}
	
}
