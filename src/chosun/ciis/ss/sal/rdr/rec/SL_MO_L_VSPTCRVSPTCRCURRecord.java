/***************************************************************************************************
* ���ϸ� :SL_MO_L_VSPTCRVSPTCRCURRecord.java_����Ͽ�
* ��� : �Ǹ�-���ڰ���-���������˻�-����������ȸ-���������˾�-�޵�����Ʈ
* �ۼ����� : 2017-02-06
* �ۼ��� : �� �� ��
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
 *
 */


public class SL_MO_L_VSPTCRVSPTCRCURRecord extends java.lang.Object implements java.io.Serializable{

	public String suspfrdt;
	public String susptodt;
	public String medinm;
	public String bonm;
	public String clsfnm;

	public SL_MO_L_VSPTCRVSPTCRCURRecord(){}

	public void setSuspfrdt(String suspfrdt){
		this.suspfrdt = suspfrdt;
	}

	public void setSusptodt(String susptodt){
		this.susptodt = susptodt;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setClsfnm(String clsfnm){
		this.clsfnm = clsfnm;
	}

	public String getSuspfrdt(){
		return this.suspfrdt;
	}

	public String getSusptodt(){
		return this.susptodt;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getClsfnm(){
		return this.clsfnm;
	}
}

/* �ۼ��ð� : Mon Feb 06 10:55:12 KST 2017 */