package com.wipro.aisoluions.aisolutionsapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.aisoluions.aisolutionsapp.model.Certification;

@Repository
public interface CertificationRepository extends JpaRepository<Certification, Long> {

}
