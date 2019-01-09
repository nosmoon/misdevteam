/***************************************************************************************************
* 파일명 : SS_L_SHFTAPLC_INIT_TMCURCARDCDRecord.java
* 기능 : 상담원-자동이체관련-초기화면 카드코드 목록을 위한 Record
* 작성일자 : 2004-04-24
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.cns.rec;

import java.sql.*;
import chosun.ciis.ss.sls.cns.dm.*;
import chosun.ciis.ss.sls.cns.ds.*;

/**
 * 상담원-자동이체관련-초기화면 카드코드 목록을 위한 Record
 */


public class SS_L_SHFTAPLC_INIT_TMCURCARDCDRecord extends java.lang.Object implements java.io.Serializable{

	public String cicodeval;
	public String cicdnm;
	public String ciymgbcd;
	public String cicdgb;
	public String cicdynm;

	public SS_L_SHFTAPLC_INIT_TMCURCARDCDRecord(){}

	public void setCicodeval(String cicodeval){
		this.cicodeval = cicodeval;
	}

	public void setCicdnm(String cicdnm){
		this.cicdnm = cicdnm;
	}

	public void setCiymgbcd(String ciymgbcd){
		this.ciymgbcd = ciymgbcd;
	}

	public void setCicdgb(String cicdgb){
		this.cicdgb = cicdgb;
	}

	public void setCicdynm(String cicdynm){
		this.cicdynm = cicdynm;
	}

	public String getCicodeval(){
		return this.cicodeval;
	}

	public String getCicdnm(){
		return this.cicdnm;
	}

	public String getCiymgbcd(){
		return this.ciymgbcd;
	}

	public String getCicdgb(){
		return this.cicdgb;
	}

	public String getCicdynm(){
		return this.cicdynm;
	}
}

/* 작성시간 : Fri Jul 16 20:50:05 KST 2004 */