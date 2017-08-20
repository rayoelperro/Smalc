
package smalc.System;

import java.util.stream.Stream;

public class Types {
	
	private Object receptor;
	
	public Types(Object receptor){
		this.receptor = receptor;
	}
	
	public String GetString(){
		return receptor.toString();
	}
	
	public int GetInt(){
		return Integer.parseInt(receptor.toString());
	}
	
	public float GetFloat(){
		return Float.parseFloat(receptor.toString());
	}
	
	public byte[] GetByte(){
		return receptor.toString().getBytes();
	}
	
	public Object GetObject(){
		return receptor;
	}
	
	public Stream<?> GetStream(){
		return (Stream<?>)receptor;
	}
}
