package edu.enterprise.spring.services.implementation;

import edu.enterprise.spring.model.entity.Empresa;
import edu.enterprise.spring.repository.EmpresaRepository;
import edu.enterprise.spring.services.interfaces.IEmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpresaServiceImpl implements IEmpresaService {

    private final EmpresaRepository empresaRepository;

    public EmpresaServiceImpl(EmpresaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }

    /**
     * Crea o actualiza empresa
     * @param empresa objeto empresa para guardar o actualizar
     * @return objeto empresa que está en la base de datos
     */
    @Override
    public Empresa crearEmpresa(Empresa empresa) {
        return empresaRepository.save(empresa);
    }

    /**
     * Permite ver todas las empresas
     * @return Devuelve lista de empresas que está en DB
     */
    @Override
    public List<Empresa> verEmpresas() {
        List<Empresa> empresaList = new ArrayList<>();
        empresaRepository.findAll().forEach(empresa -> empresaList.add(empresa));
        return empresaList;
    }
}
