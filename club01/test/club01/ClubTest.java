package club01;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import sg.edu.nus.iss.club.Club;

public class ClubTest {

	Club club=null;
	@Before
	public void init(){
		club=new Club();
	}
	@Test
	public void test() {
		assertNotNull(club);
	}
	


}
