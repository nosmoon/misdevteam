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


public class IS_AGR_2330_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String t_no;
	public String scat_mm;
	public String dept_cd_nm;
	public String sub_dept_cd_nm;
	public String sale_clsf_nm;
	public String suply_amt;
	public String s_purc_amt;
	public String prft_amt;
	public String prft_rate;

	public IS_AGR_2330_LCURLISTRecord(){}

	public void setT_no(String t_no){
		this.t_no = t_no;
	}

	public void setScat_mm(String scat_mm){
		this.scat_mm = scat_mm;
	}

	public void setDept_cd_nm(String dept_cd_nm){
		this.dept_cd_nm = dept_cd_nm;
	}

	public void setSub_dept_cd_nm(String sub_dept_cd_nm){
		this.sub_dept_cd_nm = sub_dept_cd_nm;
	}

	public void setSale_clsf_nm(String sale_clsf_nm){
		this.sale_clsf_nm = sale_clsf_nm;
	}

	public void setSuply_amt(String suply_amt){
		this.suply_amt = suply_amt;
	}

	public void setS_purc_amt(String s_purc_amt){
		this.s_purc_amt = s_purc_amt;
	}

	public void setPrft_amt(String prft_amt){
		this.prft_amt = prft_amt;
	}

	public void setPrft_rate(String prft_rate){
		this.prft_rate = prft_rate;
	}

	public String getT_no(){
		return this.t_no;
	}

	public String getScat_mm(){
		return this.scat_mm;
	}

	public String getDept_cd_nm(){
		return this.dept_cd_nm;
	}

	public String getSub_dept_cd_nm(){
		return this.sub_dept_cd_nm;
	}

	public String getSale_clsf_nm(){
		return this.sale_clsf_nm;
	}

	public String getSuply_amt(){
		return this.suply_amt;
	}

	public String getS_purc_amt(){
		return this.s_purc_amt;
	}

	public String getPrft_amt(){
		return this.prft_amt;
	}

	public String getPrft_rate(){
		return this.prft_rate;
	}
}

/* 작성시간 : Tue May 29 13:03:13 KST 2012 */