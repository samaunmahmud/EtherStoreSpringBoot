package org.alphaspring.etherstore;



public interface UserRepository {

    public void save(User user);
    User findByEmail(String email);

}
