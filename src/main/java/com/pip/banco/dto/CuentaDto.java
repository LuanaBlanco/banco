package com.pip.banco.dto;

import java.io.Serializable;

public class CuentaDto implements Serializable {
    private int numeroDeCuenta;
    private String tipoDeCuenta;

    public CuentaDto(int numeroDeCuenta, String tipoDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.tipoDeCuenta = tipoDeCuenta;
    }

    public CuentaDto() {
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public  String getTipoDeCuenta() {
        return tipoDeCuenta;
    }

    public void setTipoDeCuenta(String tipoDeCuenta) {
        this.tipoDeCuenta = tipoDeCuenta;
    }

}

