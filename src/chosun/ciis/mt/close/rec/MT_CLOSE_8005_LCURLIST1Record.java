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


package chosun.ciis.mt.close.rec;

import java.sql.*;
import chosun.ciis.mt.close.dm.*;
import chosun.ciis.mt.close.ds.*;

/**
 * 
 */


public class MT_CLOSE_8005_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String irow;
	public String medi_cd;
	public String medi_nm;
	public String so_irow;
	public String sonm;
	public String irow2;

	public MT_CLOSE_8005_LCURLIST1Record(){}

	public void setIrow(String irow){
		this.irow = irow;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setSo_irow(String so_irow){
		this.so_irow = so_irow;
	}

	public void setSonm(String sonm){
		this.sonm = sonm;
	}

	public void setIrow2(String irow2){
		this.irow2 = irow2;
	}

	public String getIrow(){
		return this.irow;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getSo_irow(){
		return this.so_irow;
	}

	public String getSonm(){
		return this.sonm;
	}

	public String getIrow2(){
		return this.irow2;
	}
}

/* 작성시간 : Wed Aug 19 15:14:38 KST 2009 */