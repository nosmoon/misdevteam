/***************************************************************************************************
* ���ϸ� : .java
* ��� : 
* �ۼ����� : 
* �ۼ��� : ������
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.move.rec;

import java.sql.*;
import chosun.ciis.ss.sls.move.dm.*;
import chosun.ciis.ss.sls.move.ds.*;

/**
 * 
 */


public class SS_S_MOVM_RDR_CLOSIPJU_APTARYRecord extends java.lang.Object implements java.io.Serializable{

	public String addrcd;
	public String addrnm;

	public SS_S_MOVM_RDR_CLOSIPJU_APTARYRecord(){}

	public void setAddrcd(String addrcd){
		this.addrcd = addrcd;
	}

	public void setAddrnm(String addrnm){
		this.addrnm = addrnm;
	}

	public String getAddrcd(){
		return this.addrcd;
	}

	public String getAddrnm(){
		return this.addrnm;
	}
}

/* �ۼ��ð� : Fri Jul 25 13:52:11 KST 2014 */