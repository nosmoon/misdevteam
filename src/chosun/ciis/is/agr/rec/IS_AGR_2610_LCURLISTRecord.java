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


package chosun.ciis.is.agr.rec;

import java.sql.*;
import chosun.ciis.is.agr.dm.*;
import chosun.ciis.is.agr.ds.*;

/**
 * 
 */


public class IS_AGR_2610_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String t_no;
	public String sale_clsf;
	public String spc_sale_clsf;
	public String sale_clsf_nm;
	public String spc_sale_clsf_nm;
	public String suply_amt_cur;
	public String purc_amt_cur;
	public String suply_amt_bef;
	public String purc_amt_bef;

	public IS_AGR_2610_LCURLISTRecord(){}

	public void setT_no(String t_no){
		this.t_no = t_no;
	}

	public void setSale_clsf(String sale_clsf){
		this.sale_clsf = sale_clsf;
	}

	public void setSpc_sale_clsf(String spc_sale_clsf){
		this.spc_sale_clsf = spc_sale_clsf;
	}

	public void setSale_clsf_nm(String sale_clsf_nm){
		this.sale_clsf_nm = sale_clsf_nm;
	}

	public void setSpc_sale_clsf_nm(String spc_sale_clsf_nm){
		this.spc_sale_clsf_nm = spc_sale_clsf_nm;
	}

	public void setSuply_amt_cur(String suply_amt_cur){
		this.suply_amt_cur = suply_amt_cur;
	}

	public void setPurc_amt_cur(String purc_amt_cur){
		this.purc_amt_cur = purc_amt_cur;
	}

	public void setSuply_amt_bef(String suply_amt_bef){
		this.suply_amt_bef = suply_amt_bef;
	}

	public void setPurc_amt_bef(String purc_amt_bef){
		this.purc_amt_bef = purc_amt_bef;
	}

	public String getT_no(){
		return this.t_no;
	}

	public String getSale_clsf(){
		return this.sale_clsf;
	}

	public String getSpc_sale_clsf(){
		return this.spc_sale_clsf;
	}

	public String getSale_clsf_nm(){
		return this.sale_clsf_nm;
	}

	public String getSpc_sale_clsf_nm(){
		return this.spc_sale_clsf_nm;
	}

	public String getSuply_amt_cur(){
		return this.suply_amt_cur;
	}

	public String getPurc_amt_cur(){
		return this.purc_amt_cur;
	}

	public String getSuply_amt_bef(){
		return this.suply_amt_bef;
	}

	public String getPurc_amt_bef(){
		return this.purc_amt_bef;
	}
}

/* 작성시간 : Fri Jun 01 11:54:14 KST 2012 */