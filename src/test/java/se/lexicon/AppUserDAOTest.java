package se.lexicon;

import se.lexicon.dao.AppUserDAO;
import se.lexicon.dao.AppUserDAOCollection;

import java.util.Collection;

public class AppUserDAOTest {
    public static void main(String[] args) {
        AppUserDAO appUserDAO = new AppUserDAOCollection();

        appUserDAO.persist(new AppUser("sergiu", "password1"));
        appUserDAO.persist(new AppUser("nicolae", "password2"));

        AppUser user = appUserDAO.findByUsername("sergiu");
        System.out.println(user);

        Collection<AppUser> users = appUserDAO.findAll();
        System.out.println(users);
    }
}
