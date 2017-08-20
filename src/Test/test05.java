package Test;

import smalc.System.Console;
import smalc.Utils.*;

public class test05 {
	
	public static void main(String[] args){
		Word[] p = new Word[4];
		p[0] = new Word("para", "for","pour","für");
		p[1] = new Word("todo", "all","tout","alle");
		p[2] = new Word("el", "the","le","die");
		p[3] = new Word("mundo", "world","monde","Welt");
		Sentence ns = new Sentence(p);
		Console.WriteLn(ns.Spanish);
		Console.WriteLn(ns.English);
		Console.WriteLn(ns.French);
		Console.WriteLn(ns.German);
	}
	
}
