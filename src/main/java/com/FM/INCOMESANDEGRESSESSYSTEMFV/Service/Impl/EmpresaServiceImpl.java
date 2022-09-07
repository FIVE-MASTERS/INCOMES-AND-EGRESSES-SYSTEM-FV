package com.FM.INCOMESANDEGRESSESSYSTEMFV.Service.Impl;

import com.FM.INCOMESANDEGRESSESSYSTEMFV.Model.Empresa;
import com.FM.INCOMESANDEGRESSESSYSTEMFV.Repository.IEmpresaRepository;
import com.FM.INCOMESANDEGRESSESSYSTEMFV.Service.IEmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class EmpresaServiceImpl implements IEmpresaService {

    @Autowired
    private IEmpresaRepository repo;


    @Override
    public Empresa create(Empresa empresa) throws Exception {
        return repo.save(empresa);
    }

    @Override
    public Empresa update(Empresa empresa) throws Exception {
        return repo.save(empresa);

    }

    @Override
    public List<Empresa> readAll() throws Exception {
        return repo.findAll();
    }

    @Override
    public Empresa readById(Long id) throws Exception {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Empresa deleted(Long id) throws Exception {
        repo.deleteById(id);

        return null;
    }
}
