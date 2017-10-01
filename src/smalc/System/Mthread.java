package smalc.System;

public class Mthread extends Thread {
	public Mthread(Delegate method){
		super(new Runnable(){

			@Override
			public void run() {
				method.Call();
			}
			
		});
	}
	public Mthread(String path){
		super(new Runnable(){

			@Override
			public void run() {
				new Delegate(path).Call();
			}
			
		});
	}
}
