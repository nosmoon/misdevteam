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


public class SS_L_SQL_EXECUTE_QUERYLISTRESULTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String seq;
	public String sql_nm;
	public String incmgpers;
	public String db_cd;
	public String db_nm;

	public SS_L_SQL_EXECUTE_QUERYLISTRESULTCURRecord(){}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setSql_nm(String sql_nm){
		this.sql_nm = sql_nm;
	}

	public void setIncmgpesr(String incmgpesr){
		this.incmgpers = incmgpers;
	}
	
	public void setDb_cd(String db_cd){
		this.db_cd = db_cd;
	}
	
	public void setDb_nm(String db_nm){
		this.db_nm = db_nm;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getSql_nm(){
		return this.sql_nm;
	}

	public String getIncmgpesr(){
		return this.incmgpers;
	}
	
	public String getDb_cd(){
		return this.db_cd;
	}
	
	public String getDb_nm(){
		return this.db_nm;
	}
}

/* 작성시간 : Wed Apr 23 06:42:28 GMT 2014 */