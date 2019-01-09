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


package chosun.ciis.hd.saly.rec;

import java.sql.*;
import chosun.ciis.hd.saly.dm.*;
import chosun.ciis.hd.saly.ds.*;

/**
 * 
 */


public class HD_SALY_5005_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String etc_dduc_nm;
	public String etc_dduc_amt;

	public HD_SALY_5005_LCURLISTRecord(){}

	public void setEtc_dduc_nm(String etc_dduc_nm){
		this.etc_dduc_nm = etc_dduc_nm;
	}

	public void setEtc_dduc_amt(String etc_dduc_amt){
		this.etc_dduc_amt = etc_dduc_amt;
	}

	public String getEtc_dduc_nm(){
		return this.etc_dduc_nm;
	}

	public String getEtc_dduc_amt(){
		return this.etc_dduc_amt;
	}
}

/* 작성시간 : Sun Sep 20 15:04:02 KST 2009 */