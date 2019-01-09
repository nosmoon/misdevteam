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


package chosun.ciis.mt.submatrout.rec;

import java.sql.*;
import chosun.ciis.mt.submatrout.dm.*;
import chosun.ciis.mt.submatrout.ds.*;

/**
 * 
 */


public class MT_SUBMATROUT_1500_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String owh_dt;
	public String fac_clsf;
	public String fac_clsf_nm;
	public String owh_num_shet;

	public MT_SUBMATROUT_1500_LCURLIST2Record(){}

	public void setOwh_dt(String owh_dt){
		this.owh_dt = owh_dt;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setFac_clsf_nm(String fac_clsf_nm){
		this.fac_clsf_nm = fac_clsf_nm;
	}

	public void setOwh_num_shet(String owh_num_shet){
		this.owh_num_shet = owh_num_shet;
	}

	public String getOwh_dt(){
		return this.owh_dt;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getFac_clsf_nm(){
		return this.fac_clsf_nm;
	}

	public String getOwh_num_shet(){
		return this.owh_num_shet;
	}
}

/* 작성시간 : Tue Oct 06 18:33:37 KST 2009 */