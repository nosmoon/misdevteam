/***************************************************************************************************
* 파일명 : SS_MO_L_INFOEXG_SRCHRMSGEXTTCD_LISTRecord.java
* 기능 : CIIS-판매-센터관리-정보공유-공지사항-리스트_모바일용
* 작성일자 : 2017-01-24
* 작성자 : 장선희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.share.rec;

import java.sql.*;
import chosun.ciis.ss.sls.share.dm.*;
import chosun.ciis.ss.sls.share.ds.*;

/**
 *
 */


public class SS_MO_L_INFOEXG_SRCHRMSGEXTTCD_LISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cicodeval;
	public String cicdnm;

	public SS_MO_L_INFOEXG_SRCHRMSGEXTTCD_LISTRecord(){}

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

/* 작성시간 : Tue Jan 24 17:40:46 KST 2017 */