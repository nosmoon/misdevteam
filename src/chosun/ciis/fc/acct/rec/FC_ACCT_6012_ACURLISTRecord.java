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


package chosun.ciis.fc.acct.rec;

import java.sql.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.ds.*;

/**
 * 
 */


public class FC_ACCT_6012_ACURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String outseq;

	public FC_ACCT_6012_ACURLISTRecord(){}

	public void setOutseq(String outseq){
		this.outseq = outseq;
	}

	public String getOutseq(){
		return this.outseq;
	}
}

/* 작성시간 : Thu May 03 14:42:19 KST 2018 */