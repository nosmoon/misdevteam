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


package chosun.ciis.mt.etccar.rec;

import java.sql.*;
import chosun.ciis.mt.etccar.dm.*;
import chosun.ciis.mt.etccar.ds.*;

/**
 * 
 */


public class MT_ETCCAR_9003_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String drvr_cd;
	public String drvr_nm;
	public String tel_no;

	public MT_ETCCAR_9003_LCURLISTRecord(){}

	public void setDrvr_cd(String drvr_cd){
		this.drvr_cd = drvr_cd;
	}

	public void setDrvr_nm(String drvr_nm){
		this.drvr_nm = drvr_nm;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public String getDrvr_cd(){
		return this.drvr_cd;
	}

	public String getDrvr_nm(){
		return this.drvr_nm;
	}

	public String getTel_no(){
		return this.tel_no;
	}
}

/* 작성시간 : Thu Sep 06 18:03:04 KST 2012 */