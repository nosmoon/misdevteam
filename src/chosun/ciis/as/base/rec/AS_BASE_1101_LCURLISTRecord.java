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


package chosun.ciis.as.base.rec;

import java.sql.*;
import chosun.ciis.as.base.dm.*;
import chosun.ciis.as.base.ds.*;

/**
 * 
 */


public class AS_BASE_1101_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cd_type;
	public String cd;
	public String cdnm;
	public String cd_abrv_nm;

	public AS_BASE_1101_LCURLISTRecord(){}

	public void setCd_type(String cd_type){
		this.cd_type = cd_type;
	}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setCdnm(String cdnm){
		this.cdnm = cdnm;
	}

	public void setCd_abrv_nm(String cd_abrv_nm){
		this.cd_abrv_nm = cd_abrv_nm;
	}

	public String getCd_type(){
		return this.cd_type;
	}

	public String getCd(){
		return this.cd;
	}

	public String getCdnm(){
		return this.cdnm;
	}

	public String getCd_abrv_nm(){
		return this.cd_abrv_nm;
	}
}

/* �ۼ��ð� : Tue Feb 24 19:29:15 KST 2009 */