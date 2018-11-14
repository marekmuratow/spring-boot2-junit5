package pl.entito.demo.junit5withspring;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootConfiguration
@ExtendWith(SpringExtension.class)
@SpringBootTest
class ApplicationTest {

	@Test
	void contextLoads() {
	}

}
