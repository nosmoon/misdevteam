/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.is.rpt.rec;

import java.sql.*;
import chosun.ciis.is.rpt.dm.*;
import chosun.ciis.is.rpt.ds.*;

/**
 * 
 */


public class IS_RPT_1810_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String sido;
	public String gu;
	public String purc_dlco_no;
	public String sido_nm;
	public String gu_nm;
	public String purc_dlco_nm;
	public String p_qunt_010;
	public String p_amt_010;
	public String p_qunt_020;
	public String p_amt_020;
	public String p_qunt_030;
	public String p_amt_030;
	public String p_qunt_tot;
	public String p_amt_tot;
	public String b_qunt_010;
	public String b_amt_010;
	public String b_qunt_020;
	public String b_amt_020;
	public String b_qunt_030;
	public String b_amt_030;
	public String b_qunt_tot;
	public String b_amt_tot;
	public String c_qunt_010;
	public String c_amt_010;
	public String c_qunt_020;
	public String c_amt_020;
	public String c_qunt_030;
	public String c_amt_030;
	public String c_qunt_tot;
	public String c_amt_tot;

	public IS_RPT_1810_LCURLIST1Record(){}

	public void setSido(String sido){
		this.sido = sido;
	}

	public void setGu(String gu){
		this.gu = gu;
	}

	public void setPurc_dlco_no(String purc_dlco_no){
		this.purc_dlco_no = purc_dlco_no;
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

	public void setP_qunt_010(String p_qunt_010){
		this.p_qunt_010 = p_qunt_010;
	}

	public void setP_amt_010(String p_amt_010){
		this.p_amt_010 = p_amt_010;
	}

	public void setP_qunt_020(String p_qunt_020){
		this.p_qunt_020 = p_qunt_020;
	}

	public void setP_amt_020(String p_amt_020){
		this.p_amt_020 = p_amt_020;
	}

	public void setP_qunt_030(String p_qunt_030){
		this.p_qunt_030 = p_qunt_030;
	}

	public void setP_amt_030(String p_amt_030){
		this.p_amt_030 = p_amt_030;
	}

	public void setP_qunt_tot(String p_qunt_tot){
		this.p_qunt_tot = p_qunt_tot;
	}

	public void setP_amt_tot(String p_amt_tot){
		this.p_amt_tot = p_amt_tot;
	}

	public void setB_qunt_010(String b_qunt_010){
		this.b_qunt_010 = b_qunt_010;
	}

	public void setB_amt_010(String b_amt_010){
		this.b_amt_010 = b_amt_010;
	}

	public void setB_qunt_020(String b_qunt_020){
		this.b_qunt_020 = b_qunt_020;
	}

	public void setB_amt_020(String b_amt_020){
		this.b_amt_020 = b_amt_020;
	}

	public void setB_qunt_030(String b_qunt_030){
		this.b_qunt_030 = b_qunt_030;
	}

	public void setB_amt_030(String b_amt_030){
		this.b_amt_030 = b_amt_030;
	}

	public void setB_qunt_tot(String b_qunt_tot){
		this.b_qunt_tot = b_qunt_tot;
	}

	public void setB_amt_tot(String b_amt_tot){
		this.b_amt_tot = b_amt_tot;
	}

	public void setC_qunt_010(String c_qunt_010){
		this.c_qunt_010 = c_qunt_010;
	}

	public void setC_amt_010(String c_amt_010){
		this.c_amt_010 = c_amt_010;
	}

	public void setC_qunt_020(String c_qunt_020){
		this.c_qunt_020 = c_qunt_020;
	}

	public void setC_amt_020(String c_amt_020){
		this.c_amt_020 = c_amt_020;
	}

	public void setC_qunt_030(String c_qunt_030){
		this.c_qunt_030 = c_qunt_030;
	}

	public void setC_amt_030(String c_amt_030){
		this.c_amt_030 = c_amt_030;
	}

	public void setC_qunt_tot(String c_qunt_tot){
		this.c_qunt_tot = c_qunt_tot;
	}

	public void setC_amt_tot(String c_amt_tot){
		this.c_amt_tot = c_amt_tot;
	}

	public String getSido(){
		return this.sido;
	}

	public String getGu(){
		return this.gu;
	}

	public String getPurc_dlco_no(){
		return this.purc_dlco_no;
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

	public String getP_qunt_010(){
		return this.p_qunt_010;
	}

	public String getP_amt_010(){
		return this.p_amt_010;
	}

	public String getP_qunt_020(){
		return this.p_qunt_020;
	}

	public String getP_amt_020(){
		return this.p_amt_020;
	}

	public String getP_qunt_030(){
		return this.p_qunt_030;
	}

	public String getP_amt_030(){
		return this.p_amt_030;
	}

	public String getP_qunt_tot(){
		return this.p_qunt_tot;
	}

	public String getP_amt_tot(){
		return this.p_amt_tot;
	}

	public String getB_qunt_010(){
		return this.b_qunt_010;
	}

	public String getB_amt_010(){
		return this.b_amt_010;
	}

	public String getB_qunt_020(){
		return this.b_qunt_020;
	}

	public String getB_amt_020(){
		return this.b_amt_020;
	}

	public String getB_qunt_030(){
		return this.b_qunt_030;
	}

	public String getB_amt_030(){
		return this.b_amt_030;
	}

	public String getB_qunt_tot(){
		return this.b_qunt_tot;
	}

	public String getB_amt_tot(){
		return this.b_amt_tot;
	}

	public String getC_qunt_010(){
		return this.c_qunt_010;
	}

	public String getC_amt_010(){
		return this.c_amt_010;
	}

	public String getC_qunt_020(){
		return this.c_qunt_020;
	}

	public String getC_amt_020(){
		return this.c_amt_020;
	}

	public String getC_qunt_030(){
		return this.c_qunt_030;
	}

	public String getC_amt_030(){
		return this.c_amt_030;
	}

	public String getC_qunt_tot(){
		return this.c_qunt_tot;
	}

	public String getC_amt_tot(){
		return this.c_amt_tot;
	}
}

/* �ۼ��ð� : Fri Jun 01 09:15:35 KST 2012 */