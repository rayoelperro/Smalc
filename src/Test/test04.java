package Test;

import smalc.System.Delegate;
import smalc.System.Exception.UnknownLanguageException;
import smalc.Utils.Dictionary;
import smalc.Utils.Word;

public class test04 {
	
	public static void main(String[] args){
		Delegate dl = new Delegate("Test.test04.prueba");
		dl.Call(new Word("queso","cheese","fromage","Käse"));
	}
	
	public static void prueba(Word prueba) throws UnknownLanguageException{
		Dictionary dt = new Dictionary("Por","For","Pour","Für");
		dt.addWord(new Word("Hola","Hello","Salut","Hallo"));
		dt.addWord(prueba);
		System.out.println(dt.getWord(2).French);
	}
}
