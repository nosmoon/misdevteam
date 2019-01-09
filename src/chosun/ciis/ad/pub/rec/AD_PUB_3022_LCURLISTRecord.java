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


package chosun.ciis.ad.pub.rec;

import java.sql.*;
import chosun.ciis.ad.pub.dm.*;
import chosun.ciis.ad.pub.ds.*;

/**
 * 
 */


public class AD_PUB_3022_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String chcode;
	public String cuscode;
	public String blndcode;
	public String orgcode;
	public String frdate;
	public String todate;
	public String rcvgrp;
	public String chgcode;
	public String stdmonth;
	public String rcvamt;
	public String vatcode;
	public String agentcode;
	public String agentfee;
	public String salecode;
	public String saleemp;
	public String deptcode;
	public String deptname;
	public String dtlseq;
	public String zpcode;
	public String zpname;
	public String stdamt;
	public String divamt;
	public String divvatamt;
	public String agentstdamt;
	public String agentdivamt;
	public String agentdivvatamt;
	public String acct_trn_cnfm;
	public String medi_cd;
	public String pubc_occr_dt;
	public String pubc_occr_seq;
	public String dtl_num;

	public AD_PUB_3022_LCURLISTRecord(){}

	public void setChcode(String chcode){
		this.chcode = chcode;
	}

	public void setCuscode(String cuscode){
		this.cuscode = cuscode;
	}

	public void setBlndcode(String blndcode){
		this.blndcode = blndcode;
	}

	public void setOrgcode(String orgcode){
		this.orgcode = orgcode;
	}

	public void setFrdate(String frdate){
		this.frdate = frdate;
	}

	public void setTodate(String todate){
		this.todate = todate;
	}

	public void setRcvgrp(String rcvgrp){
		this.rcvgrp = rcvgrp;
	}

	public void setChgcode(String chgcode){
		this.chgcode = chgcode;
	}

	public void setStdmonth(String stdmonth){
		this.stdmonth = stdmonth;
	}

	public void setRcvamt(String rcvamt){
		this.rcvamt = rcvamt;
	}

	public void setVatcode(String vatcode){
		this.vatcode = vatcode;
	}

	public void setAgentcode(String agentcode){
		this.agentcode = agentcode;
	}

	public void setAgentfee(String agentfee){
		this.agentfee = agentfee;
	}

	public void setSalecode(String salecode){
		this.salecode = salecode;
	}

	public void setSaleemp(String saleemp){
		this.saleemp = saleemp;
	}

	public void setDeptcode(String deptcode){
		this.deptcode = deptcode;
	}

	public void setDeptname(String deptname){
		this.deptname = deptname;
	}

	public void setDtlseq(String dtlseq){
		this.dtlseq = dtlseq;
	}

	public void setZpcode(String zpcode){
		this.zpcode = zpcode;
	}

	public void setZpname(String zpname){
		this.zpname = zpname;
	}

	public void setStdamt(String stdamt){
		this.stdamt = stdamt;
	}

	public void setDivamt(String divamt){
		this.divamt = divamt;
	}

	public void setDivvatamt(String divvatamt){
		this.divvatamt = divvatamt;
	}

	public void setAgentstdamt(String agentstdamt){
		this.agentstdamt = agentstdamt;
	}

	public void setAgentdivamt(String agentdivamt){
		this.agentdivamt = agentdivamt;
	}

	public void setAgentdivvatamt(String agentdivvatamt){
		this.agentdivvatamt = agentdivvatamt;
	}

	public void setAcct_trn_cnfm(String acct_trn_cnfm){
		this.acct_trn_cnfm = acct_trn_cnfm;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setPubc_occr_dt(String pubc_occr_dt){
		this.pubc_occr_dt = pubc_occr_dt;
	}

	public void setPubc_occr_seq(String pubc_occr_seq){
		this.pubc_occr_seq = pubc_occr_seq;
	}

	public void setDtl_num(String dtl_num){
		this.dtl_num = dtl_num;
	}

	public String getChcode(){
		return this.chcode;
	}

	public String getCuscode(){
		return this.cuscode;
	}

	public String getBlndcode(){
		return this.blndcode;
	}

	public String getOrgcode(){
		return this.orgcode;
	}

	public String getFrdate(){
		return this.frdate;
	}

	public String getTodate(){
		return this.todate;
	}

	public String getRcvgrp(){
		return this.rcvgrp;
	}

	public String getChgcode(){
		return this.chgcode;
	}

	public String getStdmonth(){
		return this.stdmonth;
	}

	public String getRcvamt(){
		return this.rcvamt;
	}

	public String getVatcode(){
		return this.vatcode;
	}

	public String getAgentcode(){
		return this.agentcode;
	}

	public String getAgentfee(){
		return this.agentfee;
	}

	public String getSalecode(){
		return this.salecode;
	}

	public String getSaleemp(){
		return this.saleemp;
	}

	public String getDeptcode(){
		return this.deptcode;
	}

	public String getDeptname(){
		return this.deptname;
	}

	public String getDtlseq(){
		return this.dtlseq;
	}

	public String getZpcode(){
		return this.zpcode;
	}

	public String getZpname(){
		return this.zpname;
	}

	public String getStdamt(){
		return this.stdamt;
	}

	public String getDivamt(){
		return this.divamt;
	}

	public String getDivvatamt(){
		return this.divvatamt;
	}

	public String getAgentstdamt(){
		return this.agentstdamt;
	}

	public String getAgentdivamt(){
		return this.agentdivamt;
	}

	public String getAgentdivvatamt(){
		return this.agentdivvatamt;
	}

	public String getAcct_trn_cnfm(){
		return this.acct_trn_cnfm;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getPubc_occr_dt(){
		return this.pubc_occr_dt;
	}

	public String getPubc_occr_seq(){
		return this.pubc_occr_seq;
	}

	public String getDtl_num(){
		return this.dtl_num;
	}
}

/* 작성시간 : Tue Jan 31 19:43:11 KST 2012 */