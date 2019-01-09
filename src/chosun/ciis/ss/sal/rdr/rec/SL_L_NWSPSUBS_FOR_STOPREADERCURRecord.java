/***************************************************************************************************
* 파일명 : SL_L_NWSPSUBS_FOR_STOPREADERCURRecord.java
* 기능 : 중지독자관리-중지대상조회
* 작성일자 : 2004-02-09
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
 * 중지독자관리-중지대상조회
 *
 */


public class SL_L_NWSPSUBS_FOR_STOPREADERCURRecord extends java.lang.Object implements java.io.Serializable{

	public String rdr_no;
	public String paty_clsfcd;
	public String natnclsfcd;
	public String rdrnm;
	public String email;
	public String medicd;
	public String medinm;
	public String rdrtel_no1;
	public String rdrtel_no2;
	public String rdrtel_no3;
	public String rdrptph_no1;
	public String rdrptph_no2;
	public String rdrptph_no3;
	public String dlvdstccd;
	public String dlvno;
	public String dlvintvno;
	public String freeyn;
	public String freeynnm;
	public String freeclsf;
	public String qty;

	public SL_L_NWSPSUBS_FOR_STOPREADERCURRecord(){}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setPaty_clsfcd(String paty_clsfcd){
		this.paty_clsfcd = paty_clsfcd;
	}

	public void setNatnclsfcd(String natnclsfcd){
		this.natnclsfcd = natnclsfcd;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
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

	public void setDlvdstccd(String dlvdstccd){
		this.dlvdstccd = dlvdstccd;
	}

	public void setDlvno(String dlvno){
		this.dlvno = dlvno;
	}

	public void setDlvintvno(String dlvintvno){
		this.dlvintvno = dlvintvno;
	}

	public void setFreeyn(String freeyn){
		this.freeyn = freeyn;
	}

	public void setFreeynnm(String freeynnm){
		this.freeynnm = freeynnm;
	}

	public void setFreeclsf(String freeclsf){
		this.freeclsf = freeclsf;
	}

	public void setQty(String qty){
		this.qty = qty;
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

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getEmail(){
		return this.email;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getMedinm(){
		return this.medinm;
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

	public String getDlvdstccd(){
		return this.dlvdstccd;
	}

	public String getDlvno(){
		return this.dlvno;
	}

	public String getDlvintvno(){
		return this.dlvintvno;
	}

	public String getFreeyn(){
		return this.freeyn;
	}

	public String getFreeynnm(){
		return this.freeynnm;
	}

	public String getFreeclsf(){
		return this.freeclsf;
	}

	public String getQty(){
		return this.qty;
	}
}

/* 작성시간 : Tue Feb 10 17:40:17 KST 2004 */