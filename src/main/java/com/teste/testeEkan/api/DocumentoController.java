package com.teste.testeEkan.api;

import com.teste.testeEkan.model.Documento;
import com.teste.testeEkan.service.DocumentoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/documentos")
public class DocumentoController {

    //Nota: o lombok faz a injeção de depencias exlcuindo a necessidade do uso do @AutoWired
    private final DocumentoService documentoService;

    @GetMapping("/beneficiario/{id}")
    public List<Documento> listarDocumentosPorBeneficiario(@PathVariable Long id) {
        return documentoService.listarDocumentosPorBeneficiario(id);
    }

    @PostMapping("/cadastro")
    public Documento cadastrarDocumento(@RequestBody Documento documento) {
        return documentoService.cadastrarDoc(documento);
    }
}
