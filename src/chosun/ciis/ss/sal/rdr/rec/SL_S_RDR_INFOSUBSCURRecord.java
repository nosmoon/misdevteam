/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sal.rdr.rec;

import java.sql.*;
import chosun.ciis.ss.sal.rdr.dm.*;
import chosun.ciis.ss.sal.rdr.ds.*;

/**
 * 
 */


public class SL_S_RDR_INFOSUBSCURRecord extends java.lang.Object implements java.io.Serializable{

	public String medicd;
	public int subsamt;
	public int clamamt;
	public int dscnamt;
	public int post_dlvfee;
	public int valqty;
	public int pre_valqty;
	public int no_valqty;
	public String rptvfreeclsf;
	public String rptvrdr_extndt;
	public String rptvrdr_extntype;
	public String rptvextn;
	public String rptvsubsdt;
	public String clamtmthdcd;
	public String rptvvalmm;
	public String clamtcyclcd;
	public String rptvrdr_movmdt;
	public int totrdr_extncost;
	public String rptv_bns_itemnm;
	public String rptv_suspdt;
	public String rptv_suspresncd;
	public String submedicd;
	public String vact_noprint;
	public String pay_reciyn;
	public String target_extn;

	public SL_S_RDR_INFOSUBSCURRecord(){}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setSubsamt(int subsamt){
		this.subsamt = subsamt;
	}

	public void setClamamt(int clamamt){
		this.clamamt = clamamt;
	}

	public void setDscnamt(int dscnamt){
		this.dscnamt = dscnamt;
	}

	public void setPost_dlvfee(int post_dlvfee){
		this.post_dlvfee = post_dlvfee;
	}

	public void setValqty(int valqty){
		this.valqty = valqty;
	}

	public void setPre_valqty(int pre_valqty){
		this.pre_valqty = pre_valqty;
	}

	public void setNo_valqty(int no_valqty){
		this.no_valqty = no_valqty;
	}

	public void setRptvfreeclsf(String rptvfreeclsf){
		this.rptvfreeclsf = rptvfreeclsf;
	}

	public void setRptvrdr_extndt(String rptvrdr_extndt){
		this.rptvrdr_extndt = rptvrdr_extndt;
	}

	public void setRptvrdr_extntype(String rptvrdr_extntype){
		this.rptvrdr_extntype = rptvrdr_extntype;
	}

	public void setRptvextn(String rptvextn){
		this.rptvextn = rptvextn;
	}

	public void setRptvsubsdt(String rptvsubsdt){
		this.rptvsubsdt = rptvsubsdt;
	}

	public void setClamtmthdcd(String clamtmthdcd){
		this.clamtmthdcd = clamtmthdcd;
	}

	public void setRptvvalmm(String rptvvalmm){
		this.rptvvalmm = rptvvalmm;
	}

	public void setClamtcyclcd(String clamtcyclcd){
		this.clamtcyclcd = clamtcyclcd;
	}

	public void setRptvrdr_movmdt(String rptvrdr_movmdt){
		this.rptvrdr_movmdt = rptvrdr_movmdt;
	}

	public void setTotrdr_extncost(int totrdr_extncost){
		this.totrdr_extncost = totrdr_extncost;
	}

	public void setRptv_bns_itemnm(String rptv_bns_itemnm){
		this.rptv_bns_itemnm = rptv_bns_itemnm;
	}

	public void setRptv_suspdt(String rptv_suspdt){
		this.rptv_suspdt = rptv_suspdt;
	}

	public void setRptv_suspresncd(String rptv_suspresncd){
		this.rptv_suspresncd = rptv_suspresncd;
	}

	public void setSubmedicd(String submedicd){
		this.submedicd = submedicd;
	}

	public void setVact_noprint(String vact_noprint){
		this.vact_noprint = vact_noprint;
	}

	public void setPay_reciyn(String pay_reciyn){
		this.pay_reciyn = pay_reciyn;
	}

	public void setTarget_extn(String target_extn){
		this.target_extn = target_extn;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public int getSubsamt(){
		return this.subsamt;
	}

	public int getClamamt(){
		return this.clamamt;
	}

	public int getDscnamt(){
		return this.dscnamt;
	}

	public int getPost_dlvfee(){
		return this.post_dlvfee;
	}

	public int getValqty(){
		return this.valqty;
	}

	public int getPre_valqty(){
		return this.pre_valqty;
	}

	public int getNo_valqty(){
		return this.no_valqty;
	}

	public String getRptvfreeclsf(){
		return this.rptvfreeclsf;
	}

	public String getRptvrdr_extndt(){
		return this.rptvrdr_extndt;
	}

	public String getRptvrdr_extntype(){
		return this.rptvrdr_extntype;
	}

	public String getRptvextn(){
		return this.rptvextn;
	}

	public String getRptvsubsdt(){
		return this.rptvsubsdt;
	}

	public String getClamtmthdcd(){
		return this.clamtmthdcd;
	}

	public String getRptvvalmm(){
		return this.rptvvalmm;
	}

	public String getClamtcyclcd(){
		return this.clamtcyclcd;
	}

	public String getRptvrdr_movmdt(){
		return this.rptvrdr_movmdt;
	}

	public int getTotrdr_extncost(){
		return this.totrdr_extncost;
	}

	public String getRptv_bns_itemnm(){
		return this.rptv_bns_itemnm;
	}

	public String getRptv_suspdt(){
		return this.rptv_suspdt;
	}

	public String getRptv_suspresncd(){
		return this.rptv_suspresncd;
	}

	public String getSubmedicd(){
		return this.submedicd;
	}

	public String getVact_noprint(){
		return this.vact_noprint;
	}

	public String getPay_reciyn(){
		return this.pay_reciyn;
	}

	public String getTarget_extn(){
		return this.target_extn;
	}
}

/* 작성시간 : Wed Oct 11 17:10:57 KST 2017 */