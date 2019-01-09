/***************************************************************************************************
* 파일명 : SL_L_RDR_EXTN_CNFMEXTNCURRecord.java
* 기능 : 외부확장확인관리(목록조회)
* 작성일자 : 2004-06-03
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
 * 외부확장확인관리(목록조회)
 *
 */

public class SL_L_RDR_EXTN_CNFMEXTNCURRecord extends java.lang.Object implements java.io.Serializable{

	public String rdr_extndt;
	public String rdr_extnno;
	public String medicd;
	public String medinm;
	public String mediynm;
	public String aplcdt;
	public int qty;
	public String aplcpathcd;
	public String aplcpathnm;
	public String rdr_extntypecd;
	public String rdr_extntypenm;
	public String extnblngcd;
	public String extnflnm;
	public String extntel1;
	public String extntel2;
	public String extntel3;
	public String extnptph_no1;
	public String extnptph_no2;
	public String extnptph_no3;
	public String extnprn;
	public String rshpclsfcd;
	public String aplcpersnm;
	public String aplcpersemail;
	public String aplcperstel_no1;
	public String aplcperstel_no2;
	public String aplcperstel_no3;
	public String aplcpersptph_no1;
	public String aplcpersptph_no2;
	public String aplcpersptph_no3;
	public String rdrnm;
	public String rdrtel_no1;
	public String rdrtel_no2;
	public String rdrtel_no3;
	public String rdrptph_no1;
	public String rdrptph_no2;
	public String rdrptph_no3;
	public String rdremail;
	public String rdroffinm;
	public String rdroffitel_no1;
	public String rdroffitel_no2;
	public String rdroffitel_no3;
	public String dlvzip;
	public String dlvaddr;
	public String dlvdtlsaddr;
	public String dlvhopedt;
	public String rdr_extnbocd;
	public String bonm;
	public String botel_no11;
	public String botel_no12;
	public String botel_no13;
	public String botel_no21;
	public String botel_no22;
	public String botel_no23;
	public String resiclsfcd;
	public String resitypecd;
	public String subscnfmstatcd;
	public String subscnfmstatcdnm;

	public SL_L_RDR_EXTN_CNFMEXTNCURRecord(){}

	public void setRdr_extndt(String rdr_extndt){
		this.rdr_extndt = rdr_extndt;
	}

