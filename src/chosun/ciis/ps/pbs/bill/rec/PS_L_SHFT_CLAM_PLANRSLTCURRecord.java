/***************************************************************************************************
* 파일명 : PS_L_SHFT_CLAM_PLAN.java
* 기능   : 자동이체청구예정목록
* 작성일자 : 2006-04-25
* 작성자 : 전현표
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ps.pbs.bill.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.bill.dm.*;
import chosun.ciis.ps.pbs.bill.ds.*;

/**
 * 출판국 -자동이체청구예정목록
 *
 */

public class PS_L_SHFT_CLAM_PLANRSLTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String rdr_no;
	public String medicd;
	public String termsubsno;
	public String medinm;
	public String subsmappli;
	public int agrmntamt;
	public String dlvaddr;
	public String rcpmmthd;
	public String agrmnt_dt;
	public String rcpmmthdnm;
	public String rcpmclsfcd;
	public String rcpmclsfnm;
	public String rdrnm;
	public String pymtnm;
	public String agrmntseq;

	public PS_L_SHFT_CLAM_PLANRSLTCURRecord(){}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setTermsubsno(String termsubsno){
		this.termsubsno = termsubsno;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setSubsmappli(String subsmappli){
		this.subsmappli = subsmappli;
	}

	public void setAgrmntamt(int agrmntamt){
		this.agrmntamt = agrmntamt;
	}

	public void setDlvaddr(String dlvaddr){
		this.dlvaddr = dlvaddr;
	}

	public void setRcpmmthd(String rcpmmthd){
		this.rcpmmthd = rcpmmthd;
	}

	public void setAgrmnt_dt(String agrmnt_dt){
		this.agrmnt_dt = agrmnt_dt;
	}

	public void setRcpmmthdnm(String rcpmmthdnm){
		this.rcpmmthdnm = rcpmmthdnm;
	}

	public void setRcpmclsfcd(String rcpmclsfcd){
		this.rcpmclsfcd = rcpmclsfcd;
	}

	public void setRcpmclsfnm(String rcpmclsfnm){
		this.rcpmclsfnm = rcpmclsfnm;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setPymtnm(String pymtnm){
		this.pymtnm = pymtnm;
	}

	public void setAgrmntseq(String agrmntseq){
		this.agrmntseq = agrmntseq;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getTermsubsno(){
		return this.termsubsno;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getSubsmappli(){
		return this.subsmappli;
	}

	public int getAgrmntamt(){
		return this.agrmntamt;
	}

	public String getDlvaddr(){
		return this.dlvaddr;
	}

	public String getRcpmmthd(){
		return this.rcpmmthd;
	}

	public String getAgrmnt_dt(){
		return this.agrmnt_dt;
	}

	public String getRcpmmthdnm(){
		return this.rcpmmthdnm;
	}

	public String getRcpmclsfcd(){
		return this.rcpmclsfcd;
	}

	public String getRcpmclsfnm(){
		return this.rcpmclsfnm;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getPymtnm(){
		return this.pymtnm;
	}

	public String getAgrmntseq(){
		return this.agrmntseq;
	}
}

/* 작성시간 : Tue Apr 25 15:14:45 KST 2006 */