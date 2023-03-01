package com.wipro.aisoluions.aisolutionsapp.service;

import org.springframework.stereotype.Service;

import com.wipro.aisoluions.aisolutionsapp.model.Certification;
import com.wipro.aisoluions.aisolutionsapp.repository.CertificationRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CertificationService {

	private final CertificationRepository certificationRepository;
	
	public Certification addCertication(Certification certification) {
		Certification  newCertification = certificationRepository.save(certification);
		return newCertification;
	}
	
}
 