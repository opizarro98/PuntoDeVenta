/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import datos.Empresa;
import db.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author opiza
 */
public class EmpresaDAO {
        public static void GuardarEmpresa(Empresa empresa) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.saveOrUpdate(empresa);
        session.getTransaction().commit();
        session.close();

    }
}
