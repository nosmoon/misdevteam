/***************************************************************************************************
* ���ϸ� : SE_RCP_2820_LCURLISTRecord.java
* ��� : �Ǹ� - �Աݰ��� - �����Աݰ��� - ������ä���뺸
* �ۼ����� : 2009-04-27
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.rcp.rec;

import java.sql.*;
import chosun.ciis.se.rcp.dm.*;
import chosun.ciis.se.rcp.ds.*;

/**
 * 
 */


public class SE_RCP_2820_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bo_nm			;
	public String bo_head_nm	;
	public String gurt_pers_flnm;
	public String zip			;
	public String tel			;
	public String addr			;
	public String dtls_addr		;

	public SE_RCP_2820_LCURLISTRecord(){}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setBo_head_nm(String bo_head_nm){
		this.bo_head_nm = bo_head_nm;
	}

	public void setGurt_pers_flnm(String gurt_pers_flnm){
		this.gurt_pers_flnm = gurt_pers_flnm;
	}

	public void setZip(String zip){
		this.zip = zip;
	}

	public void setTel(String tel){
		this.tel = tel;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setDtls_addr(String dtls_addr){
		this.dtls_addr = dtls_addr;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}

	public String getBo_head_nm(){
		return this.bo_head_nm;
	}

	public String getGurt_pers_flnm(){
		return this.gurt_pers_flnm;
	}

	public String getZip(){
		return this.zip;
	}

	public String getTel(){
		return this.tel;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getDtls_addr(){
		return this.dtls_addr;
	}
}

/* �ۼ��ð� : Mon Apr 27 14:30:06 KST 2009 */