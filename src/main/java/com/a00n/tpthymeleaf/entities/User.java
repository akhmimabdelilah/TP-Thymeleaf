package com.a00n.tpthymeleaf.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

//	@NotBlank(message = "Name is mandatory")
//	@Size(min = 5, max = 20, message = "Name must be between 5 and 20")
	private String name;
//	@NotBlank(message = "Email is mandatory")
//	@Email(message = "Enter a valid email")
	private String email;

}
