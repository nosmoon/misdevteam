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


package chosun.ciis.pr.sendmg.rec;

import java.sql.*;
import chosun.ciis.pr.sendmg.dm.*;
import chosun.ciis.pr.sendmg.ds.*;

/**
 * 
 */


public class PR_SENDMG_1020_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String medi_nm;
	public String prt_plac_clsf;
	public String ecnt;
	public String prt_ex_tm;
	public String prt_end_tm;
	public String card_qty;
	public String dqty;
	public String cmpy_cd;
	public String medi_cd;
	public String issu_dt;
	public String excp_qty;
	public String off_plat_tm;
	public String off_plat_end_tm;

	public PR_SENDMG_1020_LCURLISTRecord(){}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setPrt_plac_clsf(String prt_plac_clsf){
		this.prt_plac_clsf = prt_plac_clsf;
	}

	public void setEcnt(String ecnt){
		this.ecnt = ecnt;
	}

	public void setPrt_ex_tm(String prt_ex_tm){
		this.prt_ex_tm = prt_ex_tm;
	}

	public void setPrt_end_tm(String prt_end_tm){
		this.prt_end_tm = prt_end_tm;
	}

	public void setCard_qty(String card_qty){
		this.card_qty = card_qty;
	}

	public void setDqty(String dqty){
		this.dqty = dqty;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setExcp_qty(String excp_qty){
		this.excp_qty = excp_qty;
	}

	public void setOff_plat_tm(String off_plat_tm){
		this.off_plat_tm = off_plat_tm;
	}

	public void setOff_plat_end_tm(String off_plat_end_tm){
		this.off_plat_end_tm = off_plat_end_tm;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getPrt_plac_clsf(){
		return this.prt_plac_clsf;
	}

	public String getEcnt(){
		return this.ecnt;
	}

	public String getPrt_ex_tm(){
		return this.prt_ex_tm;
	}

	public String getPrt_end_tm(){
		return this.prt_end_tm;
	}

	public String getCard_qty(){
		return this.card_qty;
	}

	public String getDqty(){
		return this.dqty;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getExcp_qty(){
		return this.excp_qty;
	}

	public String getOff_plat_tm(){
		return this.off_plat_tm;
	}

	public String getOff_plat_end_tm(){
		return this.off_plat_end_tm;
	}
}

/* 작성시간 : Thu May 14 20:13:45 KST 2009 */