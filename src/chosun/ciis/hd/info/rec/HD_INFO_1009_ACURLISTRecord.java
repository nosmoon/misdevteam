/***************************************************************************************************
* ���ϸ� : .java
* ��� : 
* �ۼ����� :
* �ۼ��� :
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.hd.info.rec;

import java.sql.*;
import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.ds.*;

/**
 * 
 */


public class HD_INFO_1009_ACURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String emp_no;
	public String nm_korn;
	public String prn;

	public HD_INFO_1009_ACURLISTRecord(){}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getPrn(){
		return this.prn;
	}
}

/* �ۼ��ð� : Tue Jun 05 18:49:05 KST 2012 */