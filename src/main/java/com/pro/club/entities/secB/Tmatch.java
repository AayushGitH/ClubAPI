package com.pro.club.entities.secB;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
public class Tmatch 
{
	@Id
	private int Mid;
	private String Mmteama;
	private String Mmteamb;
	private String Mmdate;
	private String Mmplace;
	
	@JsonBackReference
	@ManyToOne
	private Tournament tournament;
	
	@JsonManagedReference
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "tmatch")
	private List<Tplayers> tplayers = new ArrayList<>();
	
}
