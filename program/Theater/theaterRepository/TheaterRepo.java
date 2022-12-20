package com.xworkz.theaterRepository;


import com.xworkz.theater.TheaterDto;

public interface TheaterRepo {
	

	public boolean save(TheaterDto theaterDto);
	
	public boolean read(TheaterDto theaterDto);
	
	public Object findByName(String name);

	}