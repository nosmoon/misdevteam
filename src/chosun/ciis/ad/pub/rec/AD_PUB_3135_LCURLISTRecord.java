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


public class AD_PUB_3135_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String chcode;
	public String cuscode;
	public String blndcode;
	public String orgcode;
	public String frdate;
	public String todate;
	public String rcvgrp;
	public String chgcode;
	public String stdmonth;
	public int rcvamt;
	public String vatcode;
	public String agentcode;
	public int agentfee;
	public String agentcode2;
	public int agentfee2;
	public String salecode;
	public String saleemp;
	public String deptcode;
	public String deptname;
	public String dtlseq;
	public String zpcode;
	public String zpname;
	public int stdamt;
	public int divamt;
	public int divvatamt;
	public int agentstdamt;
	public int agentdivamt;
	public int agentdivvatamt;
	public int agentstdamt2;
	public int agentdivamt2;
	public int agentdivvatamt2;	
	public String acct_trn_cnfm;
	public String medi_cd;
	public String pubc_occr_dt;
	public String pubc_occr_seq;
	public String pre_medi_cd;
	public String pre_pubc_occr_dt;
	public String pre_pubc_occr_seq;
	public int dtl_num;
	public String acct_yn_1;
	public String agent_branch_yn;

	public AD_PUB_3135_LCURLISTRecord(){}

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

	public void setRcvamt(int rcvamt){
		this.rcvamt = rcvamt;
	}

	public void setVatcode(String vatcode){
		this.vatcode = vatcode;
	}

	public void setAgentcode(String agentcode){
		this.agentcode = agentcode;
	}

	public void setAgentfee(int agentfee){
		this.agentfee = agentfee;
	}

	public void setAgentcode2(String agentcode2){
		this.agentcode2 = agentcode2;
	}

	public void setAgentfee2(int agentfee2){
		this.agentfee2 = agentfee2;
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

	public void setStdamt(int stdamt){
		this.stdamt = stdamt;
	}

	public void setDivamt(int divamt){
		this.divamt = divamt;
	}

	public void setDivvatamt(int divvatamt){
		this.divvatamt = divvatamt;
	}

	public void setAgentstdamt(int agentstdamt){
		this.agentstdamt = agentstdamt;
	}

	public void setAgentdivamt(int agentdivamt){
		this.agentdivamt = agentdivamt;
	}

	public void setAgentdivvatamt(int agentdivvatamt){
		this.agentdivvatamt = agentdivvatamt;
	}

	public void setAgentstdamt2(int agentstdamt2){
		this.agentstdamt2 = agentstdamt2;
	}

	public void setAgentdivamt2(int agentdivamt2){
		this.agentdivamt2 = agentdivamt2;
	}

	public void setAgentdivvatamt2(int agentdivvatamt2){
		this.agentdivvatamt2 = agentdivvatamt2;
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

	public void setPre_medi_cd(String pre_medi_cd){
		this.pre_medi_cd = pre_medi_cd;
	}

	public void setPre_pubc_occr_dt(String pre_pubc_occr_dt){
		this.pre_pubc_occr_dt = pre_pubc_occr_dt;
	}

	public void setPre_pubc_occr_seq(String pre_pubc_occr_seq){
		this.pre_pubc_occr_seq = pre_pubc_occr_seq;
	}

	public void setDtl_num(int dtl_num){
		this.dtl_num = dtl_num;
	}

	public void setAcct_yn_1(String acct_yn_1){
		this.acct_yn_1 = acct_yn_1;
	}

	public void setAgent_branch_yn(String agent_branch_yn){
		this.agent_branch_yn = agent_branch_yn;
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

	public int getRcvamt(){
		return this.rcvamt;
	}

	public String getVatcode(){
		return this.vatcode;
	}

	public String getAgentcode(){
		return this.agentcode;
	}

	public int getAgentfee(){
		return this.agentfee;
	}

	public String getAgentcode2(){
		return this.agentcode2;
	}

	public int getAgentfee2(){
		return this.agentfee2;
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

	public int getStdamt(){
		return this.stdamt;
	}

	public int getDivamt(){
		return this.divamt;
	}

	public int getDivvatamt(){
		return this.divvatamt;
	}

	public int getAgentstdamt(){
		return this.agentstdamt;
	}

	public int getAgentdivamt(){
		return this.agentdivamt;
	}

	public int getAgentdivvatamt(){
		return this.agentdivvatamt;
	}

	public int getAgentstdamt2(){
		return this.agentstdamt2;
	}

	public int getAgentdivamt2(){
		return this.agentdivamt2;
	}

	public int getAgentdivvatamt2(){
		return this.agentdivvatamt2;
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

	public String getPre_medi_cd(){
		return this.pre_medi_cd;
	}

	public String getPre_pubc_occr_dt(){
		return this.pre_pubc_occr_dt;
	}

	public String getPre_pubc_occr_seq(){
		return this.pre_pubc_occr_seq;
	}

	public int getDtl_num(){
		return this.dtl_num;
	}

	public String getAcct_yn_1(){
		return this.acct_yn_1;
	}
	
	public String getAgent_branch_yn(){
		return this.agent_branch_yn;
	}
}

/* 작성시간 : Thu Feb 23 10:28:20 KST 2012 */