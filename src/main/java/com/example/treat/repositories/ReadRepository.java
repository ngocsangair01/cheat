package com.example.treat.repositories;

import com.example.treat.daos.Listen;
import com.example.treat.daos.Read;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReadRepository extends JpaRepository<Read,Integer> {
}
