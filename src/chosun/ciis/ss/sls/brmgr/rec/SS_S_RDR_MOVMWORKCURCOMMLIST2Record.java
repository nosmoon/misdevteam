/***************************************************************************************************
* ���ϸ� : SS_S_RDR_MOVMWORKCURCOMMLIST2Record.java
* ��� : �����濵-������������-��
* �ۼ����� : 2004-03-19
* �ۼ��� : �迵��
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
 * �����濵-������������-���
 *
 */


public class SS_S_RDR_MOVMWORKCURCOMMLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String medicd;
	public String medinm;
	public int valqty;
	public int pre_valqty;
	public int no_valqty;

	public SS_S_RDR_MOVMWORKCURCOMMLIST2Record(){}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setValqty(int valqty){
		this.valqty = valqty;
	}

	public void setPre_valqty(int pre_valqty){
		this.pre_valqty = pre_valqty;
	}

	public void setNo_valqty(int no_valqty){
		this.no_valqty = no_valqty;
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

	public int getPre_valqty(){
		return this.pre_valqty;
	}

	public int getNo_valqty(){
		return this.no_valqty;
	}
}

/* �ۼ��ð� : Sat Mar 20 13:52:25 KST 2004 */