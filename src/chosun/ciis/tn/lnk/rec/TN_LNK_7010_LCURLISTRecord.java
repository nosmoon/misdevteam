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


public class TN_LNK_7010_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String seq;
	public String subs_fld;
	public String subm_dt;
	public String subs_cd;
	public String work_nm;
	public String char_nm;
	public String char_email;
	public String char_tel;
	public String char_hp;
	public String subs_work_nm;
	public String work_cont;
	public String tot_budget;
	public String myself_amt;
	public String attch_nm;
	public String attch_url;

	public TN_LNK_7010_LCURLISTRecord(){}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setSubs_fld(String subs_fld){
		this.subs_fld = subs_fld;
	}

	public void setSubm_dt(String subm_dt){
		this.subm_dt = subm_dt;
	}

	public void setSubs_cd(String subs_cd){
		this.subs_cd = subs_cd;
	}

	public void setWork_nm(String work_nm){
		this.work_nm = work_nm;
	}

	public void setChar_nm(String char_nm){
		this.char_nm = char_nm;
	}

	public void setChar_email(String char_email){
		this.char_email = char_email;
	}

	public void setChar_tel(String char_tel){
		this.char_tel = char_tel;
	}

	public void setChar_hp(String char_hp){
		this.char_hp = char_hp;
	}

	public void setSubs_work_nm(String subs_work_nm){
		this.subs_work_nm = subs_work_nm;
	}

	public void setWork_cont(String work_cont){
		this.work_cont = work_cont;
	}

	public void setTot_budget(String tot_budget){
		this.tot_budget = tot_budget;
	}

	public void setMyself_amt(String myself_amt){
		this.myself_amt = myself_amt;
	}

	public void setAttch_nm(String attch_nm){
		this.attch_nm = attch_nm;
	}

	public void setAttch_url(String attch_url){
		this.attch_url = attch_url;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getSubs_fld(){
		return this.subs_fld;
	}

	public String getSubm_dt(){
		return this.subm_dt;
	}

	public String getSubs_cd(){
		return this.subs_cd;
	}

	public String getWork_nm(){
		return this.work_nm;
	}

	public String getChar_nm(){
		return this.char_nm;
	}

	public String getChar_email(){
		return this.char_email;
	}

	public String getChar_tel(){
		return this.char_tel;
	}

	public String getChar_hp(){
		return this.char_hp;
	}

	public String getSubs_work_nm(){
		return this.subs_work_nm;
	}

	public String getWork_cont(){
		return this.work_cont;
	}

	public String getTot_budget(){
		return this.tot_budget;
	}

	public String getMyself_amt(){
		return this.myself_amt;
	}

	public String getAttch_nm(){
		return this.attch_nm;
	}

	public String getAttch_url(){
		return this.attch_url;
	}
}

/* 작성시간 : Mon Apr 17 16:27:00 KST 2017 */