/***************************************************************************************************
* 파일명 :
* 기능 :
* 작성일자 : 2015-10-21
* 작성자 : 장 선 희
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


public class SL_MO_S_RDR_INFOSUSPDEFCURRecord extends java.lang.Object implements java.io.Serializable{

	public String def_type;
	public String cns_stat;
	public String bo_stat;
	public String cns_cnfmdt;

	public SL_MO_S_RDR_INFOSUSPDEFCURRecord(){}

	public void setDef_type(String def_type){
		this.def_type = def_type;
	}

	public void setCns_stat(String cns_stat){
		this.cns_stat = cns_stat;
	}

	public void setBo_stat(String bo_stat){
		this.bo_stat = bo_stat;
	}

	public void setCns_cnfmdt(String cns_cnfmdt){
		this.cns_cnfmdt = cns_cnfmdt;
	}

	public String getDef_type(){
		return this.def_type;
	}

	public String getCns_stat(){
		return this.cns_stat;
	}

	public String getBo_stat(){
		return this.bo_stat;
	}

	public String getCns_cnfmdt(){
		return this.cns_cnfmdt;
	}
}

/* 작성시간 : Mon Dec 05 11:41:09 KST 2016 */