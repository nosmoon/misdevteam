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


package chosun.ciis.fc.acct.rec;

import java.sql.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.ds.*;

/**
 * 
 */


public class FC_ACCT_2582_SCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String incmg_dt;
	public String vipasetdebt_incmg_dt1;
	public String vipasetdebt_incmg_dt2;
	public String ddbal_incmg_dt1;
	public String ddbal_incmg_dt2;

	public FC_ACCT_2582_SCURLIST1Record(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIncmg_dt(String incmg_dt){
		this.incmg_dt = incmg_dt;
	}

	public void setVipasetdebt_incmg_dt1(String vipasetdebt_incmg_dt1){
		this.vipasetdebt_incmg_dt1 = vipasetdebt_incmg_dt1;
	}

	public void setVipasetdebt_incmg_dt2(String vipasetdebt_incmg_dt2){
		this.vipasetdebt_incmg_dt2 = vipasetdebt_incmg_dt2;
	}

	public void setDdbal_incmg_dt1(String ddbal_incmg_dt1){
		this.ddbal_incmg_dt1 = ddbal_incmg_dt1;
	}

	public void setDdbal_incmg_dt2(String ddbal_incmg_dt2){
		this.ddbal_incmg_dt2 = ddbal_incmg_dt2;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIncmg_dt(){
		return this.incmg_dt;
	}

	public String getVipasetdebt_incmg_dt1(){
		return this.vipasetdebt_incmg_dt1;
	}

	public String getVipasetdebt_incmg_dt2(){
		return this.vipasetdebt_incmg_dt2;
	}

	public String getDdbal_incmg_dt1(){
		return this.ddbal_incmg_dt1;
	}

	public String getDdbal_incmg_dt2(){
		return this.ddbal_incmg_dt2;
	}
}

/* 작성시간 : Tue Aug 11 16:06:45 KST 2009 */