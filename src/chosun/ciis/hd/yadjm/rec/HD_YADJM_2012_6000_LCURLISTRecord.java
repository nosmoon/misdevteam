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


public class HD_YADJM_2012_6000_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String emp_no;
	public String nm_korn;
	public String end_dt;

	public HD_YADJM_2012_6000_LCURLISTRecord(){}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setEnd_dt(String end_dt){
		this.end_dt = end_dt;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getEnd_dt(){
		return this.end_dt;
	}
}

/* �ۼ��ð� : Tue Jan 08 19:54:46 KST 2013 */