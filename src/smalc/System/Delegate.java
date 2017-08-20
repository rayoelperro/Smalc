package smalc.System;

import java.lang.reflect.Method;

public class Delegate {
	
	private final String _classname;
	private final String _methodname;
	
	public Delegate(String path){
		String[] pts = path.split("\\.");
		StringBuilder so = new StringBuilder();
		for(int n = 0;n < pts.length - 1; n++){
			so.append(pts[n] + ".");
		}
		so.deleteCharAt(so.length() - 1);
		_methodname = path.substring(path.length() - pts[pts.length - 1].length());
		_classname = so.toString();
	}

	public String get_classname() {
		return _classname;
	}

	public String get_methodname() {
		return _methodname;
	}

	public Object Call(Object[] parameters){
		try{
			Class<?> c = Class.forName(_classname);
			Method[] alls = c.getMethods();
			Method testMethod = null;
			for(Method inn : alls){
				if(inn.getName().equals(_methodname)){
					testMethod = inn;
					Object returnable = testMethod.invoke(c.newInstance(), parameters);
					return returnable;
				}
			}
		}catch(Exception e){
			
		}
		return null;
	}
	
	public Object Call(Object parameters){
		try{
			Class<?> c = Class.forName(_classname);
			Method[] alls = c.getMethods();
			Method testMethod = null;
			for(Method inn : alls){
				if(inn.getName().equals(_methodname)){
					testMethod = inn;
					Object returnable = testMethod.invoke(c.newInstance(), parameters);
					return returnable;
				}
			}
		}catch(Exception e){
			
		}
		return null;
	}
	
	public Object Call(){
		try {
			Class<?> c = Class.forName(_classname);
			Method testMethod = c.getMethod(_methodname, null);
			Object returnable = testMethod.invoke(c.newInstance(), null);
			return returnable;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
