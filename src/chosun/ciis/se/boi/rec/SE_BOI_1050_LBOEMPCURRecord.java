/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 삭제여부추가
* 수정자 : 장선희
* 수정일자 : 2017-09-26
* 백업 :
***************************************************************************************************/


package chosun.ciis.se.boi.rec;

import java.sql.*;
import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.ds.*;

/**
 *
 */


public class SE_BOI_1050_LBOEMPCURRecord extends java.lang.Object implements java.io.Serializable{

	public String boemp_no;
	public String flnm;
	public String prn;
	public String dutynm;
	public String tel_no;
	public String ptph_no;
	public String in_cmpy_dt;
	public String lv_cmpy_dt;
	public String delyn;

	public SE_BOI_1050_LBOEMPCURRecord(){}

	public void setBoemp_no(String boemp_no){
		this.boemp_no = boemp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setDutynm(String dutynm){
		this.dutynm = dutynm;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setPtph_no(String ptph_no){
		this.ptph_no = ptph_no;
	}

	public void setIn_cmpy_dt(String in_cmpy_dt){
		this.in_cmpy_dt = in_cmpy_dt;
	}

	public void setLv_cmpy_dt(String lv_cmpy_dt){
		this.lv_cmpy_dt = lv_cmpy_dt;
	}

	public void setDelyn(String delyn){
		this.delyn = delyn;
	}

	public String getBoemp_no(){
		return this.boemp_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getDutynm(){
		return this.dutynm;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getPtph_no(){
		return this.ptph_no;
	}

	public String getIn_cmpy_dt(){
		return this.in_cmpy_dt;
	}

	public String getLv_cmpy_dt(){
		return this.lv_cmpy_dt;
	}

	public String getDelyn(){
		return this.delyn;
	}
}

/* 작성시간 : Wed Sep 27 11:16:50 KST 2017 */