package com.pro.club.entities.secA;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public class Address 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int CAid;
	private String CStreet;
	private String CArea;
	private String CCity;
	private String CState;
	private String CPincode;
	
	@JsonBackReference
	@OneToOne
	private User user;
}
