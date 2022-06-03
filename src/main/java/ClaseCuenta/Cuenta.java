/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseCuenta;

/**
 *
 * @author bjls2
 */
public class Cuenta {
    private String nombreCliente;
    private String numeroCuenta;
    private double tipoInteres;
    private double saldo;

    public Cuenta() {
    }

    public Cuenta(String nombreCliente, 
            String numeroCuenta,
            double tipoInteres, double saldo) {
        this.nombreCliente = nombreCliente;
        this.numeroCuenta = numeroCuenta;
        this.tipoInteres = tipoInteres;
        this.saldo = saldo;
    }
    
     //Constructor copia
    public Cuenta(final Cuenta c) {
        this.nombreCliente = c.nombreCliente;
        this.numeroCuenta = c.numeroCuenta;
        this.tipoInteres = c.tipoInteres;
        this.saldo = c.saldo;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public boolean ingreso (double _saldo){
        if (_saldo>0) {
            this.saldo+=_saldo;
            return true;
        }
        return false;
    }
    public boolean reintegro(double _saldo){
        if(_saldo>0 && this.saldo>=_saldo){
            this.saldo-=_saldo;
            return true;
        }
        return false;
    }
    
    public boolean transferencia (double _saldo, Cuenta _cuenta){
        if (_saldo>0 && this.saldo>=_saldo) {
            this.reintegro(_saldo);
            _cuenta.setSaldo(_saldo);
            return true;
        }
        return false;
    }
    public String showInfo(){
        return "Datos de la cuenta: "+
                "\n Nombre cliente: "+this.nombreCliente+
                "\n Numero cuenta: "+this.numeroCuenta+
                "\n Saldo: "+this.saldo+
                "\n Tipo interes: "+this.tipoInteres;
    }
}
