/***************************************************************************************************
* 파일명 : .java
* 기능 : *확장현황-확장제한-초기화면
* 작성일자 : 2009-04-06
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * 확장현황-확장제한-초기화면
 */

public class CO_L_EXTN_RES_INITDSTCINFOCURRecord extends java.lang.Object implements java.io.Serializable{

	public String dstccd;
	public String dstcnm;
	public String teamcd;

	public CO_L_EXTN_RES_INITDSTCINFOCURRecord(){}

	public void setDstccd(String dstccd){
		this.dstccd = dstccd;
	}

	public void setDstcnm(String dstcnm){
		this.dstcnm = dstcnm;
	}

	public void setTeamcd(String teamcd){
		this.teamcd = teamcd;
	}

	public String getDstccd(){
		return this.dstccd;
	}

	public String getDstcnm(){
		return this.dstcnm;
	}

	public String getTeamcd(){
		return this.teamcd;
	}
}

/* 작성시간 : Mon Apr 06 20:48:50 KST 2009 */