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


package chosun.ciis.hd.yadjm.rec;

import java.sql.*;
import chosun.ciis.hd.yadjm.dm.*;
import chosun.ciis.hd.yadjm.ds.*;

/**
 * 
 */


public class HD_YADJM_1101_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String tot_saly_sctn_1;
	public String tot_saly_sctn_2;
	public String labr_incm_add_amt;
	public String labr_incm_dedu_amt;
	public String labr_incm_dduc_rate;
	public String seq;

	public HD_YADJM_1101_LCURLIST1Record(){}

	public void setTot_saly_sctn_1(String tot_saly_sctn_1){
		this.tot_saly_sctn_1 = tot_saly_sctn_1;
	}

	public void setTot_saly_sctn_2(String tot_saly_sctn_2){
		this.tot_saly_sctn_2 = tot_saly_sctn_2;
	}

	public void setLabr_incm_add_amt(String labr_incm_add_amt){
		this.labr_incm_add_amt = labr_incm_add_amt;
	}

	public void setLabr_incm_dedu_amt(String labr_incm_dedu_amt){
		this.labr_incm_dedu_amt = labr_incm_dedu_amt;
	}

	public void setLabr_incm_dduc_rate(String labr_incm_dduc_rate){
		this.labr_incm_dduc_rate = labr_incm_dduc_rate;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public String getTot_saly_sctn_1(){
		return this.tot_saly_sctn_1;
	}

	public String getTot_saly_sctn_2(){
		return this.tot_saly_sctn_2;
	}

	public String getLabr_incm_add_amt(){
		return this.labr_incm_add_amt;
	}

	public String getLabr_incm_dedu_amt(){
		return this.labr_incm_dedu_amt;
	}

	public String getLabr_incm_dduc_rate(){
		return this.labr_incm_dduc_rate;
	}

	public String getSeq(){
		return this.seq;
	}
}

/* 작성시간 : Wed Aug 19 10:22:51 KST 2009 */