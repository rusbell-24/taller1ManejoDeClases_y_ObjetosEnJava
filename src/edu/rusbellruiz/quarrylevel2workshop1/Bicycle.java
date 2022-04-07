/**
 * Paquete al que pertenece la clase
 */
package edu.rusbellruiz.quarrylevel2workshop1;

/**
 * Esta clase representa algunos atributos destacados de cualquier objeto bicicleta
 */
public class Bicycle {
    /**
     * Este atributo representa la marca del objeto bicicleta
     */
    private String brand;
    /**
     * Este atributo representa el color del objeto bicicleta
     */
    private String color;
    /**
     * Este atributo representa la velocidad del objeto bicicleta
     */
    private double speed;

    /**
     * Este constructor inicializa los atributos del objeto con valores por defecto, en el caso de que el usuario no los indique
     */
    public Bicycle(){
        /**
         * Asigna la marca por defecto "GW" al atributo marca(brand)
         */
        this.brand = "GW";
        /**
         * Asigna el color por defecto "grey" al atributo color
         */
        this.color = "Grey";
        /**
         * Asignamos el valor 0 a la velocidad(speed)
         */
        this.speed = 0;
    }

    /**
     * Este constructor permite inicializar el objeto con los valores que el usuario ingrese en el caso de que así lo haga
     * @param brand representa la marca del objeto bicicleta en cuestión
     * @param color representa el color del objeto bicicleta en cuestión
     * @param initialSpeed representa la velocidad inicial  del objeto bicicleta ingresada por el usuario
     */
    public Bicycle(String brand, String color, double initialSpeed){
        this.brand = brand;
        this.color = color;
        this.speed = initialSpeed;
    }

    /**
     *Este método nos permite saber la marca del objeto bicicleta en cuestión
     * @return retorna la marca del objeto bicicleta en cuestión
     */
    public String getBrand(){
        return brand;
    }

    /**
     * Este método nos permite modificar la marca del objeto bicicleta en cuestión
     * @param brand representa la nueva marca del objeto bicicleta
     */
    public void setBrand(String brand){
        this.brand = brand;
    }

    /**
     * Este método nos permite obtener el color del objeto bicicleta en cuestión
     * @return retorna el color de la bicicleta en cuestión
     */
    public String getColor(){
        return color;
    }

    /**
     * Este método nos permite modificar el color del objeto bicicleta en cuestión
     * @param color representa el nuevo color de la bicicleta en cuestión
     */
    public void setColor(String color){
        this.color = color;
    }

    /**
     * Este método nos permite obtener la velocidad a la que se encuentra el objeto bicicleta en cuestión
     * @return retorna la velocidad actual de la bicicleta en cuestión
     */
    public double getSpeed(){
        return speed;
    }

    /**
     * Este método nos permite aumentar la velocidad de la bicicleta, a partir de una aceleración proporcionada por el usuario
     * @param acceleration representa la aceleración suministrada por el usuario
     */
    public void pedaling(double acceleration){
        this.speed = this.speed + acceleration;
    }

    /**
     * Este método nos permite disminuir la velocidad de la bicicleta(freno), siempre y cuanto la bicicleta este en movimiento (velocidad > 0)
     */
    public void brake(){
        if(this.speed > 0){
            this.speed--;
        }
    }
}
