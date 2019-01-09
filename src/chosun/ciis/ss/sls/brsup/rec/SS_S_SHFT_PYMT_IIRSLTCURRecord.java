/***************************************************************************************************
* 파일명 : SS_L_SHFT_PYMT_II.java
* 기능 :   지국지원-빌링-자동이체-납부자2-납부자상세조회
* 작성일자 : 2004-10-03
* 작성자 : 노상현
***************************************************************************************************/
/***************************************************************************************************
* 수정내역	: 
* 수정자	: 
* 수정일자	:
* 백업		: 
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * 지국지원-빌링-자동이체-납부자2-납부자상세조회
 *
 */


public class SS_S_SHFT_PYMT_IIRSLTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String pymtseq;
	public String shftclsf;
	public String shftclsfnm;
	public String prn;
	public String pymtnm;
	public String email;
	public String tel1;
	public String tel2;
	public String tel3;
	public String zip;
	public String addr;
	public String addrdtls;
	public String bankcd;
	public String banknm;
	public String acctno;
	public String cardcmpycd;
	public String cardno;
	public String vdtyprd;
	public String rdrnm;
	public String pymtno;
	public String bocd;
	public String bonm;
	public String aplyyymm;
	public String rdrtel1;
	public String rdrtel2;
	public String rdrtel3;

	public SS_S_SHFT_PYMT_IIRSLTCURRecord(){}

	public void setPymtseq(String pymtseq){
		this.pymtseq = pymtseq;
	}

	public void setShftclsf(String shftclsf){
		this.shftclsf = shftclsf;
	}

	public void setShftclsfnm(String shftclsfnm){
		this.shftclsfnm = shftclsfnm;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setPymtnm(String pymtnm){
		this.pymtnm = pymtnm;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void setTel1(String tel1){
		this.tel1 = tel1;
	}

	public void setTel2(String tel2){
		this.tel2 = tel2;
	}

	public void setTel3(String tel3){
		this.tel3 = tel3;
	}

	public void setZip(String zip){
		this.zip = zip;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setAddrdtls(String addrdtls){
		this.addrdtls = addrdtls;
	}

	public void setBankcd(String bankcd){
		this.bankcd = bankcd;
	}

	public void setBanknm(String banknm){
		this.banknm = banknm;
	}

	public void setAcctno(String acctno){
		this.acctno = acctno;
	}

	public void setCardcmpycd(String cardcmpycd){
		this.cardcmpycd = cardcmpycd;
	}

	public void setCardno(String cardno){
		this.cardno = cardno;
	}

	public void setVdtyprd(String vdtyprd){
		this.vdtyprd = vdtyprd;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setPymtno(String pymtno){
		this.pymtno = pymtno;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setAplyyymm(String aplyyymm){
		this.aplyyymm = aplyyymm;
	}

	public void setRdrtel1(String rdrtel1){
		this.rdrtel1 = rdrtel1;
	}

	public void setRdrtel2(String rdrtel2){
		this.rdrtel2 = rdrtel2;
	}

	public void setRdrtel3(String rdrtel3){
		this.rdrtel3 = rdrtel3;
	}

	public String getPymtseq(){
		return this.pymtseq;
	}

	public String getShftclsf(){
		return this.shftclsf;
	}

	public String getShftclsfnm(){
		return this.shftclsfnm;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getPymtnm(){
		return this.pymtnm;
	}

	public String getEmail(){
		return this.email;
	}

	public String getTel1(){
		return this.tel1;
	}

	public String getTel2(){
		return this.tel2;
	}

	public String getTel3(){
		return this.tel3;
	}

	public String getZip(){
		return this.zip;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getAddrdtls(){
		return this.addrdtls;
	}

	public String getBankcd(){
		return this.bankcd;
	}

	public String getBanknm(){
		return this.banknm;
	}

	public String getAcctno(){
		return this.acctno;
	}

	public String getCardcmpycd(){
		return this.cardcmpycd;
	}

	public String getCardno(){
		return this.cardno;
	}

	public String getVdtyprd(){
		return this.vdtyprd;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getPymtno(){
		return this.pymtno;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getAplyyymm(){
		return this.aplyyymm;
	}

	public String getRdrtel1(){
		return this.rdrtel1;
	}

	public String getRdrtel2(){
		return this.rdrtel2;
	}

	public String getRdrtel3(){
		return this.rdrtel3;
	}
}

/* 작성시간 : Sun Oct 03 20:39:16 KST 2004 */