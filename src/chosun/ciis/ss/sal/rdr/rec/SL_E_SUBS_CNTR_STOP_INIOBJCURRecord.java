/***************************************************************************************************
* ���ϸ� : SL_E_SUBS_CNTR_STOP_INIOBJCURRecord.java
* ��� : ������������(���������˾�-�ʱ�ȭ)
* �ۼ����� : 2004-02-11
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
 * ������������(���������˾�-�ʱ�ȭ)-�������(���������)
 *
 */


public class SL_E_SUBS_CNTR_STOP_INIOBJCURRecord extends java.lang.Object implements java.io.Serializable{

	public String rdr_no;
	public String medicd;
	public String medinm;
	public String freeyn;
	public String freeynnm;
	public String freeclsf;
	public int qty;

	public SL_E_SUBS_CNTR_STOP_INIOBJCURRecord(){}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setFreeyn(String freeyn){
		this.freeyn = freeyn;
	}

	public void setFreeynnm(String freeynnm){
		this.freeynnm = freeynnm;
	}

	public void setFreeclsf(String freeclsf){
		this.freeclsf = freeclsf;
	}

	public void setQty(int qty){
		this.qty = qty;
	}

	public String getRdr_no(){
		return this.rdr_no;
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

	public String getFreeynnm(){
		return this.freeynnm;
	}

	public String getFreeclsf(){
		return this.freeclsf;
	}

	public int getQty(){
		return this.qty;
	}
}

/* �ۼ��ð� : Wed Feb 11 21:56:53 KST 2004 */