/***************************************************************************************************
* 파일명 :
* 기능 :
* 작성일자 : 2015-10-21
* 작성자 : 장 선 희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sal.rdr.rec;

import java.sql.*;
import chosun.ciis.ss.sal.rdr.dm.*;
import chosun.ciis.ss.sal.rdr.ds.*;

/**
 *
 */


public class SL_MO_S_RDR_INFOSUBSMONTHCURRecord extends java.lang.Object implements java.io.Serializable{

	public String rdr_no;
	public String realmm;
	public String totalmm;
	public String valmm;

	public SL_MO_S_RDR_INFOSUBSMONTHCURRecord(){}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setRealmm(String realmm){
		this.realmm = realmm;
	}

	public void setTotalmm(String totalmm){
		this.totalmm = totalmm;
	}

	public void setValmm(String valmm){
		this.valmm = valmm;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getRealmm(){
		return this.realmm;
	}

	public String getTotalmm(){
		return this.totalmm;
	}

	public String getValmm(){
		return this.valmm;
	}
}

/* 작성시간 : Mon Dec 05 11:41:10 KST 2016 */