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


public class SP_SAL_1010_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String dlco_no;
	public String dlco_nm;
	public String rcpm_clsf1;
	public String sale_amt1;
	public String rcpm_clsf2;
	public String sale_amt2;
	public String sale_amt3;
	public String sale_amt4;

	public SP_SAL_1010_LCURLIST1Record(){}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setRcpm_clsf1(String rcpm_clsf1){
		this.rcpm_clsf1 = rcpm_clsf1;
	}

	public void setSale_amt1(String sale_amt1){
		this.sale_amt1 = sale_amt1;
	}

	public void setRcpm_clsf2(String rcpm_clsf2){
		this.rcpm_clsf2 = rcpm_clsf2;
	}

	public void setSale_amt2(String sale_amt2){
		this.sale_amt2 = sale_amt2;
	}

	public void setSale_amt3(String sale_amt3){
		this.sale_amt3 = sale_amt3;
	}

	public void setSale_amt4(String sale_amt4){
		this.sale_amt4 = sale_amt4;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getRcpm_clsf1(){
		return this.rcpm_clsf1;
	}

	public String getSale_amt1(){
		return this.sale_amt1;
	}

	public String getRcpm_clsf2(){
		return this.rcpm_clsf2;
	}

	public String getSale_amt2(){
		return this.sale_amt2;
	}

	public String getSale_amt3(){
		return this.sale_amt3;
	}

	public String getSale_amt4(){
		return this.sale_amt4;
	}
}

/* 작성시간 : Wed Jul 18 19:47:14 KST 2012 */