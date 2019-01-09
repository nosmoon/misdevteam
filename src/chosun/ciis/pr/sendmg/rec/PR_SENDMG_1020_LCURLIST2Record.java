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


package chosun.ciis.pr.sendmg.rec;

import java.sql.*;
import chosun.ciis.pr.sendmg.dm.*;
import chosun.ciis.pr.sendmg.ds.*;

/**
 * 
 */


public class PR_SENDMG_1020_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String ecnt;

	public PR_SENDMG_1020_LCURLIST2Record(){}

	public void setEcnt(String ecnt){
		this.ecnt = ecnt;
	}

	public String getEcnt(){
		return this.ecnt;
	}
}

/* 작성시간 : Thu Jun 18 17:41:50 KST 2009 */