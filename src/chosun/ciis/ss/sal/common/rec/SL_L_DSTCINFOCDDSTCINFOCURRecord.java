/***************************************************************************************************
 * 파일명   : SL_L_DSTCINFOCDDSTCINFOCURRecord.java
 * 기능     : 독자정보조회-구역정보
 * 작성일자 : 2006/10/25
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sal.common.rec;

import java.sql.*;
import chosun.ciis.ss.sal.common.dm.*;
import chosun.ciis.ss.sal.common.ds.*;

/**
**  SP_SL_L_DSTCINFOCD
**/

public class SL_L_DSTCINFOCDDSTCINFOCURRecord extends java.lang.Object implements java.io.Serializable{

	public String dstccd;
	public String dstcnm;
	public String teamcd;

	public SL_L_DSTCINFOCDDSTCINFOCURRecord(){}

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

/* 작성시간 : Wed Oct 25 15:15:22 KST 2006 */