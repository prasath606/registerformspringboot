package com.asminds.EmpRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.asminds.EmpModel.EmpModel;
@Repository
public interface EmpRepository extends JpaRepository<EmpModel, Long> {

	 
	
	 

}
