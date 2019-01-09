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


public class HD_SALY_1300_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String saly_yy;
	public String saly_no;
	public String dept_cd;
	public String dept_nm;
	public String emp_no;
	public String flnm;
	public String dty_cd;
	public String dty_nm;
	public String posi_cd;
	public String posi_nm;
	public String base_saly;
	public String posk_saly;
	public String real_pay_rgla_saly;
	public String prvmm_mstk_saly;
	public String excp_resn;
	public String proc_stat;
	public String proc_stat_nm;
	public String food_alon;
	public String care_alon;
	public String dty_alon;
	public String posk_alon;
	public String jrnst;
	public String auto_driv_alon;
	public String evngt_saly;

	public HD_SALY_1300_LCURLISTRecord(){}

	public void setSaly_yy(String saly_yy){
		this.saly_yy = saly_yy;
	}

	public void setSaly_no(String saly_no){
		this.saly_no = saly_no;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setBase_saly(String base_saly){
		this.base_saly = base_saly;
	}

	public void setPosk_saly(String posk_saly){
		this.posk_saly = posk_saly;
	}

	public void setReal_pay_rgla_saly(String real_pay_rgla_saly){
		this.real_pay_rgla_saly = real_pay_rgla_saly;
	}

	public void setPrvmm_mstk_saly(String prvmm_mstk_saly){
		this.prvmm_mstk_saly = prvmm_mstk_saly;
	}

	public void setExcp_resn(String excp_resn){
		this.excp_resn = excp_resn;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}

	public void setProc_stat_nm(String proc_stat_nm){
		this.proc_stat_nm = proc_stat_nm;
	}

	public void setFood_alon(String food_alon){
		this.food_alon = food_alon;
	}

	public void setCare_alon(String care_alon){
		this.care_alon = care_alon;
	}

	public void setDty_alon(String dty_alon){
		this.dty_alon = dty_alon;
	}

	public void setPosk_alon(String posk_alon){
		this.posk_alon = posk_alon;
	}

	public void setJrnst(String jrnst){
		this.jrnst = jrnst;
	}

	public void setAuto_driv_alon(String auto_driv_alon){
		this.auto_driv_alon = auto_driv_alon;
	}

	public void setEvngt_saly(String evngt_saly){
		this.evngt_saly = evngt_saly;
	}

	public String getSaly_yy(){
		return this.saly_yy;
	}

	public String getSaly_no(){
		return this.saly_no;
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

	public String getFlnm(){
		return this.flnm;
	}

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getDty_nm(){
		return this.dty_nm;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getBase_saly(){
		return this.base_saly;
	}

	public String getPosk_saly(){
		return this.posk_saly;
	}

	public String getReal_pay_rgla_saly(){
		return this.real_pay_rgla_saly;
	}

	public String getPrvmm_mstk_saly(){
		return this.prvmm_mstk_saly;
	}

	public String getExcp_resn(){
		return this.excp_resn;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}

	public String getProc_stat_nm(){
		return this.proc_stat_nm;
	}

	public String getFood_alon(){
		return this.food_alon;
	}

	public String getCare_alon(){
		return this.care_alon;
	}

	public String getDty_alon(){
		return this.dty_alon;
	}

	public String getPosk_alon(){
		return this.posk_alon;
	}

	public String getJrnst(){
		return this.jrnst;
	}

	public String getAuto_driv_alon(){
		return this.auto_driv_alon;
	}

	public String getEvngt_saly(){
		return this.evngt_saly;
	}
}

/* 작성시간 : Wed Jun 18 13:44:43 KST 2014 */