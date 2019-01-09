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


package chosun.ciis.sp.sup.rec;

import java.sql.*;
import chosun.ciis.sp.sup.dm.*;
import chosun.ciis.sp.sup.ds.*;

/**
 * 
 */


public class SP_SUP_1610_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String seq;
	public String req_clsf;
	public String titl;
	public String make_pers_nm;
	public String make_dt;
	public String brws_cnt;
	public String proc_stat;

	public SP_SUP_1610_LCURLISTRecord(){}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setReq_clsf(String req_clsf){
		this.req_clsf = req_clsf;
	}

	public void setTitl(String titl){
		this.titl = titl;
	}

	public void setMake_pers_nm(String make_pers_nm){
		this.make_pers_nm = make_pers_nm;
	}

	public void setMake_dt(String make_dt){
		this.make_dt = make_dt;
	}

	public void setBrws_cnt(String brws_cnt){
		this.brws_cnt = brws_cnt;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getReq_clsf(){
		return this.req_clsf;
	}

	public String getTitl(){
		return this.titl;
	}

	public String getMake_pers_nm(){
		return this.make_pers_nm;
	}

	public String getMake_dt(){
		return this.make_dt;
	}

	public String getBrws_cnt(){
		return this.brws_cnt;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}
}

/* 작성시간 : Thu Jul 05 16:40:40 KST 2012 */