/***************************************************************************************************
* ���ϸ� : SS_L_APLC_NEWRSLTCURRecord.java
* ��� : ������������-Billing�ڵ���ü-��û����-�űԽ�û�ʱ�ȭ�� �ʱ�ȭ
* �ۼ����� : 2004-06-07
* �ۼ��� : ���
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * ������������-Billing�ڵ���ü-��û����-�űԽ�û�ʱ�ȭ�� �ʱ�ȭ
 *
 */


public class SS_L_APLC_NEWRSLTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String medicd;
	public String medinm;
	public int valqty;
	public int no_valqty;
	public int pre_valqty;
	public int realsubsamt;
	public String clamtmthdcd;
	public String clamtmthdnm;

	public SS_L_APLC_NEWRSLTCURRecord(){}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setValqty(int valqty){
		this.valqty = valqty;
	}

	public void setNo_valqty(int no_valqty){
		this.no_valqty = no_valqty;
	}

	public void setPre_valqty(int pre_valqty){
		this.pre_valqty = pre_valqty;
	}

	public void setRealsubsamt(int realsubsamt){
		this.realsubsamt = realsubsamt;
	}

	public void setClamtmthdcd(String clamtmthdcd){
		this.clamtmthdcd = clamtmthdcd;
	}

	public void setClamtmthdnm(String clamtmthdnm){
		this.clamtmthdnm = clamtmthdnm;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public int getValqty(){
		return this.valqty;
	}

	public int getNo_valqty(){
		return this.no_valqty;
	}

	public int getPre_valqty(){
		return this.pre_valqty;
	}

	public int getRealsubsamt(){
		return this.realsubsamt;
	}

	public String getClamtmthdcd(){
		return this.clamtmthdcd;
	}

	public String getClamtmthdnm(){
		return this.clamtmthdnm;
	}
}

/* �ۼ��ð� : Mon Jun 07 21:27:19 KST 2004 */