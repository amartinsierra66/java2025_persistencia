package dao;

import static locator.LocatorEntityManager.getEntityManager;

import java.util.List;

import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;
import model.Cuenta;
import model.Movimiento;
class MovimientosDaoImpl implements MovimientosDao {

	@Override
	public List<Movimiento> findByCuenta(int idCuenta) {
		String jpql="select m from Movimiento m where m.idCuenta=?1";
		TypedQuery<Movimiento> query=getEntityManager().createQuery(jpql,Movimiento.class);
		query.setParameter(1, idCuenta);
		return query.getResultList();
	} 

	@Override
	public void save(Movimiento movimiento) {
		EntityTransaction tx=getEntityManager().getTransaction();
		tx.begin();
		getEntityManager().persist(movimiento);
		tx.commit();
		
	} 

}
