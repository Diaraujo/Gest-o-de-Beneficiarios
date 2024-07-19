package com.teste.testeEkan.serviceImpl;

import com.teste.testeEkan.model.Beneficiario;
import com.teste.testeEkan.repository.BeneficiarioRepository;
import com.teste.testeEkan.service.BeneficiarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class BeneficiarioServiceImpl implements BeneficiarioService {

    private final BeneficiarioRepository beneficiarioRepository;

    @Override
    public List<Beneficiario> listarBeneficiarios() {
        return beneficiarioRepository.findAll();
    }
    @Override
    public Beneficiario cadastrarBeneficiario(Beneficiario beneficiario) {
        return beneficiarioRepository.save(beneficiario);
    }
    @Override
    public void removerBeneficiario(Long id) {
        beneficiarioRepository.deleteById(id);
    }
}
