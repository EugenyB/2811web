package beans;

import dao.AuthorDAO;
import tables.Author;

import javax.ejb.EJB;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

/**
 * Created by eugeny on 28.11.2016.
 */
@Named
@SessionScoped
public class AuthorBean implements Serializable {
    @EJB
    AuthorDAO authorDAO;

    public List<Author> getAuthors() {
        return authorDAO.findAll();
    }

    public String delete(int id) {
        authorDAO.delete(id);
        return "index";
    }
}
