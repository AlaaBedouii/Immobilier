package com.fst.immobilier.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
public class Bien {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String reference;

    private String titre;

    @Lob
    private String description;

    private Double surface;

    private int nbPieces;

    private BigDecimal prix;

    private String ville;
    private String quartier;
    private String adresse;
    private String codePostal;

    @Enumerated(EnumType.STRING)
    private TypeBien type;

    @Enumerated(EnumType.STRING)
    private StatutBien statut;

    @Enumerated(EnumType.STRING)
    private TypeTransaction typeTransaction;

    @ManyToOne
    private Agent agent;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getSurface() {
		return surface;
	}

	public void setSurface(Double surface) {
		this.surface = surface;
	}

	public int getNbPieces() {
		return nbPieces;
	}

	public void setNbPieces(int nbPieces) {
		this.nbPieces = nbPieces;
	}

	public BigDecimal getPrix() {
		return prix;
	}

	public void setPrix(BigDecimal prix) {
		this.prix = prix;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getQuartier() {
		return quartier;
	}

	public void setQuartier(String quartier) {
		this.quartier = quartier;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public TypeBien getType() {
		return type;
	}

	public void setType(TypeBien type) {
		this.type = type;
	}

	public StatutBien getStatut() {
		return statut;
	}

	public void setStatut(StatutBien statut) {
		this.statut = statut;
	}

	public TypeTransaction getTypeTransaction() {
		return typeTransaction;
	}

	public void setTypeTransaction(TypeTransaction typeTransaction) {
		this.typeTransaction = typeTransaction;
	}

	public Agent getAgent() {
		return agent;
	}

	public void setAgent(Agent agent) {
		this.agent = agent;
	}

	

	public Bien() {
		super();
		// TODO Auto-generated constructor stub
	}
    
	
	
    
}