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


package chosun.ciis.is.agr.rec;

import java.sql.*;
import chosun.ciis.is.agr.dm.*;
import chosun.ciis.is.agr.ds.*;

/**
 * 
 */


public class IS_AGR_3110_SCURLIST_ARecord extends java.lang.Object implements java.io.Serializable{

	public String make_ask_dtls_seq;
	public String dlco_clsf_cd_seq;
	public String dlco_nm;
	public String purc_clsf;
	public String uprc;
	public String qunt;
	public String purc_amt;
	public String stmt_recp_yn;
	public String remk;

	public IS_AGR_3110_SCURLIST_ARecord(){}

	public void setMake_ask_dtls_seq(String make_ask_dtls_seq){
		this.make_ask_dtls_seq = make_ask_dtls_seq;
	}

	public void setDlco_clsf_cd_seq(String dlco_clsf_cd_seq){
		this.dlco_clsf_cd_seq = dlco_clsf_cd_seq;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setPurc_clsf(String purc_clsf){
		this.purc_clsf = purc_clsf;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public void setPurc_amt(String purc_amt){
		this.purc_amt = purc_amt;
	}

	public void setStmt_recp_yn(String stmt_recp_yn){
		this.stmt_recp_yn = stmt_recp_yn;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getMake_ask_dtls_seq(){
		return this.make_ask_dtls_seq;
	}

	public String getDlco_clsf_cd_seq(){
		return this.dlco_clsf_cd_seq;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getPurc_clsf(){
		return this.purc_clsf;
	}

	public String getUprc(){
		return this.uprc;
	}

	public String getQunt(){
		return this.qunt;
	}

	public String getPurc_amt(){
		return this.purc_amt;
	}

	public String getStmt_recp_yn(){
		return this.stmt_recp_yn;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Thu Jun 07 11:44:47 KST 2012 */