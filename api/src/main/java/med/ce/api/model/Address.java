package med.ce.api.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.ce.api.dto.AddressDTO;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Address {
    private String street;
    private String neighborhood;
    private String number;
    private String city;
    private String state;
    private String zipcode;
    public Address(AddressDTO address) {
        this.street = address.street();
        this.neighborhood = address.neighborhood();
        this.number = address.number();
        this.city = address.city();
        this.state = address.state();
        this.zipcode = address.zipcode();
    }
}
