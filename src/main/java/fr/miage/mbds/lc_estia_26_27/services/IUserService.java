package fr.miage.mbds.lc_estia_26_27.services;

import fr.miage.mbds.lc_estia_26_27.dtos.UserDTO;

import java.util.List;

public interface IUserService {
    public UserDTO createUser(UserDTO userDTO);
    public UserDTO getUserById(Long id);
    public List<UserDTO> getAllUsers();
}
