package Model;

public class CuentaBancaria {
    private String titular;
    private int saldo;

    public CuentaBancaria(){}

    public CuentaBancaria(String titular, int saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return  titular + ": " + saldo + "€";
    }

    public void depositar(int ingreso){
        saldo = saldo+ingreso;
        System.out.println("Deposito de " +ingreso+ "€. Su nuevo saldo es: "+saldo+ "€");
    }

    public void retirar(int retirada){
        saldo = saldo-retirada;
        System.out.println("Retiro de " +retirada+ "€. Su nuevo saldo es: "+saldo+ "€");
    }
}
