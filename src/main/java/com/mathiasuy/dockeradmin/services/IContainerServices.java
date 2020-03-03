package com.mathiasuy.dockeradmin.services;

import java.util.List;

import com.mathiasuy.dockeradmin.model.Container;

public interface IContainerServices {

	List<Container> getContainers();

}
