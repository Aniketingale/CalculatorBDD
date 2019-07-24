package org.amdocs;
import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class steps {
	Calculator cal =null;
	private double result;
	@Given("the calculator to perform addition")
	public void the_calculator_to_perform_addition() {
		cal =new Calculator();
		
	}

	@When("the input is {string} and {string}")
	public void the_input_is_and(String string, String string2) {
		result=cal.addition(Double.parseDouble(string), Double.parseDouble(string2));
	}

	@Then("the expectedOutput is {string}")
	public void the_expectedOutput_is(String string) {
		assertEquals(Double.parseDouble(string), result,0.01);
	}
}
