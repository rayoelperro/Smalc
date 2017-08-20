package smalc.Utils;

import smalc.System.Exception.UnknownLanguageException;

public class Word {
	
	public String Spanish;
	public String English;
	public String French;
	public String German;
	
	public Word(String Spanish, String English, String French, String German){
		this.Spanish = Spanish;
		this.English = English;
		this.French = French;
		this.German = German;
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
	
	public static Word Translate(String word, String flang, Dictionary tosearch) throws UnknownLanguageException{
		Word[] alls = tosearch.getWords();
		for(Word et : alls){
			if(et.fromLang(flang).equals(word)){
				return et;
			}
		}
		return null;
	}
}
