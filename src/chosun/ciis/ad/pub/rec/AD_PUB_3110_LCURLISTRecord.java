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


public class AD_PUB_3110_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String chcode;
	public String cuscode;
	public String cuscodenm;
	public String cuscodeern;
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
	public String agentcodenm;
	public String agentcodeern;
	public String agentfee;
	public String agentcode2;
	public String agentcodenm2;
	public String agentcodeern2;
	public String agentfee2;
	public String salecode;
	public String saleemp;
	public String deptcode;
	public String deptname;
	public String acct_trn_cnfm;
	public String medi_cd;
	public String pubc_occr_dt;
	public String pubc_occr_seq;
	public String clos_yn;
	public String pubc_slip_no;
	public String acct_yn_1;
	public String agent_branch_yn;
	public String medialeb_yn;
	public String xchngadvt_yn;
	public String event_cd;
	public String rslt_dept;
	public String trst_rate;
	public String trst_fee;

	public AD_PUB_3110_LCURLISTRecord(){}

	public void setChcode(String chcode){
		this.chcode = chcode;
	}

	public void setCuscode(String cuscode){
		this.cuscode = cuscode;
	}

	public void setCuscodenm(String cuscodenm){
		this.cuscodenm = cuscodenm;
	}

	public void setCuscodeern(String cuscodeern){
		this.cuscodeern = cuscodeern;
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

	public void setAgentcodenm(String agentcodenm){
		this.agentcodenm = agentcodenm;
	}

	public void setAgentcodeern(String agentcodeern){
		this.agentcodeern = agentcodeern;
	}

	public void setAgentfee(String agentfee){
		this.agentfee = agentfee;
	}

	public void setAgentcode2(String agentcode2){
		this.agentcode2 = agentcode2;
	}

	public void setAgentcodenm2(String agentcodenm2){
		this.agentcodenm2 = agentcodenm2;
	}

	public void setAgentcodeern2(String agentcodeern2){
		this.agentcodeern2 = agentcodeern2;
	}
	
	public void setAgentfee2(String agentfee2){
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

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public void setPubc_slip_no(String pubc_slip_no){
		this.pubc_slip_no = pubc_slip_no;
	}

	public void setAcct_yn_1(String acct_yn_1){
		this.acct_yn_1 = acct_yn_1;
	}

	public void setAgent_branch_yn(String agent_branch_yn){
		this.agent_branch_yn = agent_branch_yn;
	}

	public void setMedialeb_yn(String medialeb_yn){
		this.medialeb_yn = medialeb_yn;
	}

	public void setXchngadvt_yn(String xchngadvt_yn){
		this.xchngadvt_yn = xchngadvt_yn;
	}

	public void setEvent_cd(String event_cd){
		this.event_cd = event_cd;
	}

	public void setRslt_dept(String rslt_dept){
		this.rslt_dept = rslt_dept;
	}

	public void setTrst_rate(String trst_rate){
		this.trst_rate = trst_rate;
	}

	public void setTrst_fee(String trst_fee){
		this.trst_fee = trst_fee;
	}

	public String getChcode(){
		return this.chcode;
	}

	public String getCuscode(){
		return this.cuscode;
	}

	public String getCuscodenm(){
		return this.cuscodenm;
	}

	public String getCuscodeern(){
		return this.cuscodeern;
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

	public String getAgentcodenm(){
		return this.agentcodenm;
	}

	public String getAgentcodeern(){
		return this.agentcodeern;
	}

	public String getAgentfee(){
		return this.agentfee;
	}

	public String getAgentcode2(){
		return this.agentcode2;
	}

	public String getAgentcodenm2(){
		return this.agentcodenm2;
	}

	public String getAgentcodeern2(){
		return this.agentcodeern2;
	}

	public String getAgentfee2(){
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

	public String getClos_yn(){
		return this.clos_yn;
	}

	public String getPubc_slip_no(){
		return this.pubc_slip_no;
	}

	public String getAcct_yn_1(){
		return this.acct_yn_1;
	}

	public String getAgent_branch_yn(){
		return this.agent_branch_yn;
	}

	public String getMedialeb_yn(){
		return this.medialeb_yn;
	}

	public String getXchngadvt_yn(){
		return this.xchngadvt_yn;
	}

	public String getEvent_cd(){
		return this.event_cd;
	}

	public String getRslt_dept(){
		return this.rslt_dept;
	}

	public String getTrst_rate(){
		return this.trst_rate;
	}

	public String getTrst_fee(){
		return this.trst_fee;
	}
}

/* 작성시간 : Fri Jan 30 17:53:37 KST 2015 */