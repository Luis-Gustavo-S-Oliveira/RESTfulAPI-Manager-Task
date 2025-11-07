package Manager.task.RESTfulApi.service;

import Manager.task.RESTfulApi.model.User;
import Manager.task.RESTfulApi.repository.UserRepository;

public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User save(User user) {
        if(userRepository.existsById(user.getId())){
            throw  new RuntimeException("User with id " + user.getId() + " already exists");
        }
        return userRepository.save(user);
    }
}
