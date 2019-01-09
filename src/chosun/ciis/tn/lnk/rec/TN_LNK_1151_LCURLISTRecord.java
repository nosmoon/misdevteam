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


public class TN_LNK_1151_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String seq;
	public String inpt_type;
	public String name;
	public String fund_idx;
	public String suprt_idx;
	public String memb_cd;
	public String prms_cd;
	public String prms_amt;
	public String pay_dt;
	public String pay_amt;
	public String status;
	public String memo;
	public String memberidx;
	public String promiseidx;

	public TN_LNK_1151_LCURLISTRecord(){}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setInpt_type(String inpt_type){
		this.inpt_type = inpt_type;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setFund_idx(String fund_idx){
		this.fund_idx = fund_idx;
	}

	public void setSuprt_idx(String suprt_idx){
		this.suprt_idx = suprt_idx;
	}

	public void setMemb_cd(String memb_cd){
		this.memb_cd = memb_cd;
	}

	public void setPrms_cd(String prms_cd){
		this.prms_cd = prms_cd;
	}

	public void setPrms_amt(String prms_amt){
		this.prms_amt = prms_amt;
	}

	public void setPay_dt(String pay_dt){
		this.pay_dt = pay_dt;
	}

	public void setPay_amt(String pay_amt){
		this.pay_amt = pay_amt;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public void setMemo(String memo){
		this.memo = memo;
	}

	public void setMemberidx(String memberidx){
		this.memberidx = memberidx;
	}

	public void setPromiseidx(String promiseidx){
		this.promiseidx = promiseidx;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getInpt_type(){
		return this.inpt_type;
	}

	public String getName(){
		return this.name;
	}

	public String getFund_idx(){
		return this.fund_idx;
	}

	public String getSuprt_idx(){
		return this.suprt_idx;
	}

	public String getMemb_cd(){
		return this.memb_cd;
	}

	public String getPrms_cd(){
		return this.prms_cd;
	}

	public String getPrms_amt(){
		return this.prms_amt;
	}

	public String getPay_dt(){
		return this.pay_dt;
	}

	public String getPay_amt(){
		return this.pay_amt;
	}

	public String getStatus(){
		return this.status;
	}

	public String getMemo(){
		return this.memo;
	}

	public String getMemberidx(){
		return this.memberidx;
	}

	public String getPromiseidx(){
		return this.promiseidx;
	}
}

/* 작성시간 : Tue Oct 18 14:36:24 KST 2016 */