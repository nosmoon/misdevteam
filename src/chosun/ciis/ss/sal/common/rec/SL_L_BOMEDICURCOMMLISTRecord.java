/***************************************************************************************************
* ���ϸ� : SL_L_BOMEDICURCOMMLISTRecord.java
* ��� : ������޸�ü �����ȸ
* �ۼ����� : 2003-12-27
* �ۼ��� : �迵��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/


package chosun.ciis.ss.sal.common.rec;

import java.sql.*;
import chosun.ciis.ss.sal.common.dm.*;
import chosun.ciis.ss.sal.common.ds.*;

/**
 * ������޸�ü ���
 *
 */
public class SL_L_BOMEDICURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String medicd;
	public String cicdnm;
	public String cimgtcd2;
	public int subsuprc;

	public SL_L_BOMEDICURCOMMLISTRecord(){}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setCicdnm(String cicdnm){
		this.cicdnm = cicdnm;
	}

	public void setCimgtcd2(String cimgtcd2){
		this.cimgtcd2 = cimgtcd2;
	}

	public void setSubsuprc(int subsuprc){
		this.subsuprc = subsuprc;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getCicdnm(){
		return this.cicdnm;
	}

	public String getCimgtcd2(){
		return this.cimgtcd2;
	}

	public int getSubsuprc(){
		return this.subsuprc;
	}
}

/* �ۼ��ð� : Mon Dec 29 14:35:59 KST 2003 */