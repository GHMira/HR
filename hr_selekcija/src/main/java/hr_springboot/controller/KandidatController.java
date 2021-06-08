package hr_springboot.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hr_springboot.exception.ResourceNotFoundException;
import hr_springboot.model.Kandidat;
import hr_springboot.repository.KandidatRepository;

@CrossOrigin
@RestController
@RequestMapping("/kandidat")
public class KandidatController {

	@Autowired
	private KandidatRepository kandidatRepository;

	// get all kadidate
	@GetMapping("/allK")
	public List<Kandidat> getAllKan() {
		return kandidatRepository.findAll();
	}

	// create kandidat
	@PostMapping("/saveK")
	public Kandidat createK(@RequestBody Kandidat kandidat) {
		return kandidatRepository.save(kandidat);
	}

	// get kandidate po id rest api
	@GetMapping("/{idK}")
	public ResponseEntity<Kandidat> getKandidatById(@PathVariable Integer idK) {
		Kandidat kandidat = kandidatRepository.findById(idK)
				.orElseThrow(() -> new ResourceNotFoundException("Kandidat ne postoji sa trazenim id: " + idK));
		return ResponseEntity.ok(kandidat);
	}

	// update kandidat rest api
	
	@PutMapping("/updateK")
	public ResponseEntity<Kandidat> updateKandidat(
			/* @PathVariable Integer idCan, */ @RequestBody Kandidat kandidatDetails) {

		Kandidat kandidat = kandidatRepository.findById(kandidatDetails.getIdCan())
				.orElseThrow(() -> new ResourceNotFoundException(
						"Kandidat ne postoji sa trazenim id: " + kandidatDetails.getIdCan()));

		kandidat.setName(kandidatDetails.getName());
		kandidat.setDateB(kandidatDetails.getDateB());
		kandidat.setContactN(kandidatDetails.getContactN());
		kandidat.setMail(kandidatDetails.getMail());

		Kandidat updateKandidat = kandidatRepository.save(kandidat);

		return ResponseEntity.ok(updateKandidat);
	}

	// delete kandidat rest api
	@DeleteMapping("/deleteK/{idCan}")
	public ResponseEntity<Map<String, Boolean>> deleteK(@PathVariable Integer idCan) {

		Kandidat kandidat = kandidatRepository.findById(idCan)
				.orElseThrow(() -> new ResourceNotFoundException("Kandidat ne postoji sa trazenim id: " + idCan));
		
		kandidatRepository.delete(kandidat);
		Map<String,Boolean>response=new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);

	}

}
