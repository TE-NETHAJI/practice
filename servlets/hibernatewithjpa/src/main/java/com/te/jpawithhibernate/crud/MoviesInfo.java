package com.te.jpawithhibernate.crud;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name ="movies_info")
@Entity
public class MoviesInfo {
	@Id
	@Column
	private Integer movieId;
	@Column
	private String name;

}
