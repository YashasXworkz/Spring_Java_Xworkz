package com.xworkz.fashion_factory.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "fashionfact")
@NamedQueries({ @NamedQuery(name = "getAll", query = "SELECT en FROM FashionFactEntity en"),
		@NamedQuery(name = "searchByName", query = "SELECT en FROM FashionFactEntity en WHERE en.name = :n"),
		@NamedQuery(name = "searchByEmail", query = "SELECT en FROM FashionFactEntity en WHERE en.email = :em"),
		@NamedQuery(name = "updateByEmail", query = "UPDATE FashionFactEntity en SET en.name = :n, en.phoneNo = :ph WHERE en.email = :email") })
public class FashionFactEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private long phoneNo;
}
