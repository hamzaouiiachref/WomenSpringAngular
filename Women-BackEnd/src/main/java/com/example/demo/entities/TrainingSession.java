package com.example.demo.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;


@Entity
@Data
public class TrainingSession {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idTS;
	
	private String title;
	
	//@Temporal(TemporalType.DATE)
	private String dateDebut;
	
	//@Temporal(TemporalType.DATE)
	private String dateFin;
	
	private String dure;
	
	private String localisation;
	
	private String DescriptionOfTS;
	
	@JsonIgnore
	@ManyToOne
	private User user;
	
	@OneToMany(mappedBy = "ts", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<LikeTs> likets;
	
//	@OneToMany(mappedBy = "trainingSession", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	private List<Question> questions;
//	
//	@OneToOne
//	private Certificate certificate;

}
