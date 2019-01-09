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


package chosun.ciis.pr.prtcnsg.rec;

import java.sql.*;
import chosun.ciis.pr.prtcnsg.dm.*;
import chosun.ciis.pr.prtcnsg.ds.*;

/**
 * 
 */


public class PR_OTHCNSM_2100_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String data;

	public PR_OTHCNSM_2100_LCURLIST2Record(){}

	public void setData(String data){
		this.data = data;
	}

	public String getData(){
		return this.data;
	}
}

/* 작성시간 : Sat Sep 26 18:14:25 KST 2009 */