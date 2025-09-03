package com.farmacia.luiz.controller;

import com.farmacia.luiz.dto.CargoDto;
import com.farmacia.luiz.model.CargoModel;
import com.farmacia.luiz.repository.CargoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/cargos")

public class CargoController {
    @Autowired
    private CargoRepository cargoRepository;

    @PostMapping
    public ResponseEntity<CargoModel> salvarCargos(@RequestBody @Valid CargoDto cargoDto) {

        var cargoModel = new CargoModel();
        BeanUtils.copyProperties(cargoDto, cargoModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(cargoRepository.save(cargoModel));
    }
    @GetMapping
    public ResponseEntity<List<CargoModel>> listarCargos() {
        return ResponseEntity.status(HttpStatus.OK).body(cargoRepository.findAll());
    }
    @GetMapping("/{idCargo}")
    public ResponseEntity<Object> getCargoById(@PathVariable("idCargo") Integer idCargo) {
        Optional<CargoModel> cargo = cargoRepository.findById(idCargo);
        if(cargo.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cargo não encontrado");
        }
        return ResponseEntity.status(HttpStatus.OK).body(cargo.get());
    }
}
