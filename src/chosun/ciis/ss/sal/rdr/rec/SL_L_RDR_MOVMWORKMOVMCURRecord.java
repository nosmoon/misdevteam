/***************************************************************************************************
* ���ϸ� : SL_L_RDR_MOVMWORKMOVMCURRecord.java
* ��� : ����������������-�ΰ�(�ΰ��۾���ϰ˻�)
*       ����������������-�μ�(�μ��۾���ϰ˻�)
* �ۼ����� : 2004-02-07
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
 * ����������������-�ΰ�(�ΰ��۾���ϰ˻�)
 * ����������������-�μ�(�μ��۾���ϰ˻�)
 * Ư����� : ���������ڴ� ����������������(�ΰ�� �μ��� ���� ���ӿ� ������ ��)
 */


public class SL_L_RDR_MOVMWORKMOVMCURRecord extends java.lang.Object implements java.io.Serializable{

	public String regdt;
	public String regno;
	public String medabasidt;
	public String trsfbocd;
	public String trsfbonm;
	public String acptbocd;
	public String acptbonm;
	public int rdrcnt;
	public String procstat;
	public String procstatnm;
    public String trsfdt_tm;
	public String chrgcnfmdt_tm;
	public String acptdt_tm;

	public SL_L_RDR_MOVMWORKMOVMCURRecord(){}

	public void setRegdt(String regdt){
		this.regdt = regdt;
	}

	public void setRegno(String regno){
		this.regno = regno;
	}

	public void setMedabasidt(String medabasidt){
		this.medabasidt = medabasidt;
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

	public void setRdrcnt(int rdrcnt){
		this.rdrcnt = rdrcnt;
	}

	public void setProcstat(String procstat){
		this.procstat = procstat;
	}

	public void setProcstatnm(String procstatnm){
		this.procstatnm = procstatnm;
	}

    public void setTrsfdt_tm(String procstatnm){
        this.procstatnm = procstatnm;
    }


	public void setChrgcnfmdt_tm(String chrgcnfmdt_tm){
		this.chrgcnfmdt_tm = chrgcnfmdt_tm;
	}

	public void setAcptdt_tm(String acptdt_tm){
		this.acptdt_tm = acptdt_tm;
	}

	public String getRegdt(){
		return this.regdt;
	}

	public String getRegno(){
		return this.regno;
	}

	public String getMedabasidt(){
		return this.medabasidt;
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

	public int getRdrcnt(){
		return this.rdrcnt;
	}

	public String getProcstat(){
		return this.procstat;
	}

	public String getProcstatnm(){
		return this.procstatnm;
	}

    public String getTrsfdt_tm(){
        return this.procstatnm;
    }

	public String getChrgcnfmdt_tm(){
		return this.chrgcnfmdt_tm;
	}

	public String getAcptdt_tm(){
		return this.acptdt_tm;
	}
}

/* �ۼ��ð� : Sat Feb 07 16:47:38 KST 2004 */