package NameList;

public class NameList {
	private String[] names;
	private int count;
	private static final int EXPAND_SIZE = 5;
	
	
	public NameList(){
		this(EXPAND_SIZE);
	}
	public NameList(int size){
		this.names = new String[size];
		count = 0;
	}
	
	public String[] get(){
		String[] tmpList = new String[count];

		for(int i = 0; i < count; i++) tmpList[i] = names[i];
		
		return tmpList;
	}

	public void add(String name){
//		if(names.length == count) expand();
		if(names.length == count) return; 
		
		if(!isDuplicate(name))
			names[count++] = name;
	}
	
	public boolean isDuplicate(String name){
		for(int i = 0; i < count; i ++)
			if(names[i].equals(name))
				return true;
		
		return false;
	}
	
	private void expand(){
		String[] tmpList = new String[names.length + EXPAND_SIZE];

		for(int i = 0; i < count; i++) tmpList[i] = names[i];
		
		names = tmpList;
	}

	@Override
	public String toString() {
		String message = "";

		for(int i = 0; i < count; i++) 
			message += names[i].toString() + " ";
		
		return message;
	}
	
	
}
