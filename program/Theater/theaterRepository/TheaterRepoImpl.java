package com.xworkz.theaterRepository;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.theater.TheaterDto;

public class TheaterRepoImpl implements TheaterRepo{
	
	List<TheaterDto> list = new ArrayList<TheaterDto>();

	
	@Override
	public boolean save(TheaterDto theaterdto) {
	      list.add(theaterdto);
		return true;
	
	}

	@Override
	public boolean read(TheaterDto TheaterDto) {
		list.add(TheaterDto);
		return true;
	}

	public  Object findByName(String name){
		for(TheaterDto dto : list) {
			if(dto.getName().equals(name)){
				System.out.println(dto);
				return dto;
		}
}
		return name;
}
}