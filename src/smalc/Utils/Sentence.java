package smalc.Utils;

import smalc.System.Exception.UnknownLanguageException;

public class Sentence {
	
	public String Spanish = "";
	public String English = "";
	public String French = "";
	public String German = "";
	
	public Sentence(Word[] words){
		for(Word l : words){
			Spanish += l.Spanish + " ";
			English += l.English + " ";
			French += l.French + " ";
			German += l.German + " ";
		}
	}
	
	public String fromLang(String flang) throws UnknownLanguageException{
		switch(flang){
		case "Spanish":
			return Spanish;
		case "English":
			return English;
		case "French":
			return French;
		case "German":
			return German;
		default:
			throw new UnknownLanguageException(flang + " is not a valid language");
		}
	}

}
