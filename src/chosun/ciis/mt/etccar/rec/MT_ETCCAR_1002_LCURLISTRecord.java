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


package chosun.ciis.mt.etccar.rec;

import java.sql.*;
import chosun.ciis.mt.etccar.dm.*;
import chosun.ciis.mt.etccar.ds.*;

/**
 * 
 */


public class MT_ETCCAR_1002_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String use_usag;
	public String cd_nm;

	public MT_ETCCAR_1002_LCURLISTRecord(){}

	public void setUse_usag(String use_usag){
		this.use_usag = use_usag;
	}

	public void setCd_nm(String cd_nm){
		this.cd_nm = cd_nm;
	}

	public String getUse_usag(){
		return this.use_usag;
	}

	public String getCd_nm(){
		return this.cd_nm;
	}
}

/* �ۼ��ð� : Mon Jul 06 13:39:16 KST 2009 */