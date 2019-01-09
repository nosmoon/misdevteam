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


public class HD_INFO_2202_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String emp_no;
	public String occr_dt;
	public String seq;
	public String dept_cd;
	public String dept_nm;
	public String dty_cd;
	public String dty_nm;
	public String posi_cd;
	public String posi_nm;
	public String flnm;
	public String flnm_engl;
	public String flnm_chin;
	public String bi_yymm;
	public String issu_resn;
	public String real_fee_paymt_yn;
	public String real_fee_paymt_amt;
	public String id_card_typ;
	public String issu_dt;
	public String issu_yn;
	public String remk;

	public HD_INFO_2202_LCURLIST2Record(){}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
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

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setFlnm_engl(String flnm_engl){
		this.flnm_engl = flnm_engl;
	}

	public void setFlnm_chin(String flnm_chin){
		this.flnm_chin = flnm_chin;
	}

	public void setBi_yymm(String bi_yymm){
		this.bi_yymm = bi_yymm;
	}

	public void setIssu_resn(String issu_resn){
		this.issu_resn = issu_resn;
	}

	public void setReal_fee_paymt_yn(String real_fee_paymt_yn){
		this.real_fee_paymt_yn = real_fee_paymt_yn;
	}

	public void setReal_fee_paymt_amt(String real_fee_paymt_amt){
		this.real_fee_paymt_amt = real_fee_paymt_amt;
	}

	public void setId_card_typ(String id_card_typ){
		this.id_card_typ = id_card_typ;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setIssu_yn(String issu_yn){
		this.issu_yn = issu_yn;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
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

	public String getFlnm(){
		return this.flnm;
	}

	public String getFlnm_engl(){
		return this.flnm_engl;
	}

	public String getFlnm_chin(){
		return this.flnm_chin;
	}

	public String getBi_yymm(){
		return this.bi_yymm;
	}

	public String getIssu_resn(){
		return this.issu_resn;
	}

	public String getReal_fee_paymt_yn(){
		return this.real_fee_paymt_yn;
	}

	public String getReal_fee_paymt_amt(){
		return this.real_fee_paymt_amt;
	}

	public String getId_card_typ(){
		return this.id_card_typ;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getIssu_yn(){
		return this.issu_yn;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Mon Jun 01 19:42:39 KST 2009 */