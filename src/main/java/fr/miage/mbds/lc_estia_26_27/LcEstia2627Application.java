package fr.miage.mbds.lc_estia_26_27;

import fr.miage.mbds.lc_estia_26_27.entities.Address;
import fr.miage.mbds.lc_estia_26_27.entities.User;
import fr.miage.mbds.lc_estia_26_27.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class LcEstia2627Application {

    public static void main(String[] args) {
        SpringApplication.run(LcEstia2627Application.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository)
    {
        return args -> {
            // On crée une liste de prénoms
            List<String> users = List.of("Alice", "Bob", "Charlie");
            // On crée une liste vide qui contiendra la liste des utilisateurs à créer
            List<User> usersList = new ArrayList<>();
            // On itère sur la liste et on crée les utilisateurs correspondants
            for (String user : users) {
                User userInstance = User.builder()
                        .firstName(user)
                        .lastName("Dupont")
                        .email(user + "dupont@estia.fr")
                        .address(Address.builder().street("Street").zipCode("12345").city("Bidart").build())
                        .build();
                userInstance.getAddress().setUser(userInstance);
                usersList.add(userInstance);
            }
            // On persiste les utilisateurs dans la base de données
            userRepository.saveAll(usersList);
        };
    }

}
