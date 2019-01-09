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


package chosun.ciis.pr.papmake.rec;

import java.sql.*;
import chosun.ciis.pr.papmake.dm.*;
import chosun.ciis.pr.papmake.ds.*;

/**
 * 
 */


public class PR_PAPMAKE_2000_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String yymm;
	public String fac_clsf;
	public String dept_clsf;
	public String mang_nops;
	public String prt_nops;
	public String prt_board_nops;
	public String repa_nops;
	public String nwsp_high_nops;
	public String send_nops;
	public String cmpos_nops;
	public String mony_trad_nops;
	public String edt_side_nops;
	public String advt_incmg_nops;
	public String ofcr_nops;
	public String gen_affr_nops;
	public String remk;
	public String seq;
	public String ref_matt;

	public PR_PAPMAKE_2000_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setDept_clsf(String dept_clsf){
		this.dept_clsf = dept_clsf;
	}

	public void setMang_nops(String mang_nops){
		this.mang_nops = mang_nops;
	}

	public void setPrt_nops(String prt_nops){
		this.prt_nops = prt_nops;
	}

	public void setPrt_board_nops(String prt_board_nops){
		this.prt_board_nops = prt_board_nops;
	}

	public void setRepa_nops(String repa_nops){
		this.repa_nops = repa_nops;
	}

	public void setNwsp_high_nops(String nwsp_high_nops){
		this.nwsp_high_nops = nwsp_high_nops;
	}

	public void setSend_nops(String send_nops){
		this.send_nops = send_nops;
	}

	public void setCmpos_nops(String cmpos_nops){
		this.cmpos_nops = cmpos_nops;
	}

	public void setMony_trad_nops(String mony_trad_nops){
		this.mony_trad_nops = mony_trad_nops;
	}

	public void setEdt_side_nops(String edt_side_nops){
		this.edt_side_nops = edt_side_nops;
	}

	public void setAdvt_incmg_nops(String advt_incmg_nops){
		this.advt_incmg_nops = advt_incmg_nops;
	}

	public void setOfcr_nops(String ofcr_nops){
		this.ofcr_nops = ofcr_nops;
	}

	public void setGen_affr_nops(String gen_affr_nops){
		this.gen_affr_nops = gen_affr_nops;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setRef_matt(String ref_matt){
		this.ref_matt = ref_matt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getDept_clsf(){
		return this.dept_clsf;
	}

	public String getMang_nops(){
		return this.mang_nops;
	}

	public String getPrt_nops(){
		return this.prt_nops;
	}

	public String getPrt_board_nops(){
		return this.prt_board_nops;
	}

	public String getRepa_nops(){
		return this.repa_nops;
	}

	public String getNwsp_high_nops(){
		return this.nwsp_high_nops;
	}

	public String getSend_nops(){
		return this.send_nops;
	}

	public String getCmpos_nops(){
		return this.cmpos_nops;
	}

	public String getMony_trad_nops(){
		return this.mony_trad_nops;
	}

	public String getEdt_side_nops(){
		return this.edt_side_nops;
	}

	public String getAdvt_incmg_nops(){
		return this.advt_incmg_nops;
	}

	public String getOfcr_nops(){
		return this.ofcr_nops;
	}

	public String getGen_affr_nops(){
		return this.gen_affr_nops;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getRef_matt(){
		return this.ref_matt;
	}
}

/* 작성시간 : Mon Apr 13 15:20:05 KST 2009 */