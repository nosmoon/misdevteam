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


package chosun.ciis.mt.prnpap.rec;

import java.sql.*;
import chosun.ciis.mt.prnpap.dm.*;
import chosun.ciis.mt.prnpap.ds.*;

/**
 * 
 */


public class MT_PRNPAP_3416_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String cd;
	public String hdqt_paper_clsf;
	public String title;
	public String medi_cd;
	public String sect_cd;

	public MT_PRNPAP_3416_LCURLIST2Record(){}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setHdqt_paper_clsf(String hdqt_paper_clsf){
		this.hdqt_paper_clsf = hdqt_paper_clsf;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public String getCd(){
		return this.cd;
	}

	public String getHdqt_paper_clsf(){
		return this.hdqt_paper_clsf;
	}

	public String getTitle(){
		return this.title;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}
}

/* 작성시간 : Fri Aug 14 09:52:16 KST 2009 */