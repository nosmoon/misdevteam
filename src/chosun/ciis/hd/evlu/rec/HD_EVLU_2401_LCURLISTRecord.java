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


public class HD_EVLU_2401_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String dept_nm;
	public String emp_no;
	public String nm_korn;
	public String dty_nm;
	public String posi_nm;
	public String evlu_grp_cd;
	public String evlu_grp_nm;
	public String busn_rslt_scor;
	public String spc_psdo_redu_scorcnt;
	public String dept_nm1;
	public String emp_no1;
	public String nm_korn1;
	public String posi_nm1;
	public String dept_nm2;
	public String emp_no2;
	public String nm_korn2;
	public String posi_nm2;
	public String dept_nm3;
	public String emp_no3;
	public String nm_korn3;
	public String posi_nm3;
	public String db_status;
	public String evlu_yy;
	public String tms_clsf;
	public String evlu_dp_scorcnt;

	public HD_EVLU_2401_LCURLISTRecord(){}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
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

	public void setEvlu_grp_cd(String evlu_grp_cd){
		this.evlu_grp_cd = evlu_grp_cd;
	}

	public void setEvlu_grp_nm(String evlu_grp_nm){
		this.evlu_grp_nm = evlu_grp_nm;
	}

	public void setBusn_rslt_scor(String busn_rslt_scor){
		this.busn_rslt_scor = busn_rslt_scor;
	}

	public void setSpc_psdo_redu_scorcnt(String spc_psdo_redu_scorcnt){
		this.spc_psdo_redu_scorcnt = spc_psdo_redu_scorcnt;
	}

	public void setDept_nm1(String dept_nm1){
		this.dept_nm1 = dept_nm1;
	}

	public void setEmp_no1(String emp_no1){
		this.emp_no1 = emp_no1;
	}

	public void setNm_korn1(String nm_korn1){
		this.nm_korn1 = nm_korn1;
	}

	public void setPosi_nm1(String posi_nm1){
		this.posi_nm1 = posi_nm1;
	}

	public void setDept_nm2(String dept_nm2){
		this.dept_nm2 = dept_nm2;
	}

	public void setEmp_no2(String emp_no2){
		this.emp_no2 = emp_no2;
	}

	public void setNm_korn2(String nm_korn2){
		this.nm_korn2 = nm_korn2;
	}

	public void setPosi_nm2(String posi_nm2){
		this.posi_nm2 = posi_nm2;
	}

	public void setDept_nm3(String dept_nm3){
		this.dept_nm3 = dept_nm3;
	}

	public void setEmp_no3(String emp_no3){
		this.emp_no3 = emp_no3;
	}

	public void setNm_korn3(String nm_korn3){
		this.nm_korn3 = nm_korn3;
	}

	public void setPosi_nm3(String posi_nm3){
		this.posi_nm3 = posi_nm3;
	}

	public void setDb_status(String db_status){
		this.db_status = db_status;
	}

	public void setEvlu_yy(String evlu_yy){
		this.evlu_yy = evlu_yy;
	}

	public void setTms_clsf(String tms_clsf){
		this.tms_clsf = tms_clsf;
	}

	public void setEvlu_dp_scorcnt(String evlu_dp_scorcnt){
		this.evlu_dp_scorcnt = evlu_dp_scorcnt;
	}

	public String getDept_cd(){
		return this.dept_cd;
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

	public String getEvlu_grp_cd(){
		return this.evlu_grp_cd;
	}

	public String getEvlu_grp_nm(){
		return this.evlu_grp_nm;
	}

	public String getBusn_rslt_scor(){
		return this.busn_rslt_scor;
	}

	public String getSpc_psdo_redu_scorcnt(){
		return this.spc_psdo_redu_scorcnt;
	}

	public String getDept_nm1(){
		return this.dept_nm1;
	}

	public String getEmp_no1(){
		return this.emp_no1;
	}

	public String getNm_korn1(){
		return this.nm_korn1;
	}

	public String getPosi_nm1(){
		return this.posi_nm1;
	}

	public String getDept_nm2(){
		return this.dept_nm2;
	}

	public String getEmp_no2(){
		return this.emp_no2;
	}

	public String getNm_korn2(){
		return this.nm_korn2;
	}

	public String getPosi_nm2(){
		return this.posi_nm2;
	}

	public String getDept_nm3(){
		return this.dept_nm3;
	}

	public String getEmp_no3(){
		return this.emp_no3;
	}

	public String getNm_korn3(){
		return this.nm_korn3;
	}

	public String getPosi_nm3(){
		return this.posi_nm3;
	}

	public String getDb_status(){
		return this.db_status;
	}

	public String getEvlu_yy(){
		return this.evlu_yy;
	}

	public String getTms_clsf(){
		return this.tms_clsf;
	}

	public String getEvlu_dp_scorcnt(){
		return this.evlu_dp_scorcnt;
	}
}

/* 작성시간 : Mon Aug 08 19:34:44 KST 2016 */