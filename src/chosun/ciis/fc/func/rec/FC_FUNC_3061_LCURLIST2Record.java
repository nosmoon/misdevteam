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


package chosun.ciis.fc.func.rec;

import java.sql.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.ds.*;

/**
 * 
 */


public class FC_FUNC_3061_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String publis_cash;
	public String publis_bill_90;
	public String publis_bill_120;
	public String publis_bill_125;

	public FC_FUNC_3061_LCURLIST2Record(){}

	public void setPublis_cash(String publis_cash){
		this.publis_cash = publis_cash;
	}

	public void setPublis_bill_90(String publis_bill_90){
		this.publis_bill_90 = publis_bill_90;
	}

	public void setPublis_bill_120(String publis_bill_120){
		this.publis_bill_120 = publis_bill_120;
	}

	public void setPublis_bill_125(String publis_bill_125){
		this.publis_bill_125 = publis_bill_125;
	}

	public String getPublis_cash(){
		return this.publis_cash;
	}

	public String getPublis_bill_90(){
		return this.publis_bill_90;
	}

	public String getPublis_bill_120(){
		return this.publis_bill_120;
	}

	public String getPublis_bill_125(){
		return this.publis_bill_125;
	}
}

/* �ۼ��ð� : Tue Mar 31 14:44:45 KST 2009 */