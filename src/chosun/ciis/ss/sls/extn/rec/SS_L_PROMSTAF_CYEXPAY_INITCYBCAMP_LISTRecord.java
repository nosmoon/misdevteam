/***************************************************************************************************
* ���ϸ� : SS_L_PROMSTAF_CYEXPAY_INITCYBCAMP_LISTRecord.java
* ��� : Ȯ����Ȳ-���̹�Ȯ��-���ް���-�ʱ�ȭ��
* �ۼ����� : 2004-04-01
* �ۼ��� : ����ȫ
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * Ȯ����Ȳ-���̹�Ȯ��-���ް���-�ʱ�ȭ��
 *
 */

public class SS_L_PROMSTAF_CYEXPAY_INITCYBCAMP_LISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rdr_extncampno;
	public String campnm;

	public SS_L_PROMSTAF_CYEXPAY_INITCYBCAMP_LISTRecord(){}

	public void setRdr_extncampno(String rdr_extncampno){
		this.rdr_extncampno = rdr_extncampno;
	}

	public void setCampnm(String campnm){
		this.campnm = campnm;
	}

	public String getRdr_extncampno(){
		return this.rdr_extncampno;
	}

	public String getCampnm(){
		return this.campnm;
	}
}

/* �ۼ��ð� : Thu Apr 01 21:17:07 KST 2004 */