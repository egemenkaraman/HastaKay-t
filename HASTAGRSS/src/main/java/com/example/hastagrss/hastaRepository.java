package com.example.hastagrss;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface hastaRepository extends JpaRepository<hastaEntity, Long> {
    @Query("SELECT b FROM hastaEntity b WHERE b.id = :id")
    hastaEntity findByid(@Param("id") Integer id);
}