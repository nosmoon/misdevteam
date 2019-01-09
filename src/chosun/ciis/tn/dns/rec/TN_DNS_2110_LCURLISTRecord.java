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


public class TN_DNS_2110_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String fundcode;
	public String fund1;
	public String fund2;
	public String fund3;
	public String fundidx;
     
	
	public TN_DNS_2110_LCURLISTRecord(){}

	public void setFundcode(String fundcode){
		this.fundcode = fundcode;
	}

	public void setFund1(String fund1){
		this.fund1 = fund1;
	}

	public void setFund2(String fund2){
		this.fund2 = fund2;
	}

	public void setFund3(String fund3){
		this.fund3 = fund3;
	}

	public void setFundidx(String fundidx) {
		this.fundidx = fundidx;
	}
	
	public String getFundcode(){
		return this.fundcode;
	}

	public String getFund1(){
		return this.fund1;
	}

	public String getFund2(){
		return this.fund2;
	}

	public String getFund3(){
		return this.fund3;
	}
	
	public String getFundidx() {
		return fundidx;
	}

	
}

/* 작성시간 : Wed Jun 15 18:48:59 KST 2016 */