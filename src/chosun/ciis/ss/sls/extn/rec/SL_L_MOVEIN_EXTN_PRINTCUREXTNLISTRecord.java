/***************************************************************************************************
* 파일명 : .java
* 기능 : *지국경영-입주아파트현황-입주팀확장현황-엑셀저장
* 작성일자 : 2009-04-02
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * 지국경영-입주아파트현황-입주팀확장현황-엑셀저장
 */

public class SL_L_MOVEIN_EXTN_PRINTCUREXTNLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String extndt;
	public String teamnm;
	public String jursareanm;
	public String stafnm;
	public String deptnm;
	public String areanm;
	public String bonm;
	public String rdrnm;
	public String rdr_no;
	public String addr;
	public String dtlsaddr;
	public String resitypenm;
	public String valmm;
	public String telno;
	public String ptphno;
	public int amt;
	public int qty;
	public String suspdt;
	public String subspyn;
	public String mvinaptyn;
	public String remk;
	public String rdr_extntypenm;

	public SL_L_MOVEIN_EXTN_PRINTCUREXTNLISTRecord(){}

	public void setExtndt(String extndt){
		this.extndt = extndt;
	}

	public void setTeamnm(String teamnm){
		this.teamnm = teamnm;
	}

	public void setJursareanm(String jursareanm){
		this.jursareanm = jursareanm;
	}

	public void setStafnm(String stafnm){
		this.stafnm = stafnm;
	}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setAreanm(String areanm){
		this.areanm = areanm;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setDtlsaddr(String dtlsaddr){
		this.dtlsaddr = dtlsaddr;
	}

	public void setResitypenm(String resitypenm){
		this.resitypenm = resitypenm;
	}

	public void setValmm(String valmm){
		this.valmm = valmm;
	}

	public void setTelno(String telno){
		this.telno = telno;
	}

	public void setPtphno(String ptphno){
		this.ptphno = ptphno;
	}

	public void setAmt(int amt){
		this.amt = amt;
	}

	public void setQty(int qty){
		this.qty = qty;
	}

	public void setSuspdt(String suspdt){
		this.suspdt = suspdt;
	}

	public void setSubspyn(String subspyn){
		this.subspyn = subspyn;
	}

	public void setMvinaptyn(String mvinaptyn){
		this.mvinaptyn = mvinaptyn;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setRdr_extntypenm(String rdr_extntypenm){
		this.rdr_extntypenm = rdr_extntypenm;
	}

	public String getExtndt(){
		return this.extndt;
	}

	public String getTeamnm(){
		return this.teamnm;
	}

	public String getJursareanm(){
		return this.jursareanm;
	}

	public String getStafnm(){
		return this.stafnm;
	}

	public String getDeptnm(){
		return this.deptnm;
	}

	public String getAreanm(){
		return this.areanm;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getDtlsaddr(){
		return this.dtlsaddr;
	}

	public String getResitypenm(){
		return this.resitypenm;
	}

	public String getValmm(){
		return this.valmm;
	}

	public String getTelno(){
		return this.telno;
	}

	public String getPtphno(){
		return this.ptphno;
	}

	public int getAmt(){
		return this.amt;
	}

	public int getQty(){
		return this.qty;
	}

	public String getSuspdt(){
		return this.suspdt;
	}

	public String getSubspyn(){
		return this.subspyn;
	}

	public String getMvinaptyn(){
		return this.mvinaptyn;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getRdr_extntypenm(){
		return this.rdr_extntypenm;
	}
}

/* 작성시간 : Thu Apr 02 21:38:34 KST 2009 */