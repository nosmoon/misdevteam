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


public class MC_COST_3010_ACURLIST_08Record extends java.lang.Object implements java.io.Serializable{

	public String bsbbcd_no_entry;
	public String bsbbcd_err;

	public MC_COST_3010_ACURLIST_08Record(){}

	public void setBsbbcd_no_entry(String bsbbcd_no_entry){
		this.bsbbcd_no_entry = bsbbcd_no_entry;
	}

	public void setBsbbcd_err(String bsbbcd_err){
		this.bsbbcd_err = bsbbcd_err;
	}

	public String getBsbbcd_no_entry(){
		return this.bsbbcd_no_entry;
	}

	public String getBsbbcd_err(){
		return this.bsbbcd_err;
	}
}

/* �ۼ��ð� : Mon May 11 14:20:32 KST 2009 */