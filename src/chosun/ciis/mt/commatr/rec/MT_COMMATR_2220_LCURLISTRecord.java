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


package chosun.ciis.mt.commatr.rec;

import java.sql.*;
import chosun.ciis.mt.commatr.dm.*;
import chosun.ciis.mt.commatr.ds.*;

/**
 * 
 */


public class MT_COMMATR_2220_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dlco_eps_no;
	public String dlco_nm;

	public MT_COMMATR_2220_LCURLISTRecord(){}

	public void setDlco_eps_no(String dlco_eps_no){
		this.dlco_eps_no = dlco_eps_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public String getDlco_eps_no(){
		return this.dlco_eps_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}
}

/* �ۼ��ð� : Tue Jul 07 22:28:23 KST 2009 */