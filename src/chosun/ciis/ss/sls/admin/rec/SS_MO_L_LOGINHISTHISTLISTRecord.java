/***************************************************************************************************
* ���ϸ� : SS_MO_L_LOGINHISTHISTLISTRecord.java
* ��� :  CIIS-�Ǹ�-������������-����Ϸα��ΰ���-�α����̷��� ���� Record
* �ۼ����� : 2017-07-10
* �ۼ��� : �弱��
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
 *  CIIS-�Ǹ�-������������-����Ϸα��ΰ���-�α����̷��� ���� Record
 */


public class SS_MO_L_LOGINHISTHISTLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bocd;
	public String bonm;
	public String sso_id;
	public String sso_nm;
	public String log_dt;

	public SS_MO_L_LOGINHISTHISTLISTRecord(){}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setSso_id(String sso_id){
		this.sso_id = sso_id;
	}

	public void setSso_nm(String sso_nm){
		this.sso_nm = sso_nm;
	}

	public void setLog_dt(String log_dt){
		this.log_dt = log_dt;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getSso_id(){
		return this.sso_id;
	}

	public String getSso_nm(){
		return this.sso_nm;
	}

	public String getLog_dt(){
		return this.log_dt;
	}
}

/* �ۼ��ð� : Mon Jul 10 17:17:49 KST 2017 */