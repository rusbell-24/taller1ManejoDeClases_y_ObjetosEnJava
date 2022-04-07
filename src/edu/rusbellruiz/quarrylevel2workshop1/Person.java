/**
 * Paquete al que pertenece la clase
 */
package edu.rusbellruiz.quarrylevel2workshop1;


/**
 * Importamos librerías necesarias para el manejo de la clase Date, la clase SimpleDateFormat y el manejo de Excepciones
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Esta clase representa algunos atributos relevantes de cualquier persona
 */
public class Person {
    /**
     * Corresponde al atributo nombre de un objeto person
     */
    public String name;
    /**
     * Corresponde al primer apellido de un objeto person
     */
    public String lastName1;
    /**
     * Corresponde al segundo apellido de un objeto person
     */
    public String lastName2;
    /**
     * Corresponde a la fecha de nacimiento de un objeto person
     */
    public Date dateBirth;
    /**
     * Corresponde al valor de altura de un objeto person en unidad de cm
     */
    public float height;


    /**
     * Constructor que nos permite inicializar el objeto con los atributos requeridos
     *
     * @param name       corresponde al nombre del nuevo objeto person
     * @param lastName1  corresponde al primer apellido del nuevo objeto person
     * @param lastName2  corresponde al segundo apellido  del nuevo objeto person
     * @param dateFormat corresponde a la fecha de nacimiento del nuevo objeto person en formato (dd/mm/aaaa)
     * @param height     corresponde al valor de altura del nuevo objeto person en unidad de cm
     */
    public Person(String name, String lastName1, String lastName2, String dateFormat, float height) {
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        changeFormat(dateFormat);
        this.height = height;
    }


    /**
     * Es un método que nos permite convertir la fecha del usuario ingresada en un formato común (dd/mm/aaaa) al formato que maneja por defecto la clase Date
     *
     * @param date corresponde a la fecha de nacimiento del nuevo objeto person en formato dd/mm/aaaa y de tipo String
     */
    private void changeFormat(String date) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        /**
         * Si todo sale bien hace el cambio de formato de la fecha de nacimiento, de lo contrario nos devuelve una excepción
         */
        try {
            this.dateBirth = format.parse(date);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    /**
     * Este método nos permite modificar el atributo name del objeto en cuestión
     *
     * @param name corresponde al nuevo nombre que llevara el atributo this.name del objeto en cuestion
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * Este método nos permite obtener la información que contiene el atributo name del objeto en cuestión
     *
     * @return nos devuelve el valor del atributo name
     */
    public String getName() {
        return name;
    }


    /**
     * Este método nos permite obtener la información que contiene el atributo dateBirth del objeto en cuestión
     *
     * @return nos devuelve la fecha de nacimiento del objeto en cuestión
     */
    public Date getDateBirth() {
        return dateBirth;
    }


    /**
     * Este método nos permite obtener cierta información del objeto en cuestión con un orden definido y de tipo String
     *
     * @return retorna la información indicada sobre el objeto en cuestión
     */
    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", lastName1='" + lastName1 + '\'' + ", lastName2='" + lastName2 + '\'' +
                ", dateBirth=" + dateBirth + ", height=" + height + "cm" + '}';
    }
}
