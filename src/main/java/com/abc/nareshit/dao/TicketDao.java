package com.abc.nareshit.dao;

import org.springframework.data.repository.CrudRepository;

import com.abc.nareshit.model.Ticket;

/*
 with TicketDao we can perform the crud operation on ticket table
 * c=create =insertion
 * r=read=select
 * u=update 
 * d=delete
 * 
 * 
 * we need to have data base connection=>@Repository
 * Spring boot comes with CRUDRepository for performing the crud operation 
 * developer no need to write the code for crud operation 
 * CrudRepository=two inputs
 *                1.java class name where we want crud operation
 *                2.data type of primary key
 * */
 
public interface  TicketDao extends CrudRepository<Ticket ,Integer> {
	
	/*
	 developer no need to to write the code per
	 findById==>read=>select *from <table name>where	pk=?
	 findAll=>read=> select *from <table name>
	 save =>create and update=>insert int <table name >
	              =update <table name>
	 deleteById   =>delete from<table name>where pk=?
	                    
	 
	*/
	

}
