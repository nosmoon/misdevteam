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


package chosun.ciis.se.sal.rec;

import java.sql.*;
import chosun.ciis.se.sal.dm.*;
import chosun.ciis.se.sal.ds.*;

/**
 * 
 */


public class SE_SAL_2815_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String widr_yymm;
	public String widr_mm_amt;

	public SE_SAL_2815_LCURLISTRecord(){}

	public void setWidr_yymm(String widr_yymm){
		this.widr_yymm = widr_yymm;
	}

	public void setWidr_mm_amt(String widr_mm_amt){
		this.widr_mm_amt = widr_mm_amt;
	}

	public String getWidr_yymm(){
		return this.widr_yymm;
	}

	public String getWidr_mm_amt(){
		return this.widr_mm_amt;
	}
}

/* �ۼ��ð� : Mon Dec 23 11:48:59 KST 2013 */