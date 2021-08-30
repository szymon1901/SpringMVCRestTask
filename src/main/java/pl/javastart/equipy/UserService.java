package pl.javastart.equipy;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    List<UserDTO> findAll(){
        return  userRepository
                .findAll()
                .stream()
                .map(UserMapper::toDTO)
                .collect(Collectors.toList());
    }
}
