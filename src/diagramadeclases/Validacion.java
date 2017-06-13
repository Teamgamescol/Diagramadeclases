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
public class Validacion {
    private String NickUsuario;
    private String PasswordUsuario;
    
    public void setNickUsuario(String NickUsuariop)
    {
        this.NickUsuario=NickUsuariop;
    }
    public String getNickUsuario()
    {
        return this.NickUsuario;
    }
    
    
    public void setPassword (String PasswordUsuariop)
    {
        this.PasswordUsuario=PasswordUsuariop; 
    }
    public String getPasswordUsuario()
    {
        return this.PasswordUsuario;
    }
    
    
    
    private Privado Privado1;
    public void setPrivado1(Privado Privado1p)
    {
        this.Privado1=Privado1p;
    }
    public Privado getPrivado1()
    {
        return Privado1;
    }
    
    
    private Privado Grupal1;
    public void setGrupal1(Privado Grupal1p)
    {
        this.Grupal1=Grupal1p;
    }
    public Privado getGrupal1()
    {
        return Grupal1;
    }
    
    public void VerificarDatos (){}
    public void Ingresar (){}
    public void ReconocerDNIUsuario(){}
    
}
