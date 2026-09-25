package fr.miage.mbds.lc_estia_26_27.mappers;

import fr.miage.mbds.lc_estia_26_27.dtos.AddressDTO;
import fr.miage.mbds.lc_estia_26_27.dtos.AddressDTO;
import fr.miage.mbds.lc_estia_26_27.entities.Address;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AddressMSMapper {
    public AddressDTO toAddressDTO(Address address);

    public Address toAddressEntity(AddressDTO addressDTO);

    public List<AddressDTO> toAddressDTOList(List<Address> addressList);

    public List<Address> toAddressEntityList(List<AddressDTO> addressDTO);
}
