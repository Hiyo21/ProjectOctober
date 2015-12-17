package model.vo;

import java.io.Serializable;

public class Component implements Serializable {
	private String etpNum;

    private String etpEmail;
    
    private Integer componentNum;
    
	private String componentID;

    private Integer componentWidth;

    private Integer componentHeight;

    private Integer componentPosX;

    private Integer componentPosY;

    private static final long serialVersionUID = 1L;

    ///////////////////////// GET&SET ///////////////////////// 
    
	public String getEtpNum() {
		return etpNum;
	}

	public void setEtpNum(String etpNum) {
		this.etpNum = etpNum;
	}

	public String getEtpEmail() {
		return etpEmail;
	}

	public void setEtpEmail(String etpEmail) {
		this.etpEmail = etpEmail;
	}

	public Integer getComponentNum() {
		return componentNum;
	}

	public void setComponentNum(Integer componentNum) {
		this.componentNum = componentNum;
	}

	public String getComponentID() {
		return componentID;
	}

	public void setComponentID(String componentID) {
		this.componentID = componentID;
	}

	public Integer getComponentWidth() {
		return componentWidth;
	}

	public void setComponentWidth(Integer componentWidth) {
		this.componentWidth = componentWidth;
	}

	public Integer getComponentHeight() {
		return componentHeight;
	}

	public void setComponentHeight(Integer componentHeight) {
		this.componentHeight = componentHeight;
	}

	public Integer getComponentPosX() {
		return componentPosX;
	}

	public void setComponentPosX(Integer componentPosX) {
		this.componentPosX = componentPosX;
	}

	public Integer getComponentPosY() {
		return componentPosY;
	}

	public void setComponentPosY(Integer componentPosY) {
		this.componentPosY = componentPosY;
	}
	
	///////////////////////// ToString ///////////////////////// 

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Component [etpNum=").append(etpNum).append(", etpEmail=").append(etpEmail)
				.append(", componentNum=").append(componentNum).append(", componentID=").append(componentID)
				.append(", componentWidth=").append(componentWidth).append(", componentHeight=").append(componentHeight)
				.append(", componentPosX=").append(componentPosX).append(", componentPosY=").append(componentPosY)
				.append("]");
		return builder.toString();
	}
}