/***************************************************************************************************
* ���ϸ� : .java
* ��� : Ȯ����Ȳ - ����Ȯ�帶�� ��� �ʱ�ȭ 
* �ۼ����� : 2009-08-26
* �ۼ��� : ������
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * Ȯ����Ȳ - ����Ȯ�帶�� ��� �ʱ�ȭ 
 */

public class SS_L_TASLM_RDREXTNCLOS_INITAPLCPATHRecord extends java.lang.Object implements java.io.Serializable{

	public String code;
	public String name;

	public SS_L_TASLM_RDREXTNCLOS_INITAPLCPATHRecord(){}

	public void setCode(String code){
		this.code = code;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getCode(){
		return this.code;
	}

	public String getName(){
		return this.name;
	}
}

/* �ۼ��ð� : Wed Aug 26 17:39:52 KST 2009 */