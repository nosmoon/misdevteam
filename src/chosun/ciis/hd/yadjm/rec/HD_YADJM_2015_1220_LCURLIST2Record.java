/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.yadjm.rec;

import java.sql.*;
import chosun.ciis.hd.yadjm.dm.*;
import chosun.ciis.hd.yadjm.ds.*;

/**
 * 
 */


public class HD_YADJM_2015_1220_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String limit_hosp_amt;
	public String limit_crdt_amt;
	public String sum_tot_saly_amt;
	public String pre_calc_labr_incm_amt;

	public HD_YADJM_2015_1220_LCURLIST2Record(){}

	public void setLimit_hosp_amt(String limit_hosp_amt){
		this.limit_hosp_amt = limit_hosp_amt;
	}

	public void setLimit_crdt_amt(String limit_crdt_amt){
		this.limit_crdt_amt = limit_crdt_amt;
	}

	public void setSum_tot_saly_amt(String sum_tot_saly_amt){
		this.sum_tot_saly_amt = sum_tot_saly_amt;
	}

	public void setPre_calc_labr_incm_amt(String pre_calc_labr_incm_amt){
		this.pre_calc_labr_incm_amt = pre_calc_labr_incm_amt;
	}

	public String getLimit_hosp_amt(){
		return this.limit_hosp_amt;
	}

	public String getLimit_crdt_amt(){
		return this.limit_crdt_amt;
	}

	public String getSum_tot_saly_amt(){
		return this.sum_tot_saly_amt;
	}

	public String getPre_calc_labr_incm_amt(){
		return this.pre_calc_labr_incm_amt;
	}
}

/* 작성시간 : Fri Jan 15 10:37:28 KST 2016 */