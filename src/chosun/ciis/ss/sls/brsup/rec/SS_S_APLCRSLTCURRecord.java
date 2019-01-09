/***************************************************************************************************
* 파일명 : SS_S_APLCRSLTCURRecord.java
* 기능 : 지국업무지원-Billing자동이체-신청관리-납부자(구독)정보
* 작성일자 : 2004-06-06
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
 * 지국업무지원-Billing자동이체-신청관리-납부자(구독)정보
 *
 */


public class SS_S_APLCRSLTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String aplcdt;
	public String shftclsf;
	public String shftclsfnm;
	public String pymtno_2;
	public String pymtnm;
	public String rdrnm;
	public String zip;
	public String dlvaddr;
	public String dlvaddrdtls;
	public String rdrtel1;
	public String rdrtel2;
	public String rdrtel3;
	public String aplyyymm;
	public String rdr_no;
	public String medicd;
	public String medinm;
	public int dlvqty;
	public int realsubsamt;
	public String migryn;
	public String rdrnatvno;

	public SS_S_APLCRSLTCURRecord(){}

	public void setAplcdt(String aplcdt){
		this.aplcdt = aplcdt;
	}

	public void setShftclsf(String shftclsf){
		this.shftclsf = shftclsf;
	}

	public void setShftclsfnm(String shftclsfnm){
		this.shftclsfnm = shftclsfnm;
	}

	public void setPymtno_2(String pymtno_2){
		this.pymtno_2 = pymtno_2;
	}

	public void setPymtnm(String pymtnm){
		this.pymtnm = pymtnm;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setZip(String zip){
		this.zip = zip;
	}

	public void setDlvaddr(String dlvaddr){
		this.dlvaddr = dlvaddr;
	}

	public void setDlvaddrdtls(String dlvaddrdtls){
		this.dlvaddrdtls = dlvaddrdtls;
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

	public void setAplyyymm(String aplyyymm){
		this.aplyyymm = aplyyymm;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setDlvqty(int dlvqty){
		this.dlvqty = dlvqty;
	}

	public void setRealsubsamt(int realsubsamt){
		this.realsubsamt = realsubsamt;
	}

	public void setMigryn(String migryn){
		this.migryn = migryn;
	}

	public void setRdrnatvno(String rdrnatvno){
		this.rdrnatvno = rdrnatvno;
	}

	public String getAplcdt(){
		return this.aplcdt;
	}

	public String getShftclsf(){
		return this.shftclsf;
	}

	public String getShftclsfnm(){
		return this.shftclsfnm;
	}

	public String getPymtno_2(){
		return this.pymtno_2;
	}

	public String getPymtnm(){
		return this.pymtnm;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getZip(){
		return this.zip;
	}

	public String getDlvaddr(){
		return this.dlvaddr;
	}

	public String getDlvaddrdtls(){
		return this.dlvaddrdtls;
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

	public String getAplyyymm(){
		return this.aplyyymm;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public int getDlvqty(){
		return this.dlvqty;
	}

	public int getRealsubsamt(){
		return this.realsubsamt;
	}

	public String getMigryn(){
		return this.migryn;
	}

	public String getRdrnatvno(){
		return this.rdrnatvno;
	}

}

/* 작성시간 : Sun Jun 06 21:52:41 KST 2004 */