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


public class FC_FUNC_4022_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String stat_cd;
	public String stat_dt;
	public String gf_commcdynm;

	public FC_FUNC_4022_LCURLISTRecord(){}

	public void setStat_cd(String stat_cd){
		this.stat_cd = stat_cd;
	}

	public void setStat_dt(String stat_dt){
		this.stat_dt = stat_dt;
	}

	public void setGf_commcdynm(String gf_commcdynm){
		this.gf_commcdynm = gf_commcdynm;
	}

	public String getStat_cd(){
		return this.stat_cd;
	}

	public String getStat_dt(){
		return this.stat_dt;
	}

	public String getGf_commcdynm(){
		return this.gf_commcdynm;
	}
}

/* 작성시간 : Fri Mar 06 15:26:35 KST 2009 */