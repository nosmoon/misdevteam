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


public class TN_LNK_1210_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rcpt_rpt_idx;
	public String dep_nm;
	public String create_date;
	public String cret_stnd;
	public String cnt;
	public String payprice;
	public String rpt_dt;

	public TN_LNK_1210_LCURLISTRecord(){}

	public void setRcpt_rpt_idx(String rcpt_rpt_idx){
		this.rcpt_rpt_idx = rcpt_rpt_idx;
	}

	public void setDep_nm(String dep_nm){
		this.dep_nm = dep_nm;
	}

	public void setCreate_date(String create_date){
		this.create_date = create_date;
	}

	public void setCret_stnd(String cret_stnd){
		this.cret_stnd = cret_stnd;
	}

	public void setCnt(String cnt){
		this.cnt = cnt;
	}

	public void setPayprice(String payprice){
		this.payprice = payprice;
	}

	public void setRpt_dt(String rpt_dt){
		this.rpt_dt = rpt_dt;
	}

	public String getRcpt_rpt_idx(){
		return this.rcpt_rpt_idx;
	}

	public String getDep_nm(){
		return this.dep_nm;
	}

	public String getCreate_date(){
		return this.create_date;
	}

	public String getCret_stnd(){
		return this.cret_stnd;
	}

	public String getCnt(){
		return this.cnt;
	}

	public String getPayprice(){
		return this.payprice;
	}

	public String getRpt_dt(){
		return this.rpt_dt;
	}
}

/* 작성시간 : Thu Sep 22 14:19:27 KST 2016 */