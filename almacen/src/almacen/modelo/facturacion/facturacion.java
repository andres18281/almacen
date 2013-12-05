/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package almacen.modelo.facturacion;

import java.util.List;
import sun.util.calendar.BaseCalendar.Date;

/**
 *
 * @author ubuntu
 */
public class facturacion {
    private int cod_facturacion;
    private int cedula;
    private Date fecha_venta;
    private int total;
    private List<String> item;
    private List<?> talla;
    private List<String> tipo_producto;

    /**
     * @return the cod_facturacion
     */
    public int getCod_facturacion() {
        return cod_facturacion;
    }

    /**
     * @param cod_facturacion the cod_facturacion to set
     */
    public void setCod_facturacion(int cod_facturacion) {
        this.cod_facturacion = cod_facturacion;
    }

    /**
     * @return the cedula
     */
    public int getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the fecha_venta
     */
    public Date getFecha_venta() {
        return fecha_venta;
    }

    /**
     * @param fecha_venta the fecha_venta to set
     */
    public void setFecha_venta(Date fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    /**
     * @return the total
     */
    public int getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * @return the item
     */
    public List getItem() {
        return item;
    }

    /**
     * @param item the item to set
     */
    public void setItem(List item) {
        this.item = item;
    }

    /**
     * @return the tipo_producto
     */
    public List<String> getTipo_producto() {
        return tipo_producto;
    }

    /**
     * @param tipo_producto the tipo_producto to set
     */
    public void setTipo_producto(List<String> tipo_producto) {
        this.tipo_producto = tipo_producto;
    }

    /**
     * @return the talla
     */
    public List<?> getTalla() {
        return talla;
    }

    /**
     * @param talla the talla to set
     */
    public void setTalla(List<?> talla) {
        this.talla = talla;
    }

    /**
     * @return the talla
     */

}
