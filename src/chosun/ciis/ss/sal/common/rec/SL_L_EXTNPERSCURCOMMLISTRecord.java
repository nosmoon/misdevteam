/***************************************************************************************************
* 파일명 : SL_L_EXTNPERSCURCOMMLISTRecord.java
* 기능 : 공통-확장자검색팝업(목록조회)
* 작성일자 : 2004-04-07
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
 * 공통-확장자검색팝업(목록조회)
 *
 */

public class SL_L_EXTNPERSCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String stafno;
	public String bocd;
	public String boemp_no;
	public String prn;
	public String nm;
	public String tel_no1;
	public String tel_no2;
	public String tel_no3;
	public String ptph_no1;
	public String ptph_no2;
	public String ptph_no3;
	public String email;
	public String dutycd;
	public String dutynm;
	public String extntypecd;
	public String extnblngcd;
	public String stafclsfcd;
	public String extnblngnm;
	public String rnum;

	public SL_L_EXTNPERSCURCOMMLISTRecord(){}

	public void setStafno(String stafno){
		this.stafno = stafno;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBoemp_no(String boemp_no){
		this.boemp_no = boemp_no;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setNm(String nm){
		this.nm = nm;
	}

	public void setTel_no1(String tel_no1){
		this.tel_no1 = tel_no1;
	}

	public void setTel_no2(String tel_no2){
		this.tel_no2 = tel_no2;
	}

	public void setTel_no3(String tel_no3){
		this.tel_no3 = tel_no3;
	}

	public void setPtph_no1(String ptph_no1){
		this.ptph_no1 = ptph_no1;
	}

	public void setPtph_no2(String ptph_no2){
		this.ptph_no2 = ptph_no2;
	}

	public void setPtph_no3(String ptph_no3){
		this.ptph_no3 = ptph_no3;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void setDutycd(String dutycd){
		this.dutycd = dutycd;
	}

	public void setDutynm(String dutynm){
		this.dutynm = dutynm;
	}

	public void setExtntypecd(String extntypecd){
		this.extntypecd = extntypecd;
	}

	public void setExtnblngcd(String extnblngcd){
		this.extnblngcd = extnblngcd;
	}

	public void setStafclsfcd(String stafclsfcd){
		this.stafclsfcd = stafclsfcd;
	}

	public void setExtnblngnm(String extnblngnm){
		this.extnblngnm = extnblngnm;
	}

	public void setRnum(String rnum){
		this.rnum = rnum;
	}

	public String getStafno(){
		return this.stafno;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBoemp_no(){
		return this.boemp_no;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getNm(){
		return this.nm;
	}

	public String getTel_no1(){
		return this.tel_no1;
	}

	public String getTel_no2(){
		return this.tel_no2;
	}

	public String getTel_no3(){
		return this.tel_no3;
	}

	public String getPtph_no1(){
		return this.ptph_no1;
	}

	public String getPtph_no2(){
		return this.ptph_no2;
	}

	public String getPtph_no3(){
		return this.ptph_no3;
	}

	public String getEmail(){
		return this.email;
	}

	public String getDutycd(){
		return this.dutycd;
	}

	public String getDutynm(){
		return this.dutynm;
	}

	public String getExtntypecd(){
		return this.extntypecd;
	}

	public String getExtnblngcd(){
		return this.extnblngcd;
	}

	public String getStafclsfcd(){
		return this.stafclsfcd;
	}

	public String getExtnblngnm(){
		return this.extnblngnm;
	}

	public String getRnum(){
		return this.rnum;
	}
}

/* 작성시간 : Thu Apr 08 18:59:50 KST 2004 */