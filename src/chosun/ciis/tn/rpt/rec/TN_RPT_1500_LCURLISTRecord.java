/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.tn.rpt.rec;

import java.sql.*;
import chosun.ciis.tn.rpt.dm.*;
import chosun.ciis.tn.rpt.ds.*;

/**
 * 
 */


public class TN_RPT_1500_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String promiseidx;
	public String memberidx;
	public String seq;
	public String code;
	public String kind;
	public String data_kind;
	public String chg_cont_ssum;
	public String chgpers;
	public String chgincmgdt;

	public TN_RPT_1500_LCURLISTRecord(){}

	public void setPromiseidx(String promiseidx){
		this.promiseidx = promiseidx;
	}

	public void setMemberidx(String memberidx){
		this.memberidx = memberidx;
	}
	public void setSeq(String seq){
		this.seq = seq;
	}
	public void setCode(String code){
		this.code = code;
	}
	public void setKind(String kind){
		this.kind = kind;
	}

	public void setData_kind(String data_kind){
		this.data_kind = data_kind;
	}

	public void setChg_cont_ssum(String chg_cont_ssum){
		this.chg_cont_ssum = chg_cont_ssum;
	}

	public void setChgpers(String chgpers){
		this.chgpers = chgpers;
	}

	public void setChgincmgdt(String chgincmgdt){
		this.chgincmgdt= chgincmgdt;
	}

	public String getPromiseidx(){
		return this.promiseidx;
	}

	public String getMemberidx(){
		return this.memberidx;
	}
	
	public String getSeq(){
		return this.seq;
	}
	
	public String getCode(){
		return this.code;
	}

	public String getKind(){
		return this.kind;
	}

	public String getData_kind(){
		return this.data_kind;
	}

	public String getChg_cont_ssum(){
		return this.chg_cont_ssum;
	}

	public String getChgpers(){
		return this.chgpers;
	}

	public String getChgdt(){
		return this.chgincmgdt;
	}
}

/* 작성시간 : Thu Nov 03 10:17:03 KST 2016 */