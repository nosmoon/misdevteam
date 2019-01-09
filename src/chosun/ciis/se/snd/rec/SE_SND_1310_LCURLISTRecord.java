/***************************************************************************************************
* 파일명 : SE_SND_1310_LCURLISTRecord.java
* 기능 : 판매 - 발송관리 - 노선별인쇄처변경
* 작성일자 : 2009.01.30
* 작성자 :   김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.snd.rec;

import java.sql.*;
import chosun.ciis.se.snd.dm.*;
import chosun.ciis.se.snd.ds.*;

/**
 * 
 */


public class SE_SND_1310_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{
	public String cmpy_cd           ;
	public String reg_dt            ;
	public String reg_seq           ;
	public String route_clsf        ;
	public String bgn_route_cd      ;
	public String bgn_route_nm		;
	public String end_route_cd      ;
	public String end_route_nm		;
	public String medi_cd           ;
	public String prt_plac_cd       ;
	public String incmg_pers        ;
	public String incmg_dt_tm       ;
	
	public String getBgn_route_cd() {
		return bgn_route_cd;
	}
	public void setBgn_route_cd(String bgn_route_cd) {
		this.bgn_route_cd = bgn_route_cd;
	}
	public String getCmpy_cd() {
		return cmpy_cd;
	}
	public void setCmpy_cd(String cmpy_cd) {
		this.cmpy_cd = cmpy_cd;
	}
	public String getEnd_route_cd() {
		return end_route_cd;
	}
	public void setEnd_route_cd(String end_route_cd) {
		this.end_route_cd = end_route_cd;
	}
	public String getIncmg_dt_tm() {
		return incmg_dt_tm;
	}
	public void setIncmg_dt_tm(String incmg_dt_tm) {
		this.incmg_dt_tm = incmg_dt_tm;
	}
	public String getIncmg_pers() {
		return incmg_pers;
	}
	public void setIncmg_pers(String incmg_pers) {
		this.incmg_pers = incmg_pers;
	}
	public String getMedi_cd() {
		return medi_cd;
	}
	public void setMedi_cd(String medi_cd) {
		this.medi_cd = medi_cd;
	}
	public String getPrt_plac_cd() {
		return prt_plac_cd;
	}
	public void setPrt_plac_cd(String prt_plac_cd) {
		this.prt_plac_cd = prt_plac_cd;
	}
	public String getReg_dt() {
		return reg_dt;
	}
	public void setReg_dt(String reg_dt) {
		this.reg_dt = reg_dt;
	}
	public String getReg_seq() {
		return reg_seq;
	}
	public void setReg_seq(String reg_seq) {
		this.reg_seq = reg_seq;
	}
	public String getRoute_clsf() {
		return route_clsf;
	}
	public void setRoute_clsf(String route_clsf) {
		this.route_clsf = route_clsf;
	}
	public String getBgn_route_nm() {
		return bgn_route_nm;
	}
	public void setBgn_route_nm(String bgn_route_nm) {
		this.bgn_route_nm = bgn_route_nm;
	}
	public String getEnd_route_nm() {
		return end_route_nm;
	}
	public void setEnd_route_nm(String end_route_nm) {
		this.end_route_nm = end_route_nm;
	}


}

/* 작성시간 : Tue Jan 20 19:27:48 KST 2009 */