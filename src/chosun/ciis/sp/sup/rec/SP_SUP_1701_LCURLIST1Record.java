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


package chosun.ciis.sp.sup.rec;

import java.sql.*;
import chosun.ciis.sp.sup.dm.*;
import chosun.ciis.sp.sup.ds.*;

/**
 * 
 */


public class SP_SUP_1701_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public byte[] img;
	public String dlco_no;
	public String dlco_abrv_nm;
	public String ern;

	public SP_SUP_1701_LCURLIST1Record(){}

	public void setPhot(byte[] img){
		this.img = img;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_abrv_nm(String dlco_abrv_nm){
		this.dlco_abrv_nm = dlco_abrv_nm;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public byte[] getImg(){
		return this.img;
	}


	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_abrv_nm(){
		return this.dlco_abrv_nm;
	}

	public String getErn(){
		return this.ern;
	}
}

/* 작성시간 : Tue Aug 21 20:29:56 KST 2012 */