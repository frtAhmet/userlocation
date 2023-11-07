package com.example.springbootdtoexample.repository;

import com.example.springbootdtoexample.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
