package hr_springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hr_springboot.exception.ResourceNotFoundException;
import hr_springboot.model.Vestine;
import hr_springboot.repository.VestineRepository;

@CrossOrigin
@RestController
@RequestMapping("/vestine")
public class VestineController {

	@Autowired
	private VestineRepository vestineRepository;

	// get all vestine
	@GetMapping("/allV")
	public List<Vestine> getAllV() {
		return vestineRepository.findAll();
	}

	// create vestinu
	@PostMapping("/saveV")
	public Vestine createV(@RequestBody Vestine vestina) {
		return vestineRepository.save(vestina);
	}

	// get vestinu po imenu rest api
	@GetMapping("/{nameV}")
	public ResponseEntity<Vestine> getVestinuPoImenu(@PathVariable String nameV) {
		Vestine vestina =  vestineRepository.findByNameV(nameV);
		return ResponseEntity.ok(vestina);
	}

}
