package com.pro.club.entities.secA;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
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
public class Players 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int CPid;
	private String CPName;
	private int CPAge;
	private String CPContact;
	private String CPEmail;
	private String CPImage;
	private String CPDomain;
	private String CPAddress;
	
	@JsonBackReference
	@ManyToOne
	private User user;
}
