/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.fc.func.rec;

import java.sql.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.ds.*;

/**
 * 
 */


public class FC_FUNC_9999_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String code_name;
	public String code_value;

	public FC_FUNC_9999_LCURLISTRecord(){}

	public void setCode_name(String code_name){
		this.code_name = code_name;
	}

	public void setCode_value(String code_value){
		this.code_value = code_value;
	}

	public String getCode_name(){
		return this.code_name;
	}

	public String getCode_value(){
		return this.code_value;
	}
}

/* �ۼ��ð� : Mon Jan 05 09:31:57 KST 2009 */