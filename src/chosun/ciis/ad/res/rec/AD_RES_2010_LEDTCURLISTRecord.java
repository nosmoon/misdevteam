/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ad.res.rec;

import java.sql.*;
import chosun.ciis.ad.res.dm.*;
import chosun.ciis.ad.res.ds.*;

/**
 * 
 */


public class AD_RES_2010_LEDTCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String sect_cd;
	public String sect_seq;
	public String advt_cont;
	public String cm;
	public String dn;
	public String uprc;
	public String advt_fee;

	public AD_RES_2010_LEDTCURLISTRecord(){}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setSect_seq(String sect_seq){
		this.sect_seq = sect_seq;
	}

	public void setAdvt_cont(String advt_cont){
		this.advt_cont = advt_cont;
	}

	public void setCm(String cm){
		this.cm = cm;
	}

	public void setDn(String dn){
		this.dn = dn;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public void setAdvt_fee(String advt_fee){
		this.advt_fee = advt_fee;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getSect_seq(){
		return this.sect_seq;
	}

	public String getAdvt_cont(){
		return this.advt_cont;
	}

	public String getCm(){
		return this.cm;
	}

	public String getDn(){
		return this.dn;
	}

	public String getUprc(){
		return this.uprc;
	}

	public String getAdvt_fee(){
		return this.advt_fee;
	}
}

/* 작성시간 : Mon Nov 06 11:38:09 KST 2017 */