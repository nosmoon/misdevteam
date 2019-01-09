/***************************************************************************************************
 * 파일명   : SL_L_BOEMPRSLTCURRecord.java
 * 기능     : 지국경영-아파트투입율-직원검색 직원목록조회
 * 작성일자 : 2005/10/14
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
**  지국경영-아파트투입율-직원검색 직원목록조회
**/

public class SL_L_BOEMPRSLTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String boemp_no;
	public String flnm;
	public String empnm;
	public String tel1;
	public String tel2;
	public String tel3;
	public String in_cmpy_dt;

	public SL_L_BOEMPRSLTCURRecord(){}

	public void setBoemp_no(String boemp_no){
		this.boemp_no = boemp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setEmpnm(String empnm){
		this.empnm = empnm;
	}

	public void setTel1(String tel1){
		this.tel1 = tel1;
	}

	public void setTel2(String tel2){
		this.tel2 = tel2;
	}

	public void setTel3(String tel3){
		this.tel3 = tel3;
	}

	public void setIn_cmpy_dt(String in_cmpy_dt){
		this.in_cmpy_dt = in_cmpy_dt;
	}

	public String getBoemp_no(){
		return this.boemp_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getEmpnm(){
		return this.empnm;
	}

	public String getTel1(){
		return this.tel1;
	}

	public String getTel2(){
		return this.tel2;
	}

	public String getTel3(){
		return this.tel3;
	}

	public String getIn_cmpy_dt(){
		return this.in_cmpy_dt;
	}
}

/* 작성시간 : Fri Oct 14 15:23:20 KST 2005 */