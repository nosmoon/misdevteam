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


package chosun.ciis.mt.papinout.rec;

import java.sql.*;
import chosun.ciis.mt.papinout.dm.*;
import chosun.ciis.mt.papinout.ds.*;

/**
 * 
 */


public class MT_PAPINOUT_2401_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String title;
	public String jg_wt;
	public String purc_uprc;
	public String stored_amt_nuge;
	public String cur_amt;
	public String cha_ak;
	public String cur_ig_roll;
	public String cur_ig_wt;
	public String cur_ig_amt;
	public String matr_cd;
	public String grp;

	public MT_PAPINOUT_2401_LCURLISTRecord(){}

	public void setTitle(String title){
		this.title = title;
	}

	public void setJg_wt(String jg_wt){
		this.jg_wt = jg_wt;
	}

	public void setPurc_uprc(String purc_uprc){
		this.purc_uprc = purc_uprc;
	}

	public void setStored_amt_nuge(String stored_amt_nuge){
		this.stored_amt_nuge = stored_amt_nuge;
	}

	public void setCur_amt(String cur_amt){
		this.cur_amt = cur_amt;
	}

	public void setCha_ak(String cha_ak){
		this.cha_ak = cha_ak;
	}

	public void setCur_ig_roll(String cur_ig_roll){
		this.cur_ig_roll = cur_ig_roll;
	}

	public void setCur_ig_wt(String cur_ig_wt){
		this.cur_ig_wt = cur_ig_wt;
	}

	public void setCur_ig_amt(String cur_ig_amt){
		this.cur_ig_amt = cur_ig_amt;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setGrp(String grp){
		this.grp = grp;
	}

	public String getTitle(){
		return this.title;
	}

	public String getJg_wt(){
		return this.jg_wt;
	}

	public String getPurc_uprc(){
		return this.purc_uprc;
	}

	public String getStored_amt_nuge(){
		return this.stored_amt_nuge;
	}

	public String getCur_amt(){
		return this.cur_amt;
	}

	public String getCha_ak(){
		return this.cha_ak;
	}

	public String getCur_ig_roll(){
		return this.cur_ig_roll;
	}

	public String getCur_ig_wt(){
		return this.cur_ig_wt;
	}

	public String getCur_ig_amt(){
		return this.cur_ig_amt;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getGrp(){
		return this.grp;
	}
}

/* 작성시간 : Thu Apr 23 18:05:40 KST 2009 */