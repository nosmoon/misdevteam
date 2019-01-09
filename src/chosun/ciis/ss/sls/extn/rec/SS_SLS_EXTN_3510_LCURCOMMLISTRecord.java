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


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * 
 */


public class SS_SLS_EXTN_3510_LCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String deptnm;
	public String partnm;
	public String areanm;
	public String bonm;
	public String rdrnm;
	public String rdr_no;
	public String qty;
	public String telno;
	public String ptphno;
	public String clamhystp;
	public String clamhystc;
	public String clamtmthd;
	public String resitype;
	public String nowsubsyn;
	public String bocd;
	public String addr;
	public String pay_reciyn;
	public String headnm;
	public String extntype;

	public SS_SLS_EXTN_3510_LCURCOMMLISTRecord(){}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setPartnm(String partnm){
		this.partnm = partnm;
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

	public void setQty(String qty){
		this.qty = qty;
	}

	public void setTelno(String telno){
		this.telno = telno;
	}

	public void setPtphno(String ptphno){
		this.ptphno = ptphno;
	}

	public void setClamhystp(String clamhystp){
		this.clamhystp = clamhystp;
	}

	public void setClamhystc(String clamhystc){
		this.clamhystc = clamhystc;
	}

	public void setClamtmthd(String clamtmthd){
		this.clamtmthd = clamtmthd;
	}

	public void setResitype(String resitype){
		this.resitype = resitype;
	}

	public void setNowsubsyn(String nowsubsyn){
		this.nowsubsyn = nowsubsyn;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setPay_reciyn(String pay_reciyn){
		this.pay_reciyn = pay_reciyn;
	}

	public void setHeadnm(String headnm){
		this.headnm = headnm;
	}
	
	public void setExtntype(String extntype){
		this.extntype = extntype;
	}

	public String getDeptnm(){
		return this.deptnm;
	}

	public String getPartnm(){
		return this.partnm;
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

	public String getQty(){
		return this.qty;
	}

	public String getTelno(){
		return this.telno;
	}

	public String getPtphno(){
		return this.ptphno;
	}

	public String getClamhystp(){
		return this.clamhystp;
	}

	public String getClamhystc(){
		return this.clamhystc;
	}

	public String getClamtmthd(){
		return this.clamtmthd;
	}

	public String getResitype(){
		return this.resitype;
	}

	public String getNowsubsyn(){
		return this.nowsubsyn;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getPay_reciyn(){
		return this.pay_reciyn;
	}

	public String getHeadnm(){
		return this.headnm;
	}
	
	public String getExtntype(){
		return this.extntype;
	}
}

/* 작성시간 : Tue Nov 14 18:13:58 KST 2017 */