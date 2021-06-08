package hr_springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sun.xml.bind.v2.model.core.ID;

import hr_springboot.model.Kandidat;

@Repository
public interface KandidatRepository extends JpaRepository<Kandidat, Integer> {
	
}
