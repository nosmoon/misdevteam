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


package chosun.ciis.mc.budg.rec;

import java.sql.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.ds.*;

/**
 * 
 */


public class MC_BUDG_2081_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String seq;
	public String use_dept_cd;
	public String if_buseonm_dtsybscd;

	public MC_BUDG_2081_LCURLISTRecord(){}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public void setIf_buseonm_dtsybscd(String if_buseonm_dtsybscd){
		this.if_buseonm_dtsybscd = if_buseonm_dtsybscd;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getIf_buseonm_dtsybscd(){
		return this.if_buseonm_dtsybscd;
	}
}

/* 작성시간 : Mon Jun 29 14:28:34 KST 2009 */