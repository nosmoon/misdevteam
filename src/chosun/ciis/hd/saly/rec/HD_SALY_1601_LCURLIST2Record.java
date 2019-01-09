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


package chosun.ciis.hd.saly.rec;

import java.sql.*;
import chosun.ciis.hd.saly.dm.*;
import chosun.ciis.hd.saly.ds.*;

/**
 * 
 */


public class HD_SALY_1601_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String saly_yyymm;
	public String base_saly;
	public String posk_saly;
	public String baseposk_saly;
	public String yymm_alon;
	public String holy_alon;
	public String non_regu_alon_stot;
	public String month_saly_sum;

	public HD_SALY_1601_LCURLIST2Record(){}

	public void setSaly_yyymm(String saly_yyymm){
		this.saly_yyymm = saly_yyymm;
	}

	public void setBase_saly(String base_saly){
		this.base_saly = base_saly;
	}

	public void setPosk_saly(String posk_saly){
		this.posk_saly = posk_saly;
	}

	public void setBaseposk_saly(String baseposk_saly){
		this.baseposk_saly = baseposk_saly;
	}

	public void setYymm_alon(String yymm_alon){
		this.yymm_alon = yymm_alon;
	}

	public void setHoly_alon(String holy_alon){
		this.holy_alon = holy_alon;
	}

	public void setNon_regu_alon_stot(String non_regu_alon_stot){
		this.non_regu_alon_stot = non_regu_alon_stot;
	}

	public void setMonth_saly_sum(String month_saly_sum){
		this.month_saly_sum = month_saly_sum;
	}

	public String getSaly_yyymm(){
		return this.saly_yyymm;
	}

	public String getBase_saly(){
		return this.base_saly;
	}

	public String getPosk_saly(){
		return this.posk_saly;
	}

	public String getBaseposk_saly(){
		return this.baseposk_saly;
	}

	public String getYymm_alon(){
		return this.yymm_alon;
	}

	public String getHoly_alon(){
		return this.holy_alon;
	}

	public String getNon_regu_alon_stot(){
		return this.non_regu_alon_stot;
	}

	public String getMonth_saly_sum(){
		return this.month_saly_sum;
	}
}

/* 작성시간 : Mon Nov 30 10:51:59 KST 2009 */