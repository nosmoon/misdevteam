/***************************************************************************************************
* ���ϸ� : .java
* ��� : 
* �ۼ����� : 
* �ۼ��� : ������
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.admin.rec;

import java.sql.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.ds.*;

/**
 * 
 */


public class SS_L_ADDRCD_TRSFBOCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dlvcd;
	public String addrnm;
	public String rdr_cnt;
	public String new_addrcd;

	public SS_L_ADDRCD_TRSFBOCURCOMMLISTRecord(){}

	public void setDlvcd(String dlvcd){
		this.dlvcd = dlvcd;
	}

	public void setAddrnm(String addrnm){
		this.addrnm = addrnm;
	}

	public void setRdr_cnt(String rdr_cnt){
		this.rdr_cnt = rdr_cnt;
	}
	
	public void setNew_addrcd(String new_addrcd){
		this.new_addrcd = new_addrcd;
	}

	public String getDlvcd(){
		return this.dlvcd;
	}

	public String getAddrnm(){
		return this.addrnm;
	}

	public String getRdr_cnt(){
		return this.rdr_cnt;
	}
	
	public String getNew_addrcd(){
		return this.new_addrcd;
	}
}

/* �ۼ��ð� : Mon Jul 28 17:55:05 KST 2014 */