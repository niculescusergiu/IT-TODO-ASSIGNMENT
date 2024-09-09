package se.lexicon.dao.interfaces;

import Model.AppUser;

import java.util.Collection;

public interface AppUserDAO {
    AppUser persist(AppUser appUser);
    AppUser findByUsername(String username);
    Collection<AppUser> findAll();
    void remove(String username);
}
