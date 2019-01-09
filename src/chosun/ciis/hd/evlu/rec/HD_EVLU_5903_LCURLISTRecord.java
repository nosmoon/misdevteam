/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
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


public class HD_EVLU_5903_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String evlu_yy;
	public String tms_clsf;
	public String tgt_evlu_pers_emp_no;
	public String evlu_subj_cd;
	public String evlu_subj_nm;
	public String evlu_item_cd;
	public String evlu_item_nm;
	public String viewpoint;
	public String t1_cd;
	public String t1_scor;
	public String t1_chk;
	public String t2_cd;
	public String t2_scor;
	public String t2_chk;
	public String t3_cd;
	public String t3_scor;
	public String t3_chk;
	public String t4_cd;
	public String t4_scor;
	public String t4_chk;
	public String t5_cd;
	public String t5_scor;
	public String t5_chk;
	public String t6_cd;
	public String t6_scor;
	public String t6_chk;
	public String t7_cd;
	public String t7_scor;
	public String t7_chk;
	public String t_opn;

	public HD_EVLU_5903_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEvlu_yy(String evlu_yy){
		this.evlu_yy = evlu_yy;
	}

	public void setTms_clsf(String tms_clsf){
		this.tms_clsf = tms_clsf;
	}

	public void setTgt_evlu_pers_emp_no(String tgt_evlu_pers_emp_no){
		this.tgt_evlu_pers_emp_no = tgt_evlu_pers_emp_no;
	}

	public void setEvlu_subj_cd(String evlu_subj_cd){
		this.evlu_subj_cd = evlu_subj_cd;
	}

	public void setEvlu_subj_nm(String evlu_subj_nm){
		this.evlu_subj_nm = evlu_subj_nm;
	}

	public void setEvlu_item_cd(String evlu_item_cd){
		this.evlu_item_cd = evlu_item_cd;
	}

	public void setEvlu_item_nm(String evlu_item_nm){
		this.evlu_item_nm = evlu_item_nm;
	}

	public void setViewpoint(String viewpoint){
		this.viewpoint = viewpoint;
	}

	public void setT1_cd(String t1_cd){
		this.t1_cd = t1_cd;
	}

	public void setT1_scor(String t1_scor){
		this.t1_scor = t1_scor;
	}

	public void setT1_chk(String t1_chk){
		this.t1_chk = t1_chk;
	}

	public void setT2_cd(String t2_cd){
		this.t2_cd = t2_cd;
	}

	public void setT2_scor(String t2_scor){
		this.t2_scor = t2_scor;
	}

	public void setT2_chk(String t2_chk){
		this.t2_chk = t2_chk;
	}

	public void setT3_cd(String t3_cd){
		this.t3_cd = t3_cd;
	}

	public void setT3_scor(String t3_scor){
		this.t3_scor = t3_scor;
	}

	public void setT3_chk(String t3_chk){
		this.t3_chk = t3_chk;
	}

	public void setT4_cd(String t4_cd){
		this.t4_cd = t4_cd;
	}

	public void setT4_scor(String t4_scor){
		this.t4_scor = t4_scor;
	}

	public void setT4_chk(String t4_chk){
		this.t4_chk = t4_chk;
	}

	public void setT5_cd(String t5_cd){
		this.t5_cd = t5_cd;
	}

	public void setT5_scor(String t5_scor){
		this.t5_scor = t5_scor;
	}

	public void setT5_chk(String t5_chk){
		this.t5_chk = t5_chk;
	}

	public void setT6_cd(String t6_cd){
		this.t6_cd = t6_cd;
	}

	public void setT6_scor(String t6_scor){
		this.t6_scor = t6_scor;
	}

	public void setT6_chk(String t6_chk){
		this.t6_chk = t6_chk;
	}

	public void setT7_cd(String t7_cd){
		this.t7_cd = t7_cd;
	}

	public void setT7_scor(String t7_scor){
		this.t7_scor = t7_scor;
	}

	public void setT7_chk(String t7_chk){
		this.t7_chk = t7_chk;
	}

	public void setT_opn(String t_opn){
		this.t_opn = t_opn;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEvlu_yy(){
		return this.evlu_yy;
	}

	public String getTms_clsf(){
		return this.tms_clsf;
	}

	public String getTgt_evlu_pers_emp_no(){
		return this.tgt_evlu_pers_emp_no;
	}

	public String getEvlu_subj_cd(){
		return this.evlu_subj_cd;
	}

	public String getEvlu_subj_nm(){
		return this.evlu_subj_nm;
	}

	public String getEvlu_item_cd(){
		return this.evlu_item_cd;
	}

	public String getEvlu_item_nm(){
		return this.evlu_item_nm;
	}

	public String getViewpoint(){
		return this.viewpoint;
	}

	public String getT1_cd(){
		return this.t1_cd;
	}

	public String getT1_scor(){
		return this.t1_scor;
	}

	public String getT1_chk(){
		return this.t1_chk;
	}

	public String getT2_cd(){
		return this.t2_cd;
	}

	public String getT2_scor(){
		return this.t2_scor;
	}

	public String getT2_chk(){
		return this.t2_chk;
	}

	public String getT3_cd(){
		return this.t3_cd;
	}

	public String getT3_scor(){
		return this.t3_scor;
	}

	public String getT3_chk(){
		return this.t3_chk;
	}

	public String getT4_cd(){
		return this.t4_cd;
	}

	public String getT4_scor(){
		return this.t4_scor;
	}

	public String getT4_chk(){
		return this.t4_chk;
	}

	public String getT5_cd(){
		return this.t5_cd;
	}

	public String getT5_scor(){
		return this.t5_scor;
	}

	public String getT5_chk(){
		return this.t5_chk;
	}

	public String getT6_cd(){
		return this.t6_cd;
	}

	public String getT6_scor(){
		return this.t6_scor;
	}

	public String getT6_chk(){
		return this.t6_chk;
	}

	public String getT7_cd(){
		return this.t7_cd;
	}

	public String getT7_scor(){
		return this.t7_scor;
	}

	public String getT7_chk(){
		return this.t7_chk;
	}

	public String getT_opn(){
		return this.t_opn;
	}
}

/* 작성시간 : Mon Nov 09 15:39:14 KST 2015 */