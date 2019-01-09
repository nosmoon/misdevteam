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


package chosun.ciis.pr.prtexec.rec;

import java.sql.*;
import chosun.ciis.pr.prtexec.dm.*;
import chosun.ciis.pr.prtexec.ds.*;

/**
 * 
 */


public class PR_PRTEXEC_5000_LCURLIST4Record extends java.lang.Object implements java.io.Serializable{

	public String prt_dt;
	public String issu_dt;
	public String slip_qty;
	public String medi_cd;

	public PR_PRTEXEC_5000_LCURLIST4Record(){}

	public void setPrt_dt(String prt_dt){
		this.prt_dt = prt_dt;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setSlip_qty(String slip_qty){
		this.slip_qty = slip_qty;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public String getPrt_dt(){
		return this.prt_dt;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getSlip_qty(){
		return this.slip_qty;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}
}

/* 작성시간 : Wed Sep 09 00:29:08 KST 2009 */