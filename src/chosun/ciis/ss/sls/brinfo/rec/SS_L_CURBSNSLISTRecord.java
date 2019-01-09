/**************************************************************************************************
* 파일명 	: SS_L_CURBSNSLISTRecord.java
* 기능 		: 지국Info-발송노선 리스트 record
* 작성일자 	: 2004-03-30
* 작성자 	: 배창희
**************************************************************************************************/
/**************************************************************************************************
* 수정내역 	:
* 수정자 	:
* 수정일자 	:
* 백업 		: 
**************************************************************************************************/


package chosun.ciis.ss.sls.brinfo.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.brinfo.ds.*;

/**
 * 판매지국-배달 발송노선정보조회 리스트 record
 */

public class SS_L_CURBSNSLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String mcname;					//매체명
	public String jbpansu;					//판수
	public String jpname;					//지방판
	public String inname;					//인쇄처
	public String jbjiorder;				//경유
	public String jiname;             		//지국명
	public String jbbusu;             		//부수
	public String jbbalcha;             	//발차시간
	public String jbyetime;             	//예정시간
	public String jbdotime;             	//도착시간

	public SS_L_CURBSNSLISTRecord(){}

}

/* 작성시간 : Wed Feb 11 11:39:13 KST 2004 */