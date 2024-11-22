package d_Ej2;

public class Persona {
    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;

    public Persona(String nombre, String apellidos, String dni, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void imprime() {
        System.out.println(nombre + " " + apellidos + " con DNI " + dni + " tiene " + edad + " años");
    }

    /**
     * @return boolean false si la edad es menor de 18
     */
    public boolean esMayorEdad() {
        if (edad < 18) {
            return false;
        }
        return true;
    }

    /**
     * @return boolean false si la edad es menor a 66
     */
    public boolean esJubilado() {
        if (edad < 66) {
            return false;
        }
        return true;
    }

    /**
     * @param p se le introduce un objeto Persona
     *          de este objeto Persona p queremos la edad
     * @return int la resta de la edad de p- edad del objeto persona principal
     */
    public int diferenciaEdad(Persona p) {
        if (p.edad > edad) {
            return p.edad - edad;
        }
        return edad - p.edad;
    }
}
