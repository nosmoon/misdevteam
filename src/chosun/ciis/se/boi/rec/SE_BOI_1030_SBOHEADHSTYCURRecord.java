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


package chosun.ciis.se.boi.rec;

import java.sql.*;
import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.ds.*;

/**
 * 
 */


public class SE_BOI_1030_SBOHEADHSTYCURRecord extends java.lang.Object implements java.io.Serializable{

	public String hsty_seq;
	public String yymm;
	public String hsty_matt;

	public SE_BOI_1030_SBOHEADHSTYCURRecord(){}

	public void setHsty_seq(String hsty_seq){
		this.hsty_seq = hsty_seq;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setHsty_matt(String hsty_matt){
		this.hsty_matt = hsty_matt;
	}

	public String getHsty_seq(){
		return this.hsty_seq;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getHsty_matt(){
		return this.hsty_matt;
	}
}

/* �ۼ��ð� : Tue Jan 20 18:12:34 KST 2009 */