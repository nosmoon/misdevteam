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


package chosun.ciis.hd.evlu.rec;

import java.sql.*;
import chosun.ciis.hd.evlu.dm.*;
import chosun.ciis.hd.evlu.ds.*;

/**
 * 
 */


public class HD_EVLU_2455_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String evlu_yy;
	public String tms_clsf;
	public String emp_no;
	public String flnm;
	public String seq;
	public String evlu_dp_nm;
	public String evlu_dp_scor;

	public HD_EVLU_2455_LCURLISTRecord(){}

	public void setEvlu_yy(String evlu_yy){
		this.evlu_yy = evlu_yy;
	}

	public void setTms_clsf(String tms_clsf){
		this.tms_clsf = tms_clsf;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setEvlu_dp_nm(String evlu_dp_nm){
		this.evlu_dp_nm = evlu_dp_nm;
	}

	public void setEvlu_dp_scor(String evlu_dp_scor){
		this.evlu_dp_scor = evlu_dp_scor;
	}

	public String getEvlu_yy(){
		return this.evlu_yy;
	}

	public String getTms_clsf(){
		return this.tms_clsf;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getEvlu_dp_nm(){
		return this.evlu_dp_nm;
	}

	public String getEvlu_dp_scor(){
		return this.evlu_dp_scor;
	}
}

/* 작성시간 : Mon Aug 01 14:49:52 KST 2016 */