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


package chosun.ciis.hd.saly.rec;

import java.sql.*;
import chosun.ciis.hd.saly.dm.*;
import chosun.ciis.hd.saly.ds.*;

/**
 * 
 */


public class HD_SALY_1202_MCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String duty_alon_basi_frdt;
	public String duty_alon_basi_todt;

	public HD_SALY_1202_MCURLISTRecord(){}

	public void setDuty_alon_basi_frdt(String duty_alon_basi_frdt){
		this.duty_alon_basi_frdt = duty_alon_basi_frdt;
	}

	public void setDuty_alon_basi_todt(String duty_alon_basi_todt){
		this.duty_alon_basi_todt = duty_alon_basi_todt;
	}

	public String getDuty_alon_basi_frdt(){
		return this.duty_alon_basi_frdt;
	}

	public String getDuty_alon_basi_todt(){
		return this.duty_alon_basi_todt;
	}
}

/* �ۼ��ð� : Mon Apr 27 20:41:30 KST 2009 */