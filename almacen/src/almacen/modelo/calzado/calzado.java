/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package almacen.modelo.calzado;

/**
 *
 * @author ubuntu
 */
public class calzado {
    private String codigo;
    private String color;
    private int talla;
    private String tipo_calzado;
    private int item;
    private String tipo_persona;
    private String sexo;
    private int valor;
    private int nit_provedor;
    private String descripcion;

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the talla
     */
    public int getTalla() {
        return talla;
    }

    /**
     * @param talla the talla to set
     */
    public void setTalla(int talla) {
        this.talla = talla;
    }

    /**
     * @return the item
     */
    public int getItem() {
        return item;
    }

    /**
     * @param item the item to set
     */
    public void setItem(int item) {
        this.item = item;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }

    /**
     * @return the nit_provedor
     */
    public int getNit_provedor() {
        return nit_provedor;
    }

    /**
     * @param nit_provedor the nit_provedor to set
     */
    public void setNit_provedor(int nit_provedor) {
        this.nit_provedor = nit_provedor;
    }

    /**
     * @return the tipo_calzado
     */
    public String getTipo_calzado() {
        return tipo_calzado;
    }

    /**
     * @param tipo_calzado the tipo_calzado to set
     */
    public void setTipo_calzado(String tipo_calzado) {
        this.tipo_calzado = tipo_calzado;
    }

    /**
     * @return the tipo_persona
     */
    public String getTipo_persona() {
        return tipo_persona;
    }

    /**
     * @param tipo_persona the tipo_persona to set
     */
    public void setTipo_persona(String tipo_persona) {
        this.tipo_persona = tipo_persona;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
