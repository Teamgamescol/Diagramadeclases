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
public class Usuario {
    
    private int DNIUsuario;
    private String NickUsuario;
    private String PasswordUsuario;
    private String FotoUsuario;
    private String DescripcionUsuario;
    private String Nombre;
    private String Apellido;
    private String Email;
    private String ciudad;
    private String Rol;
    private String Genero;
    private String telefono;
    private String pais;
    
    public void setDNIUsuario( int DNIUsuariop)
    {
        this.DNIUsuario=DNIUsuariop;
    }
    
    public int getDNIUsuario ()
    {
        return this.DNIUsuario;
    }
    
    
    public void setNickUsuario(String NickUsuariop)
    {
        this.NickUsuario=NickUsuariop;
    }
    public String getNickUsuario ()
    {
        return this.NickUsuario;
    }
    
    
    public void setPasswordUsuario(String PasswordUsuariop)
    {
        this.PasswordUsuario=PasswordUsuariop;
    }
    public String getPasswordUsuario()
    {
        return this.PasswordUsuario;
    }
    
    
    public void setFotoUsuario(String FotoUsuariop)
    {
        this.FotoUsuario=FotoUsuariop;
    }
    public String getFotoUsuario()
    {
        return this.FotoUsuario;
    }
    
    
    public void setDescripcionUsuario(String DescripcionUsuariop)
    {
        this.DescripcionUsuario=DescripcionUsuariop;
    }
    public String getDescripcionUsuario()
    {
        return this.DescripcionUsuario;
    }
    
    
    public void setNombre(String Nombbrep)
    {
        this.Nombre=Nombbrep;
    }
    public String getNombre()
    {
        return this.Nombre;
    }
    
    
    public void setApellido(String Apellidop)
    {
        this.Apellido=Apellidop;
    }
    public String getApellido()
    {
        return this.Apellido;
    }
    
    
    public void setEmail(String Emailp)
    {
        this.Email=Emailp;
    }
    public String getEmail()
    {
        return this.Email;
    }
    
    
    public void setCiudad (String Ciudadp)
    {
        this.ciudad=Ciudadp;
    }
    public String getCiudad()
    {
        return this.ciudad;
    }
    
    
    public void setRol(String Rolp)
    {
        this.Rol=Rolp;
    }
    public String getRol()
    {
        return this.Rol;
    }
    
    
    public void setGenero(String Generop)
    {
        this.Genero=Generop;
    }
    public String getGenero()
    {
        return this.Genero;
    }
    
    
    public void getTelefono(String Telefonop)
    {
        this.telefono=Telefonop;
    }
    public String getTelefono()
    {
        return this.telefono;
    }
    
    public void setPais(String Paisp)
    {
        this.pais=Paisp;
    }
    public String getPais()
    {
        return this.pais;
    }
    
    private Validacion Validacion1;
    public void setValidacion1(Validacion Validacionp)
    {
        this.Validacion1=Validacionp;
    }
     public Validacion getValidacion1()
     {
         return Validacion1;
     }
    
     
     private Publico Publico1;
     public void setPublico1(Publico Publico1p)
     {
         this.Publico1=Publico1p;
     }
     public Publico getPublico1()
     {
         return Publico1;
     }
    
     
     private Eventos Eventos1;
     public void getEventos1(Eventos Eventos1p)
     {
         this.Eventos1= Eventos1p;
     }
     public Eventos getEventos1()
     {
         return Eventos1;
     }
     
     
     private Articulos Articulos1;
     public void setArticulos1(Articulos Articulos1p)
     {
         this.Articulos1=Articulos1p;
     }
     public Articulos getArticulos1()
     {
         return Articulos1;
     }
    public void crearUsuario(){}
    public void MoficarUsuario(){}
    public void DesactivarUsuario(){}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

