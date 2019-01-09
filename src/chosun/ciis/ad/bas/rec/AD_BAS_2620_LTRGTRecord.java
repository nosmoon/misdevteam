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


package chosun.ciis.ad.bas.rec;

import java.sql.*;
import chosun.ciis.ad.bas.dm.*;
import chosun.ciis.ad.bas.ds.*;

/**
 * 
 */


public class AD_BAS_2620_LTRGTRecord extends java.lang.Object implements java.io.Serializable{

	public String team_nm;
	public String part_nm;
	public String pre_trgt_amt;
	public String pre_pubc_amt;
	public String pre_achi_rate;
	public String cur_trgt_amt;
	public String chrg_emp_no;
	public String cur_pubc_amt;
	public String cur_achi_rate;
	public String yy_trgt_amt;
	public String yy_pubc_amt;
	public String yy_achi_rate;
	public String trgt_clsf;
	public String trgt_obj;
	public String trgt_yymm;

	public AD_BAS_2620_LTRGTRecord(){}

	public void setTeam_nm(String team_nm){
		this.team_nm = team_nm;
	}

	public void setPart_nm(String part_nm){
		this.part_nm = part_nm;
	}

	public void setPre_trgt_amt(String pre_trgt_amt){
		this.pre_trgt_amt = pre_trgt_amt;
	}

	public void setPre_pubc_amt(String pre_pubc_amt){
		this.pre_pubc_amt = pre_pubc_amt;
	}

	public void setPre_achi_rate(String pre_achi_rate){
		this.pre_achi_rate = pre_achi_rate;
	}

	public void setCur_trgt_amt(String cur_trgt_amt){
		this.cur_trgt_amt = cur_trgt_amt;
	}

	public void setChrg_emp_no(String chrg_emp_no){
		this.chrg_emp_no = chrg_emp_no;
	}

	public void setCur_pubc_amt(String cur_pubc_amt){
		this.cur_pubc_amt = cur_pubc_amt;
	}

	public void setCur_achi_rate(String cur_achi_rate){
		this.cur_achi_rate = cur_achi_rate;
	}

	public void setYy_trgt_amt(String yy_trgt_amt){
		this.yy_trgt_amt = yy_trgt_amt;
	}

	public void setYy_pubc_amt(String yy_pubc_amt){
		this.yy_pubc_amt = yy_pubc_amt;
	}

	public void setYy_achi_rate(String yy_achi_rate){
		this.yy_achi_rate = yy_achi_rate;
	}

	public void setTrgt_clsf(String trgt_clsf){
		this.trgt_clsf = trgt_clsf;
	}

	public void setTrgt_obj(String trgt_obj){
		this.trgt_obj = trgt_obj;
	}

	public void setTrgt_yymm(String trgt_yymm){
		this.trgt_yymm = trgt_yymm;
	}

	public String getTeam_nm(){
		return this.team_nm;
	}

	public String getPart_nm(){
		return this.part_nm;
	}

	public String getPre_trgt_amt(){
		return this.pre_trgt_amt;
	}

	public String getPre_pubc_amt(){
		return this.pre_pubc_amt;
	}

	public String getPre_achi_rate(){
		return this.pre_achi_rate;
	}

	public String getCur_trgt_amt(){
		return this.cur_trgt_amt;
	}

	public String getChrg_emp_no(){
		return this.chrg_emp_no;
	}

	public String getCur_pubc_amt(){
		return this.cur_pubc_amt;
	}

	public String getCur_achi_rate(){
		return this.cur_achi_rate;
	}

	public String getYy_trgt_amt(){
		return this.yy_trgt_amt;
	}

	public String getYy_pubc_amt(){
		return this.yy_pubc_amt;
	}

	public String getYy_achi_rate(){
		return this.yy_achi_rate;
	}

	public String getTrgt_clsf(){
		return this.trgt_clsf;
	}

	public String getTrgt_obj(){
		return this.trgt_obj;
	}

	public String getTrgt_yymm(){
		return this.trgt_yymm;
	}
}

/* 작성시간 : Tue Aug 25 12:23:19 KST 2009 */