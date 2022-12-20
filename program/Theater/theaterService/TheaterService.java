package com.xworkz.theaterService;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.theater.TheaterDto;

public interface TheaterService  {
    
	public boolean save(TheaterDto theaterdto);
	
	public boolean read(TheaterDto theaterdto);
	
	public boolean findByName(String name);
}
