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


public class TN_DNS_1060_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{
	public byte[] proofdata;

	public TN_DNS_1060_LCURLISTRecord(){}
	
	public void setProofdata(byte[] proofdata){
		this.proofdata = proofdata;
	}

	public byte[] getProofdata(){
		return this.proofdata;
	}

}

/* �ۼ��ð� : Mon Jul 11 17:15:11 KST 2016 */