package vista;

import java.util.ArrayList;

public class Cuenta {
    // Atributos de la clase Cuenta
    private String nombre;
    private int nroCuenta;
    private String apellido;
    private String login;
    private String contraseña;
    private ArrayList<TipoCuenta> listaTipoCuenta; // Lista de tipos de cuenta asociados a esta cuenta

    // Constructor de la clase Cuenta
    public Cuenta(String nombre, String apellido, int nrocuenta, String login, String contraseña) {
        this.nombre = nombre;
        this.nroCuenta = nrocuenta;
        this.apellido = apellido;
        this.login = login;
        this.contraseña = contraseña;
        listaTipoCuenta = new ArrayList<TipoCuenta>(); // Inicialización de la lista de tipos de cuenta
    }

    // Constructor vacío
    public Cuenta() {
    }

    // Métodos getters para obtener valores de los atributos
    public int getNroCuenta() {
        return nroCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getLogin() {
        return login;
    }

    public String getContraseña() {
        return contraseña;
    }

    public ArrayList<TipoCuenta> getListaTipoCuenta() {
        return listaTipoCuenta;
    }

    // Métodos setters para modificar valores de los atributos
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setListaTipoCuenta(ArrayList<TipoCuenta> listaTipoCuenta) {
        this.listaTipoCuenta = listaTipoCuenta;
    }

    // Método para iniciar sesión, verifica si el login y la contraseña coinciden
    public boolean iniciarSesion(String loginn, String pass) {
        return contraseña.equals(pass) && login.equals(loginn);
    }

    // Método para añadir un tipo de cuenta a la lista de tipos de cuenta
    public void añadirMoneda(String moneda) {
        TipoCuenta añadirmoneda = new TipoCuenta(0, moneda, 0); // Crea un nuevo TipoCuenta con saldo inicial 0
        listaTipoCuenta.add(añadirmoneda); // Agrega el nuevo TipoCuenta a la lista
    }
}
