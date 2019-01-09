/***************************************************************************************************
* 파일명 : SS_S_APLC_EXPYRSLTCURRecord.java
* 기능 : 지국업무지원-Billing자동이체-신청관리-이체방법전환 상세보기
* 작성일자 : 2004-06-07
* 작성자 : 김상열
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * 지국업무지원-Billing자동이체-신청관리-이체방법전환 상세보기
 *
 */


public class SS_S_APLC_EXPYRSLTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String aplcdt;
	public String shftbgnyymm;
	public String shftclsf;
	public String prn;
	public String pymtnm;
	public String email;
	public String tel1;
	public String tel2;
	public String tel3;
	public String banknm;
	public String acctno;
	public String cardcmpynm;
	public String cardno;
	public String vdtyprd;

	public SS_S_APLC_EXPYRSLTCURRecord(){}

	public void setAplcdt(String aplcdt){
		this.aplcdt = aplcdt;
	}

	public void setShftbgnyymm(String shftbgnyymm){
		this.shftbgnyymm = shftbgnyymm;
	}

	public void setShftclsf(String shftclsf){
		this.shftclsf = shftclsf;
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

	public void setBanknm(String banknm){
		this.banknm = banknm;
	}

	public void setAcctno(String acctno){
		this.acctno = acctno;
	}

	public void setCardcmpynm(String cardcmpynm){
		this.cardcmpynm = cardcmpynm;
	}

	public void setCardno(String cardno){
		this.cardno = cardno;
	}

	public void setVdtyprd(String vdtyprd){
		this.vdtyprd = vdtyprd;
	}

	public String getAplcdt(){
		return this.aplcdt;
	}

	public String getShftbgnyymm(){
		return this.shftbgnyymm;
	}

	public String getShftclsf(){
		return this.shftclsf;
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

	public String getBanknm(){
		return this.banknm;
	}

	public String getAcctno(){
		return this.acctno;
	}

	public String getCardcmpynm(){
		return this.cardcmpynm;
	}

	public String getCardno(){
		return this.cardno;
	}

	public String getVdtyprd(){
		return this.vdtyprd;
	}
}

/* 작성시간 : Tue Jun 08 15:43:05 KST 2004 */