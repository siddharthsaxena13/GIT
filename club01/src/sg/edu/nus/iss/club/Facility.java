package sg.edu.nus.iss.club;

public class Facility {
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	private String name;
	private String description;
	
	public Facility(String _name){
		this.name=_name;
		this.description=null;
	}
	public Facility(String _name,String _description){
		this.description=_description;
		this.name=_name;
	}
	
	public Facility(){
		
	}
	
	public void show(){
		System.out.println(this.toString());
	}
	@Override
	public String toString(){
		String str="";
		if(this.name==null){
			System.out.println("STH Wrong");
			return "";
		}else{
			str+=("Facility Name:"+this.name);
		}
		
		if(this.description==null){
			return str+"";
		}else{
			return str+(" Description:"+this.description);
		}
	}
}
