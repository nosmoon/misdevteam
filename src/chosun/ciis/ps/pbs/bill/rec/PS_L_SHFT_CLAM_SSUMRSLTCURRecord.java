/***************************************************************************************************
* ���ϸ� : PS_L_SHFT_CLAM_SSUM.java
* ���   : �ڵ���üû��Ȯ�ο����
* �ۼ����� : 2006-04-25
* �ۼ��� : ����ǥ
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ps.pbs.bill.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.bill.dm.*;
import chosun.ciis.ps.pbs.bill.ds.*;

/**
 * ���Ǳ� -�ڵ���üû��Ȯ�ο����
 *
 */

public class PS_L_SHFT_CLAM_SSUMRSLTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String bocd;
	public String bonm;
	public String basidt;
	public String shftclsfcd;
	public String shftclsfnm;
	public int clamnoit;
	public int clamtotamt;
	public int recpnoit;
	public int recptotamt;
	public int billcoms;

	public PS_L_SHFT_CLAM_SSUMRSLTCURRecord(){}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setBasidt(String basidt){
		this.basidt = basidt;
	}

	public void setShftclsfcd(String shftclsfcd){
		this.shftclsfcd = shftclsfcd;
	}

	public void setShftclsfnm(String shftclsfnm){
		this.shftclsfnm = shftclsfnm;
	}

	public void setClamnoit(int clamnoit){
		this.clamnoit = clamnoit;
	}

	public void setClamtotamt(int clamtotamt){
		this.clamtotamt = clamtotamt;
	}

	public void setRecpnoit(int recpnoit){
		this.recpnoit = recpnoit;
	}

	public void setRecptotamt(int recptotamt){
		this.recptotamt = recptotamt;
	}

	public void setBillcoms(int billcoms){
		this.billcoms = billcoms;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getBasidt(){
		return this.basidt;
	}

	public String getShftclsfcd(){
		return this.shftclsfcd;
	}

	public String getShftclsfnm(){
		return this.shftclsfnm;
	}

	public int getClamnoit(){
		return this.clamnoit;
	}

	public int getClamtotamt(){
		return this.clamtotamt;
	}

	public int getRecpnoit(){
		return this.recpnoit;
	}

	public int getRecptotamt(){
		return this.recptotamt;
	}

	public int getBillcoms(){
		return this.billcoms;
	}
}

/* �ۼ��ð� : Wed May 03 17:49:09 KST 2006 */