/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.boi.rec;

import java.sql.*;
import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.ds.*;

/**
 * 
 */


public class SE_BOI_1040_SBOCOMNDLCOCURRecord extends java.lang.Object implements java.io.Serializable{

	public String chg_seq;
	public String chg_dt;
	public String dlco_no;
	public String dlco_nm;
	public String ern;
	public String incmg_dt;

	public SE_BOI_1040_SBOCOMNDLCOCURRecord(){}

	public void setChg_seq(String chg_seq){
		this.chg_seq = chg_seq;
	}

	public void setChg_dt(String chg_dt){
		this.chg_dt = chg_dt;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setIncmg_dt(String incmg_dt){
		this.incmg_dt = incmg_dt;
	}

	public String getChg_seq(){
		return this.chg_seq;
	}

	public String getChg_dt(){
		return this.chg_dt;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getErn(){
		return this.ern;
	}

	public String getIncmg_dt(){
		return this.incmg_dt;
	}
}

/* 작성시간 : Wed Oct 19 17:42:09 KST 2016 */