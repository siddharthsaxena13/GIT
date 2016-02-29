package club01;

import static org.junit.Assert.*;

import org.junit.Test;

import sg.edu.nus.iss.club.Member;

public class MemberTest {

	@Test
	public void test() {
		Member mem=new Member("Cai","YiCheng",null,0);
		assertNotNull(mem);
	}
	
	@Test
	public void testMemberNum(){
		Member mem=new Member("SN","FN","SN",0);
		assertTrue(mem.getMemberNumber()==0);
		mem.setMemberNumber(1);
		assertFalse(mem.getMemberNumber()==0);
		
	}

}
