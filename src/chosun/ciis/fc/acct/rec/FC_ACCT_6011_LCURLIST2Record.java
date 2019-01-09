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


package chosun.ciis.fc.acct.rec;

import java.sql.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.ds.*;

/**
 * 
 */


public class FC_ACCT_6011_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String slip_arow_no;
	public String mmdd;
	public String item;
	public String std;
	public String qunt;
	public String uprc;
	public String suply_amt;
	public String vat_amt;
	public String incmg_pgm_id;

	public FC_ACCT_6011_LCURLIST2Record(){}

	public void setSlip_arow_no(String slip_arow_no){
		this.slip_arow_no = slip_arow_no;
	}

	public void setMmdd(String mmdd){
		this.mmdd = mmdd;
	}

	public void setItem(String item){
		this.item = item;
	}

	public void setStd(String std){
		this.std = std;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public void setSuply_amt(String suply_amt){
		this.suply_amt = suply_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setIncmg_pgm_id(String incmg_pgm_id){
		this.incmg_pgm_id = incmg_pgm_id;
	}

	public String getSlip_arow_no(){
		return this.slip_arow_no;
	}

	public String getMmdd(){
		return this.mmdd;
	}

	public String getItem(){
		return this.item;
	}

	public String getStd(){
		return this.std;
	}

	public String getQunt(){
		return this.qunt;
	}

	public String getUprc(){
		return this.uprc;
	}

	public String getSuply_amt(){
		return this.suply_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}

	public String getIncmg_pgm_id(){
		return this.incmg_pgm_id;
	}
}

/* 작성시간 : Thu May 03 14:22:18 KST 2018 */