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


package chosun.ciis.sp.sal.rec;

import java.sql.*;
import chosun.ciis.sp.sal.dm.*;
import chosun.ciis.sp.sal.ds.*;

/**
 * 
 */


public class SP_SAL_3520_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String date_client_req;
	public String recipient_net;
	public String recipient_num;
	public String rslt_name;

	public SP_SAL_3520_LCURLISTRecord(){}

	public void setDate_client_req(String date_client_req){
		this.date_client_req = date_client_req;
	}

	public void setRecipient_net(String recipient_net){
		this.recipient_net = recipient_net;
	}

	public void setRecipient_num(String recipient_num){
		this.recipient_num = recipient_num;
	}

	public void setRslt_name(String rslt_name){
		this.rslt_name = rslt_name;
	}

	public String getDate_client_req(){
		return this.date_client_req;
	}

	public String getRecipient_net(){
		return this.recipient_net;
	}

	public String getRecipient_num(){
		return this.recipient_num;
	}

	public String getRslt_name(){
		return this.rslt_name;
	}
}

/* �ۼ��ð� : Thu Jul 19 21:34:40 KST 2012 */