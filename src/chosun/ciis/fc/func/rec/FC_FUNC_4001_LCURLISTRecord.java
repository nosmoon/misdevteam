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


package chosun.ciis.fc.func.rec;

import java.sql.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.ds.*;

/**
 * 
 */


public class FC_FUNC_4001_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String recp_dt;
	public String bgn_no;
	public String pch_count;
	public String curacct_clsf_cd;
	public String bank_cd;
	public String bank_nm;
	public String cmpy_cd;
	public String incmg_pers;
	public String incmg_pers_ipadd;

	public FC_FUNC_4001_LCURLISTRecord(){}

	public void setRecp_dt(String recp_dt){
		this.recp_dt = recp_dt;
	}

	public void setBgn_no(String bgn_no){
		this.bgn_no = bgn_no;
	}

	public void setPch_count(String pch_count){
		this.pch_count = pch_count;
	}

	public void setCuracct_clsf_cd(String curacct_clsf_cd){
		this.curacct_clsf_cd = curacct_clsf_cd;
	}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public void setBank_nm(String bank_nm){
		this.bank_nm = bank_nm;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public String getRecp_dt(){
		return this.recp_dt;
	}

	public String getBgn_no(){
		return this.bgn_no;
	}

	public String getPch_count(){
		return this.pch_count;
	}

	public String getCuracct_clsf_cd(){
		return this.curacct_clsf_cd;
	}

	public String getBank_cd(){
		return this.bank_cd;
	}

	public String getBank_nm(){
		return this.bank_nm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}
}

/* 작성시간 : Mon Mar 09 17:06:49 KST 2009 */