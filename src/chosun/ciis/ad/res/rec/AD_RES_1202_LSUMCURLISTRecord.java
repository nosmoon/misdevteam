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


package chosun.ciis.ad.res.rec;

import java.sql.*;
import chosun.ciis.ad.res.dm.*;
import chosun.ciis.ad.res.ds.*;

/**
 * 
 */


public class AD_RES_1202_LSUMCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String lbl;
	public String cnt;
	public String advt_fee;

	public AD_RES_1202_LSUMCURLISTRecord(){}

	public void setLbl(String lbl){
		this.lbl = lbl;
	}

	public void setCnt(String cnt){
		this.cnt = cnt;
	}

	public void setAdvt_fee(String advt_fee){
		this.advt_fee = advt_fee;
	}

	public String getLbl(){
		return this.lbl;
	}

	public String getCnt(){
		return this.cnt;
	}

	public String getAdvt_fee(){
		return this.advt_fee;
	}
}

/* �ۼ��ð� : Fri May 26 20:11:44 KST 2017 */