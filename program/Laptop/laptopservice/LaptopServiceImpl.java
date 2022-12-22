package com.xworkz.laptopservice;

import java.util.List;

import com.xworkz.laptop.LaptopDto;
import com.xworkz.laptoprepository.LaptopRepo;
import com.xworkz.laptoprepository.LaptopRepoImpl;

public class LaptopServiceImpl implements LaptopService{

	LaptopRepo repo = new LaptopRepoImpl();
	
	@Override
	public boolean save(LaptopDto laptop) {
		if(laptop!=null) {
			if(laptop.getName().length()>=2) {
				System.out.println("Laptop data is saved in repository");
				repo.save(laptop);
				return true;
			}
		}
		return false;
	}

	@Override
	public List<LaptopDto> read() {
		System.out.println("All data of laptop is read");
		return repo.read();
	}

	@Override
	public LaptopDto findByName(String name) {
		if(name!=null);
		if(name.length()>=2) {
			System.out.println("Laptop name found succesfully");
			LaptopDto dto =repo.findByName(name);
			return dto;
		}
		return null;
	}

	@Override
	public boolean deletByName(int index) {
		if(index>=0) {
		System.out.println("Laptop name deleted");
		repo.deleteByIndex(index);
		return true;
		}
		return false;
	}
	

}
