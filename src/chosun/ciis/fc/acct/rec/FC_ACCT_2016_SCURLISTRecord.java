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


package chosun.ciis.fc.acct.rec;

import java.sql.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.ds.*;

/**
 * 
 */


public class FC_ACCT_2016_SCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cd;
	public String cd_abrv_nm;
	public String mang_cd_5;
	public String mang_cd_6;
	public String mang_cd_7;
	public String mang_cd_8;

	public FC_ACCT_2016_SCURLISTRecord(){}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setCd_abrv_nm(String cd_abrv_nm){
		this.cd_abrv_nm = cd_abrv_nm;
	}

	public void setMang_cd_5(String mang_cd_5){
		this.mang_cd_5 = mang_cd_5;
	}

	public void setMang_cd_6(String mang_cd_6){
		this.mang_cd_6 = mang_cd_6;
	}

	public void setMang_cd_7(String mang_cd_7){
		this.mang_cd_7 = mang_cd_7;
	}

	public void setMang_cd_8(String mang_cd_8){
		this.mang_cd_8 = mang_cd_8;
	}

	public String getCd(){
		return this.cd;
	}

	public String getCd_abrv_nm(){
		return this.cd_abrv_nm;
	}

	public String getMang_cd_5(){
		return this.mang_cd_5;
	}

	public String getMang_cd_6(){
		return this.mang_cd_6;
	}

	public String getMang_cd_7(){
		return this.mang_cd_7;
	}

	public String getMang_cd_8(){
		return this.mang_cd_8;
	}
}

/* �ۼ��ð� : Mon Aug 17 17:45:42 KST 2009 */