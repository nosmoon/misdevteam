/***************************************************************************************************
* ���ϸ� : SS_L_DAY_SCHEDAYSCHECURRecord.java
* ��� : ��������-����������-�Ϻ� ���� ����� ���� Record
* �ۼ����� : 2004-04-24
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/

package chosun.ciis.ss.sls.share.rec;

import java.sql.*;
import chosun.ciis.ss.sls.share.dm.*;
import chosun.ciis.ss.sls.share.ds.*;

/**
 * ��������-����������-�Ϻ� ���� ����� ���� Record
 */

public class SS_L_DAY_SCHEDAYSCHECURRecord extends java.lang.Object implements java.io.Serializable{

	public String seq;
	public String frdt;
	public String todt;
	public String remk;
	public String schemangitemcd;
	public String schemangitemcd_nm;
	public String schemangunitcd;
	public String schemangunitcd_nm;

	public SS_L_DAY_SCHEDAYSCHECURRecord(){}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setSchemangitemcd(String schemangitemcd){
		this.schemangitemcd = schemangitemcd;
	}

	public void setSchemangitemcd_nm(String schemangitemcd_nm){
		this.schemangitemcd_nm = schemangitemcd_nm;
	}

	public void setSchemangunitcd(String schemangunitcd){
		this.schemangunitcd = schemangunitcd;
	}

	public void setSchemangunitcd_nm(String schemangunitcd_nm){
		this.schemangunitcd_nm = schemangunitcd_nm;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getSchemangitemcd(){
		return this.schemangitemcd;
	}

	public String getSchemangitemcd_nm(){
		return this.schemangitemcd_nm;
	}

	public String getSchemangunitcd(){
		return this.schemangunitcd;
	}

	public String getSchemangunitcd_nm(){
		return this.schemangunitcd_nm;
	}
}

/* �ۼ��ð� : Mon Jun 07 14:07:48 KST 2004 */