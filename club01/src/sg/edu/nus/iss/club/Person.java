package sg.edu.nus.iss.club;

public class Person {
	private String surname;
	private String firstName;
	private String secondName;
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	
	public Person(){

	}

	public Person(String _surname,String _firstName,String _secondName){
		this.firstName=_firstName;
		this.secondName=_secondName;
		this.surname=_surname;
	}
	
	public void show(){
		System.out.println(this.toString());
	}
	
	@Override
	public String toString(){
		String fullName="";
		if(this.surname!=null){
			fullName+="Surname:"+this.surname+" ";
		}
		if(this.firstName!=null){
			fullName+="FirstName:"+firstName+" ";
		}
		if(this.secondName!=null){
			fullName+="SecondName:"+secondName;
		}
		
		return (fullName);
	}
	
}
