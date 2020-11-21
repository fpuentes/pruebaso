/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesionbeanpk;

import entidades.Shippers;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author fpuentes
 */
@Stateless
public class ShippersFacade extends AbstractFacade<Shippers> {

    @PersistenceContext(unitName = "Clase23PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ShippersFacade() {
        super(Shippers.class);
    }
    
}
