package model.common;

import model.vo.Notification;
import model.vo.PhotoLocation;
import model.vo.WorkingDays;

public class VOFactory {
	public static WorkingDays createWorkingDays(){
		return new WorkingDays();
	}
	
	public static PhotoLocation createPhotoLocation(){
		return new PhotoLocation();
	}
	
	public static Notification createNotification(){
		return new Notification();
	}
}
