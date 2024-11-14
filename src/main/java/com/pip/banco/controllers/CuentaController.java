package com.pip.banco.controllers;

import com.pip.banco.dto.CuentaDto;
import com.pip.banco.models.CuentaModel;
import com.pip.banco.services.CuentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cuenta")
public class CuentaController {
    @Autowired
    private CuentaService cuentaService;
    @GetMapping(path = "/traer")
    public List<CuentaDto> getCuenta(){
        return this.cuentaService.getCuenta();
    }
    @PostMapping(path = "/crear")
    public CuentaModel saveCuenta(@RequestBody CuentaModel cuenta){
        return this.cuentaService.saveCuenta(cuenta);
    }
    @GetMapping(path = "/traer/{id}")
    public CuentaDto getCuentaById(@PathVariable Long id){
        return this.cuentaService.getById(id);
    }
    @PutMapping(path = "/editar/{id}")
    public CuentaDto updateById(@RequestBody CuentaDto request, @PathVariable Long id){
        return this.cuentaService.updateById(request, id);
    }
    @DeleteMapping(path = "/eliminar/{id}")
    public String deleteById(@PathVariable ("id") Long id){
        boolean ok = cuentaService.deleteCuenta(id);
        if (ok){
            return "La cuenta " + id + " fue eliminada";
        }else {
            return "Error";
        }
    }
}
