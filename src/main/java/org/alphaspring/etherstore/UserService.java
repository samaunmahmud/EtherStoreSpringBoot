package org.alphaspring.etherstore;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final NotificationService notificatonService;

    public UserService(UserRepository userRepository, NotificationService notificatonService) {
        this.notificatonService = notificatonService;
        this.userRepository = userRepository;
    }

    public void registerUser(User user) {
        if (userRepository.findByEmail(user.getEmail()) != null) {
            // ✅ Use IllegalArgumentException instead of IllegalAccessException
            throw new IllegalArgumentException("User with email " + user.getEmail() + " already exists");
        }

        userRepository.save(user);
        notificatonService.send("You registered successfully!", user.getEmail());
    }
}