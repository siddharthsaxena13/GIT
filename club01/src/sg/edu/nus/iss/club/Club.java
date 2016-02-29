package sg.edu.nus.iss.club;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.management.openmbean.KeyAlreadyExistsException;

import sg.edu.nus.iss.club.Exception.FacilityExistException;


public class Club {
	private ArrayList<Member> members=new ArrayList<Member>();
	public Member addMember(Member _member){
		members.add(_member);
		return _member;
	}
	
	public ArrayList<Member>getMembers(){
		return (ArrayList)members.clone();
		
	}
	
	public Member getMember(int index){
		if(index<0||index>=members.size()){
			return null;
		}else{
			//return members[index];
			return members.get(index);
		}
	}
	
	public void removeMember(int index){
		if(index<0||index>=members.size()){
			return;
		}else{
			members.remove(index);
		}
	}
	
	public void showMembers(){
		for (Member member:members){
			System.out.println(member.toString());
		}
	}
	
}
