package test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public abstract class TestBase {

	@BeforeAll
	public void initialize() throws Exception {
		// Init 
		setup();
	}

	public abstract void setup() throws Exception;

}
