/***************************************************************************************************
* ���ϸ� : .java
* ��� : 
* �ۼ����� : 
* �ۼ��� : ���½�
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


public class HD_AFFR_9600_MXX_STLM_DESTYRecord extends java.lang.Object implements java.io.Serializable{

	public String cd;
	public String cd_nm;

	public HD_AFFR_9600_MXX_STLM_DESTYRecord(){}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setCd_nm(String cd_nm){
		this.cd_nm = cd_nm;
	}

	public String getCd(){
		return this.cd;
	}

	public String getCd_nm(){
		return this.cd_nm;
	}
}

/* �ۼ��ð� : Wed Sep 13 14:38:11 KST 2017 */