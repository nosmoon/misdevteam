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


package chosun.ciis.mt.prnpap.rec;

import java.sql.*;
import chosun.ciis.mt.prnpap.dm.*;
import chosun.ciis.mt.prnpap.ds.*;

/**
 * 
 */


public class MT_PRNPAP_3006_LCURLIST3Record extends java.lang.Object implements java.io.Serializable{

	public String paper_clsf_cd;
	public String matr_cd;
	public String roll_wgt;

	public MT_PRNPAP_3006_LCURLIST3Record(){}

	public void setPaper_clsf_cd(String paper_clsf_cd){
		this.paper_clsf_cd = paper_clsf_cd;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setRoll_wgt(String roll_wgt){
		this.roll_wgt = roll_wgt;
	}

	public String getPaper_clsf_cd(){
		return this.paper_clsf_cd;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getRoll_wgt(){
		return this.roll_wgt;
	}
}

/* 작성시간 : Sat Aug 29 21:52:44 KST 2009 */