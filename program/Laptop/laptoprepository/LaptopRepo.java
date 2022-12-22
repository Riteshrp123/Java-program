package com.xworkz.laptoprepository;

import java.util.List;

import com.xworkz.laptop.LaptopDto;

public interface LaptopRepo {
	
	public boolean save(LaptopDto laptopdto);

	public List<LaptopDto> read();
	
	public LaptopDto findByName(String name);
	
	public boolean deleteByIndex(int index);
	

}
