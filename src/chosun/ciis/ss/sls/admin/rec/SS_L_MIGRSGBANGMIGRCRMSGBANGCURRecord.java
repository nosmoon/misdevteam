/***************************************************************************************************
* ���ϸ�	: 
* ���		: 
* �ۼ�����	: 2004-01-13
* �ۼ���	: �����
***************************************************************************************************/
/***************************************************************************************************
* ��������	:
* ������	:
* ��������	:
* ���		: 
***************************************************************************************************/


package chosun.ciis.ss.sls.admin.rec;

import java.sql.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.ds.*;

/**
 *
 *
 */


public class SS_L_MIGRSGBANGMIGRCRMSGBANGCURRecord extends java.lang.Object implements java.io.Serializable{

	public String sinmoon;
	public String af_code;
	public String giro;
	public String bangmun;
	public String autogiro;
	public String cardauto;
	public String etc;
	public String total;

	public SS_L_MIGRSGBANGMIGRCRMSGBANGCURRecord(){}

	public void setSinmoon(String sinmoon){
		this.sinmoon = sinmoon;
	}

	public void setAf_code(String af_code){
		this.af_code = af_code;
	}

	public void setGiro(String giro){
		this.giro = giro;
	}

	public void setBangmun(String bangmun){
		this.bangmun = bangmun;
	}

	public void setAutogiro(String autogiro){
		this.autogiro = autogiro;
	}

	public void setCardauto(String cardauto){
		this.cardauto = cardauto;
	}

	public void setEtc(String etc){
		this.etc = etc;
	}

	public void setTotal(String total){
		this.total = total;
	}

	public String getSinmoon(){
		return this.sinmoon;
	}

	public String getAf_code(){
		return this.af_code;
	}

	public String getGiro(){
		return this.giro;
	}

	public String getBangmun(){
		return this.bangmun;
	}

	public String getAutogiro(){
		return this.autogiro;
	}

	public String getCardauto(){
		return this.cardauto;
	}

	public String getEtc(){
		return this.etc;
	}

	public String getTotal(){
		return this.total;
	}
}

/* �ۼ��ð� : Thu Apr 01 11:19:55 KST 2004 */