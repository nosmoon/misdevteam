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


package chosun.ciis.as.leas.rec;

import java.sql.*;
import chosun.ciis.as.leas.dm.*;
import chosun.ciis.as.leas.ds.*;

/**
 * 
 */


public class AS_LEAS_1106_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String aset_size;
	public String leas_dlco_ern;
	public String leas_dlco_nm;

	public AS_LEAS_1106_LCURLIST1Record(){}

	public void setAset_size(String aset_size){
		this.aset_size = aset_size;
	}

	public void setLeas_dlco_ern(String leas_dlco_ern){
		this.leas_dlco_ern = leas_dlco_ern;
	}

	public void setLeas_dlco_nm(String leas_dlco_nm){
		this.leas_dlco_nm = leas_dlco_nm;
	}

	public String getAset_size(){
		return this.aset_size;
	}

	public String getLeas_dlco_ern(){
		return this.leas_dlco_ern;
	}

	public String getLeas_dlco_nm(){
		return this.leas_dlco_nm;
	}
}

/* �ۼ��ð� : Fri Apr 10 13:58:27 KST 2009 */