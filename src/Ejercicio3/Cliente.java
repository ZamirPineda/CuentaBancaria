package Ejercicio3;

public class Cliente {
    private String nombre;
    private String apellido;
    private String cc;
    Cuenta cuentas[];

    public Cliente(String nombre, String apellido, String cc, Cuenta[] cuentas){
        this.nombre = nombre;
        this.apellido = apellido;
        this.cc = cc;
        this.cuentas = cuentas;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public String getCc(){
        return cc;
    }
    public double consultar_saldo(int n){
        return cuentas[n].getSaldo();
    }
    public void ingresar_dinero(int n, double cantidad){
        cuentas[n].ingresarDinero(cantidad);
    }
    public void retirar_dinero(int n, double cantidad){
        cuentas[n].retirarDinero(cantidad);
    }
}