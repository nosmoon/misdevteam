/***************************************************************************************************
* ���ϸ� : SL_S_MILGPAYMEDICURRecord.java
* ��� : ������������(���ϸ������޳����˾�-����ȸ)
* �ۼ����� : 2004-06-03
* �ۼ��� : �迵��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sal.rdr.rec;

import java.sql.*;
import chosun.ciis.ss.sal.rdr.dm.*;
import chosun.ciis.ss.sal.rdr.ds.*;

/**
 * ������������(���ϸ������޳����˾�-����ȸ)
 *
 */

public class SL_S_MILGPAYMEDICURRecord extends java.lang.Object implements java.io.Serializable{

	public String medicd;
	public String medinm;

	public SL_S_MILGPAYMEDICURRecord(){}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getMedinm(){
		return this.medinm;
	}
}

/* �ۼ��ð� : Sat Jun 05 20:57:14 KST 2004 */