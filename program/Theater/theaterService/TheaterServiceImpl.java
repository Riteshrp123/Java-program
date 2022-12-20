package com.xworkz.theaterService;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.theater.TheaterDto;
import com.xworkz.theaterRepository.TheaterRepo;
import com.xworkz.theaterRepository.TheaterRepoImpl;

public class TheaterServiceImpl implements TheaterService{
     
	TheaterDto dto = new TheaterDto();
	
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
	public boolean read(TheaterDto theaterdto) {
		if(theaterdto!=null){
			if(theaterdto.getName().length()>=3) {	
		System.out.println("Theaterdto is read the data");
		repo.read(dto);
		return true;
	}

}
		else {
			System.out.println("Theater is not read the data");
		}
		return false;
	}

	@Override
	public boolean findByName(String name) {
		if(name!=null) {
			 System.out.println("Theater name is valid");
		 repo.findByName(name);
		return true;
			
}
	else {
		System.out.println("Theater name is not valid");
	}
		return false;
		
	}
}

