/***************************************************************************************************
* ���ϸ�   : PS_S_PRINT_INIT.java
* ���     : ��� - �ʱ� ȭ��
* �ۼ����� : 2006-02-01
* �ۼ���   : ����ǥ 
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������   :
* �������� :   
* ���     :   
***************************************************************************************************/


package chosun.ciis.ps.pbs.print.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.print.dm.*;
import chosun.ciis.ps.pbs.print.ds.*;

/**
 * ��� - �ʱ� ȭ��
 *
 */

public class PS_S_PRINT_INITBOCDCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bocd;
	public String bonm;
	public String deptcd;
	public String sellnetclsf;

	public PS_S_PRINT_INITBOCDCURLISTRecord(){}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setSellnetclsf(String sellnetclsf){
		this.sellnetclsf = sellnetclsf;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getSellnetclsf(){
		return this.sellnetclsf;
	}
}

/* �ۼ��ð� : Wed May 06 11:07:41 KST 2009 */