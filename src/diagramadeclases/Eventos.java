/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagramadeclases;

import java.util.Date;

/**
 *
 * @author sena
 */
public class Eventos {
    private String InformacionEvento;
    private Date FechaPublicacionEvento;
    private String NombreEvento;
    
    
    public void setInformacionEvento(String InformacionEventop)
    {
        this.InformacionEvento=InformacionEventop;
    }
    public String getInformacionEvento()
    {
        return this.InformacionEvento;
    }
    
    
    public void setFechaPublicacionEvento(Date FechaPublicacionEventop)
    {
        this.FechaPublicacionEvento=FechaPublicacionEventop;
    }
    public Date getFechaPublicacionEvento()
    {
        return this.FechaPublicacionEvento;
    }
    
    
    public void setNombreEvento(String NombreEventop)
    {
        this.NombreEvento=NombreEventop;
    }
    public String getNombreEvento()
    {
        return this.NombreEvento;
    }   
    
    
public void CrearEvento(){}
public void ModificarEvento(){}
public void EliminarEvento(){}

}
