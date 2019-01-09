/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.is.bus.rec;

import java.sql.*;
import chosun.ciis.is.bus.dm.*;
import chosun.ciis.is.bus.ds.*;

/**
 * 
 */


public class IS_BUS_1710_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String sale_clsf;
	public String sale_clsf_nm;
	public String sun;
	public String mon;
	public String tue;
	public String wed;
	public String thr;
	public String fri;
	public String sat;

	public IS_BUS_1710_LCURLISTRecord(){}

	public void setSale_clsf(String sale_clsf){
		this.sale_clsf = sale_clsf;
	}

	public void setSale_clsf_nm(String sale_clsf_nm){
		this.sale_clsf_nm = sale_clsf_nm;
	}

	public void setSun(String sun){
		this.sun = sun;
	}

	public void setMon(String mon){
		this.mon = mon;
	}

	public void setTue(String tue){
		this.tue = tue;
	}

	public void setWed(String wed){
		this.wed = wed;
	}

	public void setThr(String thr){
		this.thr = thr;
	}

	public void setFri(String fri){
		this.fri = fri;
	}

	public void setSat(String sat){
		this.sat = sat;
	}

	public String getSale_clsf(){
		return this.sale_clsf;
	}

	public String getSale_clsf_nm(){
		return this.sale_clsf_nm;
	}

	public String getSun(){
		return this.sun;
	}

	public String getMon(){
		return this.mon;
	}

	public String getTue(){
		return this.tue;
	}

	public String getWed(){
		return this.wed;
	}

	public String getThr(){
		return this.thr;
	}

	public String getFri(){
		return this.fri;
	}

	public String getSat(){
		return this.sat;
	}
}

/* 작성시간 : Wed Jun 20 15:51:58 KST 2012 */