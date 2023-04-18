package com.asminds.empcontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asminds.EmpModel.EmpModel;
import com.asminds.EmpRepository.EmpRepository;

@RestController
@CrossOrigin
@RequestMapping("/api")

public class EmpController {
	
	@Autowired
	EmpRepository empRepository;
 
 @GetMapping("/get")
	public List<EmpModel>getlist()	
 {
		return empRepository.findAll();
		
	}
 
 @PostMapping("/save")
 public EmpModel createModel(@Validated @RequestBody EmpModel empModel)
 {
	 return this.empRepository.save(empModel);
 }
 
 @PutMapping("/update/{id}")
 public EmpModel updateEmp(@PathVariable(value="id")Long eId, @Validated @RequestBody EmpModel	 updateEmp)
{
	Optional<EmpModel> empModel = empRepository.findById(eId);
	return updateEmp;		
}

 @DeleteMapping("/delete/{id}")
 public String deleteEmp(@PathVariable("id") long eid)
 {
	 empRepository.deleteById(eid);
	return "deletedSuccessfully";
	 
 }
 
  
}
  

