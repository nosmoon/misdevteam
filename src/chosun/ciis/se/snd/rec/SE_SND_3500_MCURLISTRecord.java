/***************************************************************************************************
* ���ϸ� : SE_SND_3500_MCURLISTRecord
* ��� : �Ǹ� - �߼۰��� - ��Ÿ�μ�ó�������
 * �ۼ����� : 2009.03.24
 * �ۼ��� :   ������
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.snd.rec;

import java.sql.*;
import chosun.ciis.se.snd.dm.*;
import chosun.ciis.se.snd.ds.*;

/**
 * 
 */


public class SE_SND_3500_MCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cd;
	public String cdnm;
	public String cd_abrv_nm;

	public SE_SND_3500_MCURLISTRecord(){}

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

/* �ۼ��ð� : Mon Feb 02 12:10:07 KST 2009 */