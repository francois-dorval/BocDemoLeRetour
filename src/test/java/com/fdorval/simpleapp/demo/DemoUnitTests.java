package com.fdorval.simpleapp.demo;

import com.fdorval.simpleapp.demo.rest.dto.CoolResult;
import com.fdorval.simpleapp.demo.rest.util.CoolCalculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * test unitaire bête et méchant
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoUnitTests {

	@Autowired
	CoolCalculator coolCalculator;

	@Test
	public void test1() {
		CoolResult result = coolCalculator.getCoolScore("François");
		Assert.assertEquals(result.getPourcentage(), 1);
		Assert.assertEquals(result.getCommentaire(), "\uD83D\uDE32\uD83D\uDE32\uD83D\uDE32\uD83D\uDE32");
	}

}
