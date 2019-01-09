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


public class HD_INFO_2600_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String cmpy_nm;
	public String rptv_movm_nm;
	public String emp_cnt;
	public String vip_serv_job;
	public String cntr_cnclus_dt;
	public String aply_yymm;
	public String mm_servcost;
	public String one_pers_servcost;
	public String spc_matt;
	public String remk;
	public String seq;
	public String occr_dt;

	public HD_INFO_2600_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setCmpy_nm(String cmpy_nm){
		this.cmpy_nm = cmpy_nm;
	}

	public void setRptv_movm_nm(String rptv_movm_nm){
		this.rptv_movm_nm = rptv_movm_nm;
	}

	public void setEmp_cnt(String emp_cnt){
		this.emp_cnt = emp_cnt;
	}

	public void setVip_serv_job(String vip_serv_job){
		this.vip_serv_job = vip_serv_job;
	}

	public void setCntr_cnclus_dt(String cntr_cnclus_dt){
		this.cntr_cnclus_dt = cntr_cnclus_dt;
	}

	public void setAply_yymm(String aply_yymm){
		this.aply_yymm = aply_yymm;
	}

	public void setMm_servcost(String mm_servcost){
		this.mm_servcost = mm_servcost;
	}

	public void setOne_pers_servcost(String one_pers_servcost){
		this.one_pers_servcost = one_pers_servcost;
	}

	public void setSpc_matt(String spc_matt){
		this.spc_matt = spc_matt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getCmpy_nm(){
		return this.cmpy_nm;
	}

	public String getRptv_movm_nm(){
		return this.rptv_movm_nm;
	}

	public String getEmp_cnt(){
		return this.emp_cnt;
	}

	public String getVip_serv_job(){
		return this.vip_serv_job;
	}

	public String getCntr_cnclus_dt(){
		return this.cntr_cnclus_dt;
	}

	public String getAply_yymm(){
		return this.aply_yymm;
	}

	public String getMm_servcost(){
		return this.mm_servcost;
	}

	public String getOne_pers_servcost(){
		return this.one_pers_servcost;
	}

	public String getSpc_matt(){
		return this.spc_matt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}
}

/* 작성시간 : Tue Aug 25 14:32:45 KST 2009 */