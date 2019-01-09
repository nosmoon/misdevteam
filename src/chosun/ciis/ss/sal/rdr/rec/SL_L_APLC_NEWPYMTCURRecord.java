/***************************************************************************************************
* 파일명 : SL_L_APLC_NEWPYMTCURRecord.java
* 기능 : 독자정보관리(이체신청팝업-신규신청 초기화)
* 작성일자 : 2004-07-29
* 작성자 : 김영윤
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
 * 독자정보관리(이체신청팝업-신규신청 초기화)
 *
 */

public class SL_L_APLC_NEWPYMTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String aplcdt;
	public String aplcno;
	public String shftclsf;
	public String bankcd;
	public String banknm;
	public String pymtnm;
	public String acctno;
	public String cardcmpycd;
	public String cardno;
	public String vdtyprd;
	public String prn;
	public String pymttel1;
	public String pymttel2;
	public String pymttel3;
	public String aplyyymm;
	public String email;

	public SL_L_APLC_NEWPYMTCURRecord(){}

	public void setAplcdt(String aplcdt){
		this.aplcdt = aplcdt;
	}

	public void setAplcno(String aplcno){
		this.aplcno = aplcno;
	}

	public void setShftclsf(String shftclsf){
		this.shftclsf = shftclsf;
	}

	public void setBankcd(String bankcd){
		this.bankcd = bankcd;
	}

	public void setBanknm(String banknm){
		this.banknm = banknm;
	}

	public void setPymtnm(String pymtnm){
		this.pymtnm = pymtnm;
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

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setPymttel1(String pymttel1){
		this.pymttel1 = pymttel1;
	}

	public void setPymttel2(String pymttel2){
		this.pymttel2 = pymttel2;
	}

	public void setPymttel3(String pymttel3){
		this.pymttel3 = pymttel3;
	}

	public void setAplyyymm(String aplyyymm){
		this.aplyyymm = aplyyymm;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getAplcdt(){
		return this.aplcdt;
	}

	public String getAplcno(){
		return this.aplcno;
	}

	public String getShftclsf(){
		return this.shftclsf;
	}

	public String getBankcd(){
		return this.bankcd;
	}

	public String getBanknm(){
		return this.banknm;
	}

	public String getPymtnm(){
		return this.pymtnm;
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

	public String getPrn(){
		return this.prn;
	}

	public String getPymttel1(){
		return this.pymttel1;
	}

	public String getPymttel2(){
		return this.pymttel2;
	}

	public String getPymttel3(){
		return this.pymttel3;
	}

	public String getAplyyymm(){
		return this.aplyyymm;
	}

	public String getEmail(){
		return this.email;
	}
}

/* 작성시간 : Fri Aug 06 20:41:47 KST 2004 */