package org.zerock.sample;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

// @RunWith : 테스트 시 필요한 클래스를 지정
// @ContextConfiguration : 어떤 설정 정보를 읽어 들여야 하는지 명시, locations를 이용해서 문자열의 배열로 XML 설정 파일을 명시 할 수 있음
// @Configuration : classes 속성으로 적용된 클래스를 지정해줄수도 있음

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class SampleTests {
	
	@Autowired
	private Restaurant restaurant;
	
	@Test
	public void testExist() {
		assertNotNull(restaurant);
		
		log.info(restaurant);
		log.info("==============");
		log.info(restaurant.getChef());
	}
}
