/***************************************************************************************************
* ���ϸ� : SS_L_SHFT_PYMT_II.java
* ��� :   ��������-����-�ڵ���ü-������2-�����ڻ���ȸ
* �ۼ����� : 2004-10-03
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
* ��������	: 
* ������	: 
* ��������	:
* ���		: 
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * ��������-����-�ڵ���ü-������2-�����ڻ���ȸ
 *
 */


public class SS_S_SHFT_PYMT_IICNTRCURRecord extends java.lang.Object implements java.io.Serializable{

	public String aplcdt;
	public String shftclsf;
	public String rdr_no;
	public String mediynm;
	public String subsstat;

	public SS_S_SHFT_PYMT_IICNTRCURRecord(){}

	public void setAplcdt(String aplcdt){
		this.aplcdt = aplcdt;
	}

	public void setShftclsf(String shftclsf){
		this.shftclsf = shftclsf;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setMediynm(String mediynm){
		this.mediynm = mediynm;
	}

	public void setSubsstat(String subsstat){
		this.subsstat = subsstat;
	}

	public String getAplcdt(){
		return this.aplcdt;
	}

	public String getShftclsf(){
		return this.shftclsf;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getMediynm(){
		return this.mediynm;
	}

	public String getSubsstat(){
		return this.subsstat;
	}
}

/* �ۼ��ð� : Sun Oct 03 20:39:16 KST 2004 */