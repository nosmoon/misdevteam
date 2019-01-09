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


public class PR_PRTEXEC_2008_LCURLIST_YRecord extends java.lang.Object implements java.io.Serializable{

	public String issu_dt;
	public String occr_yy;
	public String seq;

	public PR_PRTEXEC_2008_LCURLIST_YRecord(){}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setOccr_yy(String occr_yy){
		this.occr_yy = occr_yy;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getOccr_yy(){
		return this.occr_yy;
	}

	public String getSeq(){
		return this.seq;
	}
}

/* 작성시간 : Tue Apr 28 14:35:08 KST 2009 */