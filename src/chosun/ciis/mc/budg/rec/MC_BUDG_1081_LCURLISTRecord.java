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


package chosun.ciis.mc.budg.rec;

import java.sql.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.ds.*;

/**
 * 
 */


public class MC_BUDG_1081_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String clas_cd1;
	public String clas_cd2;
	public String clas_cd3;
	public String clas_cd4;
	public String clas_nm;
	public String abrv_nm;
	public String budg_cdnm;
	public String dtls_medi_dstb_cd;

	public MC_BUDG_1081_LCURLISTRecord(){}

	public void setClas_cd1(String clas_cd1){
		this.clas_cd1 = clas_cd1;
	}

	public void setClas_cd2(String clas_cd2){
		this.clas_cd2 = clas_cd2;
	}

	public void setClas_cd3(String clas_cd3){
		this.clas_cd3 = clas_cd3;
	}

	public void setClas_cd4(String clas_cd4){
		this.clas_cd4 = clas_cd4;
	}

	public void setClas_nm(String clas_nm){
		this.clas_nm = clas_nm;
	}

	public void setAbrv_nm(String abrv_nm){
		this.abrv_nm = abrv_nm;
	}

	public void setBudg_cdnm(String budg_cdnm){
		this.budg_cdnm = budg_cdnm;
	}

	public void setDtls_medi_dstb_cd(String dtls_medi_dstb_cd){
		this.dtls_medi_dstb_cd = dtls_medi_dstb_cd;
	}

	public String getClas_cd1(){
		return this.clas_cd1;
	}

	public String getClas_cd2(){
		return this.clas_cd2;
	}

	public String getClas_cd3(){
		return this.clas_cd3;
	}

	public String getClas_cd4(){
		return this.clas_cd4;
	}

	public String getClas_nm(){
		return this.clas_nm;
	}

	public String getAbrv_nm(){
		return this.abrv_nm;
	}

	public String getBudg_cdnm(){
		return this.budg_cdnm;
	}

	public String getDtls_medi_dstb_cd(){
		return this.dtls_medi_dstb_cd;
	}
}

/* 작성시간 : Thu Apr 09 16:26:01 KST 2009 */