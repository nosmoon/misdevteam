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


public class MC_BUDG_4063_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String sub_cd;
	public String clos_yn;
	public String incmg_dt_tm;

	public MC_BUDG_4063_LCURLISTRecord(){}

	public void setSub_cd(String sub_cd){
		this.sub_cd = sub_cd;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public void setIncmg_dt_tm(String incmg_dt_tm){
		this.incmg_dt_tm = incmg_dt_tm;
	}

	public String getSub_cd(){
		return this.sub_cd;
	}

	public String getClos_yn(){
		return this.clos_yn;
	}

	public String getIncmg_dt_tm(){
		return this.incmg_dt_tm;
	}
}

/* �ۼ��ð� : Mon May 18 17:37:28 KST 2009 */