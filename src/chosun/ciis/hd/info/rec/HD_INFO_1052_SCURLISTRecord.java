/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.info.rec;

import java.sql.*;
import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.ds.*;

/**
 * 
 */


public class HD_INFO_1052_SCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String addr_clsf;
	public String zip_1;
	public String zip_2;
	public String addr;
	public String dtls_addr;
	public String tel_no_1;
	public String tel_no_2;
	public String tel_no_3;
	public String fax_no;
	public String ptph_no_1;
	public String ptph_no_2;
	public String ptph_no_3;
	public String incmp_tel_no;
	public String email_addr;
	public String email_cd;
	public String forn_addr;
	public String forn_tel_no;
	public String forn_ptph_no;
	public String forn_fax_no;

	public HD_INFO_1052_SCURLISTRecord(){}

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

	public void setTel_no_1(String tel_no_1){
		this.tel_no_1 = tel_no_1;
	}

	public void setTel_no_2(String tel_no_2){
		this.tel_no_2 = tel_no_2;
	}

	public void setTel_no_3(String tel_no_3){
		this.tel_no_3 = tel_no_3;
	}

	public void setFax_no(String fax_no){
		this.fax_no = fax_no;
	}

	public void setPtph_no_1(String ptph_no_1){
		this.ptph_no_1 = ptph_no_1;
	}

	public void setPtph_no_2(String ptph_no_2){
		this.ptph_no_2 = ptph_no_2;
	}

	public void setPtph_no_3(String ptph_no_3){
		this.ptph_no_3 = ptph_no_3;
	}

	public void setIncmp_tel_no(String incmp_tel_no){
		this.incmp_tel_no = incmp_tel_no;
	}

	public void setEmail_addr(String email_addr){
		this.email_addr = email_addr;
	}

	public void setEmail_cd(String email_cd){
		this.email_cd = email_cd;
	}
	
	public void setForn_addr(String forn_addr){
		this.forn_addr = forn_addr;
	}

	public void setForn_tel_no(String forn_tel_no){
		this.forn_tel_no = forn_tel_no;
	}

	public void setForn_ptph_no(String forn_ptph_no){
		this.forn_ptph_no = forn_ptph_no;
	}

	public void setForn_fax_no(String forn_fax_no){
		this.forn_fax_no = forn_fax_no;
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

	public String getTel_no_1(){
		return this.tel_no_1;
	}

	public String getTel_no_2(){
		return this.tel_no_2;
	}

	public String getTel_no_3(){
		return this.tel_no_3;
	}

	public String getFax_no(){
		return this.fax_no;
	}

	public String getPtph_no_1(){
		return this.ptph_no_1;
	}

	public String getPtph_no_2(){
		return this.ptph_no_2;
	}

	public String getPtph_no_3(){
		return this.ptph_no_3;
	}

	public String getIncmp_tel_no(){
		return this.incmp_tel_no;
	}

	public String getEmail_addr(){
		return this.email_addr;
	}

	public String getEmail_cd(){
		return this.email_cd;
	}
	
	public String getForn_addr(){
		return this.forn_addr;
	}

	public String getForn_tel_no(){
		return this.forn_tel_no;
	}

	public String getForn_ptph_no(){
		return this.forn_ptph_no;
	}

	public String getForn_fax_no(){
		return this.forn_fax_no;
	}
}

/* 작성시간 : Thu Feb 05 15:32:14 KST 2009 */