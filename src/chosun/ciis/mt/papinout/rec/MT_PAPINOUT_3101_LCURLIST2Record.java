/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.mt.papinout.rec;

import java.sql.*;
import chosun.ciis.mt.papinout.dm.*;
import chosun.ciis.mt.papinout.ds.*;

/**
 * 
 */


public class MT_PAPINOUT_3101_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String fac_clsf;
	public String issu_dt;
	public String medi_cd;
	public String sect_cd;
	public String sect_nm;
	public String pap_std;
	public String issu_pcnt;
	public String bw_pcnt;
	public String clr_pcnt;
	public String slip_qty;
	public String a_wgt;
	public String b_wgt;
	public String c_wgt;
	public String a_roll;
	public String b_roll;
	public String c_roll;
	public String chk_a;
	public String chk_b;
	public String chk_c;
	public String a_rwgt;
	public String b_rwgt;
	public String c_rwgt;
	public String prt_wgt;
	public String prt_clsf;
	public String coll_yn;
	public String papcmpy_cd;
	public String occr_dt;
	public String seq;

	public MT_PAPINOUT_3101_LCURLIST2Record(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setSect_nm(String sect_nm){
		this.sect_nm = sect_nm;
	}

	public void setPap_std(String pap_std){
		this.pap_std = pap_std;
	}

	public void setIssu_pcnt(String issu_pcnt){
		this.issu_pcnt = issu_pcnt;
	}

	public void setBw_pcnt(String bw_pcnt){
		this.bw_pcnt = bw_pcnt;
	}

	public void setClr_pcnt(String clr_pcnt){
		this.clr_pcnt = clr_pcnt;
	}

	public void setSlip_qty(String slip_qty){
		this.slip_qty = slip_qty;
	}

	public void setA_wgt(String a_wgt){
		this.a_wgt = a_wgt;
	}

	public void setB_wgt(String b_wgt){
		this.b_wgt = b_wgt;
	}

	public void setC_wgt(String c_wgt){
		this.c_wgt = c_wgt;
	}

	public void setA_roll(String a_roll){
		this.a_roll = a_roll;
	}

	public void setB_roll(String b_roll){
		this.b_roll = b_roll;
	}

	public void setC_roll(String c_roll){
		this.c_roll = c_roll;
	}

	public void setChk_a(String chk_a){
		this.chk_a = chk_a;
	}

	public void setChk_b(String chk_b){
		this.chk_b = chk_b;
	}

	public void setChk_c(String chk_c){
		this.chk_c = chk_c;
	}

	public void setA_rwgt(String a_rwgt){
		this.a_rwgt = a_rwgt;
	}

	public void setB_rwgt(String b_rwgt){
		this.b_rwgt = b_rwgt;
	}

	public void setC_rwgt(String c_rwgt){
		this.c_rwgt = c_rwgt;
	}

	public void setPrt_wgt(String prt_wgt){
		this.prt_wgt = prt_wgt;
	}

	public void setPrt_clsf(String prt_clsf){
		this.prt_clsf = prt_clsf;
	}

	public void setColl_yn(String coll_yn){
		this.coll_yn = coll_yn;
	}

	public void setPapcmpy_cd(String papcmpy_cd){
		this.papcmpy_cd = papcmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getSect_nm(){
		return this.sect_nm;
	}

	public String getPap_std(){
		return this.pap_std;
	}

	public String getIssu_pcnt(){
		return this.issu_pcnt;
	}

	public String getBw_pcnt(){
		return this.bw_pcnt;
	}

	public String getClr_pcnt(){
		return this.clr_pcnt;
	}

	public String getSlip_qty(){
		return this.slip_qty;
	}

	public String getA_wgt(){
		return this.a_wgt;
	}

	public String getB_wgt(){
		return this.b_wgt;
	}

	public String getC_wgt(){
		return this.c_wgt;
	}

	public String getA_roll(){
		return this.a_roll;
	}

	public String getB_roll(){
		return this.b_roll;
	}

	public String getC_roll(){
		return this.c_roll;
	}

	public String getChk_a(){
		return this.chk_a;
	}

	public String getChk_b(){
		return this.chk_b;
	}

	public String getChk_c(){
		return this.chk_c;
	}

	public String getA_rwgt(){
		return this.a_rwgt;
	}

	public String getB_rwgt(){
		return this.b_rwgt;
	}

	public String getC_rwgt(){
		return this.c_rwgt;
	}

	public String getPrt_wgt(){
		return this.prt_wgt;
	}

	public String getPrt_clsf(){
		return this.prt_clsf;
	}

	public String getColl_yn(){
		return this.coll_yn;
	}

	public String getPapcmpy_cd(){
		return this.papcmpy_cd;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}
}

/* �ۼ��ð� : Tue Nov 03 00:45:43 KST 2009 */