package com.demo.main.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.main.Entity.Cylinder;

@Repository
public interface CylinderRepository extends JpaRepository<Cylinder, Long> {

}
