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


package chosun.ciis.hd.saly.rec;

import java.sql.*;
import chosun.ciis.hd.saly.dm.*;
import chosun.ciis.hd.saly.ds.*;

/**
 * 
 */


public class HD_SALY_4103_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String lon_clsf_cd;
	public String lon_dt;
	public String flnm;
	public String bhbhyb;
	public String bogaamt;
	public String bhnosabeon;
	public String add_bogaamt;
	public String add_bhnosabeon;

	public HD_SALY_4103_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setLon_clsf_cd(String lon_clsf_cd){
		this.lon_clsf_cd = lon_clsf_cd;
	}

	public void setLon_dt(String lon_dt){
		this.lon_dt = lon_dt;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setBhbhyb(String bhbhyb){
		this.bhbhyb = bhbhyb;
	}

	public void setBogaamt(String bogaamt){
		this.bogaamt = bogaamt;
	}

	public void setBhnosabeon(String bhnosabeon){
		this.bhnosabeon = bhnosabeon;
	}

	public void setAdd_bogaamt(String add_bogaamt){
		this.add_bogaamt = add_bogaamt;
	}

	public void setAdd_bhnosabeon(String add_bhnosabeon){
		this.add_bhnosabeon = add_bhnosabeon;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getLon_clsf_cd(){
		return this.lon_clsf_cd;
	}

	public String getLon_dt(){
		return this.lon_dt;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getBhbhyb(){
		return this.bhbhyb;
	}

	public String getBogaamt(){
		return this.bogaamt;
	}

	public String getBhnosabeon(){
		return this.bhnosabeon;
	}

	public String getAdd_bogaamt(){
		return this.add_bogaamt;
	}

	public String getAdd_bhnosabeon(){
		return this.add_bhnosabeon;
	}
}

/* 작성시간 : Tue Sep 15 20:17:49 KST 2009 */