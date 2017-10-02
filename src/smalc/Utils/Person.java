package smalc.Utils;

import java.rmi.UnexpectedException;
import java.util.Locale;

public class Person {
	
	//Datos Primarios
	
	public String Name;
	public int Age;
	public Word Gender;
	public String Country;
	public Locale Locale;
	
	//Datos Secundarios
	
	public String[] languages;
	
	public static final char Male = 'M';
	public static final char Female = 'F';
	
	public Person(String name, int age, char gender, Locale Country) throws UnexpectedException{
		this.Name = name;
		this.Age = age;
		if(gender == 'M'){
			this.Gender = new Word("Masculino","Male","Mâle","Männlich");
		}else if(gender == 'F'){
			this.Gender = new Word("Femenino","Female","Femelle","Weiblich");
		}
		else{
			throw new UnexpectedException(gender + " : is not a valid gender char like " + Male + " or " + Female);
		}
		this.Country = Country.getDisplayCountry();
		this.Locale = Country;
	}
	
	public void SetLanguages(Locale[] language){
		String[] langs = new String[language.length];
		for(int ag = 0; ag < language.length; ag++){
			langs[ag] = language[ag].getDisplayLanguage();
		}
		languages = langs;
	}
	
}