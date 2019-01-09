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


package chosun.ciis.hd.lvcmpy.rec;

import java.sql.*;
import chosun.ciis.hd.lvcmpy.dm.*;
import chosun.ciis.hd.lvcmpy.ds.*;

/**
 * 
 */


public class HD_LVCMPY_2500_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String incmp_welf_livg_lon_bal;
	public String incmp_welf_livg_lon_int;
	public String jrnst_safe_livg_patr_boks_bal;
	public String jrnst_safe_livg_patr_boks_int;
	public String lvcmpy_amt_etc_dduc_nm;
	public String lvcmpy_amt_etc_dduc;
	public String adv_bal;

	public HD_LVCMPY_2500_LCURLIST1Record(){}

	public void setIncmp_welf_livg_lon_bal(String incmp_welf_livg_lon_bal){
		this.incmp_welf_livg_lon_bal = incmp_welf_livg_lon_bal;
	}

	public void setIncmp_welf_livg_lon_int(String incmp_welf_livg_lon_int){
		this.incmp_welf_livg_lon_int = incmp_welf_livg_lon_int;
	}

	public void setJrnst_safe_livg_patr_boks_bal(String jrnst_safe_livg_patr_boks_bal){
		this.jrnst_safe_livg_patr_boks_bal = jrnst_safe_livg_patr_boks_bal;
	}

	public void setJrnst_safe_livg_patr_boks_int(String jrnst_safe_livg_patr_boks_int){
		this.jrnst_safe_livg_patr_boks_int = jrnst_safe_livg_patr_boks_int;
	}

	public void setLvcmpy_amt_etc_dduc_nm(String lvcmpy_amt_etc_dduc_nm){
		this.lvcmpy_amt_etc_dduc_nm = lvcmpy_amt_etc_dduc_nm;
	}

	public void setLvcmpy_amt_etc_dduc(String lvcmpy_amt_etc_dduc){
		this.lvcmpy_amt_etc_dduc = lvcmpy_amt_etc_dduc;
	}

	public void setAdv_bal(String adv_bal){
		this.adv_bal = adv_bal;
	}

	public String getIncmp_welf_livg_lon_bal(){
		return this.incmp_welf_livg_lon_bal;
	}

	public String getIncmp_welf_livg_lon_int(){
		return this.incmp_welf_livg_lon_int;
	}

	public String getJrnst_safe_livg_patr_boks_bal(){
		return this.jrnst_safe_livg_patr_boks_bal;
	}

	public String getJrnst_safe_livg_patr_boks_int(){
		return this.jrnst_safe_livg_patr_boks_int;
	}

	public String getLvcmpy_amt_etc_dduc_nm(){
		return this.lvcmpy_amt_etc_dduc_nm;
	}

	public String getLvcmpy_amt_etc_dduc(){
		return this.lvcmpy_amt_etc_dduc;
	}

	public String getAdv_bal(){
		return this.adv_bal;
	}
}

/* 작성시간 : Tue Sep 08 15:45:40 KST 2009 */