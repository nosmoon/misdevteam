/***************************************************************************************************
* ���ϸ� : .java
* ��� : 
* �ۼ����� : 
* �ۼ��� : ������
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.admin.rec;

import java.sql.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.ds.*;

/**
 * 
 */


public class SS_A_SQL_EXECUTE_COLUMNLISTCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String column_name;
	public String data_type;
	public String comments;

	public SS_A_SQL_EXECUTE_COLUMNLISTCURCOMMLISTRecord(){}

	public void setColumn_name(String column_name){
		this.column_name = column_name;
	}

	public void setData_type(String data_type){
		this.data_type = data_type;
	}

	public void setComments(String comments){
		this.comments = comments;
	}

	public String getColumn_name(){
		return this.column_name;
	}

	public String getData_type(){
		return this.data_type;
	}

	public String getComments(){
		return this.comments;
	}
}

/* �ۼ��ð� : Mon May 12 02:52:38 GMT 2014 */