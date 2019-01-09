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


package chosun.ciis.hd.info.rec;

import java.sql.*;
import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.ds.*;

/**
 * 
 */


public class HD_INFO_6000_LCURLIST10Record extends java.lang.Object implements java.io.Serializable{

	public String gurt_insr_entr_dt;
	public String gurt_insr_mtry_dt;
	public String gurt_insr_amt;
	public String gurt_insr_no;

	public HD_INFO_6000_LCURLIST10Record(){}

	public void setGurt_insr_entr_dt(String gurt_insr_entr_dt){
		this.gurt_insr_entr_dt = gurt_insr_entr_dt;
	}

	public void setGurt_insr_mtry_dt(String gurt_insr_mtry_dt){
		this.gurt_insr_mtry_dt = gurt_insr_mtry_dt;
	}

	public void setGurt_insr_amt(String gurt_insr_amt){
		this.gurt_insr_amt = gurt_insr_amt;
	}

	public void setGurt_insr_no(String gurt_insr_no){
		this.gurt_insr_no = gurt_insr_no;
	}

	public String getGurt_insr_entr_dt(){
		return this.gurt_insr_entr_dt;
	}

	public String getGurt_insr_mtry_dt(){
		return this.gurt_insr_mtry_dt;
	}

	public String getGurt_insr_amt(){
		return this.gurt_insr_amt;
	}

	public String getGurt_insr_no(){
		return this.gurt_insr_no;
	}
}

/* 작성시간 : Thu Aug 09 16:35:29 KST 2018 */