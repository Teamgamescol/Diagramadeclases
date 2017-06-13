/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagramadeclases;

import java.util.Date;

/**
 *
 * @author SENA
 */
public class Publicaciones {
    public String InformacionDePublicacion;
    public Date FechaDePublicacion;
    public String NombreDePublicacion;
    
    public void setInformacionDePublicacion(String InformacionDePublicacionp)
    {
        this.InformacionDePublicacion=InformacionDePublicacionp;
    }
    public String getInformacionDePublicacion()
    {
        return this.InformacionDePublicacion;
    }
    
    public void setFechaDePublicacion(Date FechaDePublicacionp)
    {
        this.FechaDePublicacion=FechaDePublicacionp;
    }
    public Date getFechaDePublicacion()
    {
        return this.FechaDePublicacion;
    }
    public void setNombreDePublicacion(String NombreDePublicacionp)
    {
        this.NombreDePublicacion=NombreDePublicacionp;
    }
    public String getNombreDePublicacion()
    {
        return this.NombreDePublicacion;
    }
    
    public void CrearPublicacion(){}
    public void ModificarPublicacion(){}
    public void EliminarPublicacion(){}
    
}
