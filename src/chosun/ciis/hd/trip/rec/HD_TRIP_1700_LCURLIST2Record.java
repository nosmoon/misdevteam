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


package chosun.ciis.hd.trip.rec;

import java.sql.*;
import chosun.ciis.hd.trip.dm.*;
import chosun.ciis.hd.trip.ds.*;

/**
 * 
 */


public class HD_TRIP_1700_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String pay_basi_clsf;
	public String dspch_clsf;
	public String base_alon;

	public HD_TRIP_1700_LCURLIST2Record(){}

	public void setPay_basi_clsf(String pay_basi_clsf){
		this.pay_basi_clsf = pay_basi_clsf;
	}

	public void setDspch_clsf(String dspch_clsf){
		this.dspch_clsf = dspch_clsf;
	}

	public void setBase_alon(String base_alon){
		this.base_alon = base_alon;
	}

	public String getPay_basi_clsf(){
		return this.pay_basi_clsf;
	}

	public String getDspch_clsf(){
		return this.dspch_clsf;
	}

	public String getBase_alon(){
		return this.base_alon;
	}
}

/* �ۼ��ð� : Wed May 13 14:39:24 KST 2009 */