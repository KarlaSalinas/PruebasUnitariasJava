package pruebasunitarias.drive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DriversManagerTest {
	
	private DriversManager driversManager = new DriversManager();
	
	@Test
	void isAddPassenger() {
		
		Passenger passenger1 = new Passenger("Luis Angel", "ABC123");
		
		driversManager.addPassenger(passenger1);
		
		assertEquals(passenger1, driversManager.getPassenger("ABC123"));
	}
	
	@DisplayName("Pruebas en el método addDriver")
	@Test
	void isaddDriver() {
		
		Driver driver1 = new Driver("Luna", "CCC1", 1.2);
		
		driversManager.addDriver(driver1);
		
		assertEquals(driver1, driversManager.getDriver("CCC1"));
	}

}
