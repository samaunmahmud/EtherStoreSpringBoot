package org.alphaspring.etherstore;


import org.alphaspring.etherstore.entities.User;
import org.alphaspring.etherstore.repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EtherStoreApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(EtherStoreApplication.class, args);



        var repository =  context.getBean(UserRepository.class);

//        var user = User.builder()
//                .name("John")
//                .email("samaunmahmud@gmail.com")
//                .password("password")
//                .build();
//
//        repository.save(user);

        var user = repository.findById(1L).orElse(null);

//        System.out.println(user.getEmail());
//

        repository.deleteById(1L);

















//        var user  = new User();
//        user.setName("Sam");
//        user.setEmail("Samaun@gmail.com");
//        user.setPassword("jaouajó3f2f$22");
//
////        var user = User.builder()
////                .name("Samaun")
////                .password("jhah4onsia")
////                .email("samaun@gmail.com")
////                .build();
//
//
//        user.addTag("tag1");
//
//
//
//        var profile = Profile.builder()
//                        .bio("bio")
//                                .build();
//
//        user.setProfile(profile);
//        profile.setUser(user);
//
//
//
//
//
//
//
//        System.out.println(user);
//
//







    }
}
