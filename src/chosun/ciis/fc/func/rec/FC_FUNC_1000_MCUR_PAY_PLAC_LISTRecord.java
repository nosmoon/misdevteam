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


public class FC_FUNC_1000_MCUR_PAY_PLAC_LISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cd_nm;
	public String cd;

	public FC_FUNC_1000_MCUR_PAY_PLAC_LISTRecord(){}

	public void setCd_nm(String cd_nm){
		this.cd_nm = cd_nm;
	}

	public void setCd(String cd){
		this.cd = cd;
	}

	public String getCd_nm(){
		return this.cd_nm;
	}

	public String getCd(){
		return this.cd;
	}
}

/* �ۼ��ð� : Thu Mar 05 21:59:33 KST 2009 */