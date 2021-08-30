package pl.javastart.equipy;

public class UserMapper {

    static UserDTO toDTO(User user){
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setFirstName(user.getFirstName());
        userDTO.setLastName(user.getLastName());
        userDTO.setPesel(user.getPesel());
        return userDTO;
    }

    static User toUser(UserDTO userDTO){
        User user = new User();
        user.setId(userDTO.getId());
        user.setFirstName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());
        user.setPesel(userDTO.getPesel());
        return user;
    }
}
