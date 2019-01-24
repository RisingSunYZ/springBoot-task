package com.example.demo;

import com.example.demo.service.AsyncService;
import com.example.demo.service.TimeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	AsyncService asyncService;

	@Autowired
	TimeService timeService;

	@Test
	public void contextLoads() throws Exception{
		asyncService.sayHello();
		System.out.println("say GoodBye");
		Thread.sleep(10000);
	}

	@Test
	public void test() throws Exception{
		timeService.sayTime();
		Thread.sleep(100000);
	}

}

