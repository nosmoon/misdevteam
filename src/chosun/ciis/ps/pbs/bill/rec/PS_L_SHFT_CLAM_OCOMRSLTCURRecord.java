/***************************************************************************************************
* 파일명 : PS_L_SHFT_CLAM_OCOM.java
* 기능   : 자동이체청구결과목록검색
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
 * 출판국 -자동이체청구결과목록검색
 *
 */

public class PS_L_SHFT_CLAM_OCOMRSLTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String basidt;
	public String shftclsfcd;
	public String shftclsfnm;
	public String rdr_no;
	public String medicd;
	public String medinm;
	public int clamqty;
	public String subsmappli;
	public int clamamt;
	public String erryn;
	public String recpocomcd;
	public String recpocomnm;
	public String rdrnm;
	public String rcpmrflyn;
	public String rcpmrflynnm;

	public PS_L_SHFT_CLAM_OCOMRSLTCURRecord(){}

	public void setBasidt(String basidt){
		this.basidt = basidt;
	}

	public void setShftclsfcd(String shftclsfcd){
		this.shftclsfcd = shftclsfcd;
	}

	public void setShftclsfnm(String shftclsfnm){
		this.shftclsfnm = shftclsfnm;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setClamqty(int clamqty){
		this.clamqty = clamqty;
	}

	public void setSubsmappli(String subsmappli){
		this.subsmappli = subsmappli;
	}

	public void setClamamt(int clamamt){
		this.clamamt = clamamt;
	}

	public void setErryn(String erryn){
		this.erryn = erryn;
	}

	public void setRecpocomcd(String recpocomcd){
		this.recpocomcd = recpocomcd;
	}

	public void setRecpocomnm(String recpocomnm){
		this.recpocomnm = recpocomnm;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setRcpmrflyn(String rcpmrflyn){
		this.rcpmrflyn = rcpmrflyn;
	}

	public void setRcpmrflynnm(String rcpmrflynnm){
		this.rcpmrflynnm = rcpmrflynnm;
	}

	public String getBasidt(){
		return this.basidt;
	}

	public String getShftclsfcd(){
		return this.shftclsfcd;
	}

	public String getShftclsfnm(){
		return this.shftclsfnm;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public int getClamqty(){
		return this.clamqty;
	}

	public String getSubsmappli(){
		return this.subsmappli;
	}

	public int getClamamt(){
		return this.clamamt;
	}

	public String getErryn(){
		return this.erryn;
	}

	public String getRecpocomcd(){
		return this.recpocomcd;
	}

	public String getRecpocomnm(){
		return this.recpocomnm;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getRcpmrflyn(){
		return this.rcpmrflyn;
	}

	public String getRcpmrflynnm(){
		return this.rcpmrflynnm;
	}
}

/* 작성시간 : Thu May 04 13:41:33 KST 2006 */