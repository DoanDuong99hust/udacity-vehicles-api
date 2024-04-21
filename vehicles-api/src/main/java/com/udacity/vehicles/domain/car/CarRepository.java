package com.udacity.vehicles.domain.car;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

    @Value("select c from Car where c.id = :carId")
    Optional<Car> findCarById(Long carId);
}
