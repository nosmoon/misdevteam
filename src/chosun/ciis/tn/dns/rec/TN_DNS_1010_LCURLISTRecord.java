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


package chosun.ciis.tn.dns.rec;

import java.sql.*;
import chosun.ciis.tn.dns.dm.*;
import chosun.ciis.tn.dns.ds.*;

/**
 * 
 */


public class TN_DNS_1010_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String membercode;
	public String memberidx;

	public TN_DNS_1010_LCURLISTRecord(){}

	public void setMembercode(String membercode){
		this.membercode = membercode;
	}

	public void setMemberidx(String memberidx){
		this.memberidx = memberidx;
	}

	public String getMembercode(){
		return this.membercode;
	}

	public String getMemberidx(){
		return this.memberidx;
	}
}

/* �ۼ��ð� : Wed Oct 19 16:53:13 KST 2016 */