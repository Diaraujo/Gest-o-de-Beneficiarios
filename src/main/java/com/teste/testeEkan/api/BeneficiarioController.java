package com.teste.testeEkan.api;

import com.teste.testeEkan.model.Beneficiario;
import com.teste.testeEkan.service.BeneficiarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/beneficiarios")
public class BeneficiarioController {

    //Nota: o lombok faz a injeção de depencias exlcuindo a necessidade do uso do @AutoWired
    private final BeneficiarioService beneficiarioService;

    @GetMapping("/listar")
    public List<Beneficiario> listarBeneficiarios() {
        return beneficiarioService.listarBeneficiarios();
    }

    @PostMapping("/cadastro")
    public Beneficiario cadastrarBeneficiario(@RequestBody Beneficiario beneficiario) {
        return beneficiarioService.cadastrarBeneficiario(beneficiario);
    }

    @DeleteMapping("/deletar/{id}")
    public void removerBeneficiario(@PathVariable Long id) {
        beneficiarioService.removerBeneficiario(id);
    }

}
