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


package chosun.ciis.fc.acct.rec;

import java.sql.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.ds.*;

/**
 * 
 */


public class FC_ACCT_1051_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String check1;
	public String cd;
	public String cdnm;
	public String remk;
	public String cd_abrv_nm;
	public String mang_cd_1;
	public String mang_cd_2;
	public String note_clehous_nm;
	public String use_yn;
	public String mang_cd_3;

	public FC_ACCT_1051_LCURLISTRecord(){}

	public void setCheck1(String check1){
		this.check1 = check1;
	}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setCdnm(String cdnm){
		this.cdnm = cdnm;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setCd_abrv_nm(String cd_abrv_nm){
		this.cd_abrv_nm = cd_abrv_nm;
	}

	public void setMang_cd_1(String mang_cd_1){
		this.mang_cd_1 = mang_cd_1;
	}

	public void setMang_cd_2(String mang_cd_2){
		this.mang_cd_2 = mang_cd_2;
	}

	public void setNote_clehous_nm(String note_clehous_nm){
		this.note_clehous_nm = note_clehous_nm;
	}

	public void setUse_yn(String use_yn){
		this.use_yn = use_yn;
	}

	public void setMang_cd_3(String mang_cd_3){
		this.mang_cd_3 = mang_cd_3;
	}

	public String getCheck1(){
		return this.check1;
	}

	public String getCd(){
		return this.cd;
	}

	public String getCdnm(){
		return this.cdnm;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getCd_abrv_nm(){
		return this.cd_abrv_nm;
	}

	public String getMang_cd_1(){
		return this.mang_cd_1;
	}

	public String getMang_cd_2(){
		return this.mang_cd_2;
	}

	public String getNote_clehous_nm(){
		return this.note_clehous_nm;
	}

	public String getUse_yn(){
		return this.use_yn;
	}

	public String getMang_cd_3(){
		return this.mang_cd_3;
	}
}

/* 작성시간 : Mon Mar 02 09:59:40 KST 2009 */