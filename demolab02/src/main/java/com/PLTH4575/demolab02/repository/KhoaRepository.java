package com.PLTH4575.demolab02.repository;

import com.PLTH4575.demolab02.model.Khoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KhoaRepository extends JpaRepository<Khoa,Long> {
}
