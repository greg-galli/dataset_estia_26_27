package fr.miage.mbds.lc_estia_26_27.services;

import fr.miage.mbds.lc_estia_26_27.dtos.UserDTO;
import fr.miage.mbds.lc_estia_26_27.entities.User;
import fr.miage.mbds.lc_estia_26_27.mappers.UserMSMapper;
import fr.miage.mbds.lc_estia_26_27.mappers.UserMapper;
import fr.miage.mbds.lc_estia_26_27.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService{

    private final UserRepository userRepository;
    private final UserMSMapper userMapper;

    @Autowired
    public UserService(UserRepository userRepository, UserMSMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    public UserDTO createUser(UserDTO userDTO) {
        User user = userMapper.toUserEntity(userDTO);
        user = userRepository.save(user);
        return userMapper.toUserDTO(user);
    }

    public UserDTO getUserById(Long id) {
        User user = userRepository.findById(id).orElse(null);
        return userMapper.toUserDTO(user);
    }

    public List<UserDTO> getAllUsers() {
        List<User> userList = userRepository.findAll();
        return userMapper.toUserDTOList(userList);
    }
}
