/***************************************************************************************************
* 파일명 : .java
* 기능 : 인사급여-인사정보조회
* 작성일자 : 2014-12-23
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 비상연락처 추가
* 수정자 : 이태식
* 수정일자 :2014-12-23
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.info.rec;

import java.sql.*;
import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.ds.*;

/**
 * 
 */


public class HD_INFO_5101_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String addr_clsf;
	public String zip_1;
	public String zip_2;
	public String addr;
	public String dtls_addr;
	public String tel_no;
	public String fax_no;
	public String ptph_no;
	public String email_id;
	public String email_cd;
	public String forn_zip;
	public String forn_addr;
	public String cntc_rshp;

	public HD_INFO_5101_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setAddr_clsf(String addr_clsf){
		this.addr_clsf = addr_clsf;
	}

	public void setZip_1(String zip_1){
		this.zip_1 = zip_1;
	}

	public void setZip_2(String zip_2){
		this.zip_2 = zip_2;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setDtls_addr(String dtls_addr){
		this.dtls_addr = dtls_addr;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setFax_no(String fax_no){
		this.fax_no = fax_no;
	}

	public void setPtph_no(String ptph_no){
		this.ptph_no = ptph_no;
	}

	public void setEmail_id(String email_id){
		this.email_id = email_id;
	}

	public void setEmail_cd(String email_cd){
		this.email_cd = email_cd;
	}
	
	public void setForn_zip(String forn_zip){
		this.forn_zip = forn_zip;
	}

	public void setForn_addr(String forn_addr){
		this.forn_addr = forn_addr;
	}

	public void setCntc_rshp(String cntc_rshp){
		this.cntc_rshp = cntc_rshp;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getAddr_clsf(){
		return this.addr_clsf;
	}

	public String getZip_1(){
		return this.zip_1;
	}

	public String getZip_2(){
		return this.zip_2;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getDtls_addr(){
		return this.dtls_addr;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getFax_no(){
		return this.fax_no;
	}

	public String getPtph_no(){
		return this.ptph_no;
	}

	public String getEmail_id(){
		return this.email_id;
	}
	
	public String getEmail_cd(){
		return this.email_cd;
	}
	
	public String getForn_zip(){
		return this.forn_zip;
	}

	public String getForn_addr(){
		return this.forn_addr;
	}

	public String getCntc_rshp(){
		return this.cntc_rshp;
	}
}

/* 작성시간 : Mon Dec 29 15:54:45 KST 2014 */