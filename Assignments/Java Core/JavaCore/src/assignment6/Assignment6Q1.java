package assignment6;

import java.util.Map;
import java.util.TreeMap;
import assignment6.Contacts.Gender;


public class Assignment6Q1 {

	public static void main(String[] args) {
		TreeMap<Long,Contacts> T1=new TreeMap<>();	
		Gender M=Gender.Male;
		Gender F=Gender.Female;
		
		Contacts C1=new Contacts(9603254784L, "Subhash", "s@gmail.com",M);
		Contacts C2=new Contacts(9603254783L, "Manasa", "m@gmail.com",F);
		Contacts C3=new Contacts(9603254782L, "Sri Hari", "sri@gmail.com",M);
		Contacts C4=new Contacts(9603254781L, "Sravani", "sr@gmail.com",F);
		T1.put(9603254784L, C1);
		T1.put(9603254783L, C2);
		T1.put(9603254782L, C3);
		T1.put(9603254781L, C4);
		
		
		//.descendingMap()----->>>[Question a]
		for(Map.Entry m:T1.descendingMap().entrySet()) {
			long key=(long) m.getKey();
			Contacts value=(Contacts) m.getValue();
			System.out.println(key+"\t"+value.email+"\t"+value.name+"\t"+value.agender);
		}}}
class Contacts {
	long phoneNumber;
	String name;
	String email;
	Gender agender;
	enum Gender{
		Male,Female;
	}
	public Contacts(long phoneNumber, String name, String email,Gender agender) {
		super();
		this.phoneNumber = phoneNumber;
		this.name = name;
		this.email = email;
		this.agender=agender;
	}}