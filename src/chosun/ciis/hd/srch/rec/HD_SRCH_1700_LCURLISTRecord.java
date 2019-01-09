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


public class HD_SRCH_1700_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String up_dept_nm;
	public String dept_nm;
	public String emp_no;
	public String nm_korn;
	public String dty_nm;
	public String posi_nm;
	public String birth_yyyymmdd;
	public String s1;
	public String in_cmpy_dt;
	public String rmsthr;
	public String last_upgrd_dt;
	public String wlrrmq;
	public String in_cmpy_clsf_nm;
	public String open_invit_clsf_nm;
	public String open_invit_desty;
	public String forc_clsi_nm;
	public String cls_nm;
	public String scl_nm;
	public String evlu2;
	public String evlu1;
	public String evlu4;
	public String evlu3;
	public String carr_aprvdds;

	public HD_SRCH_1700_LCURLISTRecord(){}

	public void setUp_dept_nm(String up_dept_nm){
		this.up_dept_nm = up_dept_nm;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setBirth_yyyymmdd(String birth_yyyymmdd){
		this.birth_yyyymmdd = birth_yyyymmdd;
	}

	public void setS1(String s1){
		this.s1 = s1;
	}

	public void setIn_cmpy_dt(String in_cmpy_dt){
		this.in_cmpy_dt = in_cmpy_dt;
	}

	public void setRmsthr(String rmsthr){
		this.rmsthr = rmsthr;
	}

	public void setLast_upgrd_dt(String last_upgrd_dt){
		this.last_upgrd_dt = last_upgrd_dt;
	}

	public void setWlrrmq(String wlrrmq){
		this.wlrrmq = wlrrmq;
	}

	public void setIn_cmpy_clsf_nm(String in_cmpy_clsf_nm){
		this.in_cmpy_clsf_nm = in_cmpy_clsf_nm;
	}

	public void setOpen_invit_clsf_nm(String open_invit_clsf_nm){
		this.open_invit_clsf_nm = open_invit_clsf_nm;
	}

	public void setOpen_invit_desty(String open_invit_desty){
		this.open_invit_desty = open_invit_desty;
	}

	public void setForc_clsi_nm(String forc_clsi_nm){
		this.forc_clsi_nm = forc_clsi_nm;
	}

	public void setCls_nm(String cls_nm){
		this.cls_nm = cls_nm;
	}

	public void setScl_nm(String scl_nm){
		this.scl_nm = scl_nm;
	}

	public void setEvlu2(String evlu2){
		this.evlu2 = evlu2;
	}

	public void setEvlu1(String evlu1){
		this.evlu1 = evlu1;
	}

	public void setEvlu4(String evlu4){
		this.evlu4 = evlu4;
	}

	public void setEvlu3(String evlu3){
		this.evlu3 = evlu3;
	}
	
	public void setCarr_aprvdds(String carr_aprvdds){
		this.carr_aprvdds = carr_aprvdds;
	}

	public String getUp_dept_nm(){
		return this.up_dept_nm;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getDty_nm(){
		return this.dty_nm;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getBirth_yyyymmdd(){
		return this.birth_yyyymmdd;
	}

	public String getS1(){
		return this.s1;
	}

	public String getIn_cmpy_dt(){
		return this.in_cmpy_dt;
	}

	public String getRmsthr(){
		return this.rmsthr;
	}

	public String getLast_upgrd_dt(){
		return this.last_upgrd_dt;
	}

	public String getWlrrmq(){
		return this.wlrrmq;
	}

	public String getIn_cmpy_clsf_nm(){
		return this.in_cmpy_clsf_nm;
	}

	public String getOpen_invit_clsf_nm(){
		return this.open_invit_clsf_nm;
	}

	public String getOpen_invit_desty(){
		return this.open_invit_desty;
	}

	public String getForc_clsi_nm(){
		return this.forc_clsi_nm;
	}

	public String getCls_nm(){
		return this.cls_nm;
	}

	public String getScl_nm(){
		return this.scl_nm;
	}

	public String getEvlu2(){
		return this.evlu2;
	}

	public String getEvlu1(){
		return this.evlu1;
	}

	public String getEvlu4(){
		return this.evlu4;
	}

	public String getEvlu3(){
		return this.evlu3;
	}
	
	public String getCarr_aprvdds(){
		return this.carr_aprvdds;
	}
}

/* 작성시간 : Fri Sep 04 09:56:16 KST 2009 */