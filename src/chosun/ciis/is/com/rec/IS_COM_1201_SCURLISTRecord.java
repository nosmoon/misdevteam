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


package chosun.ciis.is.com.rec;

import java.sql.*;
import chosun.ciis.is.com.dm.*;
import chosun.ciis.is.com.ds.*;

/**
 * 
 */


public class IS_COM_1201_SCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String advcs_cd;
	public String advcs_nm;
	public String indt_cd;
	public String indt_cd_nm;
	public String tel_no;
	public String sms_ptph_no;

	public IS_COM_1201_SCURLISTRecord(){}

	public void setAdvcs_cd(String advcs_cd){
		this.advcs_cd = advcs_cd;
	}

	public void setAdvcs_nm(String advcs_nm){
		this.advcs_nm = advcs_nm;
	}

	public void setIndt_cd(String indt_cd){
		this.indt_cd = indt_cd;
	}

	public void setIndt_cd_nm(String indt_cd_nm){
		this.indt_cd_nm = indt_cd_nm;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setSms_ptph_no(String sms_ptph_no){
		this.sms_ptph_no = sms_ptph_no;
	}

	public String getAdvcs_cd(){
		return this.advcs_cd;
	}

	public String getAdvcs_nm(){
		return this.advcs_nm;
	}

	public String getIndt_cd(){
		return this.indt_cd;
	}

	public String getIndt_cd_nm(){
		return this.indt_cd_nm;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getSms_ptph_no(){
		return this.sms_ptph_no;
	}
}

/* �ۼ��ð� : Thu Jul 26 15:30:37 KST 2012 */