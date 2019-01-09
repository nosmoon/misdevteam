/***************************************************************************************************
* 파일명 : SS_S_INSRAPLCCURCOMMLISTRecord.java
* 기능 : 지국지원-상해보험-신규신청-상세목록을 위한 Record
* 작성일자 : 2004-02-19
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/

package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * 지국지원-상해보험-신규신청-상세목록을 위한 Record
 */

public class SS_S_INSRAPLCCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String flnm;
	public String prn;
	public String dutynm;
	public String insrnm;

	public SS_S_INSRAPLCCURCOMMLISTRecord(){}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setDutynm(String dutynm){
		this.dutynm = dutynm;
	}

	public void setInsrnm(String insrnm){
		this.insrnm = insrnm;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getDutynm(){
		return this.dutynm;
	}

	public String getInsrnm(){
		return this.insrnm;
	}
}

/* 작성시간 : Thu Feb 19 19:09:38 KST 2004 */