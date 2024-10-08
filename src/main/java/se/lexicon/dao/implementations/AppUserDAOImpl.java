package se.lexicon.dao.implementations;

import Model.AppUser;
import se.lexicon.dao.interfaces.AppUserDAO;

import java.util.ArrayList;
import java.util.Collection;

public class AppUserDAOImpl implements AppUserDAO {
    private Collection<AppUser> appUsers;

    public AppUserDAOImpl() {
        this.appUsers = new ArrayList<>();
    }
    @Override
    public AppUser persist(AppUser appUser) {
        appUsers.add(appUser);
        return appUser;
    }
    @Override
    public AppUser findByUsername(String username){
        for (AppUser appUser : appUsers) {
            if (appUser.getUsername().equals(username)) {
                return appUser;
            }
        }
        return null;
    }

    @Override
    public Collection<AppUser> findAll() {
        return new ArrayList<>(appUsers);
    }

    @Override
    public void remove(String username) {
        appUsers.removeIf(appUser -> appUser.getUsername().equals(username));
    }
}
