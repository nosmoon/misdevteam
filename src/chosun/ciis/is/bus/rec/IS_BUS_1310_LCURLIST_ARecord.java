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


package chosun.ciis.is.bus.rec;

import java.sql.*;
import chosun.ciis.is.bus.dm.*;
import chosun.ciis.is.bus.ds.*;

/**
 * 
 */


public class IS_BUS_1310_LCURLIST_ARecord extends java.lang.Object implements java.io.Serializable{

	public String kind;
	public String kind_nm;
	public String d_tgt_amt;
	public String d_rst_amt;
	public String d_rate;
	public String j_rst_amt;
	public String j_rate;

	public IS_BUS_1310_LCURLIST_ARecord(){}

	public void setKind(String kind){
		this.kind = kind;
	}

	public void setKind_nm(String kind_nm){
		this.kind_nm = kind_nm;
	}

	public void setD_tgt_amt(String d_tgt_amt){
		this.d_tgt_amt = d_tgt_amt;
	}

	public void setD_rst_amt(String d_rst_amt){
		this.d_rst_amt = d_rst_amt;
	}

	public void setD_rate(String d_rate){
		this.d_rate = d_rate;
	}

	public void setJ_rst_amt(String j_rst_amt){
		this.j_rst_amt = j_rst_amt;
	}

	public void setJ_rate(String j_rate){
		this.j_rate = j_rate;
	}

	public String getKind(){
		return this.kind;
	}

	public String getKind_nm(){
		return this.kind_nm;
	}

	public String getD_tgt_amt(){
		return this.d_tgt_amt;
	}

	public String getD_rst_amt(){
		return this.d_rst_amt;
	}

	public String getD_rate(){
		return this.d_rate;
	}

	public String getJ_rst_amt(){
		return this.j_rst_amt;
	}

	public String getJ_rate(){
		return this.j_rate;
	}
}

/* 작성시간 : Tue Jun 19 21:07:14 KST 2012 */