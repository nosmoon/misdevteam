/***************************************************************************************************
 * ���ϸ�   : PS_L_EXTN_ASIN_SEARCHDataSet.java
 * ���     : ����-Ȯ�嵶�� �������ó�� �˻�
 * �ۼ����� : 2004-08-17
 * �ۼ���   : ����
 **************************************************************************************************/
 /**************************************************************************************************
 * �������� :
 * ������   :
 * �������� :
 * ���     : 
 **************************************************************************************************/



package chosun.ciis.ps.pbs.reader.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.reader.dm.*;
import chosun.ciis.ps.pbs.reader.ds.*;

/**
 * ����-Ȯ�嵶�� �������ó�� �˻�
 */

public class PS_L_EXTN_ASIN_SEARCHASINBOCDCURRecord extends java.lang.Object implements java.io.Serializable{

	public String bocd;
	public String bonm;
	public String deptcd;
	public String sellnetclsf;

	public PS_L_EXTN_ASIN_SEARCHASINBOCDCURRecord(){}

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

/* �ۼ��ð� : Mon Apr 25 16:06:23 KST 2005 */