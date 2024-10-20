package com.microservice.inventory_service.controller;

import com.microservice.inventory_service.dto.InventoryResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.microservice.inventory_service.service.InventoryService;

import lombok.RequiredArgsConstructor;

import java.util.List;


@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

	private final InventoryService inventoryService;
	
	@GetMapping
	@ResponseStatus(value = HttpStatus.OK)
	public List<InventoryResponse> isInStock(@RequestParam List<String> skvCode) {
		return inventoryService.isInStock(skvCode);
	}
	
	
}
