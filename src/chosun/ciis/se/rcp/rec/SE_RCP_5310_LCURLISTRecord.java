/***************************************************************************************************
* 파일명 : SE_SAL_1810_LCURLISTRecord.java
* 기능 : 판매 - 지대관리 - 매출관리 - 매출마감
* 작성일자 : 2009-04-10
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.rcp.rec;

import java.sql.*;
import chosun.ciis.se.rcp.dm.*;
import chosun.ciis.se.rcp.ds.*;

/**
 * 
 */


public class SE_RCP_5310_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String yymm				;
	public String clos_yn_10		;
	public String clos_dt_tm_10		;
	public String clos_yn_20		;
	public String actu_slip_no		;
	public String qty				;
	public String pdlv_fee			;
	public String uprc				;
	public String pdlv_altn_amt		;

	public SE_RCP_5310_LCURLISTRecord(){}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setClos_yn_10(String clos_yn_10){
		this.clos_yn_10 = clos_yn_10;
	}

	public void setClos_dt_tm_10(String clos_dt_tm_10){
		this.clos_dt_tm_10 = clos_dt_tm_10;
	}

	public void setClos_yn_20(String clos_yn_20){
		this.clos_yn_20 = clos_yn_20;
	}

	public void setActu_slip_no(String actu_slip_no){
		this.actu_slip_no = actu_slip_no;
	}

	public void setQty(String qty){
		this.qty = qty;
	}

	public void setPdlv_fee(String pdlv_fee){
		this.pdlv_fee = pdlv_fee;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public void setPdlv_altn_amt(String pdlv_altn_amt){
		this.pdlv_altn_amt = pdlv_altn_amt;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getClos_yn_10(){
		return this.clos_yn_10;
	}

	public String getClos_dt_tm_10(){
		return this.clos_dt_tm_10;
	}

	public String getClos_yn_20(){
		return this.clos_yn_20;
	}

	public String getActu_slip_no(){
		return this.actu_slip_no;
	}

	public String getQty(){
		return this.qty;
	}

	public String getPdlv_fee(){
		return this.pdlv_fee;
	}
	
	public String getUprc(){
		return this.uprc;
	}


	public String getPdlv_altn_amt(){
		return this.pdlv_altn_amt;
	}

}

/* 작성시간 : Fri Apr 10 16:13:39 KST 2009 */