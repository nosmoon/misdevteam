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


package chosun.ciis.is.agr.rec;

import java.sql.*;
import chosun.ciis.is.agr.dm.*;
import chosun.ciis.is.agr.ds.*;

/**
 * 
 */


public class IS_AGR_1030_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String a_dlco_clsf_cd_seq;
	public String a_dlco_abrv_nm;
	public String a_dlco_nm;
	public String a_asnt_dstc_cd;
	public String a_asnt_dstc_cd_nm;
	public String send_qty;

	public IS_AGR_1030_LCURLISTRecord(){}

	public void setA_dlco_clsf_cd_seq(String a_dlco_clsf_cd_seq){
		this.a_dlco_clsf_cd_seq = a_dlco_clsf_cd_seq;
	}

	public void setA_dlco_abrv_nm(String a_dlco_abrv_nm){
		this.a_dlco_abrv_nm = a_dlco_abrv_nm;
	}

	public void setA_dlco_nm(String a_dlco_nm){
		this.a_dlco_nm = a_dlco_nm;
	}

	public void setA_asnt_dstc_cd(String a_asnt_dstc_cd){
		this.a_asnt_dstc_cd = a_asnt_dstc_cd;
	}

	public void setA_asnt_dstc_cd_nm(String a_asnt_dstc_cd_nm){
		this.a_asnt_dstc_cd_nm = a_asnt_dstc_cd_nm;
	}

	public void setSend_qty(String send_qty){
		this.send_qty = send_qty;
	}

	public String getA_dlco_clsf_cd_seq(){
		return this.a_dlco_clsf_cd_seq;
	}

	public String getA_dlco_abrv_nm(){
		return this.a_dlco_abrv_nm;
	}

	public String getA_dlco_nm(){
		return this.a_dlco_nm;
	}

	public String getA_asnt_dstc_cd(){
		return this.a_asnt_dstc_cd;
	}

	public String getA_asnt_dstc_cd_nm(){
		return this.a_asnt_dstc_cd_nm;
	}

	public String getSend_qty(){
		return this.send_qty;
	}
}

/* 작성시간 : Wed Jul 11 21:44:52 KST 2012 */