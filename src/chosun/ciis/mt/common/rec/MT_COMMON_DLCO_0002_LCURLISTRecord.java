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


public class MT_COMMON_DLCO_0002_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dlco_no;
	public String ern;
	public String dlco_abrv_nm;
	public String dlco_nm;
	public String presi_nm;
	public String addr;
	public String tel_no;
	public String fax_no;

	public MT_COMMON_DLCO_0002_LCURLISTRecord(){}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setDlco_abrv_nm(String dlco_abrv_nm){
		this.dlco_abrv_nm = dlco_abrv_nm;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setPresi_nm(String presi_nm){
		this.presi_nm = presi_nm;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setFax_no(String fax_no){
		this.fax_no = fax_no;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getErn(){
		return this.ern;
	}

	public String getDlco_abrv_nm(){
		return this.dlco_abrv_nm;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getPresi_nm(){
		return this.presi_nm;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getFax_no(){
		return this.fax_no;
	}
}

/* �ۼ��ð� : Fri May 01 11:24:18 KST 2009 */