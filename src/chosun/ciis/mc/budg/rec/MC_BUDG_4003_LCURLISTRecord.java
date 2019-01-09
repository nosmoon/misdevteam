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


package chosun.ciis.mc.budg.rec;

import java.sql.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.ds.*;

/**
 * 
 */


public class MC_BUDG_4003_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String work_no;
	public String seq;
	public String sub_seq;
	public String use_dept_cd;
	public String medi_cd;
	public String rmks;
	public String fix_asin_amt;
	public String fix_asin_uprc;
	public String fix_asin_qunt;

	public MC_BUDG_4003_LCURLISTRecord(){}

	public void setWork_no(String work_no){
		this.work_no = work_no;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setSub_seq(String sub_seq){
		this.sub_seq = sub_seq;
	}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setRmks(String rmks){
		this.rmks = rmks;
	}

	public void setFix_asin_amt(String fix_asin_amt){
		this.fix_asin_amt = fix_asin_amt;
	}

	public void setFix_asin_uprc(String fix_asin_uprc){
		this.fix_asin_uprc = fix_asin_uprc;
	}

	public void setFix_asin_qunt(String fix_asin_qunt){
		this.fix_asin_qunt = fix_asin_qunt;
	}

	public String getWork_no(){
		return this.work_no;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getSub_seq(){
		return this.sub_seq;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getRmks(){
		return this.rmks;
	}

	public String getFix_asin_amt(){
		return this.fix_asin_amt;
	}

	public String getFix_asin_uprc(){
		return this.fix_asin_uprc;
	}

	public String getFix_asin_qunt(){
		return this.fix_asin_qunt;
	}
}

/* 작성시간 : Tue May 19 22:04:00 KST 2009 */