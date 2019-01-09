/***************************************************************************************************
* 파일명 : SL_L_RDR_MOVM_TRSF_INITDSTCINFOCURRecord.java
* 기능 : 관할지국조정관리-인계-초기화면-구역정보
* 작성일자 : 2003-12-27
* 작성자 : 김영윤
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sal.rdr.rec;

import java.sql.*;
import chosun.ciis.ss.sal.rdr.dm.*;
import chosun.ciis.ss.sal.rdr.ds.*;

/**
 * 관할지국조정관리-인계-초기화면-구역정보
 *
 */


public class SL_L_RDR_MOVM_TRSF_INITDSTCINFOCURRecord extends java.lang.Object implements java.io.Serializable{

	public String dstccd;
	public String dstcnm;
	public String teamcd;
	public String bgndlvno;
	public String enddlvno;

	public SL_L_RDR_MOVM_TRSF_INITDSTCINFOCURRecord(){}

	public void setDstccd(String dstccd){
		this.dstccd = dstccd;
	}

	public void setDstcnm(String dstcnm){
		this.dstcnm = dstcnm;
	}

	public void setTeamcd(String teamcd){
		this.teamcd = teamcd;
	}

	public void setBgndlvno(String bgndlvno){
		this.bgndlvno = bgndlvno;
	}

	public void setEnddlvno(String enddlvno){
		this.enddlvno = enddlvno;
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

	public String getBgndlvno(){
		return this.bgndlvno;
	}

	public String getEnddlvno(){
		return this.enddlvno;
	}
}

/* 작성시간 : Mon Feb 02 21:48:01 KST 2004 */