package com.mathiasuy.dockeradmin.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.mathiasuy.dockeradmin.model.Container;

@Service
public class ContainerServices implements IContainerServices {

	@Value("${global.host.url}")
	private String urlHost;
	
	@Value("${docker.commands.containers.listall}")
	private String listAllContainers;
	
	
	@Value("${docker.commands.containers.list}")
	private String listActiveContainers;
	
	
	@Override
	public List<Container> getContainers() {
		List<Container> containers = new ArrayList<>();
		
		 // Ejecucion Basica del Comando
        Process proceso;
		try {
			proceso = Runtime.getRuntime().exec(listAllContainers);
		
	        InputStreamReader entrada = new InputStreamReader(proceso.getInputStream());
	        BufferedReader stdInput = new BufferedReader(entrada);
	
	        String salida;
	        
	        //Si el comando tiene una salida la mostramos
			if((salida=stdInput.readLine()) != null){
				System.out.println("Comando ejecutado Correctamente");
				while ((salida=stdInput.readLine()) != null){
					Container container = new Container();
					container.setId(salida);
			    	System.out.println(salida);
			    	containers.add(container);
			    }
			}else{
				System.out.println("No se a producido ninguna salida");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		return containers;
	}
	
	
}
