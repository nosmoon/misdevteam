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


package chosun.ciis.is.sal.rec;

import java.sql.*;
import chosun.ciis.is.sal.dm.*;
import chosun.ciis.is.sal.ds.*;

/**
 * 
 */


public class IS_SAL_1920_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String purc_amt;
	public String purc_clsf_nm;
	public String acwr_reg_dt_seq;
	public String purc_dt;
	public String advt_nm;
	public String indt_cd_nm;
	public String std_cd_nm;

	public IS_SAL_1920_LCURLISTRecord(){}

	public void setPurc_amt(String purc_amt){
		this.purc_amt = purc_amt;
	}

	public void setPurc_clsf_nm(String purc_clsf_nm){
		this.purc_clsf_nm = purc_clsf_nm;
	}

	public void setAcwr_reg_dt_seq(String acwr_reg_dt_seq){
		this.acwr_reg_dt_seq = acwr_reg_dt_seq;
	}

	public void setPurc_dt(String purc_dt){
		this.purc_dt = purc_dt;
	}

	public void setAdvt_nm(String advt_nm){
		this.advt_nm = advt_nm;
	}

	public void setIndt_cd_nm(String indt_cd_nm){
		this.indt_cd_nm = indt_cd_nm;
	}

	public void setStd_cd_nm(String std_cd_nm){
		this.std_cd_nm = std_cd_nm;
	}

	public String getPurc_amt(){
		return this.purc_amt;
	}

	public String getPurc_clsf_nm(){
		return this.purc_clsf_nm;
	}

	public String getAcwr_reg_dt_seq(){
		return this.acwr_reg_dt_seq;
	}

	public String getPurc_dt(){
		return this.purc_dt;
	}

	public String getAdvt_nm(){
		return this.advt_nm;
	}

	public String getIndt_cd_nm(){
		return this.indt_cd_nm;
	}

	public String getStd_cd_nm(){
		return this.std_cd_nm;
	}
}

/* 작성시간 : Wed May 16 10:40:42 KST 2012 */