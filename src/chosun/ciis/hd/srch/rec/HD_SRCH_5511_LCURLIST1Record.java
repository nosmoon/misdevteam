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


public class HD_SRCH_5511_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String yymm;
	public String human_resour_1;
	public String human_resour_2;
	public String tot_nops_cnt;
	public String emp_clsf_30_cnt;
	public String emp_ratio;
	public String emp_fml_cnt;

	public HD_SRCH_5511_LCURLIST1Record(){}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setHuman_resour_1(String human_resour_1){
		this.human_resour_1 = human_resour_1;
	}

	public void setHuman_resour_2(String human_resour_2){
		this.human_resour_2 = human_resour_2;
	}

	public void setTot_nops_cnt(String tot_nops_cnt){
		this.tot_nops_cnt = tot_nops_cnt;
	}

	public void setEmp_clsf_30_cnt(String emp_clsf_30_cnt){
		this.emp_clsf_30_cnt = emp_clsf_30_cnt;
	}

	public void setEmp_ratio(String emp_ratio){
		this.emp_ratio = emp_ratio;
	}

	public void setEmp_fml_cnt(String emp_fml_cnt){
		this.emp_fml_cnt = emp_fml_cnt;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getHuman_resour_1(){
		return this.human_resour_1;
	}

	public String getHuman_resour_2(){
		return this.human_resour_2;
	}

	public String getTot_nops_cnt(){
		return this.tot_nops_cnt;
	}

	public String getEmp_clsf_30_cnt(){
		return this.emp_clsf_30_cnt;
	}

	public String getEmp_ratio(){
		return this.emp_ratio;
	}

	public String getEmp_fml_cnt(){
		return this.emp_fml_cnt;
	}
}

/* 작성시간 : Mon Nov 05 16:58:51 KST 2018 */