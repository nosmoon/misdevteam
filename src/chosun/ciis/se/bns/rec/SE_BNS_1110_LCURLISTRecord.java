/***************************************************************************************************
* ���ϸ� : .java
* ��� : 	   
* �ۼ����� : 
* �ۼ��� : 
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.bns.rec;

import java.sql.*;
import chosun.ciis.se.bns.dm.*;
import chosun.ciis.se.bns.ds.*;

/**
 * 
 */


public class SE_BNS_1110_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bns_item_cd;
	public String bns_item_nm;
	public String bns_item_clas;
	public String uprc;
	public String divn_uprc;
	public String use_yn;

	public SE_BNS_1110_LCURLISTRecord(){}

	public void setBns_item_cd(String bns_item_cd){
		this.bns_item_cd = bns_item_cd;
	}

	public void setBns_item_nm(String bns_item_nm){
		this.bns_item_nm = bns_item_nm;
	}

	public void setBns_item_clas(String bns_item_clas){
		this.bns_item_clas = bns_item_clas;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public void setDivn_uprc(String divn_uprc){
		this.divn_uprc = divn_uprc;
	}

	public void setUse_yn(String use_yn){
		this.use_yn = use_yn;
	}

	public String getBns_item_cd(){
		return this.bns_item_cd;
	}

	public String getBns_item_nm(){
		return this.bns_item_nm;
	}

	public String getBns_item_clas(){
		return this.bns_item_clas;
	}

	public String getUprc(){
		return this.uprc;
	}

	public String getDivn_uprc(){
		return this.divn_uprc;
	}

	public String getUse_yn(){
		return this.use_yn;
	}
}

/* �ۼ��ð� : Mon Aug 28 13:46:24 KST 2017 */