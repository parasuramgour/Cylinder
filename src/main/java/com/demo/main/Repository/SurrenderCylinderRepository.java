package com.demo.main.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.main.Entity.SurrenderCylinder;

@Repository
public interface SurrenderCylinderRepository extends JpaRepository<SurrenderCylinder, Long> {

}
