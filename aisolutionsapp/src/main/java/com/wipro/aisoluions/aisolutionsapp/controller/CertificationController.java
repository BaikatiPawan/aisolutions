package com.wipro.aisoluions.aisolutionsapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.aisoluions.aisolutionsapp.model.Certification;
import com.wipro.aisoluions.aisolutionsapp.service.CertificationService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class CertificationController {
	private final CertificationService certificationService;
	
	public ResponseEntity<Certification> addCertification(Certification certification){
		Certification certfication = certificationService.addCertication(certification);
		return new ResponseEntity<Certification>(certfication, HttpStatus.CREATED);
	}
}
           