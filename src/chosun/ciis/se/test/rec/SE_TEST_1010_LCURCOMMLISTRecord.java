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


package chosun.ciis.se.test.rec;

import java.sql.*;
import chosun.ciis.se.test.dm.*;
import chosun.ciis.se.test.ds.*;

/**
 * 
 */


public class SE_TEST_1010_LCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String emp_nm;
	public String cmpycd;
	public String workcd;
	public String vip_lastweek;
	public String lastweek;
	public String thisweek;

	public SE_TEST_1010_LCURCOMMLISTRecord(){}

	public void setEmp_nm(String emp_nm){
		this.emp_nm = emp_nm;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setWorkcd(String workcd){
		this.workcd = workcd;
	}

	public void setVip_lastweek(String vip_lastweek){
		this.vip_lastweek = vip_lastweek;
	}

	public void setLastweek(String lastweek){
		this.lastweek = lastweek;
	}

	public void setThisweek(String thisweek){
		this.thisweek = thisweek;
	}

	public String getEmp_nm(){
		return this.emp_nm;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getWorkcd(){
		return this.workcd;
	}

	public String getVip_lastweek(){
		return this.vip_lastweek;
	}

	public String getLastweek(){
		return this.lastweek;
	}

	public String getThisweek(){
		return this.thisweek;
	}
}

/* �ۼ��ð� : Thu May 23 17:03:18 KST 2013 */