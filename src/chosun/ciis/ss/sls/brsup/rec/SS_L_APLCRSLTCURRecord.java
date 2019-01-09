/***************************************************************************************************
* 파일명 : SS_L_APLCRSLTCURRecord.java
* 기능 : 지국업무지원-Billing자동이체-신청관리-신청목록
* 작성일자 : 2004-03-26
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
 * 지국업무지원-Billing자동이체-신청관리-신청목록
 *
 */


public class SS_L_APLCRSLTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String aplcno;
	public String aplcclsf;
	public String aplcclsfnm;
	public String aplcprocstat;
	public String aplcprocstatnm;
	public String pymtno_2;
	public String shftclsf;
	public String shftclsfnm;
	public String aplcdt;
	public String pymtnm;
	public String pymttel1;
	public String pymttel2;
	public String pymttel3;
	public String rdrnm;
	public String aplyyymm;
	public String trsmyn;
	public String pymtinforflyn;
	public String medicd;
	public String mediynm;
	public String dlvaddr;
	public String dlvaddrdtls;
	public String shftaplcclsf;
	public String shftaplcclsfnm;
	public int dlvqty;
	public String fstaplcdt;

	public SS_L_APLCRSLTCURRecord(){}

	public void setAplcno(String aplcno){
		this.aplcno = aplcno;
	}

	public void setAplcclsf(String aplcclsf){
		this.aplcclsf = aplcclsf;
	}

	public void setAplcclsfnm(String aplcclsfnm){
		this.aplcclsfnm = aplcclsfnm;
	}

	public void setAplcprocstat(String aplcprocstat){
		this.aplcprocstat = aplcprocstat;
	}

	public void setAplcprocstatnm(String aplcprocstatnm){
		this.aplcprocstatnm = aplcprocstatnm;
	}

	public void setPymtno_2(String pymtno_2){
		this.pymtno_2 = pymtno_2;
	}

	public void setShftclsf(String shftclsf){
		this.shftclsf = shftclsf;
	}

	public void setShftclsfnm(String shftclsfnm){
		this.shftclsfnm = shftclsfnm;
	}

	public void setAplcdt(String aplcdt){
		this.aplcdt = aplcdt;
	}

	public void setPymtnm(String pymtnm){
		this.pymtnm = pymtnm;
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

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setAplyyymm(String aplyyymm){
		this.aplyyymm = aplyyymm;
	}

	public void setTrsmyn(String trsmyn){
		this.trsmyn = trsmyn;
	}

	public void setPymtinforflyn(String pymtinforflyn){
		this.pymtinforflyn = pymtinforflyn;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setMediynm(String mediynm){
		this.mediynm = mediynm;
	}

	public void setDlvaddr(String dlvaddr){
		this.dlvaddr = dlvaddr;
	}

	public void setDlvaddrdtls(String dlvaddrdtls){
		this.dlvaddrdtls = dlvaddrdtls;
	}

	public void setShftaplcclsf(String shftaplcclsf){
		this.shftaplcclsf = shftaplcclsf;
	}

	public void setShftaplcclsfnm(String shftaplcclsfnm){
		this.shftaplcclsfnm = shftaplcclsfnm;
	}

	public void setDlvqty(int dlvqty){
		this.dlvqty = dlvqty;
	}

	public void setFstaplcdt(String fstaplcdt){
		this.fstaplcdt = fstaplcdt;
	}

	public String getAplcno(){
		return this.aplcno;
	}

	public String getAplcclsf(){
		return this.aplcclsf;
	}

	public String getAplcclsfnm(){
		return this.aplcclsfnm;
	}

	public String getAplcprocstat(){
		return this.aplcprocstat;
	}

	public String getAplcprocstatnm(){
		return this.aplcprocstatnm;
	}

	public String getPymtno_2(){
		return this.pymtno_2;
	}

	public String getShftclsf(){
		return this.shftclsf;
	}

	public String getShftclsfnm(){
		return this.shftclsfnm;
	}

	public String getAplcdt(){
		return this.aplcdt;
	}

	public String getPymtnm(){
		return this.pymtnm;
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

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getAplyyymm(){
		return this.aplyyymm;
	}

	public String getTrsmyn(){
		return this.trsmyn;
	}

	public String getPymtinforflyn(){
		return this.pymtinforflyn;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getMediynm(){
		return this.mediynm;
	}

	public String getDlvaddr(){
		return this.dlvaddr;
	}

	public String getDlvaddrdtls(){
		return this.dlvaddrdtls;
	}

	public String getShftaplcclsf(){
		return this.shftaplcclsf;
	}

	public String getShftaplcclsfnm(){
		return this.shftaplcclsfnm;
	}

	public int getDlvqty(){
		return this.dlvqty;
	}

	public String getFstaplcdt(){
		return this.fstaplcdt;
	}

}

/* 작성시간 : Fri Mar 26 15:54:29 KST 2004 */