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


package chosun.ciis.fc.func.rec;

import java.sql.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.ds.*;

/**
 * 
 */


public class FC_FUNC_8051_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String leas_nm;
	public String comp_dt;
	public String mtry_dt;

	public FC_FUNC_8051_LCURLIST1Record(){}

	public void setLeas_nm(String leas_nm){
		this.leas_nm = leas_nm;
	}

	public void setComp_dt(String comp_dt){
		this.comp_dt = comp_dt;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public String getLeas_nm(){
		return this.leas_nm;
	}

	public String getComp_dt(){
		return this.comp_dt;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}
}

/* �ۼ��ð� : Fri Apr 10 14:17:47 KST 2009 */