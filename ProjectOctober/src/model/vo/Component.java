package model.vo;

import java.io.Serializable;

public class Component implements Serializable {
	private String etpNum;

    private String etpEmail;
    
    private String componentID;

    private Integer componentTheme;

    private Integer componentWidth;

    private Integer componentHeight;

    private Integer componentPosX;

    private Integer componentPosY;

    private Integer backgroundTheme;

    private static final long serialVersionUID = 1L;

    ///////////////////////// GET&SET ///////////////////////// 
    
    

	public Integer getBackgroundTheme() {
        return backgroundTheme;
    }

    public String getComponentID() {
		return componentID;
	}

	public void setComponentID(String componentID) {
		this.componentID = componentID;
	}

	public Integer getComponentTheme() {
		return componentTheme;
	}

	public void setComponentTheme(Integer componentTheme) {
		this.componentTheme = componentTheme;
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

	public void setBackgroundTheme(Integer backgroundTheme) {
        this.backgroundTheme = backgroundTheme;
    }

	public String getEtpNum() {
		return etpNum;
	}

	public String getEtpEmail() {
		return etpEmail;
	}

	public void setEtpNum(String etpNum) {
		this.etpNum = etpNum;
	}

	public void setEtpEmail(String etpEmail) {
		this.etpEmail = etpEmail;
	}
	
	///////////////////////// ToString ///////////////////////// 
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder
		.append("Component [etpNum=").append(etpNum).append(", etpEmail=").append(etpEmail)
		.append(", componentID=").append(componentID).append(", componentTheme=").append(componentTheme)
		.append(", componentWidth=").append(componentWidth).append(", componentHeight=").append(componentHeight)
		.append(", componentPosX=").append(componentPosX).append(", componentPosY=").append(componentPosY)
		.append(", backgroundTheme=").append(backgroundTheme).append("]");
		return builder.toString();
	}
}