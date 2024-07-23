
package persistencia;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import logica.Contador;
import persistencia.exceptions.NonexistentEntityException;


public class ContadorJpaController implements Serializable {

    public ContadorJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    //Vamos a crear el constructor de JPA Controller poniendo dentro el nombre de la Uniti of Persistence
    //Cuando necesitemos usar los CRUD, esto crea una instancia en la entityManagerFactory para que podamos hacer uso de cada elemento
    //Este lo tenemos que tener en todas las clases controller
    public ContadorJpaController() {
        emf = Persistence.createEntityManagerFactory("DespachoContable_PU");
    }

    public void create(Contador contador) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(contador);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Contador contador) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            contador = em.merge(contador);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = contador.getId();
                if (findContador(id) == null) {
                    throw new NonexistentEntityException("The contador with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Contador contador;
            try {
                contador = em.getReference(Contador.class, id);
                contador.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The contador with id " + id + " no longer exists.", enfe);
            }
            em.remove(contador);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Contador> findContadorEntities() {
        return findContadorEntities(true, -1, -1);
    }

    public List<Contador> findContadorEntities(int maxResults, int firstResult) {
        return findContadorEntities(false, maxResults, firstResult);
    }

    private List<Contador> findContadorEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Contador.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Contador findContador(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Contador.class, id);
        } finally {
            em.close();
        }
    }

    public int getContadorCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Contador> rt = cq.from(Contador.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
