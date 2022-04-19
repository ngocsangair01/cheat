package com.example.treat.repositories;

import com.example.treat.daos.Listen;
import com.example.treat.daos.Write;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WriteRepository extends JpaRepository<Write,Integer> {
}
