/***************************************************************************************************
* 파일명 : .java
* 기능 :  공통-세금계산서-상태조회(스마트빌)
* 작성일자 : 2010-05-18
* 작성자 : 노상현
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.co.smtb.rec;

import java.sql.*;
import chosun.ciis.co.smtb.dm.*;
import chosun.ciis.co.smtb.ds.*;

/**
 * 공통-세금계산서-상태조회(스마트빌)
 */


public class CO_SMTB_1031_LTAX_STMTLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String conversation_id;
	public String supbuy_type;
	public String direction;
	public String dti_wdate;
	public String blank_cnt;
	public String dti_type;
	public String tax_demand;
	public String seq_id;
	public String sup_com_id;
	public String sup_com_regno;
	public String sup_rep_name;
	public String sup_com_name;
	public String sup_com_type;
	public String sup_com_classify;
	public String sup_com_addr;
	public String sup_bizplace_code;
	public String byr_com_regno;
	public String byr_rep_name;
	public String byr_com_name;
	public String byr_com_type;
	public String byr_com_classify;
	public String byr_com_addr;
	public String byr_tel_num;
	public String byr_email;
	public String sup_amount;
	public String tax_amount;
	public String total_amount;
	public String dtt_yn;
	public String remark;
	public String dti_status;
	public String dti_status_nm;
	public String return_code;
	public String return_description;
	public String sbdescription;
	public String created_by;
	public String creation_date;
	public String last_updated_by;
	public String last_update_date;
	public String amend_code;
	public String amend_code_nm;

	public CO_SMTB_1031_LTAX_STMTLISTRecord(){}

	public void setConversation_id(String conversation_id){
		this.conversation_id = conversation_id;
	}

	public void setSupbuy_type(String supbuy_type){
		this.supbuy_type = supbuy_type;
	}

	public void setDirection(String direction){
		this.direction = direction;
	}

	public void setDti_wdate(String dti_wdate){
		this.dti_wdate = dti_wdate;
	}

	public void setBlank_cnt(String blank_cnt){
		this.blank_cnt = blank_cnt;
	}

	public void setDti_type(String dti_type){
		this.dti_type = dti_type;
	}

	public void setTax_demand(String tax_demand){
		this.tax_demand = tax_demand;
	}

	public void setSeq_id(String seq_id){
		this.seq_id = seq_id;
	}

	public void setSup_com_id(String sup_com_id){
		this.sup_com_id = sup_com_id;
	}

	public void setSup_com_regno(String sup_com_regno){
		this.sup_com_regno = sup_com_regno;
	}

	public void setSup_rep_name(String sup_rep_name){
		this.sup_rep_name = sup_rep_name;
	}

	public void setSup_com_name(String sup_com_name){
		this.sup_com_name = sup_com_name;
	}

	public void setSup_com_type(String sup_com_type){
		this.sup_com_type = sup_com_type;
	}

	public void setSup_com_classify(String sup_com_classify){
		this.sup_com_classify = sup_com_classify;
	}

	public void setSup_com_addr(String sup_com_addr){
		this.sup_com_addr = sup_com_addr;
	}

	public void setSup_bizplace_code(String sup_bizplace_code){
		this.sup_bizplace_code = sup_bizplace_code;
	}

	public void setByr_com_regno(String byr_com_regno){
		this.byr_com_regno = byr_com_regno;
	}

	public void setByr_rep_name(String byr_rep_name){
		this.byr_rep_name = byr_rep_name;
	}

	public void setByr_com_name(String byr_com_name){
		this.byr_com_name = byr_com_name;
	}

	public void setByr_com_type(String byr_com_type){
		this.byr_com_type = byr_com_type;
	}

	public void setByr_com_classify(String byr_com_classify){
		this.byr_com_classify = byr_com_classify;
	}

	public void setByr_com_addr(String byr_com_addr){
		this.byr_com_addr = byr_com_addr;
	}

	public void setByr_tel_num(String byr_tel_num){
		this.byr_tel_num = byr_tel_num;
	}

	public void setByr_email(String byr_email){
		this.byr_email = byr_email;
	}

	public void setSup_amount(String sup_amount){
		this.sup_amount = sup_amount;
	}

	public void setTax_amount(String tax_amount){
		this.tax_amount = tax_amount;
	}

	public void setTotal_amount(String total_amount){
		this.total_amount = total_amount;
	}

	public void setDtt_yn(String dtt_yn){
		this.dtt_yn = dtt_yn;
	}

	public void setRemark(String remark){
		this.remark = remark;
	}

	public void setDti_status(String dti_status){
		this.dti_status = dti_status;
	}

	public void setDti_status_nm(String dti_status_nm){
		this.dti_status_nm = dti_status_nm;
	}

	public void setReturn_code(String return_code){
		this.return_code = return_code;
	}

	public void setReturn_description(String return_description){
		this.return_description = return_description;
	}

	public void setSbdescription(String sbdescription){
		this.sbdescription = sbdescription;
	}

	public void setCreated_by(String created_by){
		this.created_by = created_by;
	}

	public void setCreation_date(String creation_date){
		this.creation_date = creation_date;
	}

	public void setLast_updated_by(String last_updated_by){
		this.last_updated_by = last_updated_by;
	}

	public void setLast_update_date(String last_update_date){
		this.last_update_date = last_update_date;
	}

	public void setAmend_code(String amend_code){
		this.amend_code = amend_code;
	}

	public void setAmend_code_nm(String amend_code_nm){
		this.amend_code_nm = amend_code_nm;
	}

	public String getConversation_id(){
		return this.conversation_id;
	}

	public String getSupbuy_type(){
		return this.supbuy_type;
	}

	public String getDirection(){
		return this.direction;
	}

	public String getDti_wdate(){
		return this.dti_wdate;
	}

	public String getBlank_cnt(){
		return this.blank_cnt;
	}

	public String getDti_type(){
		return this.dti_type;
	}

	public String getTax_demand(){
		return this.tax_demand;
	}

	public String getSeq_id(){
		return this.seq_id;
	}

	public String getSup_com_id(){
		return this.sup_com_id;
	}

	public String getSup_com_regno(){
		return this.sup_com_regno;
	}

	public String getSup_rep_name(){
		return this.sup_rep_name;
	}

	public String getSup_com_name(){
		return this.sup_com_name;
	}

	public String getSup_com_type(){
		return this.sup_com_type;
	}

	public String getSup_com_classify(){
		return this.sup_com_classify;
	}

	public String getSup_com_addr(){
		return this.sup_com_addr;
	}

	public String getSup_bizplace_code(){
		return this.sup_bizplace_code;
	}

	public String getByr_com_regno(){
		return this.byr_com_regno;
	}

	public String getByr_rep_name(){
		return this.byr_rep_name;
	}

	public String getByr_com_name(){
		return this.byr_com_name;
	}

	public String getByr_com_type(){
		return this.byr_com_type;
	}

	public String getByr_com_classify(){
		return this.byr_com_classify;
	}

	public String getByr_com_addr(){
		return this.byr_com_addr;
	}

	public String getByr_tel_num(){
		return this.byr_tel_num;
	}

	public String getByr_email(){
		return this.byr_email;
	}

	public String getSup_amount(){
		return this.sup_amount;
	}

	public String getTax_amount(){
		return this.tax_amount;
	}

	public String getTotal_amount(){
		return this.total_amount;
	}

	public String getDtt_yn(){
		return this.dtt_yn;
	}

	public String getRemark(){
		return this.remark;
	}

	public String getDti_status(){
		return this.dti_status;
	}

	public String getDti_status_nm(){
		return this.dti_status_nm;
	}

	public String getReturn_code(){
		return this.return_code;
	}

	public String getReturn_description(){
		return this.return_description;
	}

	public String getSbdescription(){
		return this.sbdescription;
	}

	public String getCreated_by(){
		return this.created_by;
	}

	public String getCreation_date(){
		return this.creation_date;
	}

	public String getLast_updated_by(){
		return this.last_updated_by;
	}

	public String getLast_update_date(){
		return this.last_update_date;
	}

	public String getAmend_code(){
		return this.amend_code;
	}

	public String getAmend_code_nm(){
		return this.amend_code_nm;
	}
}

/* 작성시간 : Tue May 18 17:41:18 KST 2010 */