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

/* 작성시간 : Wed Oct 19 16:53:13 KST 2016 */