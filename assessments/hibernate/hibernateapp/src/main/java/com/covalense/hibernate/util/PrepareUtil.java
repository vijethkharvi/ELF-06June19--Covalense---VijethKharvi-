package com.covalense.hibernate.util;

import com.covalense.hibernateapp.onetoone.StudentInfoBean;
import com.covalense.hibernateapp.onetoone.StudentOtherInfoBean;

public static class PrepareUtil {
	private PrepareUtil() {
		
	}
private StudentInfoBean prepareData(int rollNum) {
	StudentInfoBean bean=new StudentInfoBean();
	bean.setRollNum(rollNum);
	bean.setAge(24);
	bean.setEmailId("vijeth@gmail.com");
	bean.setGender("male");
	bean.setMobileNo(12233444l);
	
	StudentOtherInfoBean infoBean=new StudentOtherInfoBean();
	infoBean.setFatherName("ramesh");
	infoBean.setMotherName("mom");
	infoBean.setNationality("indian");
	infoBean.setReligion("hindu");
	infoBean.setRollNum(rollNum);
	
	bean.setOtherinfo(infoBean);
}

}
