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


package chosun.ciis.ad.evlu.rec;

import java.sql.*;
import chosun.ciis.ad.evlu.dm.*;
import chosun.ciis.ad.evlu.ds.*;

/**
 * 
 */


public class AD_EVLU_2100_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String emp_no;
	public String nm_korn;
	public String scortl;

	public AD_EVLU_2100_LCURLIST2Record(){}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setScortl(String scortl){
		this.scortl = scortl;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getScortl(){
		return this.scortl;
	}
}

/* �ۼ��ð� : Fri Mar 19 19:05:14 KST 2010 */