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


public class SS_L_MIGRGUYUKMIGRTMPGUYUKCURRecord extends java.lang.Object implements java.io.Serializable{

	public String guyuk;
	public String yuga;
	public String jyuga;
	public String muga;
	public String etc;
	public String total;
	public String jungji;

	public SS_L_MIGRGUYUKMIGRTMPGUYUKCURRecord(){}

	public void setGuyuk(String guyuk){
		this.guyuk = guyuk;
	}

	public void setYuga(String yuga){
		this.yuga = yuga;
	}

	public void setJyuga(String jyuga){
		this.jyuga = jyuga;
	}

	public void setMuga(String muga){
		this.muga = muga;
	}

	public void setEtc(String etc){
		this.etc = etc;
	}

	public void setTotal(String total){
		this.total = total;
	}

	public void setJungji(String jungji){
		this.jungji = jungji;
	}

	public String getGuyuk(){
		return this.guyuk;
	}

	public String getYuga(){
		return this.yuga;
	}

	public String getJyuga(){
		return this.jyuga;
	}

	public String getMuga(){
		return this.muga;
	}

	public String getEtc(){
		return this.etc;
	}

	public String getTotal(){
		return this.total;
	}

	public String getJungji(){
		return this.jungji;
	}
}

/* �ۼ��ð� : Thu Apr 01 11:19:34 KST 2004 */