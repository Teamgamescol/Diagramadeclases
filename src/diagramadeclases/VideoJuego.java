/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagramadeclases;

/**
 *
 * @author SENA
 */
public class VideoJuego {
   public String NombreJuego;
    public String ImagenJuego;
    public String GeneroJuego;
    public String CalificacionJuego;
    public String Existencias;
    public String Precio;
    public String Descripcion;
    public RequerimientosVideojuego  RequerimientosVideojuego1= new RequerimientosVideojuego();
    
    public void setNombreJuego(String NombreJuegop)
    {
        this.NombreJuego=NombreJuegop;
    }
    public String getNombreJuego()
    {
        return this.NombreJuego;
    }
    public void setImagenJuego(String ImagenJuegop)
    {
        this.ImagenJuego=ImagenJuegop;
    }
    public String getImagenJuego()
    {
        return this.ImagenJuego;
    }
    public void setGeneroJuego(String GeneroJuegop)
    {
        this.GeneroJuego=GeneroJuegop;
    }        
    public String getGeneroJuego()
    {
    return this.GeneroJuego;
    }        
    public void setCalificacionJuego(String CalificacionJuegop)
    {
        this.CalificacionJuego=CalificacionJuegop;
    }
    public String getCalificacionJuego()
    {
        return this.CalificacionJuego;
    }
    public void setExistencias(String Existenciasp)
    {
        this.Existencias=Existenciasp;
    }
    public String getExistencias()
    {
        return this.Existencias;
    }
    public void setPrecio(String Preciop)
    {
        this.Precio=Preciop;
    }
    public String getPrecio()
    {
        return this.Precio;
    }
    public void setDescripcion(String Descripcionp)
    {
        this.Descripcion=Descripcionp;
    }
    public String getDescripcion()
    {
        return this.Descripcion;
    }
    public void AnadirVideojuego(){}
    public void ConsultarSobreVideojuego(){}
    public void ComprarVideoJuego(){}
    public void ModificarInformacionVideojuego(){}
}
