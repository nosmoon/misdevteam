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


package chosun.ciis.hd.evlu.rec;

import java.sql.*;
import chosun.ciis.hd.evlu.dm.*;
import chosun.ciis.hd.evlu.ds.*;

/**
 * 
 */


public class HD_EVLU_5101_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dtls_view;
	public String dtls_item_cd;
	public String remk;
	public String db_status;

	public HD_EVLU_5101_LCURLISTRecord(){}

	public void setDtls_view(String dtls_view){
		this.dtls_view = dtls_view;
	}

	public void setDtls_item_cd(String dtls_item_cd){
		this.dtls_item_cd = dtls_item_cd;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setDb_status(String db_status){
		this.db_status = db_status;
	}

	public String getDtls_view(){
		return this.dtls_view;
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

/* �ۼ��ð� : Fri May 22 10:29:09 KST 2009 */