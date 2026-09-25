package fr.miage.mbds.lc_estia_26_27.dtos;

import fr.miage.mbds.lc_estia_26_27.entities.User;
import jakarta.persistence.*;
import lombok.*;

public class AddressDTO {
    private Long id;
    private String street;
    private String city;
    private String zipCode;
    private UserDTO user;
}
