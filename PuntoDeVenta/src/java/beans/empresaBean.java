/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import dao.EmpresaDAO;
import datos.Empresa;
import java.io.Serializable;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Oscar Pizarro
 */

@ManagedBean(name = "empresaBean")
@SessionScoped
public class empresaBean implements Serializable{
    
    /**
     * DECLARACION DE METODOS
     */
    private Empresa empresa;

    
    /**
     * CONTRUCTOR
     */
    
    public empresaBean() {
        initDatos();
    }
    
    
    /**
     * METODO QUE INCIALIZA LOS DATOS
     */
    
   public void initDatos(){
       empresa =  new Empresa();
   }
   
   /**
    * METODO QUE GUARDA DATOS DE LA EMPRESA
    */
   public void guardarDatos(){
       empresa.setEmpid(1);
       empresa.setFechacrea(new Date());
       empresa.setFechamodi(new Date());
       empresa.setUsuariocrea("Oscar");
       empresa.setUsuariomodi("Oscar");
       EmpresaDAO.GuardarEmpresa(empresa);
   }
   
   
   
   //METODOS GET Y SETT //

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    
   
   
    
}
