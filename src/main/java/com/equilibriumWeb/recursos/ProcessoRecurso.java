package com.equilibriumWeb.recursos;

import java.time.Instant;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.equilibriumWeb.entidades.ProcessoEntidade;

@RestController
@RequestMapping(value = "/processo")
public class ProcessoRecurso {
	
	@GetMapping
	public ResponseEntity<ProcessoEntidade> findAll(){
		
		ProcessoEntidade p = new ProcessoEntidade(1, 1234,  Instant.parse("2019-06-20T19:53:07Z"), 20000.00, "Indenização");
		return ResponseEntity.ok().body(p);
	}

}
