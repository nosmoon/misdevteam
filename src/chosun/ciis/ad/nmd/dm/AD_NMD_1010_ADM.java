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


package chosun.ciis.ad.nmd.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.nmd.ds.*;
import chosun.ciis.ad.nmd.rec.*;

/**
 * 
 */


public class AD_NMD_1010_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String order_no;
	public String prdct_cd;
	public String sell_dt;
	public String adjst_clsf;
	public String tax_clsf;
	public String order_tot_amt;
	public String coupon_tot_amt;
	public String sttlmnt_tot_amt;
	public String crdit_card_amt;
	public String trnsf_amt;
	public String cphone_amt;
	public String nbankbok_amt;
	public String public_tot_amt;
	public String point_amt;
	public String point_tot_amt;
	public String ncash_web_amt;
	public String cash_web_amt;
	public String gift_amt;
	public String web_tot_amt;
	public String tot_amt;
	public String suply_amt;
	public String vat_amt;
	public String p_suply_amt;
	public String p_vat_amt;
	public String w_suply_amt;
	public String w_vat_amt;
	public String suply_tot_amt;
	public String vat_tot_amt;
	public String demand_dlco_no;
	public String demand_dlco_nm;
	public String adjst_amt;
	public String incmg_pers_ip;
	public String incmg_pers;

	public AD_NMD_1010_ADM(){}
	public AD_NMD_1010_ADM(String cmpy_cd, String mode, String order_no, String prdct_cd, String sell_dt, String adjst_clsf, String tax_clsf, String order_tot_amt, String coupon_tot_amt, String sttlmnt_tot_amt, String crdit_card_amt, String trnsf_amt, String cphone_amt, String nbankbok_amt, String public_tot_amt, String point_amt, String point_tot_amt, String ncash_web_amt, String cash_web_amt, String gift_amt, String web_tot_amt, String tot_amt, String suply_amt, String vat_amt, String p_suply_amt, String p_vat_amt, String w_suply_amt, String w_vat_amt, String suply_tot_amt, String vat_tot_amt, String demand_dlco_no, String demand_dlco_nm, String adjst_amt, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.order_no = order_no;
		this.prdct_cd = prdct_cd;
		this.sell_dt = sell_dt;
		this.adjst_clsf = adjst_clsf;
		this.tax_clsf = tax_clsf;
		this.order_tot_amt = order_tot_amt;
		this.coupon_tot_amt = coupon_tot_amt;
		this.sttlmnt_tot_amt = sttlmnt_tot_amt;
		this.crdit_card_amt = crdit_card_amt;
		this.trnsf_amt = trnsf_amt;
		this.cphone_amt = cphone_amt;
		this.nbankbok_amt = nbankbok_amt;
		this.public_tot_amt = public_tot_amt;
		this.point_amt = point_amt;
		this.point_tot_amt = point_tot_amt;
		this.ncash_web_amt = ncash_web_amt;
		this.cash_web_amt = cash_web_amt;
		this.gift_amt = gift_amt;
		this.web_tot_amt = web_tot_amt;
		this.tot_amt = tot_amt;
		this.suply_amt = suply_amt;
		this.vat_amt = vat_amt;
		this.p_suply_amt = p_suply_amt;
		this.p_vat_amt = p_vat_amt;
		this.w_suply_amt = w_suply_amt;
		this.w_vat_amt = w_vat_amt;
		this.suply_tot_amt = suply_tot_amt;
		this.vat_tot_amt = vat_tot_amt;
		this.demand_dlco_no = demand_dlco_no;
		this.demand_dlco_nm = demand_dlco_nm;
		this.adjst_amt = adjst_amt;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setOrder_no(String order_no){
		this.order_no = order_no;
	}

	public void setPrdct_cd(String prdct_cd){
		this.prdct_cd = prdct_cd;
	}

	public void setSell_dt(String sell_dt){
		this.sell_dt = sell_dt;
	}

	public void setAdjst_clsf(String adjst_clsf){
		this.adjst_clsf = adjst_clsf;
	}

	public void setTax_clsf(String tax_clsf){
		this.tax_clsf = tax_clsf;
	}

	public void setOrder_tot_amt(String order_tot_amt){
		this.order_tot_amt = order_tot_amt;
	}

	public void setCoupon_tot_amt(String coupon_tot_amt){
		this.coupon_tot_amt = coupon_tot_amt;
	}

	public void setSttlmnt_tot_amt(String sttlmnt_tot_amt){
		this.sttlmnt_tot_amt = sttlmnt_tot_amt;
	}

	public void setCrdit_card_amt(String crdit_card_amt){
		this.crdit_card_amt = crdit_card_amt;
	}

	public void setTrnsf_amt(String trnsf_amt){
		this.trnsf_amt = trnsf_amt;
	}

	public void setCphone_amt(String cphone_amt){
		this.cphone_amt = cphone_amt;
	}

	public void setNbankbok_amt(String nbankbok_amt){
		this.nbankbok_amt = nbankbok_amt;
	}

	public void setPublic_tot_amt(String public_tot_amt){
		this.public_tot_amt = public_tot_amt;
	}

	public void setPoint_amt(String point_amt){
		this.point_amt = point_amt;
	}

	public void setPoint_tot_amt(String point_tot_amt){
		this.point_tot_amt = point_tot_amt;
	}

	public void setNcash_web_amt(String ncash_web_amt){
		this.ncash_web_amt = ncash_web_amt;
	}

	public void setCash_web_amt(String cash_web_amt){
		this.cash_web_amt = cash_web_amt;
	}

	public void setGift_amt(String gift_amt){
		this.gift_amt = gift_amt;
	}

	public void setWeb_tot_amt(String web_tot_amt){
		this.web_tot_amt = web_tot_amt;
	}

	public void setTot_amt(String tot_amt){
		this.tot_amt = tot_amt;
	}

	public void setSuply_amt(String suply_amt){
		this.suply_amt = suply_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setP_suply_amt(String p_suply_amt){
		this.p_suply_amt = p_suply_amt;
	}

	public void setP_vat_amt(String p_vat_amt){
		this.p_vat_amt = p_vat_amt;
	}

	public void setW_suply_amt(String w_suply_amt){
		this.w_suply_amt = w_suply_amt;
	}

	public void setW_vat_amt(String w_vat_amt){
		this.w_vat_amt = w_vat_amt;
	}

	public void setSuply_tot_amt(String suply_tot_amt){
		this.suply_tot_amt = suply_tot_amt;
	}

	public void setVat_tot_amt(String vat_tot_amt){
		this.vat_tot_amt = vat_tot_amt;
	}

	public void setDemand_dlco_no(String demand_dlco_no){
		this.demand_dlco_no = demand_dlco_no;
	}

	public void setDemand_dlco_nm(String demand_dlco_nm){
		this.demand_dlco_nm = demand_dlco_nm;
	}

	public void setAdjst_amt(String adjst_amt){
		this.adjst_amt = adjst_amt;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMode(){
		return this.mode;
	}

	public String getOrder_no(){
		return this.order_no;
	}

	public String getPrdct_cd(){
		return this.prdct_cd;
	}

	public String getSell_dt(){
		return this.sell_dt;
	}

	public String getAdjst_clsf(){
		return this.adjst_clsf;
	}

	public String getTax_clsf(){
		return this.tax_clsf;
	}

	public String getOrder_tot_amt(){
		return this.order_tot_amt;
	}

	public String getCoupon_tot_amt(){
		return this.coupon_tot_amt;
	}

	public String getSttlmnt_tot_amt(){
		return this.sttlmnt_tot_amt;
	}

	public String getCrdit_card_amt(){
		return this.crdit_card_amt;
	}

	public String getTrnsf_amt(){
		return this.trnsf_amt;
	}

	public String getCphone_amt(){
		return this.cphone_amt;
	}

	public String getNbankbok_amt(){
		return this.nbankbok_amt;
	}

	public String getPublic_tot_amt(){
		return this.public_tot_amt;
	}

	public String getPoint_amt(){
		return this.point_amt;
	}

	public String getPoint_tot_amt(){
		return this.point_tot_amt;
	}

	public String getNcash_web_amt(){
		return this.ncash_web_amt;
	}

	public String getCash_web_amt(){
		return this.cash_web_amt;
	}

	public String getGift_amt(){
		return this.gift_amt;
	}

	public String getWeb_tot_amt(){
		return this.web_tot_amt;
	}

	public String getTot_amt(){
		return this.tot_amt;
	}

	public String getSuply_amt(){
		return this.suply_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}

	public String getP_suply_amt(){
		return this.p_suply_amt;
	}

	public String getP_vat_amt(){
		return this.p_vat_amt;
	}

	public String getW_suply_amt(){
		return this.w_suply_amt;
	}

	public String getW_vat_amt(){
		return this.w_vat_amt;
	}

	public String getSuply_tot_amt(){
		return this.suply_tot_amt;
	}

	public String getVat_tot_amt(){
		return this.vat_tot_amt;
	}

	public String getDemand_dlco_no(){
		return this.demand_dlco_no;
	}

	public String getDemand_dlco_nm(){
		return this.demand_dlco_nm;
	}

	public String getAdjst_amt(){
		return this.adjst_amt;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_NMD_1010_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_NMD_1010_ADM dm = (AD_NMD_1010_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.order_no);
		cstmt.setString(6, dm.prdct_cd);
		cstmt.setString(7, dm.sell_dt);
		cstmt.setString(8, dm.adjst_clsf);
		cstmt.setString(9, dm.tax_clsf);
		cstmt.setString(10, dm.order_tot_amt);
		cstmt.setString(11, dm.coupon_tot_amt);
		cstmt.setString(12, dm.sttlmnt_tot_amt);
		cstmt.setString(13, dm.crdit_card_amt);
		cstmt.setString(14, dm.trnsf_amt);
		cstmt.setString(15, dm.cphone_amt);
		cstmt.setString(16, dm.nbankbok_amt);
		cstmt.setString(17, dm.public_tot_amt);
		cstmt.setString(18, dm.point_amt);
		cstmt.setString(19, dm.point_tot_amt);
		cstmt.setString(20, dm.ncash_web_amt);
		cstmt.setString(21, dm.cash_web_amt);
		cstmt.setString(22, dm.gift_amt);
		cstmt.setString(23, dm.web_tot_amt);
		cstmt.setString(24, dm.tot_amt);
		cstmt.setString(25, dm.suply_amt);
		cstmt.setString(26, dm.vat_amt);
		cstmt.setString(27, dm.p_suply_amt);
		cstmt.setString(28, dm.p_vat_amt);
		cstmt.setString(29, dm.w_suply_amt);
		cstmt.setString(30, dm.w_vat_amt);
		cstmt.setString(31, dm.suply_tot_amt);
		cstmt.setString(32, dm.vat_tot_amt);
		cstmt.setString(33, dm.demand_dlco_no);
		cstmt.setString(34, dm.demand_dlco_nm);
		cstmt.setString(35, dm.adjst_amt);
		cstmt.setString(36, dm.incmg_pers_ip);
		cstmt.setString(37, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.nmd.ds.AD_NMD_1010_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("order_no = [" + getOrder_no() + "]");
		System.out.println("prdct_cd = [" + getPrdct_cd() + "]");
		System.out.println("sell_dt = [" + getSell_dt() + "]");
		System.out.println("adjst_clsf = [" + getAdjst_clsf() + "]");
		System.out.println("tax_clsf = [" + getTax_clsf() + "]");
		System.out.println("order_tot_amt = [" + getOrder_tot_amt() + "]");
		System.out.println("coupon_tot_amt = [" + getCoupon_tot_amt() + "]");
		System.out.println("sttlmnt_tot_amt = [" + getSttlmnt_tot_amt() + "]");
		System.out.println("crdit_card_amt = [" + getCrdit_card_amt() + "]");
		System.out.println("trnsf_amt = [" + getTrnsf_amt() + "]");
		System.out.println("cphone_amt = [" + getCphone_amt() + "]");
		System.out.println("nbankbok_amt = [" + getNbankbok_amt() + "]");
		System.out.println("public_tot_amt = [" + getPublic_tot_amt() + "]");
		System.out.println("point_amt = [" + getPoint_amt() + "]");
		System.out.println("point_tot_amt = [" + getPoint_tot_amt() + "]");
		System.out.println("ncash_web_amt = [" + getNcash_web_amt() + "]");
		System.out.println("cash_web_amt = [" + getCash_web_amt() + "]");
		System.out.println("gift_amt = [" + getGift_amt() + "]");
		System.out.println("web_tot_amt = [" + getWeb_tot_amt() + "]");
		System.out.println("tot_amt = [" + getTot_amt() + "]");
		System.out.println("suply_amt = [" + getSuply_amt() + "]");
		System.out.println("vat_amt = [" + getVat_amt() + "]");
		System.out.println("p_suply_amt = [" + getP_suply_amt() + "]");
		System.out.println("p_vat_amt = [" + getP_vat_amt() + "]");
		System.out.println("w_suply_amt = [" + getW_suply_amt() + "]");
		System.out.println("w_vat_amt = [" + getW_vat_amt() + "]");
		System.out.println("suply_tot_amt = [" + getSuply_tot_amt() + "]");
		System.out.println("vat_tot_amt = [" + getVat_tot_amt() + "]");
		System.out.println("demand_dlco_no = [" + getDemand_dlco_no() + "]");
		System.out.println("demand_dlco_nm = [" + getDemand_dlco_nm() + "]");
		System.out.println("adjst_amt = [" + getAdjst_amt() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String order_no = req.getParameter("order_no");
if( order_no == null){
	System.out.println(this.toString+" : order_no is null" );
}else{
	System.out.println(this.toString+" : order_no is "+order_no );
}
String prdct_cd = req.getParameter("prdct_cd");
if( prdct_cd == null){
	System.out.println(this.toString+" : prdct_cd is null" );
}else{
	System.out.println(this.toString+" : prdct_cd is "+prdct_cd );
}
String sell_dt = req.getParameter("sell_dt");
if( sell_dt == null){
	System.out.println(this.toString+" : sell_dt is null" );
}else{
	System.out.println(this.toString+" : sell_dt is "+sell_dt );
}
String adjst_clsf = req.getParameter("adjst_clsf");
if( adjst_clsf == null){
	System.out.println(this.toString+" : adjst_clsf is null" );
}else{
	System.out.println(this.toString+" : adjst_clsf is "+adjst_clsf );
}
String tax_clsf = req.getParameter("tax_clsf");
if( tax_clsf == null){
	System.out.println(this.toString+" : tax_clsf is null" );
}else{
	System.out.println(this.toString+" : tax_clsf is "+tax_clsf );
}
String order_tot_amt = req.getParameter("order_tot_amt");
if( order_tot_amt == null){
	System.out.println(this.toString+" : order_tot_amt is null" );
}else{
	System.out.println(this.toString+" : order_tot_amt is "+order_tot_amt );
}
String coupon_tot_amt = req.getParameter("coupon_tot_amt");
if( coupon_tot_amt == null){
	System.out.println(this.toString+" : coupon_tot_amt is null" );
}else{
	System.out.println(this.toString+" : coupon_tot_amt is "+coupon_tot_amt );
}
String sttlmnt_tot_amt = req.getParameter("sttlmnt_tot_amt");
if( sttlmnt_tot_amt == null){
	System.out.println(this.toString+" : sttlmnt_tot_amt is null" );
}else{
	System.out.println(this.toString+" : sttlmnt_tot_amt is "+sttlmnt_tot_amt );
}
String crdit_card_amt = req.getParameter("crdit_card_amt");
if( crdit_card_amt == null){
	System.out.println(this.toString+" : crdit_card_amt is null" );
}else{
	System.out.println(this.toString+" : crdit_card_amt is "+crdit_card_amt );
}
String trnsf_amt = req.getParameter("trnsf_amt");
if( trnsf_amt == null){
	System.out.println(this.toString+" : trnsf_amt is null" );
}else{
	System.out.println(this.toString+" : trnsf_amt is "+trnsf_amt );
}
String cphone_amt = req.getParameter("cphone_amt");
if( cphone_amt == null){
	System.out.println(this.toString+" : cphone_amt is null" );
}else{
	System.out.println(this.toString+" : cphone_amt is "+cphone_amt );
}
String nbankbok_amt = req.getParameter("nbankbok_amt");
if( nbankbok_amt == null){
	System.out.println(this.toString+" : nbankbok_amt is null" );
}else{
	System.out.println(this.toString+" : nbankbok_amt is "+nbankbok_amt );
}
String public_tot_amt = req.getParameter("public_tot_amt");
if( public_tot_amt == null){
	System.out.println(this.toString+" : public_tot_amt is null" );
}else{
	System.out.println(this.toString+" : public_tot_amt is "+public_tot_amt );
}
String point_amt = req.getParameter("point_amt");
if( point_amt == null){
	System.out.println(this.toString+" : point_amt is null" );
}else{
	System.out.println(this.toString+" : point_amt is "+point_amt );
}
String point_tot_amt = req.getParameter("point_tot_amt");
if( point_tot_amt == null){
	System.out.println(this.toString+" : point_tot_amt is null" );
}else{
	System.out.println(this.toString+" : point_tot_amt is "+point_tot_amt );
}
String ncash_web_amt = req.getParameter("ncash_web_amt");
if( ncash_web_amt == null){
	System.out.println(this.toString+" : ncash_web_amt is null" );
}else{
	System.out.println(this.toString+" : ncash_web_amt is "+ncash_web_amt );
}
String cash_web_amt = req.getParameter("cash_web_amt");
if( cash_web_amt == null){
	System.out.println(this.toString+" : cash_web_amt is null" );
}else{
	System.out.println(this.toString+" : cash_web_amt is "+cash_web_amt );
}
String gift_amt = req.getParameter("gift_amt");
if( gift_amt == null){
	System.out.println(this.toString+" : gift_amt is null" );
}else{
	System.out.println(this.toString+" : gift_amt is "+gift_amt );
}
String web_tot_amt = req.getParameter("web_tot_amt");
if( web_tot_amt == null){
	System.out.println(this.toString+" : web_tot_amt is null" );
}else{
	System.out.println(this.toString+" : web_tot_amt is "+web_tot_amt );
}
String tot_amt = req.getParameter("tot_amt");
if( tot_amt == null){
	System.out.println(this.toString+" : tot_amt is null" );
}else{
	System.out.println(this.toString+" : tot_amt is "+tot_amt );
}
String suply_amt = req.getParameter("suply_amt");
if( suply_amt == null){
	System.out.println(this.toString+" : suply_amt is null" );
}else{
	System.out.println(this.toString+" : suply_amt is "+suply_amt );
}
String vat_amt = req.getParameter("vat_amt");
if( vat_amt == null){
	System.out.println(this.toString+" : vat_amt is null" );
}else{
	System.out.println(this.toString+" : vat_amt is "+vat_amt );
}
String p_suply_amt = req.getParameter("p_suply_amt");
if( p_suply_amt == null){
	System.out.println(this.toString+" : p_suply_amt is null" );
}else{
	System.out.println(this.toString+" : p_suply_amt is "+p_suply_amt );
}
String p_vat_amt = req.getParameter("p_vat_amt");
if( p_vat_amt == null){
	System.out.println(this.toString+" : p_vat_amt is null" );
}else{
	System.out.println(this.toString+" : p_vat_amt is "+p_vat_amt );
}
String w_suply_amt = req.getParameter("w_suply_amt");
if( w_suply_amt == null){
	System.out.println(this.toString+" : w_suply_amt is null" );
}else{
	System.out.println(this.toString+" : w_suply_amt is "+w_suply_amt );
}
String w_vat_amt = req.getParameter("w_vat_amt");
if( w_vat_amt == null){
	System.out.println(this.toString+" : w_vat_amt is null" );
}else{
	System.out.println(this.toString+" : w_vat_amt is "+w_vat_amt );
}
String suply_tot_amt = req.getParameter("suply_tot_amt");
if( suply_tot_amt == null){
	System.out.println(this.toString+" : suply_tot_amt is null" );
}else{
	System.out.println(this.toString+" : suply_tot_amt is "+suply_tot_amt );
}
String vat_tot_amt = req.getParameter("vat_tot_amt");
if( vat_tot_amt == null){
	System.out.println(this.toString+" : vat_tot_amt is null" );
}else{
	System.out.println(this.toString+" : vat_tot_amt is "+vat_tot_amt );
}
String demand_dlco_no = req.getParameter("demand_dlco_no");
if( demand_dlco_no == null){
	System.out.println(this.toString+" : demand_dlco_no is null" );
}else{
	System.out.println(this.toString+" : demand_dlco_no is "+demand_dlco_no );
}
String demand_dlco_nm = req.getParameter("demand_dlco_nm");
if( demand_dlco_nm == null){
	System.out.println(this.toString+" : demand_dlco_nm is null" );
}else{
	System.out.println(this.toString+" : demand_dlco_nm is "+demand_dlco_nm );
}
String adjst_amt = req.getParameter("adjst_amt");
if( adjst_amt == null){
	System.out.println(this.toString+" : adjst_amt is null" );
}else{
	System.out.println(this.toString+" : adjst_amt is "+adjst_amt );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String mode = Util.checkString(req.getParameter("mode"));
String order_no = Util.checkString(req.getParameter("order_no"));
String prdct_cd = Util.checkString(req.getParameter("prdct_cd"));
String sell_dt = Util.checkString(req.getParameter("sell_dt"));
String adjst_clsf = Util.checkString(req.getParameter("adjst_clsf"));
String tax_clsf = Util.checkString(req.getParameter("tax_clsf"));
String order_tot_amt = Util.checkString(req.getParameter("order_tot_amt"));
String coupon_tot_amt = Util.checkString(req.getParameter("coupon_tot_amt"));
String sttlmnt_tot_amt = Util.checkString(req.getParameter("sttlmnt_tot_amt"));
String crdit_card_amt = Util.checkString(req.getParameter("crdit_card_amt"));
String trnsf_amt = Util.checkString(req.getParameter("trnsf_amt"));
String cphone_amt = Util.checkString(req.getParameter("cphone_amt"));
String nbankbok_amt = Util.checkString(req.getParameter("nbankbok_amt"));
String public_tot_amt = Util.checkString(req.getParameter("public_tot_amt"));
String point_amt = Util.checkString(req.getParameter("point_amt"));
String point_tot_amt = Util.checkString(req.getParameter("point_tot_amt"));
String ncash_web_amt = Util.checkString(req.getParameter("ncash_web_amt"));
String cash_web_amt = Util.checkString(req.getParameter("cash_web_amt"));
String gift_amt = Util.checkString(req.getParameter("gift_amt"));
String web_tot_amt = Util.checkString(req.getParameter("web_tot_amt"));
String tot_amt = Util.checkString(req.getParameter("tot_amt"));
String suply_amt = Util.checkString(req.getParameter("suply_amt"));
String vat_amt = Util.checkString(req.getParameter("vat_amt"));
String p_suply_amt = Util.checkString(req.getParameter("p_suply_amt"));
String p_vat_amt = Util.checkString(req.getParameter("p_vat_amt"));
String w_suply_amt = Util.checkString(req.getParameter("w_suply_amt"));
String w_vat_amt = Util.checkString(req.getParameter("w_vat_amt"));
String suply_tot_amt = Util.checkString(req.getParameter("suply_tot_amt"));
String vat_tot_amt = Util.checkString(req.getParameter("vat_tot_amt"));
String demand_dlco_no = Util.checkString(req.getParameter("demand_dlco_no"));
String demand_dlco_nm = Util.checkString(req.getParameter("demand_dlco_nm"));
String adjst_amt = Util.checkString(req.getParameter("adjst_amt"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String order_no = Util.Uni2Ksc(Util.checkString(req.getParameter("order_no")));
String prdct_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("prdct_cd")));
String sell_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("sell_dt")));
String adjst_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("adjst_clsf")));
String tax_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("tax_clsf")));
String order_tot_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("order_tot_amt")));
String coupon_tot_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("coupon_tot_amt")));
String sttlmnt_tot_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("sttlmnt_tot_amt")));
String crdit_card_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("crdit_card_amt")));
String trnsf_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("trnsf_amt")));
String cphone_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("cphone_amt")));
String nbankbok_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("nbankbok_amt")));
String public_tot_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("public_tot_amt")));
String point_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("point_amt")));
String point_tot_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("point_tot_amt")));
String ncash_web_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("ncash_web_amt")));
String cash_web_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("cash_web_amt")));
String gift_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("gift_amt")));
String web_tot_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("web_tot_amt")));
String tot_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("tot_amt")));
String suply_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("suply_amt")));
String vat_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("vat_amt")));
String p_suply_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("p_suply_amt")));
String p_vat_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("p_vat_amt")));
String w_suply_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("w_suply_amt")));
String w_vat_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("w_vat_amt")));
String suply_tot_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("suply_tot_amt")));
String vat_tot_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("vat_tot_amt")));
String demand_dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("demand_dlco_no")));
String demand_dlco_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("demand_dlco_nm")));
String adjst_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("adjst_amt")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setOrder_no(order_no);
dm.setPrdct_cd(prdct_cd);
dm.setSell_dt(sell_dt);
dm.setAdjst_clsf(adjst_clsf);
dm.setTax_clsf(tax_clsf);
dm.setOrder_tot_amt(order_tot_amt);
dm.setCoupon_tot_amt(coupon_tot_amt);
dm.setSttlmnt_tot_amt(sttlmnt_tot_amt);
dm.setCrdit_card_amt(crdit_card_amt);
dm.setTrnsf_amt(trnsf_amt);
dm.setCphone_amt(cphone_amt);
dm.setNbankbok_amt(nbankbok_amt);
dm.setPublic_tot_amt(public_tot_amt);
dm.setPoint_amt(point_amt);
dm.setPoint_tot_amt(point_tot_amt);
dm.setNcash_web_amt(ncash_web_amt);
dm.setCash_web_amt(cash_web_amt);
dm.setGift_amt(gift_amt);
dm.setWeb_tot_amt(web_tot_amt);
dm.setTot_amt(tot_amt);
dm.setSuply_amt(suply_amt);
dm.setVat_amt(vat_amt);
dm.setP_suply_amt(p_suply_amt);
dm.setP_vat_amt(p_vat_amt);
dm.setW_suply_amt(w_suply_amt);
dm.setW_vat_amt(w_vat_amt);
dm.setSuply_tot_amt(suply_tot_amt);
dm.setVat_tot_amt(vat_tot_amt);
dm.setDemand_dlco_no(demand_dlco_no);
dm.setDemand_dlco_nm(demand_dlco_nm);
dm.setAdjst_amt(adjst_amt);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 28 18:57:53 KST 2012 */