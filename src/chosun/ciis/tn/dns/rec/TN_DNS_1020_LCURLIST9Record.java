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


public class TN_DNS_1020_LCURLIST9Record extends java.lang.Object implements java.io.Serializable{

	public String promiseidx;
	public String promisecode;

	public TN_DNS_1020_LCURLIST9Record(){}

	public void setPromiseidx(String promiseidx){
		this.promiseidx = promiseidx;
	}

	public void setPromisecode(String promisecode){
		this.promisecode = promisecode;
	}

	public String getPromiseidx(){
		return this.promiseidx;
	}

	public String getPromisecode(){
		return this.promisecode;
	}
}

/* �ۼ��ð� : Mon Dec 12 18:09:25 KST 2016 */