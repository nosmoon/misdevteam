/***************************************************************************************************
* 파일명 : SS_L_INSRCOSTCLMTCURCOMMLISTRecord.java
* 기능 : 지국지원-상해보험-비용(영업담당)-상세목록을 위한 Record
* 작성일자 : 2004-02-20
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
 * 지국지원-상해보험-비용(영업담당)-상세목록을 위한 Record
 */

public class SS_L_INSRCOSTCLMTCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public int clamt;
	public String rcpmpersnm;
	public int clamtbal;
	public String clamtdt;

	public SS_L_INSRCOSTCLMTCURCOMMLISTRecord(){}

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

/* 작성시간 : Sat Feb 21 21:51:30 KST 2004 */