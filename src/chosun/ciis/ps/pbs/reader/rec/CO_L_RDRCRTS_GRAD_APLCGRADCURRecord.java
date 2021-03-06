/***************************************************************************************************
 * 파일명 : CO_L_RDRCRTS_GRAD_APLC.java
 * 기능 : 독자우대등급관리(독자우대기존독자목록조회)
 * 작성일자 : 2004-04-29
 * 작성자 : 김영윤
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 : 우리이웃 이벤트를 위한 remk 추가
 * 수정자 : 노상현
 * 수정일자 : 2004-11-30
 * 백업 : 
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 : 독자인증 파라미터값 변경
 * 수정자 : 노상현
 * 수정일자 : 2005-02-23
 * 백업 : 
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 : 현금영수증 관련 항목추가
 * 수정자 : 노상현
 * 수정일자 : 2005-11-10
 * 백업 : 
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 : 모바일기사 서비스 관련 항목추가
 * 수정자 : 노상현
 * 수정일자 : 2006-08-16
 * 백업 : 
 ***************************************************************************************************/
 /***************************************************************************************************
 * 수정내역 : Ireader 서비스 관련 항목추가
 * 수정자 : 노상현
 * 수정일자 : 2008-03-06
 * 백업 : 
 ***************************************************************************************************/


package chosun.ciis.ps.pbs.reader.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.reader.dm.*;
import chosun.ciis.ps.pbs.reader.ds.*;

/**
 * 독자-모닝플러스회원,현금영수증,모바일조선,Ireader회원관리
 */

public class CO_L_RDRCRTS_GRAD_APLCGRADCURRecord extends java.lang.Object implements java.io.Serializable{

	public String ciymgbcd;
	public String cicdgb;
	public String cicodeval;
	public String cicdnm;
	public String cicdynm;

	public CO_L_RDRCRTS_GRAD_APLCGRADCURRecord(){}

	public void setCiymgbcd(String ciymgbcd){
		this.ciymgbcd = ciymgbcd;
	}

	public void setCicdgb(String cicdgb){
		this.cicdgb = cicdgb;
	}

	public void setCicodeval(String cicodeval){
		this.cicodeval = cicodeval;
	}

	public void setCicdnm(String cicdnm){
		this.cicdnm = cicdnm;
	}

	public void setCicdynm(String cicdynm){
		this.cicdynm = cicdynm;
	}

	public String getCiymgbcd(){
		return this.ciymgbcd;
	}

	public String getCicdgb(){
		return this.cicdgb;
	}

	public String getCicodeval(){
		return this.cicodeval;
	}

	public String getCicdnm(){
		return this.cicdnm;
	}

	public String getCicdynm(){
		return this.cicdynm;
	}
}

/* 작성시간 : Fri Mar 07 16:36:06 KST 2008 */