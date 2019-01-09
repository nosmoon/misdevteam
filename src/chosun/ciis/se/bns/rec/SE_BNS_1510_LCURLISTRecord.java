/***************************************************************************************************
* 파일명 : SE_BNS_1510_LCURLISTRecord.java
* 기능 : 판매 - 판촉물관리 - 판촉물배분처리
* 작성일자 : 2009-05-06
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.bns.rec;

import java.sql.*;
import chosun.ciis.se.bns.dm.*;
import chosun.ciis.se.bns.ds.*;

/**
 * 
 */


public class SE_BNS_1510_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bns_item_cd	;
	public String bns_item_nm	;
	public String send_qunt		;
	public String qunt			;
	public String divn_dt		;

	public SE_BNS_1510_LCURLISTRecord(){}

	public void setBns_item_cd(String bns_item_cd){
		this.bns_item_cd = bns_item_cd;
	}

	public void setBns_item_nm(String bns_item_nm){
		this.bns_item_nm = bns_item_nm;
	}

	public void setSend_qunt(String send_qunt){
		this.send_qunt = send_qunt;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public void setDivn_dt(String divn_dt){
		this.divn_dt = divn_dt;
	}

	public String getBns_item_cd(){
		return this.bns_item_cd;
	}

	public String getBns_item_nm(){
		return this.bns_item_nm;
	}

	public String getSend_qunt(){
		return this.send_qunt;
	}

	public String getQunt(){
		return this.qunt;
	}

	public String getDivn_dt(){
		return this.divn_dt;
	}
}

/* 작성시간 : Wed May 06 19:56:46 KST 2009 */