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


package chosun.ciis.mt.submatrout.rec;

import java.sql.*;
import chosun.ciis.mt.submatrout.dm.*;
import chosun.ciis.mt.submatrout.ds.*;

/**
 * 
 */


public class MT_SUBMATROUT_1104_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String medi_cd;
	public String medi_nm;
	public String sect_cd;
	public String sect_nm;

	public MT_SUBMATROUT_1104_LCURLIST1Record(){}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setSect_nm(String sect_nm){
		this.sect_nm = sect_nm;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getSect_nm(){
		return this.sect_nm;
	}
}

/* 작성시간 : Tue Oct 06 15:55:37 KST 2009 */