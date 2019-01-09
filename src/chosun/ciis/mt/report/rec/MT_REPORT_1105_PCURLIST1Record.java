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


package chosun.ciis.mt.report.rec;

import java.sql.*;
import chosun.ciis.mt.report.dm.*;
import chosun.ciis.mt.report.ds.*;

/**
 * 
 */


public class MT_REPORT_1105_PCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String num;

	public MT_REPORT_1105_PCURLIST1Record(){}

	public void setNum(String num){
		this.num = num;
	}

	public String getNum(){
		return this.num;
	}
}

/* 작성시간 : Fri Jul 31 12:01:55 KST 2009 */