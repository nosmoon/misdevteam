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


package chosun.ciis.mt.etcpc.rec;

import java.sql.*;
import chosun.ciis.mt.etcpc.dm.*;
import chosun.ciis.mt.etcpc.ds.*;

/**
 * 
 */


public class MT_ETCPC_4201_MCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String swnm;

	public MT_ETCPC_4201_MCURLIST2Record(){}

	public void setSwnm(String swnm){
		this.swnm = swnm;
	}

	public String getSwnm(){
		return this.swnm;
	}
}

/* 작성시간 : Fri Apr 03 18:15:39 KST 2009 */