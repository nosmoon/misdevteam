/***************************************************************************************************
* ���ϸ� : .java
* ��� :  ����-���ݰ�꼭-������ȸ(����Ʈ��)
* �ۼ����� : 2010-03-08
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.co.smtb.rec;

import java.sql.*;
import chosun.ciis.co.smtb.dm.*;
import chosun.ciis.co.smtb.ds.*;

/**
 * ����-���ݰ�꼭-������ȸ(����Ʈ��)
 */


public class CO_SMTB_1031_LSEMURO_STAT_CD_LISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cd;
	public String cdnm;
	public String cd_abrv_nm;

	public CO_SMTB_1031_LSEMURO_STAT_CD_LISTRecord(){}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setCdnm(String cdnm){
		this.cdnm = cdnm;
	}

	public void setCd_abrv_nm(String cd_abrv_nm){
		this.cd_abrv_nm = cd_abrv_nm;
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

/* �ۼ��ð� : Thu Mar 18 13:17:38 KST 2010 */