package hr_springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hr_springboot.model.Vestine;

@Repository
public interface VestineRepository extends JpaRepository<Vestine, Integer> {

	Vestine findByNameV( final String nameV );
	
}