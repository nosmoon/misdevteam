/***************************************************************************************************
* ���ϸ� : SL_S_RDR_NWSPCLAMTCLAMTCURRecord.java
* ��� : ����-������������(�Աݳ�����)
* �ۼ����� : 2004-05-20
* �ۼ��� : �迵��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sal.rdr.rec;

import java.sql.*;
import chosun.ciis.ss.sal.rdr.dm.*;
import chosun.ciis.ss.sal.rdr.ds.*;

/**
 * ����-������������(�Աݳ�����)
 *
 */

public class SL_S_RDR_NWSPCLAMTCLAMTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String rdr_no;
	public String medicd;
	public String dlvdstccd;
	public String clamtmthdcd;
	public String rcpmclsfcd;
	public int clamamt;
	public int clamt;
	public String recpdt;

	public SL_S_RDR_NWSPCLAMTCLAMTCURRecord(){}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setDlvdstccd(String dlvdstccd){
		this.dlvdstccd = dlvdstccd;
	}

	public void setClamtmthdcd(String clamtmthdcd){
		this.clamtmthdcd = clamtmthdcd;
	}

	public void setRcpmclsfcd(String rcpmclsfcd){
		this.rcpmclsfcd = rcpmclsfcd;
	}

	public void setClamamt(int clamamt){
		this.clamamt = clamamt;
	}

	public void setClamt(int clamt){
		this.clamt = clamt;
	}

	public void setRecpdt(String recpdt){
		this.recpdt = recpdt;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getDlvdstccd(){
		return this.dlvdstccd;
	}

	public String getClamtmthdcd(){
		return this.clamtmthdcd;
	}

	public String getRcpmclsfcd(){
		return this.rcpmclsfcd;
	}

	public int getClamamt(){
		return this.clamamt;
	}

	public int getClamt(){
		return this.clamt;
	}

	public String getRecpdt(){
		return this.recpdt;
	}
}

/* �ۼ��ð� : Sat May 22 15:08:35 KST 2004 */