package com.pip.banco.dto;

import java.io.Serializable;

public class CuentaDto implements Serializable {
    private String cuenta;
    private int numeroDeCuenta;
    private String tipoDeCuenta;

    public CuentaDto(String cuenta, int numeroDeCuenta, String tipoDeCuenta) {
        this.cuenta = cuenta;
        this.numeroDeCuenta = numeroDeCuenta;
        this.tipoDeCuenta = tipoDeCuenta;
    }

    public CuentaDto() {
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
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

