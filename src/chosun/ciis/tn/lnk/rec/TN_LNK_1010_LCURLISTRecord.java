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


package chosun.ciis.tn.lnk.rec;

import java.sql.*;
import chosun.ciis.tn.lnk.dm.*;
import chosun.ciis.tn.lnk.ds.*;

/**
 * 
 */


public class TN_LNK_1010_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String onl_memb_idx;
	public String onl_memb_cd;
	public String onl_prms_idx;
	public String onl_prms_cd;
	public String onl_pmnt_idx;
	public String onl_pmnt_cd;
	public String name;
	public String tel_no;
	public String req_dt;
	public String regi_dt;
	public String fund_nm;
	public String pmnt_clsf_cd;
	public String prms_amt;
	public String pay_amt;
	public String status;
	public String memb_cd;
	public String prms_cd;
	public String pmnt_cd;
	public String memb_idx;
	public String prms_idx;
	public String pmnt_idx;

	public TN_LNK_1010_LCURLISTRecord(){}

	public void setOnl_memb_idx(String onl_memb_idx){
		this.onl_memb_idx = onl_memb_idx;
	}

	public void setOnl_memb_cd(String onl_memb_cd){
		this.onl_memb_cd = onl_memb_cd;
	}

	public void setOnl_prms_idx(String onl_prms_idx){
		this.onl_prms_idx = onl_prms_idx;
	}

	public void setOnl_prms_cd(String onl_prms_cd){
		this.onl_prms_cd = onl_prms_cd;
	}

	public void setOnl_pmnt_idx(String onl_pmnt_idx){
		this.onl_pmnt_idx = onl_pmnt_idx;
	}

	public void setOnl_pmnt_cd(String onl_pmnt_cd){
		this.onl_pmnt_cd = onl_pmnt_cd;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setReq_dt(String req_dt){
		this.req_dt = req_dt;
	}

	public void setRegi_dt(String regi_dt){
		this.regi_dt = regi_dt;
	}

	public void setFund_nm(String fund_nm){
		this.fund_nm = fund_nm;
	}

	public void setPmnt_clsf_cd(String pmnt_clsf_cd){
		this.pmnt_clsf_cd = pmnt_clsf_cd;
	}

	public void setPrms_amt(String prms_amt){
		this.prms_amt = prms_amt;
	}

	public void setPay_amt(String pay_amt){
		this.pay_amt = pay_amt;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public void setMemb_cd(String memb_cd){
		this.memb_cd = memb_cd;
	}

	public void setPrms_cd(String prms_cd){
		this.prms_cd = prms_cd;
	}

	public void setPmnt_cd(String pmnt_cd){
		this.pmnt_cd = pmnt_cd;
	}

	public void setMemb_idx(String memb_idx){
		this.memb_idx = memb_idx;
	}

	public void setPrms_idx(String prms_idx){
		this.prms_idx = prms_idx;
	}

	public void setPmnt_idx(String pmnt_idx){
		this.pmnt_idx = pmnt_idx;
	}

	public String getOnl_memb_idx(){
		return this.onl_memb_idx;
	}

	public String getOnl_memb_cd(){
		return this.onl_memb_cd;
	}

	public String getOnl_prms_idx(){
		return this.onl_prms_idx;
	}

	public String getOnl_prms_cd(){
		return this.onl_prms_cd;
	}

	public String getOnl_pmnt_idx(){
		return this.onl_pmnt_idx;
	}

	public String getOnl_pmnt_cd(){
		return this.onl_pmnt_cd;
	}

	public String getName(){
		return this.name;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getReq_dt(){
		return this.req_dt;
	}

	public String getRegi_dt(){
		return this.regi_dt;
	}

	public String getFund_nm(){
		return this.fund_nm;
	}

	public String getPmnt_clsf_cd(){
		return this.pmnt_clsf_cd;
	}

	public String getPrms_amt(){
		return this.prms_amt;
	}

	public String getPay_amt(){
		return this.pay_amt;
	}

	public String getStatus(){
		return this.status;
	}

	public String getMemb_cd(){
		return this.memb_cd;
	}

	public String getPrms_cd(){
		return this.prms_cd;
	}

	public String getPmnt_cd(){
		return this.pmnt_cd;
	}

	public String getMemb_idx(){
		return this.memb_idx;
	}

	public String getPrms_idx(){
		return this.prms_idx;
	}

	public String getPmnt_idx(){
		return this.pmnt_idx;
	}
}

/* 작성시간 : Tue Jun 28 19:18:03 KST 2016 */