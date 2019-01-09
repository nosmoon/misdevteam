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


package chosun.ciis.hd.duty.rec;

import java.sql.*;
import chosun.ciis.hd.duty.dm.*;
import chosun.ciis.hd.duty.ds.*;

/**
 * 
 */


public class HD_DUTY_1600_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String tot_occr_year_dds;
	public String use_year_dds;
	public String rmn_year_dds;

	public HD_DUTY_1600_LCURLISTRecord(){}

	public void setTot_occr_year_dds(String tot_occr_year_dds){
		this.tot_occr_year_dds = tot_occr_year_dds;
	}

	public void setUse_year_dds(String use_year_dds){
		this.use_year_dds = use_year_dds;
	}

	public void setRmn_year_dds(String rmn_year_dds){
		this.rmn_year_dds = rmn_year_dds;
	}

	public String getTot_occr_year_dds(){
		return this.tot_occr_year_dds;
	}

	public String getUse_year_dds(){
		return this.use_year_dds;
	}

	public String getRmn_year_dds(){
		return this.rmn_year_dds;
	}
}

/* 작성시간 : Wed Apr 01 11:11:28 KST 2009 */