/**
 * Clase CuentaBancaria: esta clase actua como gestora de cuentas bancarias
 * que poseen por el momento: un numero de cuenta y un saldo.
 * En esta clase se puede depositar un monto especifico para sumarselo
 * al saldo.
*/
public class CuentaBancaria {
    private int numeroCuenta;
    private double saldo;

    //método constructor para crear la cuenta
    public CuentaBancaria(int numeroCuenta){
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0.0;
    }

    /*
    Métodos getters para obtener los valores: nro de cuenta y saldo
    */
    public int getNumeroCuenta(){
        return numeroCuenta;
    }

    public double getSaldo(){
        return saldo;
    }

    //Método público que permite modificar el valor de saldo por medio de una operación
    public void depositar(double monto){
        if(monto > 0){
        this.saldo = this.saldo + monto;
        }else{
            System.err.println("No se puede depositar un monto negativo");
        }
    }
}
