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


package chosun.ciis.pr.papmake.rec;

import java.sql.*;
import chosun.ciis.pr.papmake.dm.*;
import chosun.ciis.pr.papmake.ds.*;

/**
 * 
 */


public class PR_PAPMAKE_1009_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String ecnt;
	public String ecnt_nm;

	public PR_PAPMAKE_1009_LCURLIST1Record(){}

	public void setEcnt(String ecnt){
		this.ecnt = ecnt;
	}

	public void setEcnt_nm(String ecnt_nm){
		this.ecnt_nm = ecnt_nm;
	}

	public String getEcnt(){
		return this.ecnt;
	}

	public String getEcnt_nm(){
		return this.ecnt_nm;
	}
}

/* 작성시간 : Thu Jul 30 09:50:34 KST 2009 */