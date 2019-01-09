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


package chosun.ciis.as.aset.rec;

import java.sql.*;
import chosun.ciis.as.aset.dm.*;
import chosun.ciis.as.aset.ds.*;

/**
 * 
 */


public class AS_ASET_1305_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String aset_no;
	public String aset_nm;
	public String befo_dept_cd;
	public String befo_loca;
	public String hsty_cnt;
	public String dlco_nm;

	public AS_ASET_1305_LCURLISTRecord(){}

	public void setAset_no(String aset_no){
		this.aset_no = aset_no;
	}

	public void setAset_nm(String aset_nm){
		this.aset_nm = aset_nm;
	}

	public void setBefo_dept_cd(String befo_dept_cd){
		this.befo_dept_cd = befo_dept_cd;
	}

	public void setBefo_loca(String befo_loca){
		this.befo_loca = befo_loca;
	}

	public void setHsty_cnt(String hsty_cnt){
		this.hsty_cnt = hsty_cnt;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}
 
	public String getAset_no(){
		return this.aset_no;
	}

	public String getAset_nm(){
		return this.aset_nm;
	}

	public String getBefo_dept_cd(){
		return this.befo_dept_cd;
	}

	public String getBefo_loca(){
		return this.befo_loca;
	}

	public String getHsty_cnt(){
		return this.hsty_cnt;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}
}

/* 작성시간 : Thu Mar 26 15:31:45 KST 2009 */