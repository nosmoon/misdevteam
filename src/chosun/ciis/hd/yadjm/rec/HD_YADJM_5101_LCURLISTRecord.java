/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.hd.yadjm.rec;

import java.sql.*;
import chosun.ciis.hd.yadjm.dm.*;
import chosun.ciis.hd.yadjm.ds.*;

/**
 * 
 */


public class HD_YADJM_5101_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String zip_1_1;
	public String zip_2_1;
	public String addr_1;
	public String dtls_addr_1;

	public HD_YADJM_5101_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

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

	public String getCmpy_cd(){
		return this.cmpy_cd;
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

/* �ۼ��ð� : Tue Jan 19 16:48:52 KST 2010 */