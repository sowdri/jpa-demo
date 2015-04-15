package demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.domain.Person;

public interface PersonRepo extends JpaRepository<Person, Long> {

}
