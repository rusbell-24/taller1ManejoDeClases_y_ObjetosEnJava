/**
 * Paquete al que pertenece la clase
 */
package edu.rusbellruiz.quarrylevel2workshop1;


/**
 * Importamos la librería ArrayList para poder hacer uso de sus métodos por medio del atributo colors
 */

import java.util.ArrayList;


/**
 * Esta clase representa algunos atributos destacados de cualquier objeto Fruta
 */
public class Fruit {
    /**
     * Este atributo representa el nombre del objeto fruta
     */
    public String name;
    /**
     * Este atributo representa el peso medio del objeto fruta
     */
    private float averageWeight;
    /**
     * Este atributo representa el color del objeto fruta
     */
    public String color;
    /**
     * En caso de que el objeto fruta tenga más de un color, podemos añadir los demás colores a este ArrayList usando el método set del atributo color
     */
    public ArrayList<String> colors = new ArrayList<String>();


    /**
     * Constructor que nos permite inicializar el objeto con estos atributos como requisito
     *
     * @param name          representa el nombre del objeto fruta en cuestión
     * @param averageWeight representa el peso medio del objeto fruta en cuestión
     * @param color         representa el color del objeto fruta en cuestión
     */
    public Fruit(String name, float averageWeight, String color) {
        this.name = name;
        this.averageWeight = averageWeight;
        this.color = color;
        /**
         * llamamos al método set del atributo color para añadir a nuestro ArrayList este primer color que se exige desde el método constructor
         */
        setColor(this.color);
    }


    /**
     * Este método nos permite cambiar el valor del atributo color, y además añadir al Arraylist todos los colores que han sido ingresados para dicho objeto
     *
     * @param color atributo que contiene el valor del ultimo color que se ha ingresado para el objeto en cuestión
     */
    public void setColor(String color) {
        this.color = color;
        this.colors.add(this.color);
    }


    /**
     * Este método nos permite saber el valor que contiene el atributo color del objeto en cuestión
     *
     * @return Retorna el valor actual del atributo color
     */
    public String getColor() {
        return this.color;
    }


    /**
     * Este método nos permite obtener información de todos los colores que se han ingresado para el objeto en cuestión, ordenados en un ArrayList
     *
     * @return retorna el arreglo de colores pertenecientes al objeto en cuestión
     */
    public ArrayList<String> getColors() {
        return this.colors;
    }


    /**
     * Este método nos permite obtener cierta información del objeto en cuestión con un orden definido y de tipo String
     *
     * @return retorna la información indicada sobre el objeto en cuestión
     */
    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", averageWeight=" + averageWeight +
                ", color='" + color + '\'' +
                ", colors=" + colors +
                '}';
    }
}
