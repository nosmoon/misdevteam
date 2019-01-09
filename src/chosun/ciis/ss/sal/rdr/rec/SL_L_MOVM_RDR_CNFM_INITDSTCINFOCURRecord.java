/***************************************************************************************************
* 파일명 : SL_L_MOVM_RDR_CNFM_INITDSTCINFOCURRecord.java
* 기능 : 독자-이사독자관리(인수)-초기화면 구역정보코드,코드명 목록을 위한 Record  
* 작성일자 : 2004-01-14
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
 * 독자-이사독자관리(인수)-초기화면 구역정보코드,코드명 목록을 위한 Record 
 */

public class SL_L_MOVM_RDR_CNFM_INITDSTCINFOCURRecord extends java.lang.Object implements java.io.Serializable{

	public String dstccd;
	public String dstcnm;
	public String teamcd;

	public SL_L_MOVM_RDR_CNFM_INITDSTCINFOCURRecord(){}

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

/* 작성시간 : Sun Jan 18 20:09:16 KST 2004 */