/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
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
 * 
 */


public class SL_S_RDR_INFOCLAMTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String subsmappli;
	public String recpdt;
	public int clamamt;
	public int clamt;
	public String rcpmclsfcd;
	public String clamtmthdcd;
	public String rcpmclsfnm;

	public SL_S_RDR_INFOCLAMTCURRecord(){}

	public void setSubsmappli(String subsmappli){
		this.subsmappli = subsmappli;
	}

	public void setRecpdt(String recpdt){
		this.recpdt = recpdt;
	}

	public void setClamamt(int clamamt){
		this.clamamt = clamamt;
	}

	public void setClamt(int clamt){
		this.clamt = clamt;
	}

	public void setRcpmclsfcd(String rcpmclsfcd){
		this.rcpmclsfcd = rcpmclsfcd;
	}

	public void setClamtmthdcd(String clamtmthdcd){
		this.clamtmthdcd = clamtmthdcd;
	}

	public void setRcpmclsfnm(String rcpmclsfnm){
		this.rcpmclsfnm = rcpmclsfnm;
	}

	public String getSubsmappli(){
		return this.subsmappli;
	}

	public String getRecpdt(){
		return this.recpdt;
	}

	public int getClamamt(){
		return this.clamamt;
	}

	public int getClamt(){
		return this.clamt;
	}

	public String getRcpmclsfcd(){
		return this.rcpmclsfcd;
	}

	public String getClamtmthdcd(){
		return this.clamtmthdcd;
	}

	public String getRcpmclsfnm(){
		return this.rcpmclsfnm;
	}
}

/* 작성시간 : Wed Oct 11 17:10:57 KST 2017 */