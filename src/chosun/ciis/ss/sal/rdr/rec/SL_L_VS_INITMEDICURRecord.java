/***************************************************************************************************
* ���ϸ� : SL_L_VS_INITMEDICURRecord.java
* ��� : VacationStop����-�ʱ�ȭ��
* �ۼ����� : 2004-06-10
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
 * VacationStop����-�ʱ�ȭ��
 *
 */

public class SL_L_VS_INITMEDICURRecord extends java.lang.Object implements java.io.Serializable{

	public String medicd;
	public String cicdnm;
	public String cimgtcd2;
	public int subsuprc;

	public SL_L_VS_INITMEDICURRecord(){}

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

/* �ۼ��ð� : Thu Jun 10 21:15:30 KST 2004 */