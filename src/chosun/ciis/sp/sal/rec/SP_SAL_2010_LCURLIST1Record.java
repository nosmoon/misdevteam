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


public class SP_SAL_2010_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String dlco_no;
	public String dlco_nm;
	public String area_cd;
	public String qunt;
	public String sale_cost;
	public String sale_amt;

	public SP_SAL_2010_LCURLIST1Record(){}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public void setSale_cost(String sale_cost){
		this.sale_cost = sale_cost;
	}

	public void setSale_amt(String sale_amt){
		this.sale_amt = sale_amt;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getQunt(){
		return this.qunt;
	}

	public String getSale_cost(){
		return this.sale_cost;
	}

	public String getSale_amt(){
		return this.sale_amt;
	}
}

/* 작성시간 : Tue Jul 17 10:18:21 KST 2012 */