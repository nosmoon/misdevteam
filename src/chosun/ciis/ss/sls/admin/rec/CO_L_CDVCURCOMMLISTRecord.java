/***************************************************************************************************
* ���ϸ� : CO_L_CDVCURCOMMLISTRecord.java
* ��� : ������-�����ڵ�-����� ���� Record
* �ۼ����� : 2004-03-09
* �ۼ��� : ��뼷
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
 * ������-�����ڵ�-����� ���� Record
 */

public class CO_L_CDVCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String ciymgbcd;
	public String cicdgb;
	public String cicodeval;
	public String cicdnm;
	public String cicdynm;
	public String cimgtcd1;
	public String cimgtcd2;

	public CO_L_CDVCURCOMMLISTRecord(){}

	public void setCiymgbcd(String ciymgbcd){
		this.ciymgbcd = ciymgbcd;
	}

	public void setCicdgb(String cicdgb){
		this.cicdgb = cicdgb;
	}

	public void setCicodeval(String cicodeval){
		this.cicodeval = cicodeval;
	}

	public void setCicdnm(String cicdnm){
		this.cicdnm = cicdnm;
	}

	public void setCicdynm(String cicdynm){
		this.cicdynm = cicdynm;
	}

	public void setCimgtcd1(String cimgtcd1){
		this.cimgtcd1 = cimgtcd1;
	}

	public void setCimgtcd2(String cimgtcd2){
		this.cimgtcd2 = cimgtcd2;
	}

	public String getCiymgbcd(){
		return this.ciymgbcd;
	}

	public String getCicdgb(){
		return this.cicdgb;
	}

	public String getCicodeval(){
		return this.cicodeval;
	}

	public String getCicdnm(){
		return this.cicdnm;
	}

	public String getCicdynm(){
		return this.cicdynm;
	}

	public String getCimgtcd1(){
		return this.cimgtcd1;
	}

	public String getCimgtcd2(){
		return this.cimgtcd2;
	}
}

/* �ۼ��ð� : Tue Mar 09 19:27:20 KST 2004 */