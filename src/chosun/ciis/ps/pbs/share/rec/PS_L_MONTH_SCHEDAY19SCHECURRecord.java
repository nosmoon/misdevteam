/***************************************************************************************************
* ���ϸ� : PS_L_CALENDAR
* ��� : ���Ǳ� ����-�޷�
* �ۼ����� : 2004-03-09
* �ۼ��� : ����ǥ
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ps.pbs.share.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.share.dm.*;
import chosun.ciis.ps.pbs.share.ds.*;

/**
 * ���Ǳ� ����-�޷�
 *
 */


public class PS_L_MONTH_SCHEDAY19SCHECURRecord extends java.lang.Object implements java.io.Serializable{

	public String seq;
	public String frdt;
	public String todt;
	public String remk;
	public String endyn;
	public String deptcd;

	public PS_L_MONTH_SCHEDAY19SCHECURRecord(){}

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

	public void setEndyn(String endyn){
		this.endyn = endyn;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
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

	public String getEndyn(){
		return this.endyn;
	}

	public String getDeptcd(){
		return this.deptcd;
	}
}

/* �ۼ��ð� : Wed Mar 10 14:11:09 KST 2004 */