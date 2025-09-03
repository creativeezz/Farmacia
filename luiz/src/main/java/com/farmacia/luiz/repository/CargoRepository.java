package com.farmacia.luiz.repository;

import com.farmacia.luiz.model.CargoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CargoRepository extends JpaRepository<CargoModel, Integer> {
    Optional<CargoModel> findByIdCargo(Integer idCargo);

    Optional<CargoModel> findAllByIdCargo(Integer idCargo);
}
