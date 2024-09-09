package com.example.hastagrss;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface hastaRepository extends JpaRepository<hastaEntity, Long> {
}