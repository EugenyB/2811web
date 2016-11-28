package dao;

import tables.Author;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by eugeny on 28.11.2016.
 */
@Stateless
public class AuthorDAO {
    @PersistenceContext
    EntityManager em;

    public List<Author> findAll() {
        return em.createQuery("select a from Author a").getResultList();
    }

    public Author find(int id) {
        return em.find(Author.class, id);
    }

    public void delete(int id) {
        Author author = find(id);
        em.remove(author);
    }
}
