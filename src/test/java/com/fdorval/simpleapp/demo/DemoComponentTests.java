package com.fdorval.simpleapp.demo;

import com.fdorval.simpleapp.demo.rest.dto.CoolResult;
import com.fdorval.simpleapp.demo.rest.util.CoolCalculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DemoComponentTests {


	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	/**
	 * test basique : appelle l'api avec le prénom François et test code retour et pourcentage
	 *
	 * @throws Exception
	 */
	@Test
	public void shouldReturn150() throws Exception {
		ResponseEntity<CoolResult> result = this.restTemplate.getForEntity("http://localhost:" + port + "/coolitude?name=François",
				CoolResult.class);
		Assert.assertEquals(result.getStatusCode(), HttpStatus.OK);
		Assert.assertEquals(result.getBody().getPourcentage(), 150);
	}
}