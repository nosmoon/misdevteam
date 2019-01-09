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


package chosun.ciis.mt.papinout.rec;

import java.sql.*;
import chosun.ciis.mt.papinout.dm.*;
import chosun.ciis.mt.papinout.ds.*;

/**
 * 
 */


public class MT_PAPINOUT_2100_LCURLIST5Record extends java.lang.Object implements java.io.Serializable{

	public String cd;
	public String descri;
	public String fac_clsf;
	public String fac_clsf_nm;
	public String clos_yn;
	public String clos_yn_nm;

	public MT_PAPINOUT_2100_LCURLIST5Record(){}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setDescri(String descri){
		this.descri = descri;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setFac_clsf_nm(String fac_clsf_nm){
		this.fac_clsf_nm = fac_clsf_nm;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public void setClos_yn_nm(String clos_yn_nm){
		this.clos_yn_nm = clos_yn_nm;
	}

	public String getCd(){
		return this.cd;
	}

	public String getDescri(){
		return this.descri;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getFac_clsf_nm(){
		return this.fac_clsf_nm;
	}

	public String getClos_yn(){
		return this.clos_yn;
	}

	public String getClos_yn_nm(){
		return this.clos_yn_nm;
	}
}

/* 작성시간 : Mon Jun 22 19:00:22 KST 2009 */