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


package chosun.ciis.ad.bas.rec;

import java.sql.*;
import chosun.ciis.ad.bas.dm.*;
import chosun.ciis.ad.bas.ds.*;

/**
 * 
 */


public class AD_BAS_1617_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String basi_dt;
	public String avg_amt;

	public AD_BAS_1617_LCURLISTRecord(){}

	public void setBasi_dt(String basi_dt){
		this.basi_dt = basi_dt;
	}

	public void setAvg_amt(String avg_amt){
		this.avg_amt = avg_amt;
	}

	public String getBasi_dt(){
		return this.basi_dt;
	}

	public String getAvg_amt(){
		return this.avg_amt;
	}
}

/* �ۼ��ð� : Wed Aug 26 14:16:05 KST 2009 */