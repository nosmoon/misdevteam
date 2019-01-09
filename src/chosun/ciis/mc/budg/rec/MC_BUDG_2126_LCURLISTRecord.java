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


public class MC_BUDG_2126_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String work_no;
	public String budg_cdnm;
	public String rmks;
	public String req_amt_tot;

	public MC_BUDG_2126_LCURLISTRecord(){}

	public void setWork_no(String work_no){
		this.work_no = work_no;
	}

	public void setBudg_cdnm(String budg_cdnm){
		this.budg_cdnm = budg_cdnm;
	}

	public void setRmks(String rmks){
		this.rmks = rmks;
	}

	public void setReq_amt_tot(String req_amt_tot){
		this.req_amt_tot = req_amt_tot;
	}

	public String getWork_no(){
		return this.work_no;
	}

	public String getBudg_cdnm(){
		return this.budg_cdnm;
	}

	public String getRmks(){
		return this.rmks;
	}

	public String getReq_amt_tot(){
		return this.req_amt_tot;
	}
}

/* 작성시간 : Wed May 27 13:35:43 KST 2009 */