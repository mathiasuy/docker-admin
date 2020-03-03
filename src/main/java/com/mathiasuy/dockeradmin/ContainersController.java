package com.mathiasuy.dockeradmin;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mathiasuy.dockeradmin.model.Container;
import com.mathiasuy.dockeradmin.responses.ContainerResponse;
import com.mathiasuy.dockeradmin.services.IContainerServices;

@RestController
public class ContainersController {

	@Autowired
	private IContainerServices containerServices;
	
	@GetMapping("/listAll")
	public List<ContainerResponse> getContainers(){
		List<Container> containers = containerServices.getContainers();
		List<ContainerResponse> response = containers.stream().map(c -> new ContainerResponse() {{
			setId(c.getId());
		}}).collect(Collectors.toList());
		return response;
	}
	
	
}
