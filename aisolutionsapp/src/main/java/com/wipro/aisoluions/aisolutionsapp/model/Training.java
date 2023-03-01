package com.wipro.aisoluions.aisolutionsapp.model;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
public class Training {
	private Long id;
	private String name;
	private String platform;
	private String level;
	private String code;
	private String batch;
	private int duration;
}
