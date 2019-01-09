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


package chosun.ciis.hd.evlu.rec;

import java.sql.*;
import chosun.ciis.hd.evlu.dm.*;
import chosun.ciis.hd.evlu.ds.*;

/**
 * 
 */


public class HD_EVLU_3902_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String nm_korn;
	public String dept_cd;
	public String dept_nm;
	public String posi_cd;
	public String posi_nm;
	public String in_cmpy_dt;
	public String evlu_yy;
	public String tms_clsf_name;
	public String evlu_pers1;
	public String evlu_pers2;
	public String evlu_pers_deci_grad_last;
	public String evlu_grp_name;
	public String evlu_frdt;
	public String evlu_todt;
	public String noti_dt;

	public HD_EVLU_3902_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setIn_cmpy_dt(String in_cmpy_dt){
		this.in_cmpy_dt = in_cmpy_dt;
	}

	public void setEvlu_yy(String evlu_yy){
		this.evlu_yy = evlu_yy;
	}

	public void setTms_clsf_name(String tms_clsf_name){
		this.tms_clsf_name = tms_clsf_name;
	}

	public void setEvlu_pers1(String evlu_pers1){
		this.evlu_pers1 = evlu_pers1;
	}

	public void setEvlu_pers2(String evlu_pers2){
		this.evlu_pers2 = evlu_pers2;
	}

	public void setEvlu_pers_deci_grad_last(String evlu_pers_deci_grad_last){
		this.evlu_pers_deci_grad_last = evlu_pers_deci_grad_last;
	}

	public void setEvlu_grp_name(String evlu_grp_name){
		this.evlu_grp_name = evlu_grp_name;
	}

	public void setEvlu_frdt(String evlu_frdt){
		this.evlu_frdt = evlu_frdt;
	}

	public void setEvlu_todt(String evlu_todt){
		this.evlu_todt = evlu_todt;
	}

	public void setNoti_dt(String noti_dt){
		this.noti_dt = noti_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getIn_cmpy_dt(){
		return this.in_cmpy_dt;
	}

	public String getEvlu_yy(){
		return this.evlu_yy;
	}

	public String getTms_clsf_name(){
		return this.tms_clsf_name;
	}

	public String getEvlu_pers1(){
		return this.evlu_pers1;
	}

	public String getEvlu_pers2(){
		return this.evlu_pers2;
	}

	public String getEvlu_pers_deci_grad_last(){
		return this.evlu_pers_deci_grad_last;
	}

	public String getEvlu_grp_name(){
		return this.evlu_grp_name;
	}

	public String getEvlu_frdt(){
		return this.evlu_frdt;
	}

	public String getEvlu_todt(){
		return this.evlu_todt;
	}

	public String getNoti_dt(){
		return this.noti_dt;
	}
}

/* 작성시간 : Fri Jul 26 16:15:31 KST 2013 */