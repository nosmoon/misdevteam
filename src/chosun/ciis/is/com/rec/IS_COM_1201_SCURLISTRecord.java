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


package chosun.ciis.is.com.rec;

import java.sql.*;
import chosun.ciis.is.com.dm.*;
import chosun.ciis.is.com.ds.*;

/**
 * 
 */


public class IS_COM_1201_SCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String advcs_cd;
	public String advcs_nm;
	public String indt_cd;
	public String indt_cd_nm;
	public String tel_no;
	public String sms_ptph_no;

	public IS_COM_1201_SCURLISTRecord(){}

	public void setAdvcs_cd(String advcs_cd){
		this.advcs_cd = advcs_cd;
	}

	public void setAdvcs_nm(String advcs_nm){
		this.advcs_nm = advcs_nm;
	}

	public void setIndt_cd(String indt_cd){
		this.indt_cd = indt_cd;
	}

	public void setIndt_cd_nm(String indt_cd_nm){
		this.indt_cd_nm = indt_cd_nm;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setSms_ptph_no(String sms_ptph_no){
		this.sms_ptph_no = sms_ptph_no;
	}

	public String getAdvcs_cd(){
		return this.advcs_cd;
	}

	public String getAdvcs_nm(){
		return this.advcs_nm;
	}

	public String getIndt_cd(){
		return this.indt_cd;
	}

	public String getIndt_cd_nm(){
		return this.indt_cd_nm;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getSms_ptph_no(){
		return this.sms_ptph_no;
	}
}

/* 작성시간 : Thu Jul 26 15:30:37 KST 2012 */