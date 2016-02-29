package sg.edu.nus.iss.club;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ClubApplication {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	Map<String,Member>map=new HashMap<String,Member>();
	
	Member m1=new Member("Cai","Yi","cheng",23);
	Member m2=new Member("Saxena","Sid","",25);
	
	map.put("Eason", m1);
	map.put("StrongMan", m2);
	
	map.get("StrongMan").show();
	
	}

}
