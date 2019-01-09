/***************************************************************************************************
* 파일명 : SS_L_SHFT_PYMT_II.java
* 기능 :   지국지원-빌링-자동이체-납부자2-납부자목록조회
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
 * 지국지원-빌링-자동이체-납부자2-납부자목록조회
 *
 */


public class SS_L_SHFT_PYMT_IIRSLTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String pymtseq;
	public String shftclsf;
	public String shftclsfnm;
	public String prn;
	public String pymtnm;
	public String acctno;
	public String cardno;
	public String cnfm;
	public String bonm;
	public String bocd;
	public String rdr_no;
	public String rdrnm;
	public String medicd;
	public String mediynm;
	public String dlvqty;
	public String realsubsamt;
	public String pymtno;
	public String shftbgnyymm;
	public String shftstatclsfcd;
	public String shftstatclsfnm;
	public String subsstat;

	public SS_L_SHFT_PYMT_IIRSLTCURRecord(){}

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

	public void setAcctno(String acctno){
		this.acctno = acctno;
	}

	public void setCardno(String cardno){
		this.cardno = cardno;
	}

	public void setCnfm(String cnfm){
		this.cnfm = cnfm;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setMediynm(String mediynm){
		this.mediynm = mediynm;
	}

	public void setDlvqty(String dlvqty){
		this.dlvqty = dlvqty;
	}

	public void setRealsubsamt(String realsubsamt){
		this.realsubsamt = realsubsamt;
	}

	public void setPymtno(String pymtno){
		this.pymtno = pymtno;
	}

	public void setShftbgnyymm(String shftbgnyymm){
		this.shftbgnyymm = shftbgnyymm;
	}

	public void setShftstatclsfcd(String shftstatclsfcd){
		this.shftstatclsfcd = shftstatclsfcd;
	}

	public void setShftstatclsfnm(String shftstatclsfnm){
		this.shftstatclsfnm = shftstatclsfnm;
	}

	public void setSubsstat(String subsstat){
		this.subsstat = subsstat;
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

	public String getAcctno(){
		return this.acctno;
	}

	public String getCardno(){
		return this.cardno;
	}

	public String getCnfm(){
		return this.cnfm;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getMediynm(){
		return this.mediynm;
	}

	public String getDlvqty(){
		return this.dlvqty;
	}

	public String getRealsubsamt(){
		return this.realsubsamt;
	}

	public String getPymtno(){
		return this.pymtno;
	}

	public String getShftbgnyymm(){
		return this.shftbgnyymm;
	}

	public String getShftstatclsfcd(){
		return this.shftstatclsfcd;
	}

	public String getShftstatclsfnm(){
		return this.shftstatclsfnm;
	}

	public String getSubsstat(){
		return this.subsstat;
	}
}

/* 작성시간 : Sun Oct 03 20:23:29 KST 2004 */