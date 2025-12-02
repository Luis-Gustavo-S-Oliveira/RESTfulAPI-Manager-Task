package Manager.task.RESTfulApi.service;

import Manager.task.RESTfulApi.model.User;
import Manager.task.RESTfulApi.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User userCreate(User user) {
        if(userRepository.existsByEmail(user.getEmail())){
            throw new RuntimeException("Email already exists");
        }
        return userRepository.save(user);

    }

    public User userFindById(Long id){
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }
}
