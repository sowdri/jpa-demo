package demo;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import demo.domain.Person;
import demo.repo.AddressRepo;
import demo.repo.PersonRepo;

public class RepoTest extends JpaDemoApplicationTests {

	@Autowired
	private PersonRepo personRepo;

	@Autowired
	private AddressRepo addressRepo;

	@Test
	public void test() {

		// addressRepo.save(new Address("CBE", "TN"));
		personRepo.save(new Person("Nisha"));
	}

}
