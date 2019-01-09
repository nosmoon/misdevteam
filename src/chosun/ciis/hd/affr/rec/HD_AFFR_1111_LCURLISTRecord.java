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


package chosun.ciis.hd.affr.rec;

import java.sql.*;
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.ds.*;

/**
 * 
 */


public class HD_AFFR_1111_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String proc_stat_nm;
	public String remk;
	public String remk_adm;
	public String real_preng_condo_nm;
	public String preng_condo_nm_1;
	public String preng_condo_nm_2;
	public String preng_no;
	public String use_frdt;
	public String use_todt;
	public String cmpy_sply_use_yn;
	public String use_dds;
	public String guest_room_cnt;
	public String ptph_no;
	public String tel_no;
	public String email_addr;
	public String use_pay_amt;
	public String slf_burd_amt;
	public String cmpy_sply_amt;
	public String slf_drbk_amt;
	public String guest_room_fee_tot_amt;

	public HD_AFFR_1111_LCURLISTRecord(){}

	public void setProc_stat_nm(String proc_stat_nm){
		this.proc_stat_nm = proc_stat_nm;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setRemk_adm(String remk_adm){
		this.remk_adm = remk_adm;
	}

	public void setReal_preng_condo_nm(String real_preng_condo_nm){
		this.real_preng_condo_nm = real_preng_condo_nm;
	}

	public void setPreng_condo_nm_1(String preng_condo_nm_1){
		this.preng_condo_nm_1 = preng_condo_nm_1;
	}

	public void setPreng_condo_nm_2(String preng_condo_nm_2){
		this.preng_condo_nm_2 = preng_condo_nm_2;
	}

	public void setPreng_no(String preng_no){
		this.preng_no = preng_no;
	}

	public void setUse_frdt(String use_frdt){
		this.use_frdt = use_frdt;
	}

	public void setUse_todt(String use_todt){
		this.use_todt = use_todt;
	}

	public void setCmpy_sply_use_yn(String cmpy_sply_use_yn){
		this.cmpy_sply_use_yn = cmpy_sply_use_yn;
	}

	public void setUse_dds(String use_dds){
		this.use_dds = use_dds;
	}

	public void setGuest_room_cnt(String guest_room_cnt){
		this.guest_room_cnt = guest_room_cnt;
	}

	public void setPtph_no(String ptph_no){
		this.ptph_no = ptph_no;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setEmail_addr(String email_addr){
		this.email_addr = email_addr;
	}

	public void setUse_pay_amt(String use_pay_amt){
		this.use_pay_amt = use_pay_amt;
	}

	public void setSlf_burd_amt(String slf_burd_amt){
		this.slf_burd_amt = slf_burd_amt;
	}

	public void setCmpy_sply_amt(String cmpy_sply_amt){
		this.cmpy_sply_amt = cmpy_sply_amt;
	}

	public void setSlf_drbk_amt(String slf_drbk_amt){
		this.slf_drbk_amt = slf_drbk_amt;
	}

	public void setGuest_room_fee_tot_amt(String guest_room_fee_tot_amt){
		this.guest_room_fee_tot_amt = guest_room_fee_tot_amt;
	}

	public String getProc_stat_nm(){
		return this.proc_stat_nm;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getRemk_adm(){
		return this.remk_adm;
	}

	public String getReal_preng_condo_nm(){
		return this.real_preng_condo_nm;
	}

	public String getPreng_condo_nm_1(){
		return this.preng_condo_nm_1;
	}

	public String getPreng_condo_nm_2(){
		return this.preng_condo_nm_2;
	}

	public String getPreng_no(){
		return this.preng_no;
	}

	public String getUse_frdt(){
		return this.use_frdt;
	}

	public String getUse_todt(){
		return this.use_todt;
	}

	public String getCmpy_sply_use_yn(){
		return this.cmpy_sply_use_yn;
	}

	public String getUse_dds(){
		return this.use_dds;
	}

	public String getGuest_room_cnt(){
		return this.guest_room_cnt;
	}

	public String getPtph_no(){
		return this.ptph_no;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getEmail_addr(){
		return this.email_addr;
	}

	public String getUse_pay_amt(){
		return this.use_pay_amt;
	}

	public String getSlf_burd_amt(){
		return this.slf_burd_amt;
	}

	public String getCmpy_sply_amt(){
		return this.cmpy_sply_amt;
	}

	public String getSlf_drbk_amt(){
		return this.slf_drbk_amt;
	}

	public String getGuest_room_fee_tot_amt(){
		return this.guest_room_fee_tot_amt;
	}
}

/* 작성시간 : Wed Dec 23 15:20:04 KST 2009 */