/***************************************************************************************************
 * ���ϸ�   : PS_S_RDR_EXTNDataSet.java
 * ���     : ����-Ȯ�嵶�ڰ��� �ʱ�,����ȸ,RESET
 * �ۼ����� : 2004-02-26
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
 * ����-Ȯ�嵶�ڰ��� �ʱ�,����ȸ,RESET
 */

public class PS_S_RDR_EXTNASINBOCDCURRecord extends java.lang.Object implements java.io.Serializable{

	public String bocd;
	public String bonm;
	public String deptcd;
	public String sellnetclsf;

	public PS_S_RDR_EXTNASINBOCDCURRecord(){}

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

/* �ۼ��ð� : Mon May 28 13:09:31 KST 2007 */