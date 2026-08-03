package org.alphaspring.etherstore;


import org.alphaspring.etherstore.entities.Address;
import org.alphaspring.etherstore.entities.Profile;
import org.alphaspring.etherstore.entities.Tag;
import org.alphaspring.etherstore.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.annotation.Order;
import java.util.Scanner;

@SpringBootApplication
public class EtherStoreApplication {

    public static void main(String[] args) {

//        ApplicationContext context = SpringApplication.run(EtherStoreApplication.class, args);

        var user  = new User();
        user.setName("Sam");
        user.setEmail("Samaun@gmail.com");
        user.setPassword("jaouajó3f2f$22");

//        var user = User.builder()
//                .name("Samaun")
//                .password("jhah4onsia")
//                .email("samaun@gmail.com")
//                .build();


        user.addTag("tag1");



        var profile = Profile.builder()
                        .bio("bio")
                                .build();

        user.setProfile(profile);
        profile.setUser(user);







        System.out.println(user);








    }
}
