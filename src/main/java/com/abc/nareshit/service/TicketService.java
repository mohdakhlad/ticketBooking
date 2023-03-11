package com.abc.nareshit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.nareshit.dao.TicketDao;
import com.abc.nareshit.model.Ticket;

@Service
//Any transaction mgmt code, any external frameworks like KAFKA,RABMITMQ, JAX WS....
//Generally Service Layer is mainly used for business logic
public class TicketService {
	@Autowired
	private TicketDao ticketDao;
	//TickeDao ticketDao=new TicketDao();
	
	
	
	
	
	//Create Ticket
	
	public Ticket createTicket(Ticket inputTicketObj) {
		
		return ticketDao.save(inputTicketObj);
		
		//Save ===> Insert the data into the table
		//Save ==> insert into tbl_ticket values (.....);
		//Save ==> Update the Method
		
	}
	
	
	
	
	
	//Retrieve All Tickets
	
	public Iterable<Ticket> getAllTickets(){
		return ticketDao.findAll();
		//findAll ==> select * from tbl_ticket 
		//Convert Resultset into Iterable<Ticket>
	}
	
	
	
	
	//Retrieve Specific Ticket
	
	public Ticket retrieveTicket(Integer ticketId) {
		return ticketDao.findById(ticketId).
				orElse(new Ticket());
		//findById ==> select * from tbl_ticket where ticket_id=ticketId
		//Resultset converted into Ticket
		//FindbyId ==> ONly works with Primary Key
		
		//Ticket dbObj=retrieveTicket(100);
		//if(dbObj!=null)
		// print (dbObj.getPassengerName);
		
	}
	
	
	
	//Update Ticket
	
	
	
	//Delete Ticket

}
