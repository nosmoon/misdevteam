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


package chosun.ciis.se.bas.rec;

import java.sql.*;
import chosun.ciis.se.bas.dm.*;
import chosun.ciis.se.bas.ds.*;

/**
 * 
 */


public class SE_BAS_1710_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String medi_cd;
	public String bo_cd;
	public String aply_yymm;
	public String uprc_amt;
	public String uprc_aply_clsf;
	public String remk;
	public String incmg_pers;
	public String incmg_dt_tm;
	public String chg_pers;
	public String chg_dt_tm;
	public String bo_nm;
	public String sell_net_clsf;

	public SE_BAS_1710_LCURLISTRecord(){}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setAply_yymm(String aply_yymm){
		this.aply_yymm = aply_yymm;
	}

	public void setUprc_amt(String uprc_amt){
		this.uprc_amt = uprc_amt;
	}

	public void setUprc_aply_clsf(String uprc_aply_clsf){
		this.uprc_aply_clsf = uprc_aply_clsf;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_dt_tm(String incmg_dt_tm){
		this.incmg_dt_tm = incmg_dt_tm;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setChg_dt_tm(String chg_dt_tm){
		this.chg_dt_tm = chg_dt_tm;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}
	
	public void setSell_net_clsf(String sell_net_clsf){
		this.sell_net_clsf = sell_net_clsf;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getAply_yymm(){
		return this.aply_yymm;
	}

	public String getUprc_amt(){
		return this.uprc_amt;
	}

	public String getUprc_aply_clsf(){
		return this.uprc_aply_clsf;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_dt_tm(){
		return this.incmg_dt_tm;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getChg_dt_tm(){
		return this.chg_dt_tm;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}
	
	public String getSell_net_clsf(){
		return this.sell_net_clsf;
	}	
}

/* 작성시간 : Wed Aug 27 16:24:20 KST 2014 */