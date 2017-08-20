package smalc.Utils;

import smalc.System.Exception.UnknownLanguageException;

public class Dictionary {
	
	private Word[] words;
	
	public Dictionary(Word[] words){
		this.words = words;
	}
	
	public Dictionary(Word word){
		words = new Word[1];
		words[0] = word;
	}
	
	public Dictionary(String es,String en,String fr,String gr){
		words = new Word[1];
		words[0] = new Word(es,en,fr,gr);
	}
	
	public Dictionary(){
		words = new Word[0];
	}
	
	public void addWord(Word toAdd){
		Word[] pre = words;
		words = new Word[words.length + 1];
		for(int lst = 0; lst < pre.length; lst++){
			words[lst] = pre[lst];
		}
		words[words.length - 1] = toAdd;
	}
	
	public Word[] getWords() {
		return words;
	}
	
	public void addWords(Word[] toAdd){
		Word[] pre = words;
		words = new Word[words.length + toAdd.length];
		System.arraycopy(pre, 0, words, 0, pre.length);
		System.arraycopy(toAdd, 0, words, pre.length, toAdd.length);
	}
	
	public Word getWord(int index){
		return words[index];
	}
	
	public void setWords(Word[] words) {
		this.words = words;
	}
	
	public int length(){
		return words.length;
	}
	
	public Word Search(String word, String flang) throws UnknownLanguageException{
		return Word.Translate(word, flang, this);
	}
}
