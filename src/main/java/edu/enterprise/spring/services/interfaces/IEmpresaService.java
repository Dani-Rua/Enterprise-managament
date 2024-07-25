package edu.enterprise.spring.services.interfaces;

import edu.enterprise.spring.model.entity.Empresa;

import java.util.List;

public interface IEmpresaService {

    /**
     * Interface que me permite crear una empresa
     * @param empresa objeto empresa para guardar o actualizar
     * @return objeto tipo empresa guardado en la base de datos
     */
    Empresa crearEmpresa (Empresa empresa);

    /**
     * Método que me lista todas las empresas
     * @return una lista de empresas
     */
    List<Empresa> verEmpresas ();
}
