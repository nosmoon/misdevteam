/***************************************************************************************************
* ���ϸ� : MT_PRNPAP_1002_LCURLISTRecord.java
* ��� :  �������� / �μ���� ����
* �ۼ����� : 2009-03-30 
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/


package chosun.ciis.mt.prnpap.rec;

import java.sql.*;
import chosun.ciis.mt.prnpap.dm.*;
import chosun.ciis.mt.prnpap.ds.*;

/**
 * 
 */


public class MT_PRNPAP_1002_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cd;
	public String cdnm;
	public String mang_cd_1;
	public String mang_cd_2;
	public String mang_cd_3;
	public String mang_cd_4;

	public MT_PRNPAP_1002_LCURLISTRecord(){}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setCdnm(String cdnm){
		this.cdnm = cdnm;
	}

	public void setMang_cd_1(String mang_cd_1){
		this.mang_cd_1 = mang_cd_1;
	}

	public void setMang_cd_2(String mang_cd_2){
		this.mang_cd_2 = mang_cd_2;
	}

	public void setMang_cd_3(String mang_cd_3){
		this.mang_cd_3 = mang_cd_3;
	}

	public void setMang_cd_4(String mang_cd_4){
		this.mang_cd_4 = mang_cd_4;
	}

	public String getCd(){
		return this.cd;
	}

	public String getCdnm(){
		return this.cdnm;
	}

	public String getMang_cd_1(){
		return this.mang_cd_1;
	}

	public String getMang_cd_2(){
		return this.mang_cd_2;
	}

	public String getMang_cd_3(){
		return this.mang_cd_3;
	}

	public String getMang_cd_4(){
		return this.mang_cd_4;
	}
}

/* �ۼ��ð� : Mon Mar 30 18:35:51 KST 2009 */