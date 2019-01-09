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

/* 작성시간 : Mon Dec 12 18:09:25 KST 2016 */