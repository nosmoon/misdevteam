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


public class FC_FUNC_8062_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String frex_cd;
	public String exrate;

	public FC_FUNC_8062_LCURLISTRecord(){}

	public void setFrex_cd(String frex_cd){
		this.frex_cd = frex_cd;
	}

	public void setExrate(String exrate){
		this.exrate = exrate;
	}

	public String getFrex_cd(){
		return this.frex_cd;
	}

	public String getExrate(){
		return this.exrate;
	}
}

/* �ۼ��ð� : Sat Apr 11 13:18:30 KST 2009 */