/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ti.umy.pws.assessmentpws;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

/**
 *
 * @author ASUS
 */
@CrossOrigin
@RestController
@RequestMapping("/dataminuman")
public class AssessmentController {
   @Autowired
private assessmentrepo minuman;
@GetMapping("/minuman")
public List<Dataminuman> getAllDataminuman(){
return minuman.findAll();
}
@GetMapping ("/minuman/{idproduct}")
public Dataminuman getDataminumanById(@PathVariable String idproduct){
return minuman.findById(idproduct).get();
}
@PostMapping ("/minuman")
public Dataminuman saveDataminumanDetails(@RequestBody Dataminuman c){
return minuman.save(c);
}
@PutMapping("/minuman")
public Dataminuman updateDataminumanshop(@RequestBody Dataminuman c){
return minuman.save(c);
}
@DeleteMapping("/minuman/{idproduct}")
public ResponseEntity<HttpStatus> deleteDataminumanById(@PathVariable String idproduct){
minuman.deleteById(idproduct);
return new ResponseEntity<>(HttpStatus.NO_CONTENT);
} 
}
