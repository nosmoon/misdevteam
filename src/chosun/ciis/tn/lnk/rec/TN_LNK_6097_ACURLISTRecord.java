/***************************************************************************************************
* 파일명 : .java
* 기능 : 	   
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.tn.lnk.rec;

import java.sql.*;
import chosun.ciis.tn.lnk.dm.*;
import chosun.ciis.tn.lnk.ds.*;

/**
 * 
 */


public class TN_LNK_6097_ACURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String seq;
	public String data_clsf;
	public String pymtmm;
	public String pymtdd;
	public String support;
	public String memb_cd;
	public String memb_nm;
	public String pymt_cd;
	public String mobiaprvname;
	public String mobiaprvcmpy;
	public String mobiaprvnumber;
	public String payprice;
	public String result_stat;
	public String paymentidx;
	public String cnclokdate;
	public String cncldate;
	public String cncl_stat;
	public String acptdate;
	public String acptno;
	public String acptprice;
	public String acptlimit;
	public String reqprice;
	public String paydate;
	public String result;
	public String resultcode;
	public String resultmsg;
	public String memberidx;
	public String promiseidx;
	public String sdsipaymentidx;
	public String sdsiidx;

	public TN_LNK_6097_ACURLISTRecord(){}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setData_clsf(String data_clsf){
		this.data_clsf = data_clsf;
	}

	public void setPymtmm(String pymtmm){
		this.pymtmm = pymtmm;
	}

	public void setPymtdd(String pymtdd){
		this.pymtdd = pymtdd;
	}

	public void setSupport(String support){
		this.support = support;
	}

	public void setMemb_cd(String memb_cd){
		this.memb_cd = memb_cd;
	}

	public void setMemb_nm(String memb_nm){
		this.memb_nm = memb_nm;
	}

	public void setPymt_cd(String pymt_cd){
		this.pymt_cd = pymt_cd;
	}

	public void setMobiaprvname(String mobiaprvname){
		this.mobiaprvname = mobiaprvname;
	}

	public void setMobiaprvcmpy(String mobiaprvcmpy){
		this.mobiaprvcmpy = mobiaprvcmpy;
	}

	public void setMobiaprvnumber(String mobiaprvnumber){
		this.mobiaprvnumber = mobiaprvnumber;
	}

	public void setPayprice(String payprice){
		this.payprice = payprice;
	}

	public void setResult_stat(String result_stat){
		this.result_stat = result_stat;
	}

	public void setPaymentidx(String paymentidx){
		this.paymentidx = paymentidx;
	}

	public void setCnclokdate(String cnclokdate){
		this.cnclokdate = cnclokdate;
	}

	public void setCncldate(String cncldate){
		this.cncldate = cncldate;
	}

	public void setCncl_stat(String cncl_stat){
		this.cncl_stat = cncl_stat;
	}

	public void setAcptdate(String acptdate){
		this.acptdate = acptdate;
	}

	public void setAcptno(String acptno){
		this.acptno = acptno;
	}

	public void setAcptprice(String acptprice){
		this.acptprice = acptprice;
	}

	public void setAcptlimit(String acptlimit){
		this.acptlimit = acptlimit;
	}

	public void setReqprice(String reqprice){
		this.reqprice = reqprice;
	}

	public void setPaydate(String paydate){
		this.paydate = paydate;
	}

	public void setResult(String result){
		this.result = result;
	}

	public void setResultcode(String resultcode){
		this.resultcode = resultcode;
	}

	public void setResultmsg(String resultmsg){
		this.resultmsg = resultmsg;
	}

	public void setMemberidx(String memberidx){
		this.memberidx = memberidx;
	}

	public void setPromiseidx(String promiseidx){
		this.promiseidx = promiseidx;
	}

	public void setSdsipaymentidx(String sdsipaymentidx){
		this.sdsipaymentidx = sdsipaymentidx;
	}

	public void setSdsiidx(String sdsiidx){
		this.sdsiidx = sdsiidx;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getData_clsf(){
		return this.data_clsf;
	}

	public String getPymtmm(){
		return this.pymtmm;
	}

	public String getPymtdd(){
		return this.pymtdd;
	}

	public String getSupport(){
		return this.support;
	}

	public String getMemb_cd(){
		return this.memb_cd;
	}

	public String getMemb_nm(){
		return this.memb_nm;
	}

	public String getPymt_cd(){
		return this.pymt_cd;
	}

	public String getMobiaprvname(){
		return this.mobiaprvname;
	}

	public String getMobiaprvcmpy(){
		return this.mobiaprvcmpy;
	}

	public String getMobiaprvnumber(){
		return this.mobiaprvnumber;
	}

	public String getPayprice(){
		return this.payprice;
	}

	public String getResult_stat(){
		return this.result_stat;
	}

	public String getPaymentidx(){
		return this.paymentidx;
	}

	public String getCnclokdate(){
		return this.cnclokdate;
	}

	public String getCncldate(){
		return this.cncldate;
	}

	public String getCncl_stat(){
		return this.cncl_stat;
	}

	public String getAcptdate(){
		return this.acptdate;
	}

	public String getAcptno(){
		return this.acptno;
	}

	public String getAcptprice(){
		return this.acptprice;
	}

	public String getAcptlimit(){
		return this.acptlimit;
	}

	public String getReqprice(){
		return this.reqprice;
	}

	public String getPaydate(){
		return this.paydate;
	}

	public String getResult(){
		return this.result;
	}

	public String getResultcode(){
		return this.resultcode;
	}

	public String getResultmsg(){
		return this.resultmsg;
	}

	public String getMemberidx(){
		return this.memberidx;
	}

	public String getPromiseidx(){
		return this.promiseidx;
	}

	public String getSdsipaymentidx(){
		return this.sdsipaymentidx;
	}

	public String getSdsiidx(){
		return this.sdsiidx;
	}
}

/* 작성시간 : Fri Dec 23 10:39:52 KST 2016 */