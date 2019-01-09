/***************************************************************************************************
* 파일명 : .java
* 기능 : 통합정보지원시스템-판촉물재고현황-상세조회화면-출고추가
* 작성일자 : 2009-05-08
* 작성자 : 김용욱
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * 통합정보지원시스템 판촉물재고현황 상세조회 출고추가팝업
 */

public class SS_L_POPOUTBNSITEM_INITPOPOUTLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cicdnm;
	public String cicodeval;

	public SS_L_POPOUTBNSITEM_INITPOPOUTLISTRecord(){}

	public void setCicdnm(String cicdnm){
		this.cicdnm = cicdnm;
	}

	public void setCicodeval(String cicodeval){
		this.cicodeval = cicodeval;
	}

	public String getCicdnm(){
		return this.cicdnm;
	}

	public String getCicodeval(){
		return this.cicodeval;
	}
}

/* 작성시간 : Fri May 08 17:12:58 PDT 2009 */