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


package chosun.ciis.en.rcpm.rec;

import java.sql.*;
import chosun.ciis.en.rcpm.dm.*;
import chosun.ciis.en.rcpm.ds.*;

/**
 * 
 */


public class EN_RCPM_1001_MCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cd_clsf;
	public String cd;
	public String cdnm;
	public String cd_abrv_nm;

	public EN_RCPM_1001_MCURLISTRecord(){}

	public void setCd_clsf(String cd_clsf){
		this.cd_clsf = cd_clsf;
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

	public String getCd_clsf(){
		return this.cd_clsf;
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

/* �ۼ��ð� : Wed Feb 11 09:35:44 KST 2009 */