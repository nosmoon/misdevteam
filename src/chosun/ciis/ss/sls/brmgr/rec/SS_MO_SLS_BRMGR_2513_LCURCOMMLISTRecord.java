/***************************************************************************************************
* ���ϸ� : SS_MO_SLS_BRMGR_2513_LCURCOMMLISTRecord.java
* ��� : �������հ���-���Ͱ���-���Ͱ�����-���������_����Ͽ�
* �ۼ����� : 2016-12-19
* �ۼ��� : �� �� ��
***************************************************************************************************/
/***************************************************************************************************
* �������� : �������ļ����� ����, ��,��Ʈ,�������� ���� ���� �� �ֵ��� �߰�.
* ������ : �� �� ��
* �������� : 2017-03-16
* ��� :
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
 *
 */


public class SS_MO_SLS_BRMGR_2513_LCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String yymm;
	public String deptcd;
	public String deptnm;
	public String partcd;
	public String partnm;
	public String areacd;
	public String areanm;
	public String srtseq;
	public String bocd;
	public String bonm;
	public String boclsf;
	public String medaqty;
	public String meda_amt;
	public String repm_amt;
	public String repm_rate;
	public String longmisu;
	public String lm_rate;

	public SS_MO_SLS_BRMGR_2513_LCURCOMMLISTRecord(){}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setPartcd(String partcd){
		this.partcd = partcd;
	}

	public void setPartnm(String partnm){
		this.partnm = partnm;
	}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setAreanm(String areanm){
		this.areanm = areanm;
	}

	public void setSrtseq(String srtseq){
		this.srtseq = srtseq;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setBoclsf(String boclsf){
		this.boclsf = boclsf;
	}

	public void setMedaqty(String medaqty){
		this.medaqty = medaqty;
	}

	public void setMeda_amt(String meda_amt){
		this.meda_amt = meda_amt;
	}

	public void setRepm_amt(String repm_amt){
		this.repm_amt = repm_amt;
	}

	public void setRepm_rate(String repm_rate){
		this.repm_rate = repm_rate;
	}

	public void setLongmisu(String longmisu){
		this.longmisu = longmisu;
	}

	public void setLm_rate(String lm_rate){
		this.lm_rate = lm_rate;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getDeptnm(){
		return this.deptnm;
	}

	public String getPartcd(){
		return this.partcd;
	}

	public String getPartnm(){
		return this.partnm;
	}

	public String getAreacd(){
		return this.areacd;
	}

	public String getAreanm(){
		return this.areanm;
	}

	public String getSrtseq(){
		return this.srtseq;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getBoclsf(){
		return this.boclsf;
	}

	public String getMedaqty(){
		return this.medaqty;
	}

	public String getMeda_amt(){
		return this.meda_amt;
	}

	public String getRepm_amt(){
		return this.repm_amt;
	}

	public String getRepm_rate(){
		return this.repm_rate;
	}

	public String getLongmisu(){
		return this.longmisu;
	}

	public String getLm_rate(){
		return this.lm_rate;
	}
}

/* �ۼ��ð� : Thu Mar 16 17:50:40 KST 2017 */