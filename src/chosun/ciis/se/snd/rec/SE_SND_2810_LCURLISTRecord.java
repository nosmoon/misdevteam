/***************************************************************************************************
* 파일명 : SE_SND_2810_LCURLISTRecord.java
* 기능 : 발송관리 - 마감관리 - 발송정보 DOWNLOAD
* 작성일자 : 2009-03-25
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.snd.rec;

import java.sql.*;
import chosun.ciis.se.snd.dm.*;
import chosun.ciis.se.snd.ds.*;

/**
 * 
 */


public class SE_SND_2810_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String issu_dt	;
	public String tmsg_seq	;
	public String tmsg_dt_tm;
	public String flnm		;
	public String medi_nm	;

	public SE_SND_2810_LCURLISTRecord(){}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setTmsg_seq(String tmsg_seq){
		this.tmsg_seq = tmsg_seq;
	}

	public void setTmsg_dt_tm(String tmsg_dt_tm){
		this.tmsg_dt_tm = tmsg_dt_tm;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getTmsg_seq(){
		return this.tmsg_seq;
	}

	public String getTmsg_dt_tm(){
		return this.tmsg_dt_tm;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}
}

/* 작성시간 : Wed Mar 25 20:29:53 KST 2009 */