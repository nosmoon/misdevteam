/***************************************************************************************************
* ���ϸ� : SL_S_RDR_NWSPCLAMTDEFAULTCURRecord.java
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

public class SL_S_RDR_NWSPCLAMTDEFAULTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String rdr_no;
	public String medicd;
	public String dlvdstccd;
	public String clamtmthdcd;
	public int clamqty;
	public int clamamt;

	public SL_S_RDR_NWSPCLAMTDEFAULTCURRecord(){}

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

	public void setClamqty(int clamqty){
		this.clamqty = clamqty;
	}

	public void setClamamt(int clamamt){
		this.clamamt = clamamt;
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

	public int getClamqty(){
		return this.clamqty;
	}

	public int getClamamt(){
		return this.clamamt;
	}
}

/* �ۼ��ð� : Sat May 22 15:08:35 KST 2004 */