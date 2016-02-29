package sg.edu.nus.iss.club;

/**
 * @author hippo
 *
 */
public class Member extends Person {
	
	private int memberNumber;
	
	public Member(String surName,String firstName,String secondName,int _memberNumber){
		super(surName, firstName, secondName);
		this.memberNumber=_memberNumber;
	}

	/**
	 * @return
	 */
	public int getMemberNumber() {
		return memberNumber;
	}

	/**
	 * @param memberNumber
	 */
	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
	}
	
	@Override
	public String toString(){
		return super.toString()+" MemberNumber:"+this.memberNumber;
	}

}
