/***************************************************************************************************
* ���ϸ� : SL_S_MOVM_RDRNWSPSUBSCURRecord.java
* ��� : ����-�̻絶�ڰ���-�̻��ΰ�-��
* �ۼ����� : 2004-03-26
* �ۼ��� : �迵��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sal.rdr.rec;

import java.sql.*;
import chosun.ciis.ss.sal.rdr.dm.*;
import chosun.ciis.ss.sal.rdr.ds.*;

/**
 * ����-�̻絶�ڰ���-�̻��ΰ�-��
 *
 */

public class SL_S_MOVM_RDRNWSPSUBSCURRecord extends java.lang.Object implements java.io.Serializable{

	public String medicd;
	public String medinm;
	public String freeyn;
	public String freeclsf;
	public String freeclsfnm;
	public int qty;
	public String valmm;

	public SL_S_MOVM_RDRNWSPSUBSCURRecord(){}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setFreeyn(String freeyn){
		this.freeyn = freeyn;
	}

	public void setFreeclsf(String freeclsf){
		this.freeclsf = freeclsf;
	}

	public void setFreeclsfnm(String freeclsfnm){
		this.freeclsfnm = freeclsfnm;
	}

	public void setQty(int qty){
		this.qty = qty;
	}

	public void setValmm(String valmm){
		this.valmm = valmm;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getFreeyn(){
		return this.freeyn;
	}

	public String getFreeclsf(){
		return this.freeclsf;
	}

	public String getFreeclsfnm(){
		return this.freeclsfnm;
	}

	public int getQty(){
		return this.qty;
	}

	public String getValmm(){
		return this.valmm;
	}
}

/* �ۼ��ð� : Fri Mar 26 15:13:47 KST 2004 */