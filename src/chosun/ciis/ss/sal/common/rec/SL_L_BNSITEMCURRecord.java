/***************************************************************************************************
* ���ϸ� : SL_L_BNSITEMCURRecord.java
* ��� : ���˹� �����ȸ
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

/**
 * ���˹� �����ȸ
 *
 */


public class SL_L_BNSITEMCURRecord extends java.lang.Object implements java.io.Serializable{

	public String bns_itemcd;
	public String bns_itemnm;
	public int uprc;
	public String mnftwon;
	public String spec;
	public String remk;

	public SL_L_BNSITEMCURRecord(){}

	public void setBns_itemcd(String bns_itemcd){
		this.bns_itemcd = bns_itemcd;
	}

	public void setBns_itemnm(String bns_itemnm){
		this.bns_itemnm = bns_itemnm;
	}

	public void setUprc(int uprc){
		this.uprc = uprc;
	}

	public void setMnftwon(String mnftwon){
		this.mnftwon = mnftwon;
	}

	public void setSpec(String spec){
		this.spec = spec;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getBns_itemcd(){
		return this.bns_itemcd;
	}

	public String getBns_itemnm(){
		return this.bns_itemnm;
	}

	public int getUprc(){
		return this.uprc;
	}

	public String getMnftwon(){
		return this.mnftwon;
	}

	public String getSpec(){
		return this.spec;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* �ۼ��ð� : Tue Dec 02 20:08:01 KST 2003 */