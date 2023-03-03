package acceptance;

import kr.eztolearn.calculator.CalculatorApplication;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;


import static org.junit.jupiter.api.Assertions.assertEquals;

//@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
		classes = CalculatorApplication.class)
class CalculatorApplicationTests {

	@Autowired
	TestRestTemplate testRestTemplate;

	private final String  server = System.getProperty("calculator.url");

	@LocalServerPort
	int randomServerPort;

	@Test
	void goHome() {
		String result = testRestTemplate.getForObject(server+":"+randomServerPort, String.class);
		assertEquals("Welcome GitHub Action Home", result);
	}

}
