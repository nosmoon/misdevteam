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


package chosun.ciis.is.rpt.rec;

import java.sql.*;
import chosun.ciis.is.rpt.dm.*;
import chosun.ciis.is.rpt.ds.*;

/**
 * 
 */


public class IS_RPT_2310_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String sido;
	public String gu;
	public String purc_dlco_no_sort;
	public String yyyy;
	public String yymm;
	public String sido_nm;
	public String gu_nm;
	public String purc_dlco_nm;
	public String purc_dlco_no;
	public String o_amt;
	public String p_amt;
	public String r_amt;
	public String r_rate;

	public IS_RPT_2310_LCURLIST1Record(){}

	public void setSido(String sido){
		this.sido = sido;
	}

	public void setGu(String gu){
		this.gu = gu;
	}

	public void setPurc_dlco_no_sort(String purc_dlco_no_sort){
		this.purc_dlco_no_sort = purc_dlco_no_sort;
	}

	public void setYyyy(String yyyy){
		this.yyyy = yyyy;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setSido_nm(String sido_nm){
		this.sido_nm = sido_nm;
	}

	public void setGu_nm(String gu_nm){
		this.gu_nm = gu_nm;
	}

	public void setPurc_dlco_nm(String purc_dlco_nm){
		this.purc_dlco_nm = purc_dlco_nm;
	}

	public void setPurc_dlco_no(String purc_dlco_no){
		this.purc_dlco_no = purc_dlco_no;
	}

	public void setO_amt(String o_amt){
		this.o_amt = o_amt;
	}

	public void setP_amt(String p_amt){
		this.p_amt = p_amt;
	}

	public void setR_amt(String r_amt){
		this.r_amt = r_amt;
	}

	public void setR_rate(String r_rate){
		this.r_rate = r_rate;
	}

	public String getSido(){
		return this.sido;
	}

	public String getGu(){
		return this.gu;
	}

	public String getPurc_dlco_no_sort(){
		return this.purc_dlco_no_sort;
	}

	public String getYyyy(){
		return this.yyyy;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getSido_nm(){
		return this.sido_nm;
	}

	public String getGu_nm(){
		return this.gu_nm;
	}

	public String getPurc_dlco_nm(){
		return this.purc_dlco_nm;
	}

	public String getPurc_dlco_no(){
		return this.purc_dlco_no;
	}

	public String getO_amt(){
		return this.o_amt;
	}

	public String getP_amt(){
		return this.p_amt;
	}

	public String getR_amt(){
		return this.r_amt;
	}

	public String getR_rate(){
		return this.r_rate;
	}
}

/* 작성시간 : Mon Jun 04 18:42:24 KST 2012 */