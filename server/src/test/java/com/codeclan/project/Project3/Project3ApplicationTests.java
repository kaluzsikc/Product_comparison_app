package com.codeclan.project.Project3;

import com.codeclan.project.Project3.repositories.CountryRepository.CountryRepository;
import com.codeclan.project.Project3.repositories.SearchItemRepository.SearchItemRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Project3ApplicationTests {

	@Autowired
	SearchItemRepository searchItemRepository;

	@Autowired
	CountryRepository countryRepository;

	@Test
	public void contextLoads() {
	}

}
