/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
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

/* 작성시간 : Mon Jul 11 17:15:11 KST 2016 */