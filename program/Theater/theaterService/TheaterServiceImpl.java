package com.xworkz.theaterService;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.theater.TheaterDto;
import com.xworkz.theaterRepository.TheaterRepo;
import com.xworkz.theaterRepository.TheaterRepoImpl;

public class TheaterServiceImpl implements TheaterService{
     
	
	
	TheaterRepo repo = new TheaterRepoImpl();
	
	public boolean save(TheaterDto theaterdto) {
	if(theaterdto!=null){
		if(theaterdto.getName().length()>=3) {
			System.out.println("Theater service are valid to repository");
				repo.save(theaterdto);
				return true;
			}
		}
		else {
			System.out.println("Theater service are not valid to repository");
		}
	return false;
	}

	@Override
	public List<TheaterDto> read() {
		System.out.println("All the data in theater read");
		return repo.read();
		}

	@Override
	public  TheaterDto findByName(String name) {
		if(name!=null) {
			if(name.length()>=3)
			 System.out.println("Theater name is valid");
		 TheaterDto dto = repo.findByName(name);
		return dto;
			
	}
		return null;
		
	}
	@Override
	public TheaterDto deleteByName(String name) {
		if(name!=null) {
			if(name.length()>=3) {
		TheaterDto dto = repo.deleteByName(name);
		return dto;
	}
		}
		return null;
}
}