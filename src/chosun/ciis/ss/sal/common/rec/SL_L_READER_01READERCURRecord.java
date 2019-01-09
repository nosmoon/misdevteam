/***************************************************************************************************
* 파일명 : SL_L_READER_01READERCURRecord.java
* 기능 : 독자조회(기본형) 한 독자에 한 건 조회
* 작성일자 : 2003-12-27
* 작성자 : 김영윤
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sal.common.rec;

import java.sql.*;
import chosun.ciis.ss.sal.common.dm.*;
import chosun.ciis.ss.sal.common.ds.*;

/**
 * 독자조회(기본형) 한 독자에 한 건 조회
 *
 */


public class SL_L_READER_01READERCURRecord extends java.lang.Object implements java.io.Serializable{

	public String rdr_no;
	public String paty_clsfcd;
	public String natnclsfcd;
	public String onlmembid;
	public String rdrnm;
	public String prn;
	public String ernno;
	public String email;
	public String dlvzip;
	public String dlvcd;
	public String dlvaddr;
	public String dlvdtlsaddr;
	public String dlvdong;
	public String dlvser_no;
	public String dlvbnji;
	public String dlvteamcd;
	public String dlvdstccd;
	public String dlvno;
	public String dlvintvno;
	public String dlvmthdcd;
	public int dlvqty;
	public String rdrtel_no1;
	public String rdrtel_no2;
	public String rdrtel_no3;
	public String rdrptph_no1;
	public String rdrptph_no2;
	public String rdrptph_no3;
	public int realsubsamt;
	public int subsamt;
	public int dscnamt;
	public String rptvsubsdt;
	public String rptvrdr_extndt;
	public String addrnm;
	public String mil;

	public SL_L_READER_01READERCURRecord(){}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setPaty_clsfcd(String paty_clsfcd){
		this.paty_clsfcd = paty_clsfcd;
	}

	public void setNatnclsfcd(String natnclsfcd){
		this.natnclsfcd = natnclsfcd;
	}

	public void setOnlmembid(String onlmembid){
		this.onlmembid = onlmembid;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setErnno(String ernno){
		this.ernno = ernno;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void setDlvzip(String dlvzip){
		this.dlvzip = dlvzip;
	}

	public void setDlvcd(String dlvcd){
		this.dlvcd = dlvcd;
	}

	public void setDlvaddr(String dlvaddr){
		this.dlvaddr = dlvaddr;
	}

	public void setDlvdtlsaddr(String dlvdtlsaddr){
		this.dlvdtlsaddr = dlvdtlsaddr;
	}

	public void setDlvdong(String dlvdong){
		this.dlvdong = dlvdong;
	}

	public void setDlvser_no(String dlvser_no){
		this.dlvser_no = dlvser_no;
	}

	public void setDlvbnji(String dlvbnji){
		this.dlvbnji = dlvbnji;
	}

	public void setDlvteamcd(String dlvteamcd){
		this.dlvteamcd = dlvteamcd;
	}

	public void setDlvdstccd(String dlvdstccd){
		this.dlvdstccd = dlvdstccd;
	}

	public void setDlvno(String dlvno){
		this.dlvno = dlvno;
	}

	public void setDlvintvno(String dlvintvno){
		this.dlvintvno = dlvintvno;
	}

	public void setDlvmthdcd(String dlvmthdcd){
		this.dlvmthdcd = dlvmthdcd;
	}

	public void setDlvqty(int dlvqty){
		this.dlvqty = dlvqty;
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

	public void setRealsubsamt(int realsubsamt){
		this.realsubsamt = realsubsamt;
	}

	public void setSubsamt(int subsamt){
		this.subsamt = subsamt;
	}

	public void setDscnamt(int dscnamt){
		this.dscnamt = dscnamt;
	}

	public void setRptvsubsdt(String rptvsubsdt){
		this.rptvsubsdt = rptvsubsdt;
	}

	public void setRptvrdr_extndt(String rptvrdr_extndt){
		this.rptvrdr_extndt = rptvrdr_extndt;
	}

	public void setAddrnm(String addrnm){
		this.addrnm = addrnm;
	}

	public void setMil(String mil){
		this.mil = mil;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getPaty_clsfcd(){
		return this.paty_clsfcd;
	}

	public String getNatnclsfcd(){
		return this.natnclsfcd;
	}

	public String getOnlmembid(){
		return this.onlmembid;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getErnno(){
		return this.ernno;
	}

	public String getEmail(){
		return this.email;
	}

	public String getDlvzip(){
		return this.dlvzip;
	}

	public String getDlvcd(){
		return this.dlvcd;
	}

	public String getDlvaddr(){
		return this.dlvaddr;
	}

	public String getDlvdtlsaddr(){
		return this.dlvdtlsaddr;
	}

	public String getDlvdong(){
		return this.dlvdong;
	}

	public String getDlvser_no(){
		return this.dlvser_no;
	}

	public String getDlvbnji(){
		return this.dlvbnji;
	}

	public String getDlvteamcd(){
		return this.dlvteamcd;
	}

	public String getDlvdstccd(){
		return this.dlvdstccd;
	}

	public String getDlvno(){
		return this.dlvno;
	}

	public String getDlvintvno(){
		return this.dlvintvno;
	}

	public String getDlvmthdcd(){
		return this.dlvmthdcd;
	}

	public int getDlvqty(){
		return this.dlvqty;
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

	public int getRealsubsamt(){
		return this.realsubsamt;
	}

	public int getSubsamt(){
		return this.subsamt;
	}

	public int getDscnamt(){
		return this.dscnamt;
	}

	public String getRptvsubsdt(){
		return this.rptvsubsdt;
	}

	public String getRptvrdr_extndt(){
		return this.rptvrdr_extndt;
	}

	public String getAddrnm(){
		return this.addrnm;
	}

	public String getMil(){
		return this.mil;
	}
}

/* 작성시간 : Fri Jan 16 17:20:24 KST 2004 */