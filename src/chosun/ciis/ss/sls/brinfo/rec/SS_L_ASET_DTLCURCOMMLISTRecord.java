/***************************************************************************************************
* ���ϸ� : SS_L_ASET_DTLCURCOMMLISTRecord.java
* ��� : ����Info-������ǰ��Ȳ-�� ��ȸ
* �ۼ����� : 2004-02-01
* �ۼ��� : ����ȫ
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brinfo.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.brinfo.ds.*;

/**
 * ����Info-������ǰ��Ȳ-�� ��ȸ
 *
 */


public class SS_L_ASET_DTLCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bocd;
	public String asetseq;
	public String asetclascd;
	public String asetclascdnm;
	public String asetnm;
	public String buydt;

	public SS_L_ASET_DTLCURCOMMLISTRecord(){}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setAsetseq(String asetseq){
		this.asetseq = asetseq;
	}

	public void setAsetclascd(String asetclascd){
		this.asetclascd = asetclascd;
	}

	public void setAsetclascdnm(String asetclascdnm){
		this.asetclascdnm = asetclascdnm;
	}

	public void setAsetnm(String asetnm){
		this.asetnm = asetnm;
	}

	public void setBuydt(String buydt){
		this.buydt = buydt;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getAsetseq(){
		return this.asetseq;
	}

	public String getAsetclascd(){
		return this.asetclascd;
	}

	public String getAsetclascdnm(){
		return this.asetclascdnm;
	}

	public String getAsetnm(){
		return this.asetnm;
	}

	public String getBuydt(){
		return this.buydt;
	}
}

/* �ۼ��ð� : Sun Feb 01 21:50:12 KST 2004 */