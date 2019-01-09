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


package chosun.ciis.mt.commatr.rec;

import java.sql.*;
import chosun.ciis.mt.commatr.dm.*;
import chosun.ciis.mt.commatr.ds.*;

/**
 * 
 */


public class MT_COMMATR_3300_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String dlco_no;
	public String seq;
	public String chrg_pers_nm;
	public String chrg_pers_tel_no;
	public String chrg_pers_email;

	public MT_COMMATR_3300_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setChrg_pers_nm(String chrg_pers_nm){
		this.chrg_pers_nm = chrg_pers_nm;
	}

	public void setChrg_pers_tel_no(String chrg_pers_tel_no){
		this.chrg_pers_tel_no = chrg_pers_tel_no;
	}

	public void setChrg_pers_email(String chrg_pers_email){
		this.chrg_pers_email = chrg_pers_email;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getChrg_pers_nm(){
		return this.chrg_pers_nm;
	}

	public String getChrg_pers_tel_no(){
		return this.chrg_pers_tel_no;
	}

	public String getChrg_pers_email(){
		return this.chrg_pers_email;
	}
}

/* 작성시간 : Mon Jul 13 11:42:15 KST 2009 */