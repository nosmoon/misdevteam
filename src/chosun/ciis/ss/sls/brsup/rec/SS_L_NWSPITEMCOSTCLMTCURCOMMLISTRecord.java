/***************************************************************************************************
* 파일명 : SS_L_NWSPITEMCOSTCLMTCURCOMMLISTRecord.java
* 기능 : 지국지원-신문지원물품-비용(영업담당)-상세목록을 위한 Record
* 작성일자 : 2004-02-07
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
 * 지국지원-신문지원물품-비용(영업담당)-상세목록을 위한 Record
 */

public class SS_L_NWSPITEMCOSTCLMTCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public int clamt;
	public String rcpmpersnm;
	public int clamtbal;
	public String clamtdt;

	public SS_L_NWSPITEMCOSTCLMTCURCOMMLISTRecord(){}

	public void setClamt(int clamt){
		this.clamt = clamt;
	}

	public void setRcpmpersnm(String rcpmpersnm){
		this.rcpmpersnm = rcpmpersnm;
	}

	public void setClamtbal(int clamtbal){
		this.clamtbal = clamtbal;
	}

	public void setClamtdt(String clamtdt){
		this.clamtdt = clamtdt;
	}

	public int getClamt(){
		return this.clamt;
	}

	public String getRcpmpersnm(){
		return this.rcpmpersnm;
	}

	public int getClamtbal(){
		return this.clamtbal;
	}

	public String getClamtdt(){
		return this.clamtdt;
	}
}

/* 작성시간 : Tue Feb 10 19:48:19 KST 2004 */