/***************************************************************************************************
* ���ϸ� : SS_L_RDR_EXTN_CYBCOSTDCURCOMMLISTRecord.java
* ��� : Ȯ����Ȳ-���̹�Ȯ��-������-��ϻ�
* �ۼ����� : 2004-04-09
* �ۼ��� : ����ȫ
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * Ȯ����Ȳ-���̹�Ȯ��-������-��ϻ�
 *
 */

public class SS_L_RDR_EXTN_CYBCOSTDCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String medicdnm;
	public int acptqty;
	public int calcqty;
	public int basiamt;
	public int costamt;

	public SS_L_RDR_EXTN_CYBCOSTDCURCOMMLISTRecord(){}

	public void setMedicdnm(String medicdnm){
		this.medicdnm = medicdnm;
	}

	public void setAcptqty(int acptqty){
		this.acptqty = acptqty;
	}

	public void setCalcqty(int calcqty){
		this.calcqty = calcqty;
	}

	public void setBasiamt(int basiamt){
		this.basiamt = basiamt;
	}

	public void setCostamt(int costamt){
		this.costamt = costamt;
	}

	public String getMedicdnm(){
		return this.medicdnm;
	}

	public int getAcptqty(){
		return this.acptqty;
	}

	public int getCalcqty(){
		return this.calcqty;
	}

	public int getBasiamt(){
		return this.basiamt;
	}

	public int getCostamt(){
		return this.costamt;
	}
}

/* �ۼ��ð� : Fri Apr 09 16:13:59 KST 2004 */