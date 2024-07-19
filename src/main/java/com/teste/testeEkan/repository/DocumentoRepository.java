package com.teste.testeEkan.repository;

import com.teste.testeEkan.model.Documento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DocumentoRepository extends JpaRepository<Documento, Long> {

    List<Documento> findByBeneficiarioId(Long beneficiarioId);
}
