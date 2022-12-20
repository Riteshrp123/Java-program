package com.xworkz.theater;

import java.security.Provider.Service;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.theaterService.TheaterService;
import com.xworkz.theaterService.TheaterServiceImpl;

public class TheaterRunner {
	public static void main(String[] args) {
		

  
  TheaterService service = new  TheaterServiceImpl();
  
  TheaterDto dto = new TheaterDto();
  
     dto.setName("Vega_city");
     dto.setLocation("Bannergata");
     dto.setParking(true);
     dto.setNoOfScreen(8);
     dto.setNoOfSeat(500);
     dto.setTicketPrice(300);
     dto.setServeAnyFood(true);
     dto.setType("Imax");
     dto.setLift(true);
     dto.setNoOfGate(10);
     

		 dto.setName("Gopalan");
		  dto.setLocation("J.p nagar");
		  dto.setParking(true);
		 dto.setNoOfScreen(7);
		 dto.setNoOfSeat(400);
		 dto.setTicketPrice(200);
		 dto.setServeAnyFood(true);
		 dto.setType("4k");
		 dto.setLift(true);
		 dto.setNoOfGate(8);
		 
		 TheaterDto dto3 = new TheaterDto();
		 dto3.setName("Phonex");
		 dto3.setLocation("Whitefield");
		 dto3.setParking(true);
		 dto3.setNoOfScreen(12);
		 dto3.setNoOfSeat(600);
		 dto3.setTicketPrice(400);
		 dto3.setServeAnyFood(true);
		 dto3.setType("Imax");
		 dto3.setLift(true);
		 dto3.setNoOfGate(10);
		 TheaterDto dto4 = new TheaterDto();
		 dto4.setName("Shared");
		 dto4.setLocation("Nagarathpete");
		 dto4.setParking(true);
		 dto4.setNoOfScreen(5);
		 dto4.setNoOfSeat(300);
		 dto4.setTicketPrice(200);
		 dto4.setServeAnyFood(true);
		 dto4.setType("2k");
		 dto4.setLift(true);
		 dto4.setNoOfGate(5);
		 TheaterDto dto5 = new TheaterDto();
		 dto5.setName("Balaji");
		 dto5.setLocation("Balaji nagar");
		  dto5.setParking(true);
		  dto5.setNoOfScreen(6);
		  dto5.setNoOfSeat(300);
		 dto5.setTicketPrice(150);
		 dto5.setServeAnyFood(true);
		 dto5.setType("2d");
		 dto5.setLift(false);
		 dto5.setNoOfGate(4);
		 
		 TheaterDto dto6 = new TheaterDto("Urvasi","Doddamavalli",8,"4k",true,200,true,true,500,10); 
		 TheaterDto dto7 = new TheaterDto("Maheswari","Tilak nagar",7,"2k",true,250,true,true,400,8); 
		 TheaterDto dto8 = new TheaterDto("Sandhya","btm",6,"2k",true,150,true,true,300,5);
		 TheaterDto dto9 = new TheaterDto("Royal minakshi","Bannergata",7,"4k",true,300,true,true,400,12);
		 TheaterDto dto10 = new TheaterDto("Orion","Banaswadi",6,"3D",true,300,true,true,300,6); 
		 TheaterDto dto11 = new TheaterDto("Binnypet","Jagajeevanram",7,"3d",true,200,true,true,600,11); 
		  TheaterDto dto12 = new TheaterDto("Laxmi","S.G palya",7,"4k",true,250,true,true,450,10); 
		 TheaterDto dto13 = new TheaterDto("Innovation","Marathali",10,"4k",true,260,true,true,700,5); 
		 TheaterDto dto14 = new TheaterDto("Triveni","Gandhinagar",5,"4k",true,150,true,true,250,4); 
		 TheaterDto dto15 = new TheaterDto("Cineplexx","Keonjhar",2,"4k",true,200,true,true,350,3); 
		 
		 service.save(dto);
		 service.save(dto); 
		 service.save(dto3); 
		 service.save(dto4); 
		 service.save(dto5);
		 service.save(dto6); 
		  service.save(dto7);
		  service.save(dto8);
		  service.save(dto9);
		  service.save(dto10);
		  service.save(dto11);
		  service.save(dto12);
		  service.save(dto13);
		  service.save(dto14);
		  service.save(dto15);
		  
     service.read(dto);
     service.findByName("Vega_city");
     
     System.out.println(service.findByName("Vega_city"));
     
     }
     }

