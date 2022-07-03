package com.gl.java.hr;
import com.gl.java.supper.*;

public class Hrdepartment extends Superdepartment {
	
	public String departmentName() {
		return "Hr Department";
	}
	
	public String getTodaysWork() {
		return "Fill today's worksheet and mark yor attendance";
	}
	
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	public String doActivity() {
		return "Team Lunch";
	}

}
