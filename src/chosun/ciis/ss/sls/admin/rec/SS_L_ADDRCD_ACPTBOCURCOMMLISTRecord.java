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


package chosun.ciis.ss.sls.admin.rec;

import java.sql.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.ds.*;

/**
 * 
 */


public class SS_L_ADDRCD_ACPTBOCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String addrcd;
	public String addrnm;
	public String useyn;

	public SS_L_ADDRCD_ACPTBOCURCOMMLISTRecord(){}

	public void setAddrcd(String addrcd){
		this.addrcd = addrcd;
	}

	public void setAddrnm(String addrnm){
		this.addrnm = addrnm;
	}

	public void setUseyn(String useyn){
		this.useyn = useyn;
	}

	public String getAddrcd(){
		return this.addrcd;
	}

	public String getAddrnm(){
		return this.addrnm;
	}

	public String getUseyn(){
		return this.useyn;
	}
}

/* �ۼ��ð� : Mon Jul 28 17:55:23 KST 2014 */