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


package chosun.ciis.mt.papord.rec;

import java.sql.*;
import chosun.ciis.mt.papord.dm.*;
import chosun.ciis.mt.papord.ds.*;

/**
 * 
 */


public class MT_PAPORD_4005_LCURLIST_2Record extends java.lang.Object implements java.io.Serializable{

	public String paper_clsf_cd;
	public String fac_clsf;
	public String roll_wgt;
	public String matr_cd;
	public String matr_nm;

	public MT_PAPORD_4005_LCURLIST_2Record(){}

	public void setPaper_clsf_cd(String paper_clsf_cd){
		this.paper_clsf_cd = paper_clsf_cd;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setRoll_wgt(String roll_wgt){
		this.roll_wgt = roll_wgt;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setMatr_nm(String matr_nm){
		this.matr_nm = matr_nm;
	}

	public String getPaper_clsf_cd(){
		return this.paper_clsf_cd;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getRoll_wgt(){
		return this.roll_wgt;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getMatr_nm(){
		return this.matr_nm;
	}
}

/* 작성시간 : Mon Jul 13 11:33:44 KST 2009 */