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


package chosun.ciis.is.snd.rec;

import java.sql.*;
import chosun.ciis.is.snd.dm.*;
import chosun.ciis.is.snd.ds.*;

/**
 * 
 */


public class IS_SND_1520_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String wh_cd_nm;
	public String asnt_dstc_cd_nm;
	public String purc_dlco_nm;
	public String ptph_no_000;
	public String ptph_no_010;
	public String ptph_no_020;
	public String msg;

	public IS_SND_1520_LCURLISTRecord(){}

	public void setWh_cd_nm(String wh_cd_nm){
		this.wh_cd_nm = wh_cd_nm;
	}

	public void setAsnt_dstc_cd_nm(String asnt_dstc_cd_nm){
		this.asnt_dstc_cd_nm = asnt_dstc_cd_nm;
	}

	public void setPurc_dlco_nm(String purc_dlco_nm){
		this.purc_dlco_nm = purc_dlco_nm;
	}

	public void setPtph_no_000(String ptph_no_000){
		this.ptph_no_000 = ptph_no_000;
	}

	public void setPtph_no_010(String ptph_no_010){
		this.ptph_no_010 = ptph_no_010;
	}

	public void setPtph_no_020(String ptph_no_020){
		this.ptph_no_020 = ptph_no_020;
	}

	public void setMsg(String msg){
		this.msg = msg;
	}

	public String getWh_cd_nm(){
		return this.wh_cd_nm;
	}

	public String getAsnt_dstc_cd_nm(){
		return this.asnt_dstc_cd_nm;
	}

	public String getPurc_dlco_nm(){
		return this.purc_dlco_nm;
	}

	public String getPtph_no_000(){
		return this.ptph_no_000;
	}

	public String getPtph_no_010(){
		return this.ptph_no_010;
	}

	public String getPtph_no_020(){
		return this.ptph_no_020;
	}

	public String getMsg(){
		return this.msg;
	}
}

/* 작성시간 : Fri May 25 18:18:24 KST 2012 */