package com.hcl.test.tickets;

import com.hcl.test.tickets.entity.Ticket;
import com.hcl.test.tickets.repository.TicketRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Collections;

import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@WebMvcTest
public class TicketsApplicationTests {

	@Autowired
	MockMvc mockMvc;

	@MockBean
	TicketRepository ticketRepository;

	@Test
	public void getAllTest() throws Exception{

		when(ticketRepository.findAll()).thenReturn(
				Collections.EMPTY_LIST
		);

		MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/allTickets").accept(MediaType.APPLICATION_JSON)).andReturn();
		Mockito.verify(ticketRepository).findAll();
	}

	@Test
	public void getTicketTest() throws Exception{
		long id = 1;
		when(ticketRepository.getOne(id)).thenReturn(new Ticket("Issue1", "Common Issue", "High", "34001", "open")
		);

		MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/tickets/1/").accept(MediaType.APPLICATION_JSON)).andReturn();
		Mockito.verify(ticketRepository).findById(id);
	}


}
