/***************************************************************************************************
* ���ϸ� : SS_L_RDR_EXTN_SERVCOSTDCURCOMMLISTRecord.java
* ��� : Ȯ����Ȳ-����ISȮ��-�������� �󼼸���� ���� Record
* �ۼ����� : 2004-04-24
* �ۼ��� : ��뼷
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
 * Ȯ����Ȳ-����ISȮ��-�������� �󼼸���� ���� Record
 */


public class SS_L_RDR_EXTN_SERVCOSTDCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String medinm;
	public String deptnm;
	public String resitypenm;
	public int rdr_extnqty;
	public int adjmqty;
	public int errqty;
	public int basiamt;
	public int servcost;

	public SS_L_RDR_EXTN_SERVCOSTDCURCOMMLISTRecord(){}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setResitypenm(String resitypenm){
		this.resitypenm = resitypenm;
	}

	public void setRdr_extnqty(int rdr_extnqty){
		this.rdr_extnqty = rdr_extnqty;
	}

	public void setAdjmqty(int adjmqty){
		this.adjmqty = adjmqty;
	}

	public void setErrqty(int errqty){
		this.errqty = errqty;
	}

	public void setBasiamt(int basiamt){
		this.basiamt = basiamt;
	}

	public void setServcost(int servcost){
		this.servcost = servcost;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getDeptnm(){
		return this.deptnm;
	}

	public String getResitypenm(){
		return this.resitypenm;
	}

	public int getRdr_extnqty(){
		return this.rdr_extnqty;
	}

	public int getAdjmqty(){
		return this.adjmqty;
	}

	public int getErrqty(){
		return this.errqty;
	}

	public int getBasiamt(){
		return this.basiamt;
	}

	public int getServcost(){
		return this.servcost;
	}
}

/* �ۼ��ð� : Tue Aug 03 19:37:00 KST 2004 */