/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.fc.func.rec;

import java.sql.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.ds.*;

/**
 * 
 */


public class FC_FUNC_1012_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String stat_cd;
	public String stat_dt;
	public String stat_cd_nm;

	public FC_FUNC_1012_LCURLISTRecord(){}

	public void setStat_cd(String stat_cd){
		this.stat_cd = stat_cd;
	}

	public void setStat_dt(String stat_dt){
		this.stat_dt = stat_dt;
	}

	public void setStat_cd_nm(String stat_cd_nm){
		this.stat_cd_nm = stat_cd_nm;
	}

	public String getStat_cd(){
		return this.stat_cd;
	}

	public String getStat_dt(){
		return this.stat_dt;
	}

	public String getStat_cd_nm(){
		return this.stat_cd_nm;
	}
}

/* �ۼ��ð� : Wed Apr 22 17:39:30 KST 2009 */