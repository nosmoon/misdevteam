/***************************************************************************************************
* ���ϸ� : .java
* ��� :  �繫ȸ��-ȸ�����-�ΰ�������-�ΰ����Ű��ڷ����(��ȸ)
* �ۼ����� : 2010-04-23
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.fc.acct.rec;

import java.sql.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.ds.*;

/**
 * �繫ȸ��-ȸ�����-�ΰ�������-�ΰ����Ű��ڷ����(��ȸ)
 */


public class FC_ACCT_6131_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String vat_decl_yymm;
	public String purc_sale_clsf_cd;
	public String purc_sale_clsf_nm;
	public String decl_amt1;
	public String decl_amt2;
	public String clos_yn;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String incmg_dt_tm;
	public String erplace_cd;
	public String erplace_cd_nm;

	public FC_ACCT_6131_LCURLISTRecord(){}

	public void setVat_decl_yymm(String vat_decl_yymm){
		this.vat_decl_yymm = vat_decl_yymm;
	}

	public void setPurc_sale_clsf_cd(String purc_sale_clsf_cd){
		this.purc_sale_clsf_cd = purc_sale_clsf_cd;
	}

	public void setPurc_sale_clsf_nm(String purc_sale_clsf_nm){
		this.purc_sale_clsf_nm = purc_sale_clsf_nm;
	}

	public void setDecl_amt1(String decl_amt1){
		this.decl_amt1 = decl_amt1;
	}

	public void setDecl_amt2(String decl_amt2){
		this.decl_amt2 = decl_amt2;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_dt_tm(String incmg_dt_tm){
		this.incmg_dt_tm = incmg_dt_tm;
	}

	public void setErplace_cd(String erplace_cd){
		this.erplace_cd = erplace_cd;
	}

	public void setErplace_cd_nm(String erplace_cd_nm){
		this.erplace_cd_nm = erplace_cd_nm;
	}

	public String getVat_decl_yymm(){
		return this.vat_decl_yymm;
	}

	public String getPurc_sale_clsf_cd(){
		return this.purc_sale_clsf_cd;
	}

	public String getPurc_sale_clsf_nm(){
		return this.purc_sale_clsf_nm;
	}

	public String getDecl_amt1(){
		return this.decl_amt1;
	}

	public String getDecl_amt2(){
		return this.decl_amt2;
	}

	public String getClos_yn(){
		return this.clos_yn;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_dt_tm(){
		return this.incmg_dt_tm;
	}

	public String getErplace_cd(){
		return this.erplace_cd;
	}

	public String getErplace_cd_nm(){
		return this.erplace_cd_nm;
	}
}

/* �ۼ��ð� : Fri Apr 23 10:44:39 KST 2010 */