/**
 * Paquete al que pertenece la clase
 */
package edu.rusbellruiz.quarrylevel2workshop1;

/**
 * Esta clase representa algunos atributos destacados de cualquier cuenta Bancaria
 */
public class BankAccount {
    /**
     * Este atributo representa el número de la cuenta bancaria
     */
    private int accountNumber;
    /**
     * Este atributo representa el estado de activación en el que se encuentra la cuenta bancaria, la inicializamos como desactivada(false)
     */
    protected boolean activated = false;
    /**
     * Este atributo permitirá al usuario modificar el estado de activación de la cuenta bancaria
     */
    public boolean actived;

    /**
     *Constructor que nos permite inicializar el objeto con estos atributos como requisito
     * @param accountNumber representa el número de la cuenta bancaria en cuestión
     * @param actived se solicita el estado de activación de la cuenta bancaria en cuestión
     */
    public BankAccount(int accountNumber, boolean actived) {
        this.accountNumber = accountNumber;
        this.actived = actived;
        /**
         * Llamamos al metodo set del atributo actived, para que actualice el estado de activación de la cuenta según la información suministrada por el usuario
         */
        setActived(this.actived);
    }

    /**
     * Este método permite modificar el estado de activación de la cuenta bancaria
     * @param actived atributo que sirve como modificador de estado de activación
     */
    public void setActived(boolean actived) {
        /**
         * Actualizamos el modificador de estado de activación al valor recibido como parámetro
         */
        this.actived = actived;
        /**
         * Actualizamos el estado de activación al valor que tenga el modificador de estado de activación
         */
        this.activated = this.actived;
    }

    /**
     * Este método nos permite obtener el valor que contiene el modificador de estado de activación
     * * @return retorna el valor del atributo actived
     */
    public boolean getActived() {
        return actived;
    }

}
