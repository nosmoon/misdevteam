/***************************************************************************************************
* 파일명 : SE_SND_1210_LCURLISTRecord.java
* 기능 : 판매 - 발송관리 - 노선구분등록
* 작성일자 : 2009.01.20
* 작성자 :   김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.snd.rec;

import java.sql.*;
import chosun.ciis.se.bas.dm.*;
import chosun.ciis.se.bas.ds.*;

/**
 * 
 */


public class SE_SND_1210_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cd;
	public String cdnm;
	public String mang_cd_1;
	public String use_yn;
	public String chg_dt_tm;
	public String cd_key;

	public SE_SND_1210_LCURLISTRecord(){}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setCdnm(String cdnm){
		this.cdnm = cdnm;
	}

	public void setMang_cd_1(String mang_cd_1){
		this.mang_cd_1 = mang_cd_1;
	}

	public void setUse_yn(String use_yn){
		this.use_yn = use_yn;
	}

	public void setChg_dt_tm(String chg_dt_tm){
		this.chg_dt_tm = chg_dt_tm;
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

	public String getUse_yn(){
		return this.use_yn;
	}

	public String getChg_dt_tm(){
		return this.chg_dt_tm;
	}
	
	public String getCd_key() {
		return cd_key;
	}

	public void setCd_key(String cd_key) {
		this.cd_key = cd_key;
	}
}


/* 작성시간 : Mon Jan 19 15:55:59 KST 2009 */