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


package chosun.ciis.se.bas.rec;

import java.sql.*;
import chosun.ciis.se.bas.dm.*;
import chosun.ciis.se.bas.ds.*;

/**
 * 
 */


public class SE_BAS_1310_LSENDLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String medi_cd;
	public String bhilsu;
	public String amt;

	public SE_BAS_1310_LSENDLISTRecord(){}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setBhilsu(String bhilsu){
		this.bhilsu = bhilsu;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getBhilsu(){
		return this.bhilsu;
	}

	public String getAmt(){
		return this.amt;
	}
}

/* �ۼ��ð� : Tue Feb 24 10:13:32 KST 2009 */