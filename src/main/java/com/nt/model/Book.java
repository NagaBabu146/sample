package com.nt.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.Type;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity

@Setter
@Getter
@NoArgsConstructor
@ToString
public class Book implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3454805030316474025L;
	@Id
	@GeneratedValue
	@Column(length = 10)
	@Type(type = "integer")
	@ApiModelProperty(notes = "The unique id of the book")
	private Integer bookId;
	@Column(length = 15)

	@Type(type = "string")
	@ApiModelProperty(notes = "The book name")
	private String bookName;
	@Column(length = 15)
	@Type(type = "double")
	@ApiModelProperty(notes = "The  book price")
	private double price;
}
