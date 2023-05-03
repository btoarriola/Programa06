/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.programa06_2;

import java.util.Iterator;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author btoarriola
 */
public class DAOVenta implements IDAOGeneral<Venta, Long>{

    @Override
    public Venta create(Venta p) {
        try (Session session = HibernateUtil.getSession()) {
            Transaction t = session.beginTransaction();
            session.save(p);
            
            for (Iterator<DetalleVenta> iterator = p.getDetalleventa().iterator(); iterator.hasNext();) {
                session.save(iterator);
            }
            t.commit();
            session.close();
        }
        return p;
    }

    @Override
    public boolean delete(Long id) {
        
        return false;
        
    }

    @Override
    public Venta update(Venta p, Long id) {
        
        return null;
        
    }

    @Override
    public List<Venta> findAll() {
        
        return null;
        
    }

    @Override
    public Venta FindById(Long id) {
        
        return null;
        
    }
    
}
