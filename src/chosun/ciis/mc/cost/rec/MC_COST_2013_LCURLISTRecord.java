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


package chosun.ciis.mc.cost.rec;

import java.sql.*;
import chosun.ciis.mc.cost.dm.*;
import chosun.ciis.mc.cost.ds.*;

/**
 * 
 */


public class MC_COST_2013_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cost_dstb_cd;
	public String intfce_yn;

	public MC_COST_2013_LCURLISTRecord(){}

	public void setCost_dstb_cd(String cost_dstb_cd){
		this.cost_dstb_cd = cost_dstb_cd;
	}

	public void setIntfce_yn(String intfce_yn){
		this.intfce_yn = intfce_yn;
	}

	public String getCost_dstb_cd(){
		return this.cost_dstb_cd;
	}

	public String getIntfce_yn(){
		return this.intfce_yn;
	}
}

/* �ۼ��ð� : Wed May 06 17:51:57 KST 2009 */