package com.camaratek.batch.writer;



import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.camaratek.batch.modele.User;
import com.camaratek.batch.repository.UserRepository;

@Component
public class DBWriter implements ItemWriter<User> {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void write(List<? extends User> items) throws Exception {
		items.forEach(u -> System.out.println("Data saved for User: " + u));
		items.forEach(u -> this.userRepository.save(u));
		
	}

}
