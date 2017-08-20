package Test;

import java.util.Locale;

import smalc.System.Console;
import smalc.Utils.Person;

public class test03 {

	public static void main(String[] args) {
		Person p = new Person("Alberto",15,Person.Male,new Locale("es","ES"));
		Console.WriteLn(p.Name + " tiene " + p.Age + " años, es de género " + p.Gender.Spanish.toLowerCase() + " y vive en " + p.Country);
		Locale[] l = new Locale[2];
		l[0] = new Locale("es","ES");
		l[1] = new Locale("en","EN");
		p.SetLanguages(l);
		Console.WriteLn(p.Name + " habla " + p.languages[0] + " e " + p.languages[1]);
	}

}
