package com.cloudParking.parking;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloudParking.service.ParkingService;

import model.Parking;

@RestController
@RequestMapping("/parking")

public class ParkingController {

	private final ParkingService parkingService;

	public ParkingController(ParkingService parkingService) {
		this.parkingService = parkingService;
	}

	@GetMapping
	public List<Parking> findAll() {
		return parkingService.findAll();

	}

}
