/***************************************************************************************************
* ���ϸ� : SL_MO_L_COMM_APT_THRWDM.java
* ��� :  �ش������Ǿ���Ʈ �ּҸ���� ��ȸ_����Ͽ�
* �ۼ����� : 2017-01-13
* �ۼ��� : �� �� ��
***************************************************************************************************/
/***************************************************************************************************
* �������� : ����Ʈ�ڵ巹�ڵ忡 ������Ʈ �߰�
* ������ : �弱��
* �������� : 2017-01-16
* ��� :
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
 *
 */


public class SL_MO_L_COMM_APT_THRWADDRCDCURRecord extends java.lang.Object implements java.io.Serializable{

	public String addrcd;
	public String addrnm;
	public String donglist;

	public SL_MO_L_COMM_APT_THRWADDRCDCURRecord(){}

	public void setAddrcd(String addrcd){
		this.addrcd = addrcd;
	}

	public void setAddrnm(String addrnm){
		this.addrnm = addrnm;
	}

	public void setDonglist(String donglist){
		this.donglist = donglist;
	}

	public String getAddrcd(){
		return this.addrcd;
	}

	public String getAddrnm(){
		return this.addrnm;
	}

	public String getDonglist(){
		return this.donglist;
	}
}

/* �ۼ��ð� : Mon Jan 16 15:25:08 KST 2017 */