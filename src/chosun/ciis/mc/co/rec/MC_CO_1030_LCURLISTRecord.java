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


package chosun.ciis.mc.co.rec;

import java.sql.*;
import chosun.ciis.mc.co.dm.*;
import chosun.ciis.mc.co.ds.*;

/**
 * 
 */


public class MC_CO_1030_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cd;
	public String cdnm;
	public String cd_cdnm;

	public MC_CO_1030_LCURLISTRecord(){}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setCdnm(String cdnm){
		this.cdnm = cdnm;
	}

	public void setCd_cdnm(String cd_cdnm){
		this.cd_cdnm = cd_cdnm;
	}

	public String getCd(){
		return this.cd;
	}

	public String getCdnm(){
		return this.cdnm;
	}

	public String getCd_cdnm(){
		return this.cd_cdnm;
	}
}

/* �ۼ��ð� : Thu May 14 10:29:00 KST 2009 */