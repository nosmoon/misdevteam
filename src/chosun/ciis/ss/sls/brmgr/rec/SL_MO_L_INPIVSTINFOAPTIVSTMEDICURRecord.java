/***************************************************************************************************
* ���ϸ� : SL_MO_L_INPIVSTINFOAPTIVSTMEDICURRecord.java
* ��� :  ����Ʈ�� ����, ���Է����翡 �ʿ��� ��ü����Ʈ_����Ͽ�
* �ۼ����� : 2017-01-13
* �ۼ��� : �� �� ��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
 *
 */


public class SL_MO_L_INPIVSTINFOAPTIVSTMEDICURRecord extends java.lang.Object implements java.io.Serializable{

	public String medicd;
	public String medinm;
	public String mediycd;
	public String mediynm;

	public SL_MO_L_INPIVSTINFOAPTIVSTMEDICURRecord(){}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setMediycd(String mediycd){
		this.mediycd = mediycd;
	}

	public void setMediynm(String mediynm){
		this.mediynm = mediynm;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getMediycd(){
		return this.mediycd;
	}

	public String getMediynm(){
		return this.mediynm;
	}
}

/* �ۼ��ð� : Thu Jan 12 17:26:47 KST 2017 */