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
public class Articulos {
    
   private String InformacionArticulo;
   private Date  FechaPublicacionArticulo;
   private String NombreArticulo;
   
   
   public void setInformcionArticulo(String InformacionArticulop)
   {
       this.InformacionArticulo=InformacionArticulop;
   }
   public String getInformacionArticulo()
   {
       return this.InformacionArticulo;
   }
   
   
   public void setFechaPublicacionArticulo( Date FechaPublicacionArticulop)
   {
       this.FechaPublicacionArticulo= FechaPublicacionArticulop;
   }
   public Date getFechaPublicacionArticulo()
   {
       return this.FechaPublicacionArticulo;
   }
   
   
   public void setNombreArticulo(String NombreArticulop)
   {
       this.NombreArticulo=NombreArticulop;
   }
   public String getNombreArticulo()
   {
       return this.NombreArticulo;
   }
   
   
   
   public void CrearArticulo(){}
   public void ModificarArticulo(){}
   public void EliminarArticulo(){}
           
   
}
