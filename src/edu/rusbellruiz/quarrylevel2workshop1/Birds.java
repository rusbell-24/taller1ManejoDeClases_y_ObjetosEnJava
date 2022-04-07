/**
 * Paquete al que pertenece la clase
 */
package edu.rusbellruiz.quarrylevel2workshop1;

/**
 * Esta clase representa algunos atributos destacados de cualquier objeto Ave(pajaros)
 */
public class Birds {
    /**
     * Este atributo epresenta el nombre de la especie del objeto ave
     */
    public String speciesName;
    /**
     * Este atributo representa la altura del objeto ave
     */
    public float height;
    /**
     * Este atributo representa el peso del objeto ave
     */
    public double weight;

    /**
     * Este Constructor nos permite inicializar el objeto con los atributos requeridos
     * @param speciesName representa el nombre del ave en cuestión
     * @param height representa el peso del ave en cuestión
     * @param weight representa el peso del ave en cuestión
     */
    public Birds(String speciesName, float height, double weight) {
        this.speciesName = speciesName;
        this.height = height;
        this.weight = weight;
    }

    /**
     *Este método nos permite modificar el nombre de especie del objeto ave en cuestión
     * @param speciesName representa el nombre de especie del ave en cuestión
     */
    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }

    /**
     * Este método nos permite obtener el nombre de especie del objeto ave en cuestión
     * @return retorna el nombre de especie del ave en cuestión
     */
    public String getSpeciesName() {
        return speciesName;
    }

    /**
     * Este método nos permite modificar la altura del objeto ave en cuestión
     * @param height representa la altura del ave en cuestión
     */
    public void setHeight(float height) {
        this.height = height;
    }

    /**
     * Este método nos permite obtener la altura del objeto ave en cuestión
     * @return retorna la altura del ave en cuestión
     */
    public float getHeight() {
        return height;
    }

    /**
     * Este método nos permite modificar el peso del objeto ave
     * @param weight representa el peso del ave en cuestión
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * Este método nos permite obtener el peso del objeto ave en cuestión
     * @return retorna el peso del ave en cuestión
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Este método nos permite obtener cierta información del objeto en cuestión con un orden definido y de tipo String
     * @return retorna la información indicada sobre el objeto ave en cuestión
     */
    @Override
    public String toString() {
        return "Birds{" +
                "speciesName='" + speciesName + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}

