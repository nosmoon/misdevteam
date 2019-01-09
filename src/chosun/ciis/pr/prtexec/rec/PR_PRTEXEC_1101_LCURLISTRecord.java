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


package chosun.ciis.pr.prtexec.rec;

import java.sql.*;
import chosun.ciis.pr.prtexec.dm.*;
import chosun.ciis.pr.prtexec.ds.*;

/**
 * 
 */


public class PR_PRTEXEC_1101_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String fac_clsf;
	public String fac_clsf_nm;
	public String medi_cd;
	public String medi_nm;
	public String sect_cd;
	public String sect_nm;
	public String ecnt;
	public String rmsg_tm;
	public String off_plat_tm;
	public String off_plat_end_tm;
	public String prt_bgn_tm;
	public String prt_end_tm;
	public String slip_qty;
	public String real_prt_qty;
	public String bad_nwsp_qty;
	public String card_qty;
	public String dqty;
	public String apcut_err;
	public String driv_cut_err;

	public PR_PRTEXEC_1101_LCURLISTRecord(){}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setFac_clsf_nm(String fac_clsf_nm){
		this.fac_clsf_nm = fac_clsf_nm;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setSect_nm(String sect_nm){
		this.sect_nm = sect_nm;
	}

	public void setEcnt(String ecnt){
		this.ecnt = ecnt;
	}

	public void setRmsg_tm(String rmsg_tm){
		this.rmsg_tm = rmsg_tm;
	}

	public void setOff_plat_tm(String off_plat_tm){
		this.off_plat_tm = off_plat_tm;
	}

	public void setOff_plat_end_tm(String off_plat_end_tm){
		this.off_plat_end_tm = off_plat_end_tm;
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

	public void setBad_nwsp_qty(String bad_nwsp_qty){
		this.bad_nwsp_qty = bad_nwsp_qty;
	}

	public void setCard_qty(String card_qty){
		this.card_qty = card_qty;
	}

	public void setDqty(String dqty){
		this.dqty = dqty;
	}

	public void setApcut_err(String apcut_err){
		this.apcut_err = apcut_err;
	}

	public void setDriv_cut_err(String driv_cut_err){
		this.driv_cut_err = driv_cut_err;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getFac_clsf_nm(){
		return this.fac_clsf_nm;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getSect_nm(){
		return this.sect_nm;
	}

	public String getEcnt(){
		return this.ecnt;
	}

	public String getRmsg_tm(){
		return this.rmsg_tm;
	}

	public String getOff_plat_tm(){
		return this.off_plat_tm;
	}

	public String getOff_plat_end_tm(){
		return this.off_plat_end_tm;
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

	public String getBad_nwsp_qty(){
		return this.bad_nwsp_qty;
	}

	public String getCard_qty(){
		return this.card_qty;
	}

	public String getDqty(){
		return this.dqty;
	}

	public String getApcut_err(){
		return this.apcut_err;
	}

	public String getDriv_cut_err(){
		return this.driv_cut_err;
	}
}

/* 작성시간 : Sat Jun 06 19:02:43 KST 2009 */