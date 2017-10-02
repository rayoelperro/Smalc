package smalc.Tests;

import smalc.System.Delegate;
import smalc.System.Mthread;

public class Mthreadtry {

	public static void main(String[] args) {
		Delegate del = new Delegate("smalc.Tests.Mthreadtry.loop");
		Delegate del2 = new Delegate("smalc.Tests.Mthreadtry.loop2");
		Mthread me = new Mthread(del);
		Mthread me2 = new Mthread(del2);
		me.start();
		me2.start();
	}
	
	public static void loop(){
		while(true){
			System.out.println("A");
		}
	}
	
	public static void loop2(){
		while(true){
			System.out.println("B");
		}
	}

}
