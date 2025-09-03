package com.farmacia.luiz.controller;


import com.farmacia.luiz.dto.EmpresaDto;
import com.farmacia.luiz.model.EmpresaModel;
import com.farmacia.luiz.repository.EmpresaRepository;
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
@RequestMapping("/api/v1/empresas")

public class EmpresaController {
    @Autowired
    private EmpresaRepository empresaRepository;

    @PostMapping
    public ResponseEntity<EmpresaModel> salvarEmpresa(@RequestBody @Valid
                                                          EmpresaDto empresaDto){

        var empresaModel = new EmpresaModel();
        BeanUtils.copyProperties(empresaDto, empresaModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(empresaRepository.save(empresaModel));
    }

    @GetMapping
    public ResponseEntity<List<EmpresaModel>> listarEmpresas(){
        return ResponseEntity.status(HttpStatus.OK).body(empresaRepository.findAll());
    }

    @GetMapping("/{idEmpresa}")
    public ResponseEntity<Object> getEmpresas(@PathVariable("idEmpresa") Integer idEmpresa){
        Optional<EmpresaModel> empresa0 = empresaRepository.findById(idEmpresa);

        if (empresa0.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Empresa não encontrada");
        }
        return ResponseEntity.status(HttpStatus.OK).body(empresa0.get());
    }
}
