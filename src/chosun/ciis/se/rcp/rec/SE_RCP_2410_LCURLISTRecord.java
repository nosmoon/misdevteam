/***************************************************************************************************
* ���ϸ� : .java
* ��� : �ǸŽý���
* �ۼ����� : 2009-02-18
* �ۼ��� : ��â��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.rcp.rec;

import java.sql.*;
import chosun.ciis.se.rcp.dm.*;
import chosun.ciis.se.rcp.ds.*;

/**
 * 
 */


public class SE_RCP_2410_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_nm;
	public String part_nm;
	public String area_nm;
	public String chrg_flnm;
	public String amt;

	public SE_RCP_2410_LCURLISTRecord(){}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setPart_nm(String part_nm){
		this.part_nm = part_nm;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setChrg_flnm(String chrg_flnm){
		this.chrg_flnm = chrg_flnm;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getPart_nm(){
		return this.part_nm;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getChrg_flnm(){
		return this.chrg_flnm;
	}

	public String getAmt(){
		return this.amt;
	}
}

/* �ۼ��ð� : Thu Apr 23 14:41:50 KST 2009 */