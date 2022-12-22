package com.xworkz.theaterRepository;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.theater.TheaterDto;

public class TheaterRepoImpl implements TheaterRepo{
	
	List<TheaterDto> list = new ArrayList<TheaterDto>();

	
	@Override
	public boolean save(TheaterDto theaterdto) {
		System.out.println("Theater repo will came to database");
	      list.add(theaterdto);
		System.out.println("Theater data will be save");
		return true;
	
	}

	@Override
	public List<TheaterDto> read() {
	     return list;
	}

	public  TheaterDto findByName(String name){
		for(TheaterDto dto : list) {
			if(dto.getName().equals(name)){
				System.out.println("Theater name is there");
			return dto;
		}
} 
		return null;		
}

	@Override
	public TheaterDto deleteByName(String name) {
	for(TheaterDto dto : list) {
		if(dto.getName().equals(name)) {
			System.out.println("Theater name is deleted");
			return dto;
		}
	}
	return null;
		
	}
}