	public void setRdr_extnno(String rdr_extnno){
		this.rdr_extnno = rdr_extnno;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setMediynm(String mediynm){
		this.mediynm = mediynm;
	}

	public void setAplcdt(String aplcdt){
		this.aplcdt = aplcdt;
	}

	public void setQty(int qty){
		this.qty = qty;
	}

	public void setAplcpathcd(String aplcpathcd){
		this.aplcpathcd = aplcpathcd;
	}

	public void setAplcpathnm(String aplcpathnm){
		this.aplcpathnm = aplcpathnm;
	}

	public void setRdr_extntypecd(String rdr_extntypecd){
		this.rdr_extntypecd = rdr_extntypecd;
	}

	public void setRdr_extntypenm(String rdr_extntypenm){
		this.rdr_extntypenm = rdr_extntypenm;
	}

	public void setExtnblngcd(String extnblngcd){
		this.extnblngcd = extnblngcd;
	}

	public void setExtnflnm(String extnflnm){
		this.extnflnm = extnflnm;
	}

	public void setExtntel1(String extntel1){
		this.extntel1 = extntel1;
	}

	public void setExtntel2(String extntel2){
		this.extntel2 = extntel2;
	}

	public void setExtntel3(String extntel3){
		this.extntel3 = extntel3;
	}

	public void setExtnptph_no1(String extnptph_no1){
		this.extnptph_no1 = extnptph_no1;
	}

	public void setExtnptph_no2(String extnptph_no2){
		this.extnptph_no2 = extnptph_no2;
	}

	public void setExtnptph_no3(String extnptph_no3){
		this.extnptph_no3 = extnptph_no3;
	}

	public void setExtnprn(String extnprn){
		this.extnprn = extnprn;
	}

	public void setRshpclsfcd(String rshpclsfcd){
		this.rshpclsfcd = rshpclsfcd;
	}

	public void setAplcpersnm(String aplcpersnm){
		this.aplcpersnm = aplcpersnm;
	}

	public void setAplcpersemail(String aplcpersemail){
		this.aplcpersemail = aplcpersemail;
	}

	public void setAplcperstel_no1(String aplcperstel_no1){
		this.aplcperstel_no1 = aplcperstel_no1;
	}

	public void setAplcperstel_no2(String aplcperstel_no2){
		this.aplcperstel_no2 = aplcperstel_no2;
	}

	public void setAplcperstel_no3(String aplcperstel_no3){
		this.aplcperstel_no3 = aplcperstel_no3;
	}

	public void setAplcpersptph_no1(String aplcpersptph_no1){
		this.aplcpersptph_no1 = aplcpersptph_no1;
	}

	public void setAplcpersptph_no2(String aplcpersptph_no2){
		this.aplcpersptph_no2 = aplcpersptph_no2;
	}

	public void setAplcpersptph_no3(String aplcpersptph_no3){
		this.aplcpersptph_no3 = aplcpersptph_no3;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setRdrtel_no1(String rdrtel_no1){
		this.rdrtel_no1 = rdrtel_no1;
	}

	public void setRdrtel_no2(String rdrtel_no2){
		this.rdrtel_no2 = rdrtel_no2;
	}

	public void setRdrtel_no3(String rdrtel_no3){
		this.rdrtel_no3 = rdrtel_no3;
	}

	public void setRdrptph_no1(String rdrptph_no1){
		this.rdrptph_no1 = rdrptph_no1;
	}

	public void setRdrptph_no2(String rdrptph_no2){
		this.rdrptph_no2 = rdrptph_no2;
	}

	public void setRdrptph_no3(String rdrptph_no3){
		this.rdrptph_no3 = rdrptph_no3;
	}

	public void setRdremail(String rdremail){
		this.rdremail = rdremail;
	}

	public void setRdroffinm(String rdroffinm){
		this.rdroffinm = rdroffinm;
	}

	public void setRdroffitel_no1(String rdroffitel_no1){
		this.rdroffitel_no1 = rdroffitel_no1;
	}

	public void setRdroffitel_no2(String rdroffitel_no2){
		this.rdroffitel_no2 = rdroffitel_no2;
	}

	public void setRdroffitel_no3(String rdroffitel_no3){
		this.rdroffitel_no3 = rdroffitel_no3;
	}

	public void setDlvzip(String dlvzip){
		this.dlvzip = dlvzip;
	}

	public void setDlvaddr(String dlvaddr){
		this.dlvaddr = dlvaddr;
	}

	public void setDlvdtlsaddr(String dlvdtlsaddr){
		this.dlvdtlsaddr = dlvdtlsaddr;
	}

	public void setDlvhopedt(String dlvhopedt){
		this.dlvhopedt = dlvhopedt;
	}

	public void setRdr_extnbocd(String rdr_extnbocd){
		this.rdr_extnbocd = rdr_extnbocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setBotel_no11(String botel_no11){
		this.botel_no11 = botel_no11;
	}

	public void setBotel_no12(String botel_no12){
		this.botel_no12 = botel_no12;
	}

	public void setBotel_no13(String botel_no13){
		this.botel_no13 = botel_no13;
	}

	public void setBotel_no21(String botel_no21){
		this.botel_no21 = botel_no21;
	}

	public void setBotel_no22(String botel_no22){
		this.botel_no22 = botel_no22;
	}

	public void setBotel_no23(String botel_no23){
		this.botel_no23 = botel_no23;
	}

	public void setResiclsfcd(String resiclsfcd){
		this.resiclsfcd = resiclsfcd;
	}

	public void setResitypecd(String resitypecd){
		this.resitypecd = resitypecd;
	}

	public void setSubscnfmstatcd(String subscnfmstatcd){
		this.subscnfmstatcd = subscnfmstatcd;
	}

	public void setSubscnfmstatcdnm(String subscnfmstatcdnm){
		this.subscnfmstatcdnm = subscnfmstatcdnm;
	}

	public String getRdr_extndt(){
		return this.rdr_extndt;
	}

	public String getRdr_extnno(){
		return this.rdr_extnno;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getMediynm(){
		return this.mediynm;
	}

	public String getAplcdt(){
		return this.aplcdt;
	}

	public int getQty(){
		return this.qty;
	}

	public String getAplcpathcd(){
		return this.aplcpathcd;
	}

	public String getAplcpathnm(){
		return this.aplcpathnm;
	}

	public String getRdr_extntypecd(){
		return this.rdr_extntypecd;
	}

	public String getRdr_extntypenm(){
		return this.rdr_extntypenm;
	}

	public String getExtnblngcd(){
		return this.extnblngcd;
	}

	public String getExtnflnm(){
		return this.extnflnm;
	}

	public String getExtntel1(){
		return this.extntel1;
	}

	public String getExtntel2(){
		return this.extntel2;
	}

	public String getExtntel3(){
		return this.extntel3;
	}

	public String getExtnptph_no1(){
		return this.extnptph_no1;
	}

	public String getExtnptph_no2(){
		return this.extnptph_no2;
	}

	public String getExtnptph_no3(){
		return this.extnptph_no3;
	}

	public String getExtnprn(){
		return this.extnprn;
	}

	public String getRshpclsfcd(){
		return this.rshpclsfcd;
	}

	public String getAplcpersnm(){
		return this.aplcpersnm;
	}

	public String getAplcpersemail(){
		return this.aplcpersemail;
	}

	public String getAplcperstel_no1(){
		return this.aplcperstel_no1;
	}

	public String getAplcperstel_no2(){
		return this.aplcperstel_no2;
	}

	public String getAplcperstel_no3(){
		return this.aplcperstel_no3;
	}

	public String getAplcpersptph_no1(){
		return this.aplcpersptph_no1;
	}

	public String getAplcpersptph_no2(){
		return this.aplcpersptph_no2;
	}

	public String getAplcpersptph_no3(){
		return this.aplcpersptph_no3;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getRdrtel_no1(){
		return this.rdrtel_no1;
	}

	public String getRdrtel_no2(){
		return this.rdrtel_no2;
	}

	public String getRdrtel_no3(){
		return this.rdrtel_no3;
	}

	public String getRdrptph_no1(){
		return this.rdrptph_no1;
	}

	public String getRdrptph_no2(){
		return this.rdrptph_no2;
	}

	public String getRdrptph_no3(){
		return this.rdrptph_no3;
	}

	public String getRdremail(){
		return this.rdremail;
	}

	public String getRdroffinm(){
		return this.rdroffinm;
	}

	public String getRdroffitel_no1(){
		return this.rdroffitel_no1;
	}

	public String getRdroffitel_no2(){
		return this.rdroffitel_no2;
	}

	public String getRdroffitel_no3(){
		return this.rdroffitel_no3;
	}

	public String getDlvzip(){
		return this.dlvzip;
	}

	public String getDlvaddr(){
		return this.dlvaddr;
	}

	public String getDlvdtlsaddr(){
		return this.dlvdtlsaddr;
	}

	public String getDlvhopedt(){
		return this.dlvhopedt;
	}

	public String getRdr_extnbocd(){
		return this.rdr_extnbocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getBotel_no11(){
		return this.botel_no11;
	}

	public String getBotel_no12(){
		return this.botel_no12;
	}

	public String getBotel_no13(){
		return this.botel_no13;
	}

	public String getBotel_no21(){
		return this.botel_no21;
	}

	public String getBotel_no22(){
		return this.botel_no22;
	}

	public String getBotel_no23(){
		return this.botel_no23;
	}

	public String getResiclsfcd(){
		return this.resiclsfcd;
	}

	public String getResitypecd(){
		return this.resitypecd;
	}

	public String getSubscnfmstatcd(){
		return this.subscnfmstatcd;
	}

	public String getSubscnfmstatcdnm(){
		return this.subscnfmstatcdnm;
	}
}

/* 작성시간 : Wed Jun 09 10:41:35 KST 2004 */