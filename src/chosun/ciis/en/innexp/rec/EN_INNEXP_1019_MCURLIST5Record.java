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


package chosun.ciis.en.innexp.rec;

import java.sql.*;
import chosun.ciis.en.innexp.dm.*;
import chosun.ciis.en.innexp.ds.*;

/**
 * 
 */


public class EN_INNEXP_1019_MCURLIST5Record extends java.lang.Object implements java.io.Serializable{

	public String reven_stot;
	public String expn_stot;
	public String bal_stot;

	public EN_INNEXP_1019_MCURLIST5Record(){}

	public void setReven_stot(String reven_stot){
		this.reven_stot = reven_stot;
	}

	public void setExpn_stot(String expn_stot){
		this.expn_stot = expn_stot;
	}

	public void setBal_stot(String bal_stot){
		this.bal_stot = bal_stot;
	}

	public String getReven_stot(){
		return this.reven_stot;
	}

	public String getExpn_stot(){
		return this.expn_stot;
	}

	public String getBal_stot(){
		return this.bal_stot;
	}
}

/* �ۼ��ð� : Fri May 22 16:43:35 KST 2009 */