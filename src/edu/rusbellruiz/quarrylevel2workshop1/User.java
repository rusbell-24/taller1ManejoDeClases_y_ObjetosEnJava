/**
 * Paquete al que pertenece la clase
 */
package edu.rusbellruiz.quarrylevel2workshop1;

/**
 * Esta clase representa algunos atributos relevantes de cualquier objeto Usuario
 */
public class User {
    /**
     * Corresponde al nombre de usuario de un objeto Usuario
     */
    public String userName;
    /**
     * Corresponde a la contraseña de un objeto Usuario
     */
    private String password;

    /**
     * Constructor que nos permite inicializar el objeto Usuario con los atributos requeridos
     * @param userName corresponde al nombre de usuario del nuevo objeto Usuario
     * @param password corresponde a la contraseña  del nuevo objeto Usuario
     */
    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    /**
     * Este método nos permite mostrar en consola un saludo departe de usuario en cuestión con su userName
     */
    void greet(){
        System.out.println("hola, mi usurio es:" + userName);
    }

    /**
     * Este método nos permite obtener la  contraseña  del objeto Usuario en cuestión
     * @return retorna la contraseña del objeto Usuario en cuestión
     */
    public String getPassword(){
        return this.password;
    }

    /**
     * Este método nos permite modificar la contrasela del objeto Usuario en cuestión
     * @param pass representa el valor de la nueva contraseña
     */
    public void setPassword(String pass){
        password = pass;
    }
}
