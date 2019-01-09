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


public class MC_BUDG_6046_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String chk;
	public String yymm;
	public String sub_cd;
	public String clos_yn;
	public String incmg_dt_tm;

	public MC_BUDG_6046_LCURLISTRecord(){}

	public void setChk(String chk){
		this.chk = chk;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setSub_cd(String sub_cd){
		this.sub_cd = sub_cd;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public void setIncmg_dt_tm(String incmg_dt_tm){
		this.incmg_dt_tm = incmg_dt_tm;
	}

	public String getChk(){
		return this.chk;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getSub_cd(){
		return this.sub_cd;
	}

	public String getClos_yn(){
		return this.clos_yn;
	}

	public String getIncmg_dt_tm(){
		return this.incmg_dt_tm;
	}
}

/* 작성시간 : Fri May 15 17:30:54 KST 2009 */