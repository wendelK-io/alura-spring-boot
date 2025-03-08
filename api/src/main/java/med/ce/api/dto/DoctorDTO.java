package med.ce.api.dto;

import med.ce.api.model.Specialty;

public record DoctorDTO(String name, String email, String crm, Specialty specialty, AddressDTO address) {
}
