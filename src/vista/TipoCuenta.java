package vista;

public class TipoCuenta {

    private int nroCuenta;       // Número de cuenta
    private double saldo;        // Saldo de la cuenta
    private String tipoMoneda;   // Tipo de moneda de la cuenta

    // Constructor que inicializa los atributos con los valores proporcionados
    public TipoCuenta(int nroCuenta, String tipoMoneda, double saldo) {
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
        this.tipoMoneda = tipoMoneda;
    }

    // Constructor vacío por si se necesita inicializar el objeto sin datos específicos
    public TipoCuenta() {
    }

    // Métodos getter para obtener los valores de los atributos
    public int getNroCuenta() {
        return nroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTipoMoneda() {
        return tipoMoneda;
    }

    // Métodos setter para modificar los valores de los atributos
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTipoMoneda(String tipoMoneda) {
        this.tipoMoneda = tipoMoneda;
    }
    
}
