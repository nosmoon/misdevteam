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


package chosun.ciis.hd.srch.rec;

import java.sql.*;
import chosun.ciis.hd.srch.dm.*;
import chosun.ciis.hd.srch.ds.*;

/**
 * 
 */


public class HD_SRCH_5531_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String posk_gbn;
	public String m_cnt;
	public String m_avg_saly;
	public String m_sum_saly;
	public String w_cnt;
	public String w_avg_saly;
	public String w_sum_saly;
	public String tot_cnt;
	public String tot_avg_saly;
	public String tot_sum_saly;

	public HD_SRCH_5531_LCURLIST1Record(){}

	public void setPosk_gbn(String posk_gbn){
		this.posk_gbn = posk_gbn;
	}

	public void setM_cnt(String m_cnt){
		this.m_cnt = m_cnt;
	}

	public void setM_avg_saly(String m_avg_saly){
		this.m_avg_saly = m_avg_saly;
	}

	public void setM_sum_saly(String m_sum_saly){
		this.m_sum_saly = m_sum_saly;
	}

	public void setW_cnt(String w_cnt){
		this.w_cnt = w_cnt;
	}

	public void setW_avg_saly(String w_avg_saly){
		this.w_avg_saly = w_avg_saly;
	}

	public void setW_sum_saly(String w_sum_saly){
		this.w_sum_saly = w_sum_saly;
	}

	public void setTot_cnt(String tot_cnt){
		this.tot_cnt = tot_cnt;
	}

	public void setTot_avg_saly(String tot_avg_saly){
		this.tot_avg_saly = tot_avg_saly;
	}

	public void setTot_sum_saly(String tot_sum_saly){
		this.tot_sum_saly = tot_sum_saly;
	}

	public String getPosk_gbn(){
		return this.posk_gbn;
	}

	public String getM_cnt(){
		return this.m_cnt;
	}

	public String getM_avg_saly(){
		return this.m_avg_saly;
	}

	public String getM_sum_saly(){
		return this.m_sum_saly;
	}

	public String getW_cnt(){
		return this.w_cnt;
	}

	public String getW_avg_saly(){
		return this.w_avg_saly;
	}

	public String getW_sum_saly(){
		return this.w_sum_saly;
	}

	public String getTot_cnt(){
		return this.tot_cnt;
	}

	public String getTot_avg_saly(){
		return this.tot_avg_saly;
	}

	public String getTot_sum_saly(){
		return this.tot_sum_saly;
	}
}

/* 작성시간 : Mon Nov 19 11:44:27 KST 2018 */