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


package chosun.ciis.hd.affr.rec;

import java.sql.*;
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.ds.*;

/**
 * 
 */


public class HD_AFFR_9704_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cd;
	public String cd_abrv_nm;

	public HD_AFFR_9704_LCURLISTRecord(){}

	public void setCd(String cd){
		this.cd = cd;
	}


	public void setCd_abrv_nm(String cd_abrv_nm){
		this.cd_abrv_nm = cd_abrv_nm;
	}


	public String getCd(){
		return this.cd;
	}


	public String getCd_abrv_nm(){
		return this.cd_abrv_nm;
	}
}

/* �ۼ��ð� : Tue Jun 23 14:13:25 KST 2009 */