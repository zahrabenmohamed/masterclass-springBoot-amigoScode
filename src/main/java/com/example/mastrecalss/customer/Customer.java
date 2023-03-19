package com.example.mastrecalss.customer;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;


@Data
@AllArgsConstructor
public class Customer {

    @JsonProperty("customerId")
    private final Long id;
    @NotBlank(message = "name is missing please enter name ")
    private final String name;

    @NotBlank(message = "password is missing")
    @JsonProperty(access= JsonProperty.Access.WRITE_ONLY)
    private final String password;


    @NotBlank(message="email must not be empty ")
    @Email(regexp = "^[a-zA-Z0-9.]+@gmail\\.com$")
    private final String email;
}
