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


package chosun.ciis.se.qty.rec;

import java.sql.*;
import chosun.ciis.se.qty.dm.*;
import chosun.ciis.se.qty.ds.*;

/**
 * 
 */


public class SE_QTY_1140_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String yymm;
	public String bo_cd;
	public String bo_seq;
	public String rdr_extn_enty_qty;
	public String isenty_qty;

	public SE_QTY_1140_LCURLISTRecord(){}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setBo_seq(String bo_seq){
		this.bo_seq = bo_seq;
	}

	public void setRdr_extn_enty_qty(String rdr_extn_enty_qty){
		this.rdr_extn_enty_qty = rdr_extn_enty_qty;
	}

	public void setIsenty_qty(String isenty_qty){
		this.isenty_qty = isenty_qty;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getBo_seq(){
		return this.bo_seq;
	}

	public String getRdr_extn_enty_qty(){
		return this.rdr_extn_enty_qty;
	}

	public String getIsenty_qty(){
		return this.isenty_qty;
	}
}

/* 작성시간 : Mon Jan 20 16:34:06 KST 2014 */