package demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.domain.Address;

public interface AddressRepo extends JpaRepository<Address, Long> {

}
