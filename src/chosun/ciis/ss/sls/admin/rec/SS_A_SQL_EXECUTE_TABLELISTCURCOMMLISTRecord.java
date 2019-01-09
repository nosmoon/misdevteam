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


public class SS_A_SQL_EXECUTE_TABLELISTCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String table_name;

	public SS_A_SQL_EXECUTE_TABLELISTCURCOMMLISTRecord(){}

	public void setTable_name(String table_name){
		this.table_name = table_name;
	}

	public String getTable_name(){
		return this.table_name;
	}
}

/* 작성시간 : Mon May 12 01:16:08 GMT 2014 */