/***************************************************************************************************
* 파일명 : PS_L_INFOEXG_INIT.java
* 기능 : 정보공유 게시판 - 공지사항,각종통계(확장목록,중재,불편접수,이사신청)
* 작성일자 : 2004-03-29
* 작성자 : 전현표
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ps.pbs.share.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.share.dm.*;
import chosun.ciis.ps.pbs.share.ds.*;

/**
 * 출판국- 정보공유 게시판 공지사항,각종통계(확장목록,중재,불편접수,이사신청)
 *
 */

public class PS_L_INFOEXG_INITEXTTLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cicodeval;
	public String cicdnm;

	public PS_L_INFOEXG_INITEXTTLISTRecord(){}

	public void setCicodeval(String cicodeval){
		this.cicodeval = cicodeval;
	}

	public void setCicdnm(String cicdnm){
		this.cicdnm = cicdnm;
	}

	public String getCicodeval(){
		return this.cicodeval;
	}

	public String getCicdnm(){
		return this.cicdnm;
	}
}

/* 작성시간 : Tue Jul 25 16:28:23 KST 2006 */