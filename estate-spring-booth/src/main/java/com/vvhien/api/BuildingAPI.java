package com.vvhien.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vvhien.dto.BuildingDTO;

@RestController
public class BuildingAPI {
	@PostMapping(value = ("/api/building"))
	public BuildingDTO saveBuilding(@RequestBody BuildingDTO buildingDTO) {
		return buildingDTO;
	}

}
