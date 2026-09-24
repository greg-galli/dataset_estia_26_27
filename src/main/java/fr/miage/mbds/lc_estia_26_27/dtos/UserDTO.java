package fr.miage.mbds.lc_estia_26_27.dtos;

import lombok.*;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class UserDTO {
    private Long id;

    private String firstName;

    private String lastName;
}
