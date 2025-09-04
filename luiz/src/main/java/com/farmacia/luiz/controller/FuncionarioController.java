package com.farmacia.luiz.controller;

import com.farmacia.luiz.dto.FuncionarioDto;
import com.farmacia.luiz.model.FuncionarioModel;
import com.farmacia.luiz.repository.FuncionarioRepository;
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
@RequestMapping("/api/v1/funcionarios")

public class FuncionarioController {
    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @PostMapping
    public ResponseEntity<FuncionarioModel> salvarFuncionario(@RequestBody @Valid FuncionarioDto funcionarioDto) {

        var funcionarioModel = new FuncionarioModel();
        BeanUtils.copyProperties(funcionarioDto, funcionarioModel);
        return  ResponseEntity
                .status(HttpStatus.CREATED)
                .body(funcionarioRepository.save(funcionarioModel));
    }

    @GetMapping
    public ResponseEntity<List<FuncionarioModel>> listarFuncionarios() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(funcionarioRepository.findAll());
    }
    @GetMapping("/{cdFuncionario}")
    public ResponseEntity<Object> getFuncionario(@PathVariable("cdFuncionario") Integer cdFuncionario) {
        Optional<FuncionarioModel> funcionario = funcionarioRepository.findById(cdFuncionario);
        if (funcionario.isEmpty()) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("Funcionário não encontrado");
        }
        return ResponseEntity.status(HttpStatus.OK).body(funcionario.get());
    }
}
