/***************************************************************************************************
* ���ϸ� : SS_L_NWSPITEMCOST_BUSNCURCOMMLISTRecord.java
* ��� : ��������-�Ź�������ǰ-���(�������)-����� ���� Record
* �ۼ����� : 2004-02-07
* �ۼ��� : ��뼷
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
 * ��������-�Ź�������ǰ-���(�������)-����� ���� Record
 */

public class SS_L_NWSPITEMCOST_BUSNCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String deptnm;
	public String areacd;
	public String areanm;
	public String bocd;
	public String bonm;
	public String basidt;
	public int amt;
	public int busnchrgamt;
	public int busnchrgclamtbal;
	public String busnchrgclamtend;
	public String busnchrgclamtdt;

	public SS_L_NWSPITEMCOST_BUSNCURCOMMLISTRecord(){}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setAreanm(String areanm){
		this.areanm = areanm;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setBasidt(String basidt){
		this.basidt = basidt;
	}

	public void setAmt(int amt){
		this.amt = amt;
	}

	public void setBusnchrgamt(int busnchrgamt){
		this.busnchrgamt = busnchrgamt;
	}

	public void setBusnchrgclamtbal(int busnchrgclamtbal){
		this.busnchrgclamtbal = busnchrgclamtbal;
	}

	public void setBusnchrgclamtend(String busnchrgclamtend){
		this.busnchrgclamtend = busnchrgclamtend;
	}

	public void setBusnchrgclamtdt(String busnchrgclamtdt){
		this.busnchrgclamtdt = busnchrgclamtdt;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getDeptnm(){
		return this.deptnm;
	}

	public String getAreacd(){
		return this.areacd;
	}

	public String getAreanm(){
		return this.areanm;
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

	public int getAmt(){
		return this.amt;
	}

	public int getBusnchrgamt(){
		return this.busnchrgamt;
	}

	public int getBusnchrgclamtbal(){
		return this.busnchrgclamtbal;
	}

	public String getBusnchrgclamtend(){
		return this.busnchrgclamtend;
	}

	public String getBusnchrgclamtdt(){
		return this.busnchrgclamtdt;
	}
}

/* �ۼ��ð� : Wed Feb 11 10:12:46 KST 2004 */