package com.pro.club.entities.secA;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int CId;
	private String CName;
	private String CContact;
	private String Image;
	private String Password;
	private String Email;
	private String Role;
	
	@JsonManagedReference
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "user")
	private Address address;
	
	@JsonManagedReference
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "user")
	private List<Players> players = new ArrayList<>();
}
