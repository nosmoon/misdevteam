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


public class IS_AGR_2320_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String t_no;
	public String chrg_pers;
	public String suply_amt;
	public String s_purc_amt;
	public String prft_amt;
	public String prft_rate;

	public IS_AGR_2320_LCURLISTRecord(){}

	public void setT_no(String t_no){
		this.t_no = t_no;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
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

	public String getChrg_pers(){
		return this.chrg_pers;
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

/* 작성시간 : Tue May 29 11:45:20 KST 2012 */