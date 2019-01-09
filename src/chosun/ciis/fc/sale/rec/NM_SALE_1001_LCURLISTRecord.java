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


package chosun.ciis.fc.sale.rec;

import java.sql.*;
import chosun.ciis.fc.sale.dm.*;
import chosun.ciis.fc.sale.ds.*;

/**
 * 
 */


public class NM_SALE_1001_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String yymm;
	public String seq;
	public String dlco_cd;
	public String dlco_nm;
	public String medi_clsf;
	public String clos_yn;
	public String actu_slip_no;
	public String tax_stmt_no;

	public NM_SALE_1001_LCURLISTRecord(){}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setMedi_clsf(String medi_clsf){
		this.medi_clsf = medi_clsf;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public void setActu_slip_no(String actu_slip_no){
		this.actu_slip_no = actu_slip_no;
	}

	public void setTax_stmt_no(String tax_stmt_no){
		this.tax_stmt_no = tax_stmt_no;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}
	
	public String getMedi_clsf(){
		return this.medi_clsf;
	}

	public String getClos_yn(){
		return this.clos_yn;
	}

	public String getActu_slip_no(){
		return this.actu_slip_no;
	}

	public String getTax_stmt_no(){
		return this.tax_stmt_no;
	}
}

/* 작성시간 : Fri Jun 21 11:31:13 KST 2013 */