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


package chosun.ciis.mt.papinout.rec;

import java.sql.*;
import chosun.ciis.mt.papinout.dm.*;
import chosun.ciis.mt.papinout.ds.*;

/**
 * 
 */


public class MT_PAPINOUT_1003_LCURLIST3Record extends java.lang.Object implements java.io.Serializable{

	public String pap_std;
	public String issu_pcnt;
	public String slip_qty;

	public MT_PAPINOUT_1003_LCURLIST3Record(){}

	public void setPap_std(String pap_std){
		this.pap_std = pap_std;
	}

	public void setIssu_pcnt(String issu_pcnt){
		this.issu_pcnt = issu_pcnt;
	}

	public void setSlip_qty(String slip_qty){
		this.slip_qty = slip_qty;
	}

	public String getPap_std(){
		return this.pap_std;
	}

	public String getIssu_pcnt(){
		return this.issu_pcnt;
	}

	public String getSlip_qty(){
		return this.slip_qty;
	}
}

/* �ۼ��ð� : Tue Apr 14 20:36:25 KST 2009 */