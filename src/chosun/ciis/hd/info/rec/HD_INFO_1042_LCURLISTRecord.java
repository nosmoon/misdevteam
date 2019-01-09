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


package chosun.ciis.hd.info.rec;

import java.sql.*;
import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.ds.*;

/**
 * 
 */


public class HD_INFO_1042_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String army_clsf_cd;
	public String forc_clsi_cd;
	public String army_svc_cd;
	public String cmmd_army_part_cd;
	public String cmmd_army_part_nm;
	public String sold_main_spc_cd;
	public String sold_main_spc_nm;
	public String army_cd;
	public String crps_spc_cd;
	public String cls_cd;
	public String forc_no;
	public String in_army_dt;
	public String out_army_dt;
	public String out_army_clsf_cd;
	public String army_un_finsh_resn_cd;
	public String rsv_forc_form_cd;
	public String rsv_forc_form_dt;

	public HD_INFO_1042_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setArmy_clsf_cd(String army_clsf_cd){
		this.army_clsf_cd = army_clsf_cd;
	}

	public void setForc_clsi_cd(String forc_clsi_cd){
		this.forc_clsi_cd = forc_clsi_cd;
	}

	public void setArmy_svc_cd(String army_svc_cd){
		this.army_svc_cd = army_svc_cd;
	}

	public void setCmmd_army_part_cd(String cmmd_army_part_cd){
		this.cmmd_army_part_cd = cmmd_army_part_cd;
	}

	public void setCmmd_army_part_nm(String cmmd_army_part_nm){
		this.cmmd_army_part_nm = cmmd_army_part_nm;
	}

	public void setSold_main_spc_cd(String sold_main_spc_cd){
		this.sold_main_spc_cd = sold_main_spc_cd;
	}

	public void setSold_main_spc_nm(String sold_main_spc_nm){
		this.sold_main_spc_nm = sold_main_spc_nm;
	}
	
	public void setArmy_cd(String army_cd){
		this.army_cd = army_cd;
	}

	public void setCrps_spc_cd(String crps_spc_cd){
		this.crps_spc_cd = crps_spc_cd;
	}

	public void setCls_cd(String cls_cd){
		this.cls_cd = cls_cd;
	}

	public void setForc_no(String forc_no){
		this.forc_no = forc_no;
	}

	public void setIn_army_dt(String in_army_dt){
		this.in_army_dt = in_army_dt;
	}

	public void setOut_army_dt(String out_army_dt){
		this.out_army_dt = out_army_dt;
	}

	public void setOut_army_clsf_cd(String out_army_clsf_cd){
		this.out_army_clsf_cd = out_army_clsf_cd;
	}

	public void setArmy_un_finsh_resn_cd(String army_un_finsh_resn_cd){
		this.army_un_finsh_resn_cd = army_un_finsh_resn_cd;
	}

	public void setRsv_forc_form_cd(String rsv_forc_form_cd){
		this.rsv_forc_form_cd = rsv_forc_form_cd;
	}

	public void setRsv_forc_form_dt(String rsv_forc_form_dt){
		this.rsv_forc_form_dt = rsv_forc_form_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getArmy_clsf_cd(){
		return this.army_clsf_cd;
	}

	public String getForc_clsi_cd(){
		return this.forc_clsi_cd;
	}

	public String getArmy_svc_cd(){
		return this.army_svc_cd;
	}

	public String getCmmd_army_part_cd(){
		return this.cmmd_army_part_cd;
	}

	public String getCmmd_army_part_nm(){
		return this.cmmd_army_part_nm;
	}

	public String getSold_main_spc_cd(){
		return this.sold_main_spc_cd;
	}

	public String getSold_main_spc_nm(){
		return this.sold_main_spc_nm;
	}
	
	public String getArmy_cd(){
		return this.army_cd;
	}

	public String getCrps_spc_cd(){
		return this.crps_spc_cd;
	}

	public String getCls_cd(){
		return this.cls_cd;
	}

	public String getForc_no(){
		return this.forc_no;
	}

	public String getIn_army_dt(){
		return this.in_army_dt;
	}

	public String getOut_army_dt(){
		return this.out_army_dt;
	}

	public String getOut_army_clsf_cd(){
		return this.out_army_clsf_cd;
	}

	public String getArmy_un_finsh_resn_cd(){
		return this.army_un_finsh_resn_cd;
	}

	public String getRsv_forc_form_cd(){
		return this.rsv_forc_form_cd;
	}

	public String getRsv_forc_form_dt(){
		return this.rsv_forc_form_dt;
	}
}

/* 작성시간 : Fri Feb 13 13:22:11 KST 2009 */