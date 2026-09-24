package fr.miage.mbds.lc_estia_26_27.mappers;

import fr.miage.mbds.lc_estia_26_27.dtos.UserDTO;
import fr.miage.mbds.lc_estia_26_27.entities.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserMapper {

    public UserDTO toUserDTO(User user)
    {
        return new UserDTO(user.getId(), user.getFirstName(), user.getLastName());
    }

    public User toUserEntity(UserDTO UserDTO)
    {
        return new User(null, UserDTO.getFirstName(), UserDTO.getLastName());
    }

    public List<UserDTO> toUserDTOList(List<User> userList)
    {
        return userList.stream().map(this::toUserDTO).toList();
    }

    public List<User> toUserEntityList(List<UserDTO> UserDTOList)
    {
        return UserDTOList.stream().map(this::toUserEntity).toList();
    }
}
