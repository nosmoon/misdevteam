/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.yadjm.rec;

import java.sql.*;
import chosun.ciis.hd.yadjm.dm.*;
import chosun.ciis.hd.yadjm.ds.*;

/**
 * 
 */


public class HD_YADJM_2016_1220_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String emp_no;
	public String zip_1_1;
	public String zip_2_1;
	public String addr_1;
	public String dtls_addr_1;

	public HD_YADJM_2016_1220_LCURLIST1Record(){}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setZip_1_1(String zip_1_1){
		this.zip_1_1 = zip_1_1;
	}

	public void setZip_2_1(String zip_2_1){
		this.zip_2_1 = zip_2_1;
	}

	public void setAddr_1(String addr_1){
		this.addr_1 = addr_1;
	}

	public void setDtls_addr_1(String dtls_addr_1){
		this.dtls_addr_1 = dtls_addr_1;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getZip_1_1(){
		return this.zip_1_1;
	}

	public String getZip_2_1(){
		return this.zip_2_1;
	}

	public String getAddr_1(){
		return this.addr_1;
	}

	public String getDtls_addr_1(){
		return this.dtls_addr_1;
	}
}

/* 작성시간 : Fri Jan 15 10:37:28 KST 2016 */