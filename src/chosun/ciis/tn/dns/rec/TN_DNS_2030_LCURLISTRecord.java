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


public class TN_DNS_2030_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String membercode;
	public String memberidx;
	public String name;
	public String membertype;

	public TN_DNS_2030_LCURLISTRecord(){}

	public void setMembercode(String membercode){
		this.membercode = membercode;
	}

	public void setMemberidx(String memberidx){
		this.memberidx = memberidx;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setMembertype(String membertype){
		this.membertype = membertype;
	}

	public String getMembercode(){
		return this.membercode;
	}

	public String getMemberidx(){
		return this.memberidx;
	}

	public String getName(){
		return this.name;
	}

	public String getMembertype(){
		return this.membertype;
	}
}

/* 작성시간 : Wed Sep 28 19:29:58 KST 2016 */