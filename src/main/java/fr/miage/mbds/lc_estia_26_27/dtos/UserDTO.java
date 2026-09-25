package fr.miage.mbds.lc_estia_26_27.dtos;

import fr.miage.mbds.lc_estia_26_27.entities.Address;
import lombok.*;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class UserDTO {
    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private Address address;
}
