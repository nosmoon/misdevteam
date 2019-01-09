/***************************************************************************************************
* 파일명 : SS_L_RDR_DTLS_SECHRDRDTLSCURRecord.java
 * 기능 : 독자 목록조회(수금형) ( 독자+매체 ) 조회
 * 작성일자 : 2003-12-20
 * 작성자 : 김영윤
 ***************************************************************************************************/
 /***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/


package chosun.ciis.ss.sls.common.rec;

import java.sql.*;
import chosun.ciis.ss.sls.common.dm.*;
import chosun.ciis.ss.sls.common.ds.*;

/**
 * 독자 목록(수금형) ( 독자 + 매체 )
 *
 */


public class SS_L_RDR_DTLS_SECHRDRDTLSCURRecord extends java.lang.Object implements java.io.Serializable{

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
	public String dlvqty;
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
	public String rptvrdr_extntype;
	public String addrnm;
	public String medicd;
	public String cimgtcd2;
	public int valqty;
	public int no_valqty;
	public int pre_valqty;
	public String clamtmthdcd;
	public String m1;
	public String m2;
	public String m3;
	public String m4;
	public String m5;
	public String m6;
	public String m7;
	public String m8;
	public String m9;
	public String m10;
	public String m11;
	public String m12;
    public String rptvvalmm;
	public SS_L_RDR_DTLS_SECHRDRDTLSCURRecord(){}

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

	public void setDlvqty(String dlvqty){
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

	public void setRptvrdr_extntype(String rptvrdr_extntype){
		this.rptvrdr_extntype = rptvrdr_extntype;
	}

	public void setAddrnm(String addrnm){
		this.addrnm = addrnm;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setCimgtcd2(String cimgtcd2){
		this.cimgtcd2 = cimgtcd2;
	}

	public void setValqty(int valqty){
		this.valqty = valqty;
	}

	public void setNo_valqty(int no_valqty){
		this.no_valqty = no_valqty;
	}

	public void setPre_valqty(int pre_valqty){
		this.pre_valqty = pre_valqty;
	}

	public void setClamtmthdcd(String clamtmthdcd){
		this.clamtmthdcd = clamtmthdcd;
	}

	public void setM1(String m1){
		this.m1 = m1;
	}

	public void setM2(String m2){
		this.m2 = m2;
	}

	public void setM3(String m3){
		this.m3 = m3;
	}

	public void setM4(String m4){
		this.m4 = m4;
	}

	public void setM5(String m5){
		this.m5 = m5;
	}

	public void setM6(String m6){
		this.m6 = m6;
	}

	public void setM7(String m7){
		this.m7 = m7;
	}

	public void setM8(String m8){
		this.m8 = m8;
	}

	public void setM9(String m9){
		this.m9 = m9;
	}

	public void setM10(String m10){
		this.m10 = m10;
	}

	public void setM11(String m11){
		this.m11 = m11;
	}

	public void setM12(String m12){
		this.m12 = m12;
	}

    public void setRptvvalmm(String rptvvalmm){
        this.rptvvalmm = rptvvalmm;
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

	public String getDlvqty(){
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

	public String getRptvrdr_extntype(){
		return this.rptvrdr_extntype;
	}

	public String getAddrnm(){
		return this.addrnm;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getCimgtcd2(){
		return this.cimgtcd2;
	}

	public int getValqty(){
		return this.valqty;
	}

	public int getNo_valqty(){
		return this.no_valqty;
	}

	public int getPre_valqty(){
		return this.pre_valqty;
	}

	public String getClamtmthdcd(){
		return this.clamtmthdcd;
	}

	public String getM1(){
		return this.m1;
	}

	public String getM2(){
		return this.m2;
	}

	public String getM3(){
		return this.m3;
	}

	public String getM4(){
		return this.m4;
	}

	public String getM5(){
		return this.m5;
	}

	public String getM6(){
		return this.m6;
	}

	public String getM7(){
		return this.m7;
	}

	public String getM8(){
		return this.m8;
	}

	public String getM9(){
		return this.m9;
	}

	public String getM10(){
		return this.m10;
	}

	public String getM11(){
		return this.m11;
	}

	public String getM12(){
		return this.m12;
	}

    public String getRptvvalmm(){
        return this.rptvvalmm;
    }

}

/* 작성시간 : Thu Dec 18 20:01:02 KST 2003 */