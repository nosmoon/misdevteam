/***************************************************************************************************
* 파일명 : SL_L_RDR_RDRAREACURCOMMLISTRecord.java
* 기능 : 독자-지역독자관리(목록조회)
* 작성일자 : 2004-05-20
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
 * 독자-지역독자관리(목록조회)
 *
 */

public class SL_L_RDR_RDRAREACURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String areardr_no;
	public String areardrnm;
	public String zip;
	public String addr;
	public String dtlsaddr;
	public String tel_no1;
	public String tel_no2;
	public String tel_no3;
	public String area_rdrregdt;
	public String subsmedicd;
	public String subsmedinm;

	public SL_L_RDR_RDRAREACURCOMMLISTRecord(){}

	public void setAreardr_no(String areardr_no){
		this.areardr_no = areardr_no;
	}

	public void setAreardrnm(String areardrnm){
		this.areardrnm = areardrnm;
	}

	public void setZip(String zip){
		this.zip = zip;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setDtlsaddr(String dtlsaddr){
		this.dtlsaddr = dtlsaddr;
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

	public void setArea_rdrregdt(String area_rdrregdt){
		this.area_rdrregdt = area_rdrregdt;
	}

	public void setSubsmedicd(String subsmedicd){
		this.subsmedicd = subsmedicd;
	}

	public void setSubsmedinm(String subsmedinm){
		this.subsmedinm = subsmedinm;
	}

	public String getAreardr_no(){
		return this.areardr_no;
	}

	public String getAreardrnm(){
		return this.areardrnm;
	}

	public String getZip(){
		return this.zip;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getDtlsaddr(){
		return this.dtlsaddr;
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

	public String getArea_rdrregdt(){
		return this.area_rdrregdt;
	}

	public String getSubsmedicd(){
		return this.subsmedicd;
	}

	public String getSubsmedinm(){
		return this.subsmedinm;
	}
}

/* 작성시간 : Mon May 24 15:30:08 KST 2004 */