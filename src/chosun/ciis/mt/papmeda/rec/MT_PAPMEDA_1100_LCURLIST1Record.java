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


public class MT_PAPMEDA_1100_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String eps_no;

	public MT_PAPMEDA_1100_LCURLIST1Record(){}

	public void setEps_no(String eps_no){
		this.eps_no = eps_no;
	}

	public String getEps_no(){
		return this.eps_no;
	}
}

/* 작성시간 : Fri May 08 17:19:56 KST 2009 */