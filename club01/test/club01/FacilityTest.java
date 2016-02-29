package club01;

import static org.junit.Assert.*;

import org.junit.Test;

import sg.edu.nus.iss.club.Facility;

public class FacilityTest {

	@Test
	public void test() {
		Facility fac=new Facility();
		fac.setName("");
		assertArrayEquals("".toCharArray(), fac.getName().toCharArray());
		
	}

}
