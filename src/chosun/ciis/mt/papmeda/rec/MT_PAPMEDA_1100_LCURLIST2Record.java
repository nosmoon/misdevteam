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


package chosun.ciis.mt.papmeda.rec;

import java.sql.*;
import chosun.ciis.mt.papmeda.dm.*;
import chosun.ciis.mt.papmeda.ds.*;

/**
 * 
 */


public class MT_PAPMEDA_1100_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String paper_amt;

	public MT_PAPMEDA_1100_LCURLIST2Record(){}

	public void setPaper_amt(String paper_amt){
		this.paper_amt = paper_amt;
	}

	public String getPaper_amt(){
		return this.paper_amt;
	}
}

/* 작성시간 : Fri May 08 17:19:56 KST 2009 */