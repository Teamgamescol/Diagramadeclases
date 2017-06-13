/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagramadeclases;

/**
 *
 * @author sena
 */
public class Privado extends Chats {
    private String Mensaje;
    
    public void setMensaje(String Mensajep)
    {
        this.Mensaje=Mensajep;
    }
    public String getMensaje()
    {
        return this.Mensaje;
    }
    
    
    private void MandarMensaje1persona(){}
}
