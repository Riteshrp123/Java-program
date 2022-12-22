package com.xworkz.theaterRepository;


import java.util.List;

import com.xworkz.theater.TheaterDto;

public interface TheaterRepo {
	

	public boolean save(TheaterDto theaterDto);
	
	public List<TheaterDto> read();  
	
	public TheaterDto findByName(String name);

	public TheaterDto deleteByName(String name);
	
	}