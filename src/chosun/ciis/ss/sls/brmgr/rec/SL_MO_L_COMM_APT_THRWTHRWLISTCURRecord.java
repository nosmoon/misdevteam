/***************************************************************************************************
* ���ϸ� : SL_MO_L_COMM_APT_THRWTHRWLISTCURRecord.java
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


public class SL_MO_L_COMM_APT_THRWTHRWLISTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String bocd;
	public String invsgdt;
	public String invsgno;
	public String invsghhmm;
	public String addrnm;
	public String invsgpers;
	public String addrcd;
	public String dongno;
	public String regdt;

	public SL_MO_L_COMM_APT_THRWTHRWLISTCURRecord(){}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setInvsgdt(String invsgdt){
		this.invsgdt = invsgdt;
	}

	public void setInvsgno(String invsgno){
		this.invsgno = invsgno;
	}

	public void setInvsghhmm(String invsghhmm){
		this.invsghhmm = invsghhmm;
	}

	public void setAddrnm(String addrnm){
		this.addrnm = addrnm;
	}

	public void setInvsgpers(String invsgpers){
		this.invsgpers = invsgpers;
	}

	public void setAddrcd(String addrcd){
		this.addrcd = addrcd;
	}

	public void setDongno(String dongno){
		this.dongno = dongno;
	}

	public void setRegdt(String regdt){
		this.regdt = regdt;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getInvsgdt(){
		return this.invsgdt;
	}

	public String getInvsgno(){
		return this.invsgno;
	}

	public String getInvsghhmm(){
		return this.invsghhmm;
	}

	public String getAddrnm(){
		return this.addrnm;
	}

	public String getInvsgpers(){
		return this.invsgpers;
	}

	public String getAddrcd(){
		return this.addrcd;
	}

	public String getDongno(){
		return this.dongno;
	}

	public String getRegdt(){
		return this.regdt;
	}
}

/* �ۼ��ð� : Mon Jan 16 15:25:08 KST 2017 */