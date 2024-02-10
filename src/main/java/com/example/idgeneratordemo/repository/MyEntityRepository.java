package com.example.idgeneratordemo.repository;

import com.example.idgeneratordemo.entity.MyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyEntityRepository extends JpaRepository<MyEntity, String> {
}
