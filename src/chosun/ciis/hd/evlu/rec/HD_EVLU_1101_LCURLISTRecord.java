/***************************************************************************************************
* ���ϸ�		: 
* ���		:
* �ۼ�����	: 
* �ۼ���		: 
***************************************************************************************************/
/***************************************************************************************************
* ��������	: 
* ������		:   
* ��������	: 
* ���		: 
***************************************************************************************************/


package chosun.ciis.hd.evlu.rec;

import java.sql.*;
import chosun.ciis.hd.evlu.dm.*;
import chosun.ciis.hd.evlu.ds.*;

/**
 *
 */

public class HD_EVLU_1101_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dtls_item_cd;
	public String remk;
	public String db_status;

	public HD_EVLU_1101_LCURLISTRecord(){}

	public void setDtls_item_cd(String dtls_item_cd){
		this.dtls_item_cd = dtls_item_cd;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setDb_status(String db_status){
		this.db_status = db_status;
	}

	public String getDtls_item_cd(){
		return this.dtls_item_cd;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getDb_status(){
		return this.db_status;
	}
}

/* �ۼ��ð� : Mon Jul 20 21:10:56 KST 2009 */