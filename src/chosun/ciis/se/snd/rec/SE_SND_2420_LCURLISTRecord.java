/***************************************************************************************************
* 파일명 : SE_SND_2420_LCURLISTRecord.java
* 기능 : 판매-발송관리-수송단가변경
* 작성일자 : 2009-02-19
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


public class SE_SND_2420_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String medi_cd;
	public String medi_nm;
	public String sect_cd;
	public String sect_nm;
	public String cmpy_cd;
	public String tran_uprc_cd;
	public String send_yn;
	public String qty;
	public String aply_dt;

	public String getAply_dt() {
		return aply_dt;
	}

	public void setAply_dt(String aply_dt) {
		this.aply_dt = aply_dt;
	}

	public SE_SND_2420_LCURLISTRecord(){}

	public String getCmpy_cd() {
		return cmpy_cd;
	}

	public void setCmpy_cd(String cmpy_cd) {
		this.cmpy_cd = cmpy_cd;
	}

	public String getMedi_cd() {
		return medi_cd;
	}

	public void setMedi_cd(String medi_cd) {
		this.medi_cd = medi_cd;
	}

	public String getMedi_nm() {
		return medi_nm;
	}

	public void setMedi_nm(String medi_nm) {
		this.medi_nm = medi_nm;
	}

	public String getQty() {
		return qty;
	}

	public void setQty(String qty) {
		this.qty = qty;
	}

	public String getSect_cd() {
		return sect_cd;
	}

	public void setSect_cd(String sect_cd) {
		this.sect_cd = sect_cd;
	}

	public String getSect_nm() {
		return sect_nm;
	}

	public void setSect_nm(String sect_nm) {
		this.sect_nm = sect_nm;
	}

	public String getSend_yn() {
		return send_yn;
	}

	public void setSend_yn(String send_yn) {
		this.send_yn = send_yn;
	}

	public String getTran_uprc_cd() {
		return tran_uprc_cd;
	}

	public void setTran_uprc_cd(String tran_uprc_cd) {
		this.tran_uprc_cd = tran_uprc_cd;
	}

	
}

/* 작성시간 : Thu Feb 19 17:42:17 KST 2009 */