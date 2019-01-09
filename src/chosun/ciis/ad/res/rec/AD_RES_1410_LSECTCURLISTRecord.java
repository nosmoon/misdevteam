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


package chosun.ciis.ad.res.rec;

import java.sql.*;
import chosun.ciis.ad.res.dm.*;
import chosun.ciis.ad.res.ds.*;

/**
 * 
 */


public class AD_RES_1410_LSECTCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String sect_clas_cd;
	public String sect_nm_cd;
	public String sect_nm;
	public String sect_cd;
	public String max_seq;
	public String edt_clsf_nm;

	public AD_RES_1410_LSECTCURLISTRecord(){}

	public void setSect_clas_cd(String sect_clas_cd){
		this.sect_clas_cd = sect_clas_cd;
	}

	public void setSect_nm_cd(String sect_nm_cd){
		this.sect_nm_cd = sect_nm_cd;
	}

	public void setSect_nm(String sect_nm){
		this.sect_nm = sect_nm;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setMax_seq(String max_seq){
		this.max_seq = max_seq;
	}

	public void setEdt_clsf_nm(String edt_clsf_nm){
		this.edt_clsf_nm = edt_clsf_nm;
	}

	public String getSect_clas_cd(){
		return this.sect_clas_cd;
	}

	public String getSect_nm_cd(){
		return this.sect_nm_cd;
	}

	public String getSect_nm(){
		return this.sect_nm;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getMax_seq(){
		return this.max_seq;
	}

	public String getEdt_clsf_nm(){
		return this.edt_clsf_nm;
	}
}

/* 작성시간 : Thu Aug 03 10:16:30 KST 2017 */