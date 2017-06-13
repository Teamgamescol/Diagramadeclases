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
public class Compras {
    public int CodigoCompra;
    public double precio;
    public String NombreArticulo;
    public String FormaDePago;
    
    public void setCodigoCompra(int CodigoComprap)
    {
        this.CodigoCompra=CodigoComprap;
    }
    public int getCodigoCompra()
    {
        return this.CodigoCompra;
    }
    public void setprecio(double preciop)
    {
        this.precio=preciop;
    }
    public double getprecio()
    {
        return this.precio;
    }
    public void setNombreArticulo(String NombreArticulop)
    {
        this.NombreArticulo=NombreArticulop;
    }
    public String getNombreArticulo()
    {
        return this.NombreArticulo;
    }
    public void setFormaDePago(String FormaDePagop)
    {
        this.FormaDePago=FormaDePagop;
    }
    public String getFormaDePago()
    {
        return this.FormaDePago;
    }
    
    public void AbquirirUnVideojuego(){}
}
