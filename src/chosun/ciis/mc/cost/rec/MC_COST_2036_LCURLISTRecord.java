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


public class MC_COST_2036_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bgn_dt;
	public String end_dt;

	public MC_COST_2036_LCURLISTRecord(){}

	public void setBgn_dt(String bgn_dt){
		this.bgn_dt = bgn_dt;
	}

	public void setEnd_dt(String end_dt){
		this.end_dt = end_dt;
	}

	public String getBgn_dt(){
		return this.bgn_dt;
	}

	public String getEnd_dt(){
		return this.end_dt;
	}
}

/* �ۼ��ð� : Mon Jul 20 15:26:36 KST 2009 */