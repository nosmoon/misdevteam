/***************************************************************************************************
* ���ϸ� : SE_MO_BOI_1020_SCOMMCDCUR10Record.java_����Ͽ�
* ��� : ���Ͱ���-������������-��
* �ۼ����� : 2017-04-13
* �ۼ��� : �弱��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/


package chosun.ciis.se.boi.rec;

import java.sql.*;
import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.ds.*;

/**
 *
 */


public class SE_MO_BOI_1020_SCOMMCDCUR10Record extends java.lang.Object implements java.io.Serializable{

	public String cd;
	public String cdnm;
	public String cd_abrv_nm;

	public SE_MO_BOI_1020_SCOMMCDCUR10Record(){}

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

/* �ۼ��ð� : Thu Apr 13 17:05:09 KST 2017 */