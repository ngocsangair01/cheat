package com.example.treat.repositories;

import com.example.treat.daos.Listen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListenRepository extends JpaRepository<Listen,Integer> {
}
