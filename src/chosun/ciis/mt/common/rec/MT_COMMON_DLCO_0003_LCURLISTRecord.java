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


package chosun.ciis.mt.common.rec;

import java.sql.*;
import chosun.ciis.mt.common.dm.*;
import chosun.ciis.mt.common.ds.*;

/**
 * 
 */


public class MT_COMMON_DLCO_0003_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String ern;
	public String dlco_no;
	public String dlco_nm;

	public MT_COMMON_DLCO_0003_LCURLISTRecord(){}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public String getErn(){
		return this.ern;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}
}

/* �ۼ��ð� : Thu Apr 02 10:51:55 KST 2009 */