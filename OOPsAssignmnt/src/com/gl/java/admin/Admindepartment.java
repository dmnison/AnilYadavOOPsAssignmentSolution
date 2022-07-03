package com.gl.java.admin;
import com.gl.java.supper.*;

public class Admindepartment extends Superdepartment {
	
	public String departmentName() {
		return "Admin Department";
	}
	
	public String getTodaysWork() {
		return "Complete your document submission";
	}
	
	public String getWorkDeadline() {
		return "Complete by EOD";
	}

}
