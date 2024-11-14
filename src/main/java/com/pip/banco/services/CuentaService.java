package com.pip.banco.services;

import com.pip.banco.dto.CuentaDto;
import com.pip.banco.models.CuentaModel;
import com.pip.banco.repositories.ICuentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CuentaService {
    @Autowired
    ICuentaRepository cuentaRepository;
    public List<CuentaDto> getCuenta(){
        List<CuentaModel> cuentaModelList = this.cuentaRepository.findAll();
        List<CuentaDto> cuentaDtoList = new ArrayList<>();
        for (int i = 0; i < 0; i++){
            CuentaModel cuentaModel = cuentaModelList.get(i);
            CuentaDto cuentaDto = new CuentaDto();
            cuentaDto.setCuenta(cuentaModel.getCuenta());
            cuentaDto.setNumeroDeCuenta(cuentaModel.getNumeroDeCuenta());
            cuentaDto.setTipoDeCuenta(cuentaModel.getTipoDeCuenta());
            cuentaDtoList.add(cuentaDto);
        }
        return cuentaDtoList;

    }
    public CuentaModel saveCuenta(CuentaModel cuenta){
        CuentaModel cuentaGuardada = cuentaRepository.save(cuenta);
        return cuentaGuardada;
    }
    public CuentaDto getById(Long id){
        CuentaModel cuentaModel = this.cuentaRepository.findById(id).get();
        CuentaDto cuentaDto = new CuentaDto();
        cuentaDto.setCuenta(cuentaModel.getCuenta());
        cuentaDto.setNumeroDeCuenta(cuentaModel.getNumeroDeCuenta());
        cuentaDto.setTipoDeCuenta(cuentaModel.getTipoDeCuenta());
        return cuentaDto;
    }
    public CuentaDto updateById(CuentaDto request, Long id){

        CuentaModel cuentaModel = cuentaRepository.findById(id).get();
        //seteo dto a model
        cuentaModel.setCuenta(request.getCuenta());
        cuentaModel.setNumeroDeCuenta(request.getNumeroDeCuenta());
        cuentaModel.setTipoDeCuenta(request.getTipoDeCuenta());
        CuentaModel cuentaGuardada = cuentaRepository.save(cuentaModel);
        //seteo model a dto
        CuentaDto cuentaDto = new CuentaDto();
        cuentaDto.setCuenta(cuentaGuardada.getCuenta());
        cuentaDto.setNumeroDeCuenta(cuentaGuardada.getNumeroDeCuenta());
        cuentaDto.setTipoDeCuenta(cuentaGuardada.getTipoDeCuenta());

        return cuentaDto;
    }
    public boolean deleteCuenta(Long id){
        try {
            cuentaRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
