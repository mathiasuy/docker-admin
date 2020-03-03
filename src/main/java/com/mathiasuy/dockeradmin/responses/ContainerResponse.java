package com.mathiasuy.dockeradmin.responses;

public class ContainerResponse {

	private String id;
	private String imageId;
	private String execCommand;
	private String dateCreation;
	private String status;
	private String ports;
	private String names;
	
	public ContainerResponse() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getImageId() {
		return imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	public String getExecCommand() {
		return execCommand;
	}

	public void setExecCommand(String execCommand) {
		this.execCommand = execCommand;
	}

	public String getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPorts() {
		return ports;
	}

	public void setPorts(String ports) {
		this.ports = ports;
	}

	public String getNames() {
		return names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	@Override
	public String toString() {
		return "ContainerResponse [id=" + id + ", imageId=" + imageId + ", execCommand=" + execCommand
				+ ", dateCreation=" + dateCreation + ", status=" + status + ", ports=" + ports + ", names=" + names
				+ "]";
	}	
	
}
