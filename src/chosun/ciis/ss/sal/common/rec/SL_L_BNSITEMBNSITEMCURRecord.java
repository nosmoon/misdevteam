/***************************************************************************************************
* ���ϸ� : .java
* ��� : *���˹��ڵ�˻�(�����ȸ)
* �ۼ����� : 2009-06-15
* �ۼ��� : �輼��
***************************************************************************************************/


package chosun.ciis.ss.sal.common.rec;

import java.sql.*;
import chosun.ciis.ss.sal.common.dm.*;
import chosun.ciis.ss.sal.common.ds.*;

/**
 * ���˹��ڵ�˻�(�����ȸ)
 */

public class SL_L_BNSITEMBNSITEMCURRecord extends java.lang.Object implements java.io.Serializable{

	public String bns_itemcd;
	public String bns_itemnm;
	public int uprc;
	public String mnftwon;
	public String spec;
	public String remk;
	public String useclsf;
	public String useyn;

	public SL_L_BNSITEMBNSITEMCURRecord(){}

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

	public void setUseclsf(String useclsf){
		this.useclsf = useclsf;
	}

	public void setUseyn(String useyn){
		this.useyn = useyn;
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

	public String getUseclsf(){
		return this.useclsf;
	}

	public String getUseyn(){
		return this.useyn;
	}
}

/* �ۼ��ð� : Mon Jun 15 16:06:04 KST 2009 */