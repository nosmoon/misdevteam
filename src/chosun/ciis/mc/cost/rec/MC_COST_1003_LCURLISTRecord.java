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


public class MC_COST_1003_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bbpct_count;
	public String yeasancd_count;
	public String cdbuseo_count;

	public MC_COST_1003_LCURLISTRecord(){}

	public void setBbpct_count(String bbpct_count){
		this.bbpct_count = bbpct_count;
	}

	public void setYeasancd_count(String yeasancd_count){
		this.yeasancd_count = yeasancd_count;
	}

	public void setCdbuseo_count(String cdbuseo_count){
		this.cdbuseo_count = cdbuseo_count;
	}

	public String getBbpct_count(){
		return this.bbpct_count;
	}

	public String getYeasancd_count(){
		return this.yeasancd_count;
	}

	public String getCdbuseo_count(){
		return this.cdbuseo_count;
	}
}

/* �ۼ��ð� : Thu Apr 16 10:41:54 KST 2009 */