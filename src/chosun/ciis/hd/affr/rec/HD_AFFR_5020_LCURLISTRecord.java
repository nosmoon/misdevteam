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


package chosun.ciis.hd.affr.rec;

import java.sql.*;
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.ds.*;

/**
 * 
 */


public class HD_AFFR_5020_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String emp_no;
	public String aplc_dt;
	public String certi_clsf_name;
	public String issu_num_shet;
	public String usag;
	public String issu_dt;
	public String issu_clsf;
	public String issu_no;
	public String certi_clsf;
	public String occr_dt;
	public String seq;

	public HD_AFFR_5020_LCURLISTRecord(){}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setAplc_dt(String aplc_dt){
		this.aplc_dt = aplc_dt;
	}

	public void setCerti_clsf_name(String certi_clsf_name){
		this.certi_clsf_name = certi_clsf_name;
	}

	public void setIssu_num_shet(String issu_num_shet){
		this.issu_num_shet = issu_num_shet;
	}

	public void setUsag(String usag){
		this.usag = usag;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setIssu_clsf(String issu_clsf){
		this.issu_clsf = issu_clsf;
	}

	public void setIssu_no(String issu_no){
		this.issu_no = issu_no;
	}
	
	public void setCerit_clsf(String certi_clsf){
		this.certi_clsf = certi_clsf;
	}
	
	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}
	
	public void setSeq(String seq){
		this.seq = seq;
	}
	public String getEmp_no(){
		return this.emp_no;
	}

	public String getAplc_dt(){
		return this.aplc_dt;
	}

	public String getCerti_clsf_name(){
		return this.certi_clsf_name;
	}

	public String getIssu_num_shet(){
		return this.issu_num_shet;
	}

	public String getUsag(){
		return this.usag;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getIssu_clsf(){
		return this.issu_clsf;
	}

	public String getIssu_no(){
		return this.issu_no;
	}
	
	public String getCerti_clsf(){
		return this.certi_clsf;
	}
	
	public String getOccr_dt(){
		return this.occr_dt;
	}
	
	public String getSeq(){
		return this.seq;
	}
}

/* 작성시간 : Sun Jun 21 14:28:20 KST 2009 */