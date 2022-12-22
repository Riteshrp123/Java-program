package com.xworkz.laptoprepository;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.laptop.LaptopDto;

public class LaptopRepoImpl implements LaptopRepo{
	
     List<LaptopDto> list = new ArrayList<LaptopDto>();
     
	@Override
	public boolean save(LaptopDto laptopdto) {
		list.add(laptopdto);
		System.out.println("Laptop data is saved");
		return true;
	}

	@Override
	public List<LaptopDto> read() {
		return list;
	}
	@Override
	public LaptopDto findByName(String name) {
		for(LaptopDto dto : list) {
			if(dto.getName().equals(name)){
				System.out.println("Laptop name found");
			return dto;
	}
		}
		return null;
}

	@Override
	public boolean deleteByIndex(int index) {
		list.remove(index);
		return true;
	}
}