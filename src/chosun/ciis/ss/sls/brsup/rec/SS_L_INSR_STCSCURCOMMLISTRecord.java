/***************************************************************************************************
* ���ϸ� : .java
* ��� : *��������-���غ���-������Ȳ-���
* �ۼ����� : 2009-04-09
* �ۼ��� : �輼��
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * ��������-���غ���-������Ȳ-���
 */

public class SS_L_INSR_STCSCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String deptnm;
	public String areanm;
	public String bonm;
	public int aplcqunt;
	public int hdqtsplyqunt;
	public int totamt;
	public int splyamt;
	public int clamamt;

	public SS_L_INSR_STCSCURCOMMLISTRecord(){}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setAreanm(String areanm){
		this.areanm = areanm;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setAplcqunt(int aplcqunt){
		this.aplcqunt = aplcqunt;
	}

	public void setHdqtsplyqunt(int hdqtsplyqunt){
		this.hdqtsplyqunt = hdqtsplyqunt;
	}

	public void setTotamt(int totamt){
		this.totamt = totamt;
	}

	public void setSplyamt(int splyamt){
		this.splyamt = splyamt;
	}

	public void setClamamt(int clamamt){
		this.clamamt = clamamt;
	}

	public String getDeptnm(){
		return this.deptnm;
	}

	public String getAreanm(){
		return this.areanm;
	}

	public String getBonm(){
		return this.bonm;
	}

	public int getAplcqunt(){
		return this.aplcqunt;
	}

	public int getHdqtsplyqunt(){
		return this.hdqtsplyqunt;
	}

	public int getTotamt(){
		return this.totamt;
	}

	public int getSplyamt(){
		return this.splyamt;
	}

	public int getClamamt(){
		return this.clamamt;
	}
}

/* �ۼ��ð� : Thu Apr 09 20:44:33 KST 2009 */