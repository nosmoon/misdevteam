/***************************************************************************************************
* ���ϸ� : SS_S_RDR_EXTN_CYBCAMPCURCOMMLISTRecord.java
* ��� : Ȯ����Ȳ-���̹�Ȯ��-��ȸ �� ��ü,���� ����� ���� Record
* �ۼ����� : 2004-07-24
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
 * Ȯ����Ȳ-���̹�Ȯ��-��ȸ �� ��ü,���� ����� ���� Record
 */


public class SS_S_RDR_EXTN_CYBCAMPCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String medicd;
	public String medinm;
	public int alonamt;
	public int cnvsalonamt;

	public SS_S_RDR_EXTN_CYBCAMPCURCOMMLISTRecord(){}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setAlonamt(int alonamt){
		this.alonamt = alonamt;
	}

	public void setCnvsalonamt(int cnvsalonamt){
		this.cnvsalonamt = cnvsalonamt;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public int getAlonamt(){
		return this.alonamt;
	}

	public int getCnvsalonamt(){
		return this.cnvsalonamt;
	}
}

/* �ۼ��ð� : Sat Aug 07 14:15:15 KST 2004 */