/***************************************************************************************************
* ���ϸ� : SL_L_MOVM_RDRPTCRMOVM_RDRCURRecord.java
* ��� : ������������(���������˾�-�̻系��)
* �ۼ����� : 2003-12-27
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
 * ������������(���������˾�-�̻系��)
 *
 */
public class SL_L_MOVM_RDRPTCRMOVM_RDRCURRecord extends java.lang.Object implements java.io.Serializable{

	public String movmdt;
	public String trsfbocd;
	public String trsfbonm;
	public String acptbocd;
	public String acptbonm;

	public SL_L_MOVM_RDRPTCRMOVM_RDRCURRecord(){}

	public void setMovmdt(String movmdt){
		this.movmdt = movmdt;
	}

	public void setTrsfbocd(String trsfbocd){
		this.trsfbocd = trsfbocd;
	}

	public void setTrsfbonm(String trsfbonm){
		this.trsfbonm = trsfbonm;
	}

	public void setAcptbocd(String acptbocd){
		this.acptbocd = acptbocd;
	}

	public void setAcptbonm(String acptbonm){
		this.acptbonm = acptbonm;
	}

	public String getMovmdt(){
		return this.movmdt;
	}

	public String getTrsfbocd(){
		return this.trsfbocd;
	}

	public String getTrsfbonm(){
		return this.trsfbonm;
	}

	public String getAcptbocd(){
		return this.acptbocd;
	}

	public String getAcptbonm(){
		return this.acptbonm;
	}
}

/* �ۼ��ð� : Mon Dec 29 22:25:04 KST 2003 */