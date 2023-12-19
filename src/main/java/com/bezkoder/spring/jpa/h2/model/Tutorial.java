package com.bezkoder.spring.jpa.h2.model;

import javax.persistence.*;

@Entity
@Table(name = "tutorials")
public class Tutorial {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "title")
	private String title;

	@Column(name = "description")
	private String description;

	@Column(name = "published")
	private boolean published;
	@Column(name = "price_uri")
	private String priceUri;

	public String getPriceUri() {
		return priceUri;
	}

	public void setPriceUri(String priceUri) {
		this.priceUri = priceUri;
	}

	public Tutorial() {

	}

	public Tutorial(String title, String description, boolean published,String priceUri) {
		this.title = title;
		this.description = description;
		this.published = published;
		this.priceUri=priceUri;
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isPublished() {
		return published;
	}

	public void setPublished(boolean isPublished) {
		this.published = isPublished;
	}

	@Override
	public String toString() {
		return "Tutorial [id=" + id + ", title=" + title + ", desc=" + description + ", published=" + published +  ", price=" + priceUri + "]";
	}

}
