/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매시스템
* 작성일자 : 2009-02-18
* 작성자 : 배창희
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


public class SE_BAS_1610_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String sell_net_clsf;
	public String sell_net_clsf_nm;
	public String aply_mm;
	public String aply_bgn_dd;
	public String enty_rate;
	public String remk;
	public String chg_pers;
	public String chg_dt;

	public SE_BAS_1610_LCURLISTRecord(){}

	public void setSell_net_clsf(String sell_net_clsf){
		this.sell_net_clsf = sell_net_clsf;
	}

	public void setSell_net_clsf_nm(String sell_net_clsf_nm){
		this.sell_net_clsf_nm = sell_net_clsf_nm;
	}

	public void setAply_mm(String aply_mm){
		this.aply_mm = aply_mm;
	}

	public void setAply_bgn_dd(String aply_bgn_dd){
		this.aply_bgn_dd = aply_bgn_dd;
	}

	public void setEnty_rate(String enty_rate){
		this.enty_rate = enty_rate;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setChg_dt(String chg_dt){
		this.chg_dt = chg_dt;
	}

	public String getSell_net_clsf(){
		return this.sell_net_clsf;
	}

	public String getSell_net_clsf_nm(){
		return this.sell_net_clsf_nm;
	}

	public String getAply_mm(){
		return this.aply_mm;
	}

	public String getAply_bgn_dd(){
		return this.aply_bgn_dd;
	}

	public String getEnty_rate(){
		return this.enty_rate;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getChg_dt(){
		return this.chg_dt;
	}
}

/* 작성시간 : Tue Jul 21 19:36:36 KST 2009 */