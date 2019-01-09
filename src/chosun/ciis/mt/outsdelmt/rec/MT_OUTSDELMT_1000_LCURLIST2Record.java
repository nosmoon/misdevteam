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


package chosun.ciis.mt.outsdelmt.rec;

import java.sql.*;
import chosun.ciis.mt.outsdelmt.dm.*;
import chosun.ciis.mt.outsdelmt.ds.*;

/**
 * 
 */


public class MT_OUTSDELMT_1000_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String cd;
	public String cdnm_cd;
	public String outsd_elmt_clsf;
	public String unit;

	public MT_OUTSDELMT_1000_LCURLIST2Record(){}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setCdnm_cd(String cdnm_cd){
		this.cdnm_cd = cdnm_cd;
	}

	public void setOutsd_elmt_clsf(String outsd_elmt_clsf){
		this.outsd_elmt_clsf = outsd_elmt_clsf;
	}

	public void setUnit(String unit){
		this.unit = unit;
	}

	public String getCd(){
		return this.cd;
	}

	public String getCdnm_cd(){
		return this.cdnm_cd;
	}

	public String getOutsd_elmt_clsf(){
		return this.outsd_elmt_clsf;
	}

	public String getUnit(){
		return this.unit;
	}
}

/* 작성시간 : Thu Jul 09 19:03:57 KST 2009 */