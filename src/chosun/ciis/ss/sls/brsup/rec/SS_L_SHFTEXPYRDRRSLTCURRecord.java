/***************************************************************************************************
* 파일명 : .java
* 기능 : 지국업무지원-Billing자동이체-해지독자-목록조회
* 작성일자 : 2005-01-14
* 작성자 : 김영윤
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
 * 지국업무지원-Billing자동이체-해지독자-목록조회
 */


public class SS_L_SHFTEXPYRDRRSLTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String areanm;
	public String bonm;
	public String rdrnm;
	public String medinm;
	public String pymtnm;
	public String prn;
	public String acctno;
	public String rdrtel_no;
	public String pymttel_no;
	public String rdraddr;
	public String aplcdt;
	public String expydt;
	public String expystat;
	public String shftclsf;

	public SS_L_SHFTEXPYRDRRSLTCURRecord(){}

	public void setAreanm(String areanm){
		this.areanm = areanm;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setPymtnm(String pymtnm){
		this.pymtnm = pymtnm;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setAcctno(String acctno){
		this.acctno = acctno;
	}

	public void setRdrtel_no(String rdrtel_no){
		this.rdrtel_no = rdrtel_no;
	}

	public void setPymttel_no(String pymttel_no){
		this.pymttel_no = pymttel_no;
	}

	public void setRdraddr(String rdraddr){
		this.rdraddr = rdraddr;
	}

	public void setAplcdt(String aplcdt){
		this.aplcdt = aplcdt;
	}

	public void setExpydt(String expydt){
		this.expydt = expydt;
	}

	public void setExpystat(String expystat){
		this.expystat = expystat;
	}

	public void setShftclsf(String shftclsf){
		this.shftclsf = shftclsf;
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

	public String getMedinm(){
		return this.medinm;
	}

	public String getPymtnm(){
		return this.pymtnm;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getAcctno(){
		return this.acctno;
	}

	public String getRdrtel_no(){
		return this.rdrtel_no;
	}

	public String getPymttel_no(){
		return this.pymttel_no;
	}

	public String getRdraddr(){
		return this.rdraddr;
	}

	public String getAplcdt(){
		return this.aplcdt;
	}

	public String getExpydt(){
		return this.expydt;
	}

	public String getExpystat(){
		return this.expystat;
	}

	public String getShftclsf(){
		return this.shftclsf;
	}
}

/* 작성시간 : Fri Jan 14 19:21:56 KST 2005 */
