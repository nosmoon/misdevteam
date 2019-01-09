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


public class IS_SND_1120_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String asnt_dstc_cd_nm;
	public String dlco_nm;
	public String qunt;
	public String send_yn;

	public IS_SND_1120_LCURLIST1Record(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAsnt_dstc_cd_nm(String asnt_dstc_cd_nm){
		this.asnt_dstc_cd_nm = asnt_dstc_cd_nm;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public void setSend_yn(String send_yn){
		this.send_yn = send_yn;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAsnt_dstc_cd_nm(){
		return this.asnt_dstc_cd_nm;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getQunt(){
		return this.qunt;
	}

	public String getSend_yn(){
		return this.send_yn;
	}
}

/* 작성시간 : Mon Dec 24 14:39:11 KST 2012 */