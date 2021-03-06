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


public class IS_RPT_2420_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String sido;
	public String gu;
	public String purc_dlco_no_sort;
	public String sido_nm;
	public String gu_nm;
	public String purc_dlco_nm;
	public String purc_dlco_no;
	public String o_amt_01;
	public String o_amt_02;
	public String o_amt_03;
	public String o_amt_04;
	public String o_amt_05;
	public String o_amt_06;
	public String o_amt_07;
	public String o_amt_08;
	public String o_amt_09;
	public String o_amt_10;
	public String o_amt_11;
	public String o_amt_12;
	public String p_amt_01;
	public String p_amt_02;
	public String p_amt_03;
	public String p_amt_04;
	public String p_amt_05;
	public String p_amt_06;
	public String p_amt_07;
	public String p_amt_08;
	public String p_amt_09;
	public String p_amt_10;
	public String p_amt_11;
	public String p_amt_12;

	public IS_RPT_2420_LCURLIST1Record(){}

	public void setSido(String sido){
		this.sido = sido;
	}

	public void setGu(String gu){
		this.gu = gu;
	}

	public void setPurc_dlco_no_sort(String purc_dlco_no_sort){
		this.purc_dlco_no_sort = purc_dlco_no_sort;
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

	public void setO_amt_01(String o_amt_01){
		this.o_amt_01 = o_amt_01;
	}

	public void setO_amt_02(String o_amt_02){
		this.o_amt_02 = o_amt_02;
	}

	public void setO_amt_03(String o_amt_03){
		this.o_amt_03 = o_amt_03;
	}

	public void setO_amt_04(String o_amt_04){
		this.o_amt_04 = o_amt_04;
	}

	public void setO_amt_05(String o_amt_05){
		this.o_amt_05 = o_amt_05;
	}

	public void setO_amt_06(String o_amt_06){
		this.o_amt_06 = o_amt_06;
	}

	public void setO_amt_07(String o_amt_07){
		this.o_amt_07 = o_amt_07;
	}

	public void setO_amt_08(String o_amt_08){
		this.o_amt_08 = o_amt_08;
	}

	public void setO_amt_09(String o_amt_09){
		this.o_amt_09 = o_amt_09;
	}

	public void setO_amt_10(String o_amt_10){
		this.o_amt_10 = o_amt_10;
	}

	public void setO_amt_11(String o_amt_11){
		this.o_amt_11 = o_amt_11;
	}

	public void setO_amt_12(String o_amt_12){
		this.o_amt_12 = o_amt_12;
	}

	public void setP_amt_01(String p_amt_01){
		this.p_amt_01 = p_amt_01;
	}

	public void setP_amt_02(String p_amt_02){
		this.p_amt_02 = p_amt_02;
	}

	public void setP_amt_03(String p_amt_03){
		this.p_amt_03 = p_amt_03;
	}

	public void setP_amt_04(String p_amt_04){
		this.p_amt_04 = p_amt_04;
	}

	public void setP_amt_05(String p_amt_05){
		this.p_amt_05 = p_amt_05;
	}

	public void setP_amt_06(String p_amt_06){
		this.p_amt_06 = p_amt_06;
	}

	public void setP_amt_07(String p_amt_07){
		this.p_amt_07 = p_amt_07;
	}

	public void setP_amt_08(String p_amt_08){
		this.p_amt_08 = p_amt_08;
	}

	public void setP_amt_09(String p_amt_09){
		this.p_amt_09 = p_amt_09;
	}

	public void setP_amt_10(String p_amt_10){
		this.p_amt_10 = p_amt_10;
	}

	public void setP_amt_11(String p_amt_11){
		this.p_amt_11 = p_amt_11;
	}

	public void setP_amt_12(String p_amt_12){
		this.p_amt_12 = p_amt_12;
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

	public String getO_amt_01(){
		return this.o_amt_01;
	}

	public String getO_amt_02(){
		return this.o_amt_02;
	}

	public String getO_amt_03(){
		return this.o_amt_03;
	}

	public String getO_amt_04(){
		return this.o_amt_04;
	}

	public String getO_amt_05(){
		return this.o_amt_05;
	}

	public String getO_amt_06(){
		return this.o_amt_06;
	}

	public String getO_amt_07(){
		return this.o_amt_07;
	}

	public String getO_amt_08(){
		return this.o_amt_08;
	}

	public String getO_amt_09(){
		return this.o_amt_09;
	}

	public String getO_amt_10(){
		return this.o_amt_10;
	}

	public String getO_amt_11(){
		return this.o_amt_11;
	}

	public String getO_amt_12(){
		return this.o_amt_12;
	}

	public String getP_amt_01(){
		return this.p_amt_01;
	}

	public String getP_amt_02(){
		return this.p_amt_02;
	}

	public String getP_amt_03(){
		return this.p_amt_03;
	}

	public String getP_amt_04(){
		return this.p_amt_04;
	}

	public String getP_amt_05(){
		return this.p_amt_05;
	}

	public String getP_amt_06(){
		return this.p_amt_06;
	}

	public String getP_amt_07(){
		return this.p_amt_07;
	}

	public String getP_amt_08(){
		return this.p_amt_08;
	}

	public String getP_amt_09(){
		return this.p_amt_09;
	}

	public String getP_amt_10(){
		return this.p_amt_10;
	}

	public String getP_amt_11(){
		return this.p_amt_11;
	}

	public String getP_amt_12(){
		return this.p_amt_12;
	}
}

/* 작성시간 : Thu Jun 28 15:54:07 KST 2012 */