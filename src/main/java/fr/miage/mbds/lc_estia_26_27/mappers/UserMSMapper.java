package fr.miage.mbds.lc_estia_26_27.mappers;

import fr.miage.mbds.lc_estia_26_27.dtos.UserDTO;
import fr.miage.mbds.lc_estia_26_27.entities.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMSMapper {
    public UserDTO toUserDTO(User user);

    public User toUserEntity(UserDTO userDTO);

    public List<UserDTO> toUserDTOList(List<User> userList);

    public List<User> toUserEntityList(List<UserDTO> userDTO);
}
