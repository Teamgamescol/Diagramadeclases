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
public class Noticias {
    public String InformacionDeNoticia;
    public Date FechaDePublicacionNoticias;
    public String NombreDeNoticia;
    
    public void setInformacionDeNoticia(String InformacionDeNoticiap)
    {
        this.InformacionDeNoticia=InformacionDeNoticiap;
    }
    public String getInformacionDeNoticia()
    {
        return this.InformacionDeNoticia;
    }
    public void setFechaDePublicacionNoticias(Date FechaDePublicacionNoticiasp)
    {
        this.FechaDePublicacionNoticias=FechaDePublicacionNoticiasp;
    }
    public Date getFechaDePublicacionNoticias()
    {
        return this.FechaDePublicacionNoticias;
    }
    public void setNombreDeNoticia(String NombreDeNoticiap)
    {
        this.NombreDeNoticia=NombreDeNoticiap;
    }
    public String getNombreDeNoticia()
    {
        return this.NombreDeNoticia;
    }
    
    public void CrearNoticia(){}
    public void ModificarNoticia(){}
    public void EliminarNoticia(){}
}
