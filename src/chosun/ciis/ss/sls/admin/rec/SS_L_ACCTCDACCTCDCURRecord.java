/***************************************************************************************************
* ���ϸ� : SS_L_ACCTCDACCTCDCURRecord.java
* ��� : ������-�����ڵ�-����� ���� Record
* �ۼ����� : 2004-04-24
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.admin.rec;

import java.sql.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.ds.*;

/**
 * ������-�����ڵ�-����� ���� Record
 */


public class SS_L_ACCTCDACCTCDCURRecord extends java.lang.Object implements java.io.Serializable{

	public String acctcd;
	public String acctnm;
	public String imptexpnclsf;
	public String leaf_inyn;
	public String empadvyn;

	public SS_L_ACCTCDACCTCDCURRecord(){}

	public void setAcctcd(String acctcd){
		this.acctcd = acctcd;
	}

	public void setAcctnm(String acctnm){
		this.acctnm = acctnm;
	}

	public void setImptexpnclsf(String imptexpnclsf){
		this.imptexpnclsf = imptexpnclsf;
	}

	public void setLeaf_inyn(String leaf_inyn){
		this.leaf_inyn = leaf_inyn;
	}

	public void setEmpadvyn(String empadvyn){
		this.empadvyn = empadvyn;
	}

	public String getAcctcd(){
		return this.acctcd;
	}

	public String getAcctnm(){
		return this.acctnm;
	}

	public String getImptexpnclsf(){
		return this.imptexpnclsf;
	}

	public String getLeaf_inyn(){
		return this.leaf_inyn;
	}

	public String getEmpadvyn(){
		return this.empadvyn;
	}
}

/* �ۼ��ð� : Sat Jul 03 17:32:28 KST 2004 */