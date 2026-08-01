package org.alphaspring.etherstore;


import org.springframework.stereotype.Repository;

import java.util.HashMap;
@Repository
public class InMemoryUserRepository implements UserRepository{

    HashMap<String, User> users = new HashMap<>();

    @Override
    public void save(User user) {
        System.out.println("Saving User: "+user);
        users.put(user.getEmail(), user);


    }

    @Override
    public User findByEmail(String email) {
        return users.getOrDefault(email, null);
    }
}
