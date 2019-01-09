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


package chosun.ciis.sp.sal.rec;

import java.sql.*;
import chosun.ciis.sp.sal.dm.*;
import chosun.ciis.sp.sal.ds.*;

/**
 * 
 */


public class SP_SAL_2410_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String bo_cd;
	public String area_nm;
	public String bo_nm;
	public String amt;
	public String req_amt;
	public String dduc_posb_amt;

	public SP_SAL_2410_LCURLIST1Record(){}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setReq_amt(String req_amt){
		this.req_amt = req_amt;
	}

	public void setDduc_posb_amt(String dduc_posb_amt){
		this.dduc_posb_amt = dduc_posb_amt;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getReq_amt(){
		return this.req_amt;
	}

	public String getDduc_posb_amt(){
		return this.dduc_posb_amt;
	}
}

/* 작성시간 : Wed Jul 18 14:34:59 KST 2012 */