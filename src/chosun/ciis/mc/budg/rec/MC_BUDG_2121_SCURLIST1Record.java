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


package chosun.ciis.mc.budg.rec;

import java.sql.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.ds.*;

/**
 * 
 */


public class MC_BUDG_2121_SCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String evnt_cd;
	public String bgn_dt;
	public String last_dt;

	public MC_BUDG_2121_SCURLIST1Record(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public void setBgn_dt(String bgn_dt){
		this.bgn_dt = bgn_dt;
	}

	public void setLast_dt(String last_dt){
		this.last_dt = last_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getBgn_dt(){
		return this.bgn_dt;
	}

	public String getLast_dt(){
		return this.last_dt;
	}
}

/* �ۼ��ð� : Tue May 26 15:37:18 KST 2009 */