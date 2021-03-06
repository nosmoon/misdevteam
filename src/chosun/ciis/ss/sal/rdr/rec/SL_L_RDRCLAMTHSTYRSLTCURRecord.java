/***************************************************************************************************
* 파일명 : SL_L_RDRCLAMTHSTYRSLTCURRecord.java
* 기능 : 독자정보관리-입금내역-목록
* 작성일자 : 2003-12-26
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
 * 독자정보관리-입금내역-목록
 *
 */


public class SL_L_RDRCLAMTHSTYRSLTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String subsmappli;
	public String recpdt;
	public int clamamt;
	public int clamt;
	public String rcpmclsfcd;
	public String clamtmthdcd;
	public String rcpmclsfnm;

	public SL_L_RDRCLAMTHSTYRSLTCURRecord(){}

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

/* 작성시간 : Mon Dec 22 14:24:57 KST 2003 */