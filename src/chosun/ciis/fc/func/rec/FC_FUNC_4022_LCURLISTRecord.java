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


public class FC_FUNC_4022_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String stat_cd;
	public String stat_dt;
	public String gf_commcdynm;

	public FC_FUNC_4022_LCURLISTRecord(){}

	public void setStat_cd(String stat_cd){
		this.stat_cd = stat_cd;
	}

	public void setStat_dt(String stat_dt){
		this.stat_dt = stat_dt;
	}

	public void setGf_commcdynm(String gf_commcdynm){
		this.gf_commcdynm = gf_commcdynm;
	}

	public String getStat_cd(){
		return this.stat_cd;
	}

	public String getStat_dt(){
		return this.stat_dt;
	}

	public String getGf_commcdynm(){
		return this.gf_commcdynm;
	}
}

/* �ۼ��ð� : Fri Mar 06 15:26:35 KST 2009 */