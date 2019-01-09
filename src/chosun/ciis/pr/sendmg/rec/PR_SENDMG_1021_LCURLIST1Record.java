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


public class PR_SENDMG_1021_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String medi_cd;
	public String prt_plac_clsf;
	public String ecnt;
	public String prt_bgn_tm;
	public String prt_end_tm;
	public String slip_qty;
	public String real_prt_qty;
	public String card_qty;
	public String dqty;
	public String off_plat_tm;

	public PR_SENDMG_1021_LCURLIST1Record(){}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setPrt_plac_clsf(String prt_plac_clsf){
		this.prt_plac_clsf = prt_plac_clsf;
	}

	public void setEcnt(String ecnt){
		this.ecnt = ecnt;
	}

	public void setPrt_bgn_tm(String prt_bgn_tm){
		this.prt_bgn_tm = prt_bgn_tm;
	}

	public void setPrt_end_tm(String prt_end_tm){
		this.prt_end_tm = prt_end_tm;
	}

	public void setSlip_qty(String slip_qty){
		this.slip_qty = slip_qty;
	}

	public void setReal_prt_qty(String real_prt_qty){
		this.real_prt_qty = real_prt_qty;
	}

	public void setCard_qty(String card_qty){
		this.card_qty = card_qty;
	}

	public void setDqty(String dqty){
		this.dqty = dqty;
	}

	public void setOff_plat_tm(String off_plat_tm){
		this.off_plat_tm = off_plat_tm;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getPrt_plac_clsf(){
		return this.prt_plac_clsf;
	}

	public String getEcnt(){
		return this.ecnt;
	}

	public String getPrt_bgn_tm(){
		return this.prt_bgn_tm;
	}

	public String getPrt_end_tm(){
		return this.prt_end_tm;
	}

	public String getSlip_qty(){
		return this.slip_qty;
	}

	public String getReal_prt_qty(){
		return this.real_prt_qty;
	}

	public String getCard_qty(){
		return this.card_qty;
	}

	public String getDqty(){
		return this.dqty;
	}

	public String getOff_plat_tm(){
		return this.off_plat_tm;
	}
}

/* 작성시간 : Mon Jun 15 16:03:43 KST 2009 */