/***************************************************************************************************
* ���ϸ� : .java
* ��� : Ȯ����Ȳ - ������������ ��� �ʱ�ȭ 
* �ۼ����� : 2009-08-26
* �ۼ��� : ������
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * Ȯ����Ȳ - ������������ ��� �ʱ�ȭ 
 */

public class SS_L_TASLM_BOSUSPCLOS_INITCURTYPE1Record extends java.lang.Object implements java.io.Serializable{

	public String code;
	public String name;

	public SS_L_TASLM_BOSUSPCLOS_INITCURTYPE1Record(){}

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

/* �ۼ��ð� : Wed Aug 26 18:21:02 KST 2009 */