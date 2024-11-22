package Tema_6.e_Ej2;

public class Persona {
    private final String dni;
    private String nombre;
    private String apellidos;
    private int edad;
    private static final int mayorDeEdad = 18;

    public Persona(String nombre, String apellidos, String dni, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.edad = edad;
    }

    /**
     * @return
     *         El atributo de tipo {@code String} dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @return
     *         El atributo de tipo {@code String} nombre
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return
     *         El atributo de tipo {@code String} apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Se sara para cambiar el apellido de un objeto {@code Persona}
     * 
     * @param apellidos
     *                  Un dato de tipo {@code String}
     * 
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return
     *         El atributo de tipo {@code int} edad
     */
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * usa {@code System.out.println()}
     * 
     * @return imprime los atributos de un objeto persona en formato "nombre,
     *         apellidos,
     *         dni, edad"
     */
    public void imprime() {
        System.out.println(nombre + " " + apellidos + " con DNI " + dni + " tiene " + edad + " años");
    }

    /**
     * Comprueba segun la edad de la persona es mayor de edad
     * 
     * @return
     *         {@code true} si la edad es igual o mayor al valor de mayorDeEdad
     * @see Persona#getEdad()
     */
    public boolean esMayorEdad() {
        if (edad >= mayorDeEdad) {
            return true;
        }
        return false;
    }

    /**
     * Comprobara si la edad de la persona es mayor a 66
     * @return
     *         {@code true} si la edad es mayor a 66
     * @see Persona#getEdad()
     */
    public boolean esJubilado() {
        if (edad < 66) {
            return false;
        }
        return true;
    }

    /**
     * Usara los atributos {@code edad} de 2 distintos objetos {@code Persona}
     * y los restara para descubrir la diferencia.
     * 
     * @param p
     *          Un objeto {@code Persona}
     * @return
     *         Un int de la cantidad de años entre las 2 edades
     * @see Persona#Persona(String, String, String, int)
     * @see Persona#getEdad()
     * @see Persona#setEdad(int)
     */
    public int diferenciaEdad(Persona p) {
        if (p.edad > edad) {
            return p.edad - edad;
        }
        return edad - p.edad;
    }

    /**
     * Usara {@link String#matches(String)} para comprobar que un {@code String} sea
     * un dni valido. El {@code String} sera valido si tiene 8 digitos y una letra
     * mayuscula
     * 
     * @param dni
     *            Un dato de tipo {@link String}
     * @return
     *         {@code true} si el dni cumple con la condicion del {@code matches}
     * @see Persona#getDni()
     */
    public static boolean validarDNI(String dni) {
        if (dni.matches("\\d{8}[A-Z]")) {
            return true;
        }
        return false;
    }
}
