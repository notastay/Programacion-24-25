package Tema_6.e_Ej4;

public class Articulo {
    private String nombre;
    private double precio;
    private final double iva;
    private final String tipoIva;
    private int cuantosQuedan;

    public Articulo(String nombre, double precio, int cuantosQuedan, String tipoIva) {
        if (precio > 0 && cuantosQuedan > 0) {
            this.cuantosQuedan = cuantosQuedan;
            this.nombre = nombre;
            this.precio = precio;
            if (tipoIva.equals("reducido")) {
                iva = 10;
                this.tipoIva = tipoIva;
            } else if (tipoIva.equals("super reducido")) {
                iva = 4;
                this.tipoIva = tipoIva;
            } else {
                iva = 21;
                this.tipoIva = "general";
            }

        } else {
            System.err.println("ERROR al instanciar " + nombre);
            this.iva = 0;
            this.tipoIva = null;
        }

    }

    /**
     * @return
     *         devuelve el atributo {@code nombre}
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * se le cambiara el nombre al {@code Articulo}
     * 
     * @param nombre
     *               el nuevo valor del atributo {@code nombre}
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return
     *         devuelve el atributo {@code precio}
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * se le cambiara el precio al {@code Articulo}
     * 
     * @param precio
     *               el nuevo valor del atributo {@code precio}
     */
    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
        } else {
            System.out.println("ERROR al cambiar el valor");
        }
    }

    /**
     * @return
     *         devuelve el atributo {@code iva}
     */
    public double getIva() {
        return iva;
    }

    /**
     * @return
     *         devuelve el atributo {@code cuantosQuedan}
     */
    public int getCuantosQuedan() {
        return cuantosQuedan;
    }

    /**
     * se le cambiara el atributo cunatosQuedan al {@code Articulo}
     * 
     * @param cuantosQuedan
     *                      el nuevo valor del atributo {@code cuantosQuedan}
     * @see Articulo#vender(int)
     * @see Articulo#almacenar(int)
     */
    public void setCuantosQuedan(int cuantosQuedan) {
        if (cuantosQuedan > 0) {
            this.cuantosQuedan = cuantosQuedan;
        } else {
            System.out.println("ERROR al cambiar el valor");
        }
    }

    /**
     * se imprimiran por pantalla los atributos de {@code Articulo} el formato
     * nombre, precio, iva, pvp
     */
    public void imprimir() {
        System.out.println(nombre + " - Precio:" + precio + " - IVA:" + iva + "% - PVP: "
                + (precio + (precio * (iva / 100))));
    }

    /**
     * usa el {@code precio} y el {@code iva} para calcular el pvp del producto
     * 
     * @return
     *         devuelve un PVP
     * @see Articulo#getPVPDescuento(int)
     */
    public double getPVP() {
        return (precio + (precio * (iva / 100)));
    }

    /**
     * se le pasara un porcentaje de descuento y se usara el metodo
     * {@link Articulo#getPVP()} para calcular el pvp y restarle la cantidad a
     * descontar
     * 
     * @param descuento
     *                  la cantidad a descontar del {@code PVP}
     * @return
     *         devolvera el {@code PVP} con el descuento
     */
    public double getPVPDescuento(int descuento) {
        return this.getPVP() - ((this.getPVP() * descuento) / 100);
    }

    /**
     * se le restara un numero a {@code cuantosQuedan} si el numero introducido no
     * sobrepasa el numero de {@code cuantosQuedan}
     * 
     * @param cant
     *             el numero a restar de {@code cuantosQuedan}
     * 
     * @return {@code true} si se ha restado la cantidad correctamente
     * @see Articulo#almacenar(int)
     */
    public boolean vender(int cant) {
        if (cuantosQuedan >= cant) {
            cuantosQuedan = cuantosQuedan - cant;
            return true;
        }
        return false;
    }

    /**
     * se le sumara un numero a {@code cuantosQuedan} si el numero introducido es
     * positivo
     * 
     * @param cant
     *             el numero a sumar a {@code cuantosQuedan}
     * 
     * @return {@code true} si se ha sumado la cantidad correctamente
     * @see Articulo#vender(int)
     */
    public boolean almacenar(int cant) {
        if (cant > 0) {
            cuantosQuedan = cuantosQuedan + cant;
            return true;
        }
        return false;
    }

    /**
     * @return
     *         devuelve el atributo {@code tipoIva}
     */
    public String getTipoIva() {
        return tipoIva;
    }

}
