package com.abc.nareshit.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/*
 * 
 the class is called as model/entity/domain class
 @Entity =>this annotation will create the table in data base
 by default class name will be table name
 @Table =>which is customized tabel table name 
 this will create table with "tbl_ticket"
 =>optional annotation 
 */
@Entity
@Table(name="tbl_ticket")
public class Ticket {
	/*
	 * auto generation =>this will create a sequence to data base which will used for auto population 
	 * 
	 *
	 * */
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="tikt_id")//this will create a primary key
	
	private Integer tiktId;// this column we need as primary key
	
	@Column(name="customer_name")//a column will create by name customer_name;
	private String customerName;
	
	@Column(name="source_station")//a column will create by name source_station;
	private String sourceStation;
	
	@Column(name="travel_date")//a column will create by name travel_date;
	private Date travelDate;
	
	@Column(name="email")//a column will create by name email;
	private String email;
	
	public Integer getTiktId() {
		return tiktId;
	}

	public void setTiktId(Integer tiktId) {
		this.tiktId = tiktId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getSourceStation() {
		return sourceStation;
	}

	public void setSourceStation(String sourceStation) {
		this.sourceStation = sourceStation;
	}

	public Date getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Ticket(String customerName, String sourceStation, String email) {
		super();
		this.customerName = customerName;
		this.sourceStation = sourceStation;
		this.travelDate = new Date();
		this.email = email;
	}

	public Ticket() {
		
	}

	@Override
	public String toString() {
		return "Ticket [tiktId=" + tiktId + ", customerName=" + customerName + ", sourceStation=" + sourceStation
				+ ", travelDate=" + travelDate + ", email=" + email + "]";
	}
	

	
	
	

}
