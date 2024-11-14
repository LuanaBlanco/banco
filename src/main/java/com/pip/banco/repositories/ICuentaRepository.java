package com.pip.banco.repositories;

import com.pip.banco.models.CuentaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICuentaRepository extends JpaRepository<CuentaModel,Long> {
}
