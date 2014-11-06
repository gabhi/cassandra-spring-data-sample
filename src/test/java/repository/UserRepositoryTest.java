package repository;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.config.AppConfiguration;
import com.domain.User;
import com.repository.UserRepository;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=AppConfiguration.class)
public class UserRepositoryTest extends Assert {

	@Autowired
	UserRepository repository;
	
	@Test
	public void test(){
		
		Iterable<User> iter = repository.findAll();
		
		for (User user : iter) {
			System.out.println(user);
		}
	}
	
	@Test
	public void findByLastname(){
		
		List<User> iter = repository.findByLname("lname");
		
		for (User user : iter) {
			System.out.println("--------------"+user);
		}
	}
}
