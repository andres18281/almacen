/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package almacen.modelo.juguetes;

/**
 *
 * @author ubuntu
 */
public class juguetes {
    private String codigo;
    private int valor;
    private String tipo_niño;
    private String Marca;
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
     * @return the tipo_niño
     */
    public String getTipo_niño() {
        return tipo_niño;
    }

    /**
     * @param tipo_niño the tipo_niño to set
     */
    public void setTipo_niño(String tipo_niño) {
        this.tipo_niño = tipo_niño;
    }

    /**
     * @return the Marca
     */
    public String getMarca() {
        return Marca;
    }

    /**
     * @param Marca the Marca to set
     */
    public void setMarca(String Marca) {
        this.Marca = Marca;
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
