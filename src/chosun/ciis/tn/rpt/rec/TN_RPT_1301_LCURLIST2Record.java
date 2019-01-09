/***************************************************************************************************
* 파일명 : .java
* 기능 :  모금보고 - 일일보고현황
* 작성일자 : 2015.10.01
* 작성자   : 노상현
***************************************************************************************************/


package chosun.ciis.tn.rpt.rec;

import java.sql.*;
import chosun.ciis.tn.rpt.dm.*;
import chosun.ciis.tn.rpt.ds.*;

/**
 * 모금보고 - 일일보고현황
 */

public class TN_RPT_1301_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String clos_clsf2;
	public String clos_clsf2_nm;
	public String clos_clsf3;
	public String clos_clsf3_nm;
	public String yes_cnt;
	public String yes_amt;
	public String to_cnt;
	public String to_amt;
	public String diff_cnt;
	public String diff_amt;
	public String remk;

	public TN_RPT_1301_LCURLIST2Record(){}

	public void setClos_clsf2(String clos_clsf2){
		this.clos_clsf2 = clos_clsf2;
	}

	public void setClos_clsf2_nm(String clos_clsf2_nm){
		this.clos_clsf2_nm = clos_clsf2_nm;
	}

	public void setClos_clsf3(String clos_clsf3){
		this.clos_clsf3 = clos_clsf3;
	}

	public void setClos_clsf3_nm(String clos_clsf3_nm){
		this.clos_clsf3_nm = clos_clsf3_nm;
	}

	public void setYes_cnt(String yes_cnt){
		this.yes_cnt = yes_cnt;
	}

	public void setYes_amt(String yes_amt){
		this.yes_amt = yes_amt;
	}

	public void setTo_cnt(String to_cnt){
		this.to_cnt = to_cnt;
	}

	public void setTo_amt(String to_amt){
		this.to_amt = to_amt;
	}

	public void setDiff_cnt(String diff_cnt){
		this.diff_cnt = diff_cnt;
	}

	public void setDiff_amt(String diff_amt){
		this.diff_amt = diff_amt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getClos_clsf2(){
		return this.clos_clsf2;
	}

	public String getClos_clsf2_nm(){
		return this.clos_clsf2_nm;
	}

	public String getClos_clsf3(){
		return this.clos_clsf3;
	}

	public String getClos_clsf3_nm(){
		return this.clos_clsf3_nm;
	}

	public String getYes_cnt(){
		return this.yes_cnt;
	}

	public String getYes_amt(){
		return this.yes_amt;
	}

	public String getTo_cnt(){
		return this.to_cnt;
	}

	public String getTo_amt(){
		return this.to_amt;
	}

	public String getDiff_cnt(){
		return this.diff_cnt;
	}

	public String getDiff_amt(){
		return this.diff_amt;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Fri Oct 21 11:20:45 KST 2016 */