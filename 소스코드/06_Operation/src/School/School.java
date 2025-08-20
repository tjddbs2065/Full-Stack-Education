package School;


public class School {
	private Person[] people;
	private int size;
//	private static final int EXPAND_SIZE = 5;
	
	public School() {
		this(EXPAND_SIZE);
	}
	public School(int size){
		people = new Person[size];
	}
	
	public Person[] get(){
		Person[] tmpPeople = new Person[size];

		for(int i = 0; i < size; i++) tmpPeople[i] = people[i];
		
		return tmpPeople;
	}
	
	public void add(Person person){
//		if(size == people.length) expand();
		if(size == people.length) return;
		
		if(isDuplicate(person)){
			System.out.println("[!ม฿บน!] " + person.getName());
			return;
		}

		people[size++] = person;
		
	}
	public boolean isDuplicate(Person person){
		for(int i = 0; i < size; i ++){
//			if(people[i].equals(person)) return true;

			if(person.equals(people[i])) return true;
		}
		
		return false;
	}
	private void expand(){
		Person[] tmpPeople = new Person[people.length + EXPAND_SIZE];

		for(int i = 0; i < size; i++) tmpPeople[i] = people[i];
		
		people = tmpPeople;
	}
	
	@Override
	public String toString() {
		String message = "";
		
		for(int i = 0; i < size; i++)
			message += people[i].toString() + "\n\n";
		
		return message;
	}
	
	
}
