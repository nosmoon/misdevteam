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


package chosun.ciis.mt.close.rec;

import java.sql.*;
import chosun.ciis.mt.close.dm.*;
import chosun.ciis.mt.close.ds.*;

/**
 * 
 */


public class MT_CLOSE_7014_LCURLIST3Record extends java.lang.Object implements java.io.Serializable{

	public String cd;
	public String cdnm_cd;

	public MT_CLOSE_7014_LCURLIST3Record(){}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setCdnm_cd(String cdnm_cd){
		this.cdnm_cd = cdnm_cd;
	}

	public String getCd(){
		return this.cd;
	}

	public String getCdnm_cd(){
		return this.cdnm_cd;
	}
}

/* 작성시간 : Fri Jul 31 15:15:38 KST 2009 */