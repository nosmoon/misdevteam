/***************************************************************************************************
* ���ϸ� : .java
* ��� : �Ǹ�-��������-�̻絶�ڼ�����Ȳ
* �ۼ����� : 2011-12-05
* �ۼ��� : �̱⿵
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
 * 
 */


public class ABC_L_AUTHRATIOCURAUTHRATIORecord extends java.lang.Object implements java.io.Serializable{

	public String subsmappli;
	public String bocd;
	public String abcclsf;
	public String cnt;

	public ABC_L_AUTHRATIOCURAUTHRATIORecord(){}

	public void setSubsmappli(String subsmappli){
		this.subsmappli = subsmappli;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setAbcclsf(String abcclsf){
		this.abcclsf = abcclsf;
	}

	public void setCnt(String cnt){
		this.cnt = cnt;
	}

	public String getSubsmappli(){
		return this.subsmappli;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getAbcclsf(){
		return this.abcclsf;
	}

	public String getCnt(){
		return this.cnt;
	}
}

/* �ۼ��ð� : Wed Apr 03 07:50:26 GMT 2013 */