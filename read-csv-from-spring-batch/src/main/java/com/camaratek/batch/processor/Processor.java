package com.camaratek.batch.processor;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.camaratek.batch.modele.User;

@Component
public class Processor implements ItemProcessor<User, User> {

	private static final Map<String, String> DEPT_NAMES = new HashMap<String, String>();
	
	public Processor() {
		DEPT_NAMES.put("001", "Technologie de l'Informatique Radès");
		DEPT_NAMES.put("002", "Technologie de l'Informatique Djerba");
		DEPT_NAMES.put("003", "Ecole d'Ingénieur de Sfax");
	}
	
	@Override
	public User process(User item) throws Exception {
		
		String deptCode = item.getDept();
		String dept = DEPT_NAMES.get(deptCode);
		item.setTime(new Date());
		System.out.println(String.format("Converted from [%s] to [%s]", deptCode, dept));
		return item;
	}

}
