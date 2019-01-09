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


public class MT_COMMATR_1100_LCURLIST_1Record extends java.lang.Object implements java.io.Serializable{

	public String matr_cd;
	public String cd;
	public String cdnm;
	public String cd_abrv_nm;
	public String rela_yn;

	public MT_COMMATR_1100_LCURLIST_1Record(){}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setCdnm(String cdnm){
		this.cdnm = cdnm;
	}

	public void setCd_abrv_nm(String cd_abrv_nm){
		this.cd_abrv_nm = cd_abrv_nm;
	}

	public void setRela_yn(String rela_yn){
		this.rela_yn = rela_yn;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getCd(){
		return this.cd;
	}

	public String getCdnm(){
		return this.cdnm;
	}

	public String getCd_abrv_nm(){
		return this.cd_abrv_nm;
	}

	public String getRela_yn(){
		return this.rela_yn;
	}
}

/* 작성시간 : Tue Feb 10 11:12:22 KST 2009 */