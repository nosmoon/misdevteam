/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.admin.rec;

import java.sql.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.ds.*;

/**
 * 
 */


public class SS_L_SQL_EXECUTE_LISTRESULTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String sql_nm;
	public Timestamp bgntm;
	public Timestamp endtm;
	public String erryn;
	public String errmsg;
	public String incmgpers;
	public int data_cnt;
	public String execute_dt;
	public String sql_seq;

	public SS_L_SQL_EXECUTE_LISTRESULTCURRecord(){}

	public void setSql_nm(String sql_nm){
		this.sql_nm = sql_nm;
	}

	public void setBgntm(Timestamp bgntm){
		this.bgntm = bgntm;
	}

	public void setEndtm(Timestamp endtm){
		this.endtm = endtm;
	}

	public void setErryn(String erryn){
		this.erryn = erryn;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setData_cnt(int data_cnt){
		this.data_cnt = data_cnt;
	}

	public void setExecute_dt(String execute_dt){
		this.execute_dt = execute_dt;
	}

	public void setSql_seq(String sql_seq){
		this.sql_seq = sql_seq;
	}

	public String getSql_nm(){
		return this.sql_nm;
	}

	public Timestamp getBgntm(){
		return this.bgntm;
	}

	public Timestamp getEndtm(){
		return this.endtm;
	}

	public String getErryn(){
		return this.erryn;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public int getData_cnt(){
		return this.data_cnt;
	}

	public String getExecute_dt(){
		return this.execute_dt;
	}

	public String getSql_seq(){
		return this.sql_seq;
	}
}

/* 작성시간 : Tue Dec 24 07:39:20 GMT 2013 */