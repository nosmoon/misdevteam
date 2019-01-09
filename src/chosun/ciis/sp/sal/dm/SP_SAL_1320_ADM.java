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


package chosun.ciis.sp.sal.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.sp.sal.ds.*;
import chosun.ciis.sp.sal.rec.*;

/**
 * 
 */


public class SP_SAL_1320_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String sale_yymm;
	public String sell_dept_nm;
	public String sell_area_cd;
	public String sell_area_nm;
	public String bo_nm;
	public String acol_no;
	public String dlco_no;
	public String clam_apt;
	public String clam_hous;
	public String clam_shop_etc;
	public String ufth_apt;
	public String ufth_hous;
	public String ufth_shop_etc;
	public String cnfm_apt;
	public String cnfm_hous;
	public String cnfm_shop_etc;
	public String alon_clam_qty;
	public String rdr_extn_alon;
	public String pay_amt;
	public String incmg_pers_ip;
	public String incmg_pers;

	public SP_SAL_1320_ADM(){}
	public SP_SAL_1320_ADM(String cmpy_cd, String sale_yymm, String sell_dept_nm, String sell_area_cd, String sell_area_nm, String bo_nm, String acol_no, String dlco_no, String clam_apt, String clam_hous, String clam_shop_etc, String ufth_apt, String ufth_hous, String ufth_shop_etc, String cnfm_apt, String cnfm_hous, String cnfm_shop_etc, String alon_clam_qty, String rdr_extn_alon, String pay_amt, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.sale_yymm = sale_yymm;
		this.sell_dept_nm = sell_dept_nm;
		this.sell_area_cd = sell_area_cd;
		this.sell_area_nm = sell_area_nm;
		this.bo_nm = bo_nm;
		this.acol_no = acol_no;
		this.dlco_no = dlco_no;
		this.clam_apt = clam_apt;
		this.clam_hous = clam_hous;
		this.clam_shop_etc = clam_shop_etc;
		this.ufth_apt = ufth_apt;
		this.ufth_hous = ufth_hous;
		this.ufth_shop_etc = ufth_shop_etc;
		this.cnfm_apt = cnfm_apt;
		this.cnfm_hous = cnfm_hous;
		this.cnfm_shop_etc = cnfm_shop_etc;
		this.alon_clam_qty = alon_clam_qty;
		this.rdr_extn_alon = rdr_extn_alon;
		this.pay_amt = pay_amt;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSale_yymm(String sale_yymm){
		this.sale_yymm = sale_yymm;
	}

	public void setSell_dept_nm(String sell_dept_nm){
		this.sell_dept_nm = sell_dept_nm;
	}

	public void setSell_area_cd(String sell_area_cd){
		this.sell_area_cd = sell_area_cd;
	}

	public void setSell_area_nm(String sell_area_nm){
		this.sell_area_nm = sell_area_nm;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setAcol_no(String acol_no){
		this.acol_no = acol_no;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setClam_apt(String clam_apt){
		this.clam_apt = clam_apt;
	}

	public void setClam_hous(String clam_hous){
		this.clam_hous = clam_hous;
	}

	public void setClam_shop_etc(String clam_shop_etc){
		this.clam_shop_etc = clam_shop_etc;
	}

	public void setUfth_apt(String ufth_apt){
		this.ufth_apt = ufth_apt;
	}

	public void setUfth_hous(String ufth_hous){
		this.ufth_hous = ufth_hous;
	}

	public void setUfth_shop_etc(String ufth_shop_etc){
		this.ufth_shop_etc = ufth_shop_etc;
	}

	public void setCnfm_apt(String cnfm_apt){
		this.cnfm_apt = cnfm_apt;
	}

	public void setCnfm_hous(String cnfm_hous){
		this.cnfm_hous = cnfm_hous;
	}

	public void setCnfm_shop_etc(String cnfm_shop_etc){
		this.cnfm_shop_etc = cnfm_shop_etc;
	}

	public void setAlon_clam_qty(String alon_clam_qty){
		this.alon_clam_qty = alon_clam_qty;
	}

	public void setRdr_extn_alon(String rdr_extn_alon){
		this.rdr_extn_alon = rdr_extn_alon;
	}

	public void setPay_amt(String pay_amt){
		this.pay_amt = pay_amt;
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

	public String getSale_yymm(){
		return this.sale_yymm;
	}

	public String getSell_dept_nm(){
		return this.sell_dept_nm;
	}

	public String getSell_area_cd(){
		return this.sell_area_cd;
	}

	public String getSell_area_nm(){
		return this.sell_area_nm;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}

	public String getAcol_no(){
		return this.acol_no;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getClam_apt(){
		return this.clam_apt;
	}

	public String getClam_hous(){
		return this.clam_hous;
	}

	public String getClam_shop_etc(){
		return this.clam_shop_etc;
	}

	public String getUfth_apt(){
		return this.ufth_apt;
	}

	public String getUfth_hous(){
		return this.ufth_hous;
	}

	public String getUfth_shop_etc(){
		return this.ufth_shop_etc;
	}

	public String getCnfm_apt(){
		return this.cnfm_apt;
	}

	public String getCnfm_hous(){
		return this.cnfm_hous;
	}

	public String getCnfm_shop_etc(){
		return this.cnfm_shop_etc;
	}

	public String getAlon_clam_qty(){
		return this.alon_clam_qty;
	}

	public String getRdr_extn_alon(){
		return this.rdr_extn_alon;
	}

	public String getPay_amt(){
		return this.pay_amt;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_SP_SAL_1320_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SP_SAL_1320_ADM dm = (SP_SAL_1320_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.sale_yymm);
		cstmt.setString(5, dm.sell_dept_nm);
		cstmt.setString(6, dm.sell_area_cd);
		cstmt.setString(7, dm.sell_area_nm);
		cstmt.setString(8, dm.bo_nm);
		cstmt.setString(9, dm.acol_no);
		cstmt.setString(10, dm.dlco_no);
		cstmt.setString(11, dm.clam_apt);
		cstmt.setString(12, dm.clam_hous);
		cstmt.setString(13, dm.clam_shop_etc);
		cstmt.setString(14, dm.ufth_apt);
		cstmt.setString(15, dm.ufth_hous);
		cstmt.setString(16, dm.ufth_shop_etc);
		cstmt.setString(17, dm.cnfm_apt);
		cstmt.setString(18, dm.cnfm_hous);
		cstmt.setString(19, dm.cnfm_shop_etc);
		cstmt.setString(20, dm.alon_clam_qty);
		cstmt.setString(21, dm.rdr_extn_alon);
		cstmt.setString(22, dm.pay_amt);
		cstmt.setString(23, dm.incmg_pers_ip);
		cstmt.setString(24, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.sp.sal.ds.SP_SAL_1320_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("sale_yymm = [" + getSale_yymm() + "]");
		System.out.println("sell_dept_nm = [" + getSell_dept_nm() + "]");
		System.out.println("sell_area_cd = [" + getSell_area_cd() + "]");
		System.out.println("sell_area_nm = [" + getSell_area_nm() + "]");
		System.out.println("bo_nm = [" + getBo_nm() + "]");
		System.out.println("acol_no = [" + getAcol_no() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("clam_apt = [" + getClam_apt() + "]");
		System.out.println("clam_hous = [" + getClam_hous() + "]");
		System.out.println("clam_shop_etc = [" + getClam_shop_etc() + "]");
		System.out.println("ufth_apt = [" + getUfth_apt() + "]");
		System.out.println("ufth_hous = [" + getUfth_hous() + "]");
		System.out.println("ufth_shop_etc = [" + getUfth_shop_etc() + "]");
		System.out.println("cnfm_apt = [" + getCnfm_apt() + "]");
		System.out.println("cnfm_hous = [" + getCnfm_hous() + "]");
		System.out.println("cnfm_shop_etc = [" + getCnfm_shop_etc() + "]");
		System.out.println("alon_clam_qty = [" + getAlon_clam_qty() + "]");
		System.out.println("rdr_extn_alon = [" + getRdr_extn_alon() + "]");
		System.out.println("pay_amt = [" + getPay_amt() + "]");
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
String sale_yymm = req.getParameter("sale_yymm");
if( sale_yymm == null){
	System.out.println(this.toString+" : sale_yymm is null" );
}else{
	System.out.println(this.toString+" : sale_yymm is "+sale_yymm );
}
String sell_dept_nm = req.getParameter("sell_dept_nm");
if( sell_dept_nm == null){
	System.out.println(this.toString+" : sell_dept_nm is null" );
}else{
	System.out.println(this.toString+" : sell_dept_nm is "+sell_dept_nm );
}
String sell_area_cd = req.getParameter("sell_area_cd");
if( sell_area_cd == null){
	System.out.println(this.toString+" : sell_area_cd is null" );
}else{
	System.out.println(this.toString+" : sell_area_cd is "+sell_area_cd );
}
String sell_area_nm = req.getParameter("sell_area_nm");
if( sell_area_nm == null){
	System.out.println(this.toString+" : sell_area_nm is null" );
}else{
	System.out.println(this.toString+" : sell_area_nm is "+sell_area_nm );
}
String bo_nm = req.getParameter("bo_nm");
if( bo_nm == null){
	System.out.println(this.toString+" : bo_nm is null" );
}else{
	System.out.println(this.toString+" : bo_nm is "+bo_nm );
}
String acol_no = req.getParameter("acol_no");
if( acol_no == null){
	System.out.println(this.toString+" : acol_no is null" );
}else{
	System.out.println(this.toString+" : acol_no is "+acol_no );
}
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
String clam_apt = req.getParameter("clam_apt");
if( clam_apt == null){
	System.out.println(this.toString+" : clam_apt is null" );
}else{
	System.out.println(this.toString+" : clam_apt is "+clam_apt );
}
String clam_hous = req.getParameter("clam_hous");
if( clam_hous == null){
	System.out.println(this.toString+" : clam_hous is null" );
}else{
	System.out.println(this.toString+" : clam_hous is "+clam_hous );
}
String clam_shop_etc = req.getParameter("clam_shop_etc");
if( clam_shop_etc == null){
	System.out.println(this.toString+" : clam_shop_etc is null" );
}else{
	System.out.println(this.toString+" : clam_shop_etc is "+clam_shop_etc );
}
String ufth_apt = req.getParameter("ufth_apt");
if( ufth_apt == null){
	System.out.println(this.toString+" : ufth_apt is null" );
}else{
	System.out.println(this.toString+" : ufth_apt is "+ufth_apt );
}
String ufth_hous = req.getParameter("ufth_hous");
if( ufth_hous == null){
	System.out.println(this.toString+" : ufth_hous is null" );
}else{
	System.out.println(this.toString+" : ufth_hous is "+ufth_hous );
}
String ufth_shop_etc = req.getParameter("ufth_shop_etc");
if( ufth_shop_etc == null){
	System.out.println(this.toString+" : ufth_shop_etc is null" );
}else{
	System.out.println(this.toString+" : ufth_shop_etc is "+ufth_shop_etc );
}
String cnfm_apt = req.getParameter("cnfm_apt");
if( cnfm_apt == null){
	System.out.println(this.toString+" : cnfm_apt is null" );
}else{
	System.out.println(this.toString+" : cnfm_apt is "+cnfm_apt );
}
String cnfm_hous = req.getParameter("cnfm_hous");
if( cnfm_hous == null){
	System.out.println(this.toString+" : cnfm_hous is null" );
}else{
	System.out.println(this.toString+" : cnfm_hous is "+cnfm_hous );
}
String cnfm_shop_etc = req.getParameter("cnfm_shop_etc");
if( cnfm_shop_etc == null){
	System.out.println(this.toString+" : cnfm_shop_etc is null" );
}else{
	System.out.println(this.toString+" : cnfm_shop_etc is "+cnfm_shop_etc );
}
String alon_clam_qty = req.getParameter("alon_clam_qty");
if( alon_clam_qty == null){
	System.out.println(this.toString+" : alon_clam_qty is null" );
}else{
	System.out.println(this.toString+" : alon_clam_qty is "+alon_clam_qty );
}
String rdr_extn_alon = req.getParameter("rdr_extn_alon");
if( rdr_extn_alon == null){
	System.out.println(this.toString+" : rdr_extn_alon is null" );
}else{
	System.out.println(this.toString+" : rdr_extn_alon is "+rdr_extn_alon );
}
String pay_amt = req.getParameter("pay_amt");
if( pay_amt == null){
	System.out.println(this.toString+" : pay_amt is null" );
}else{
	System.out.println(this.toString+" : pay_amt is "+pay_amt );
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
String sale_yymm = Util.checkString(req.getParameter("sale_yymm"));
String sell_dept_nm = Util.checkString(req.getParameter("sell_dept_nm"));
String sell_area_cd = Util.checkString(req.getParameter("sell_area_cd"));
String sell_area_nm = Util.checkString(req.getParameter("sell_area_nm"));
String bo_nm = Util.checkString(req.getParameter("bo_nm"));
String acol_no = Util.checkString(req.getParameter("acol_no"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String clam_apt = Util.checkString(req.getParameter("clam_apt"));
String clam_hous = Util.checkString(req.getParameter("clam_hous"));
String clam_shop_etc = Util.checkString(req.getParameter("clam_shop_etc"));
String ufth_apt = Util.checkString(req.getParameter("ufth_apt"));
String ufth_hous = Util.checkString(req.getParameter("ufth_hous"));
String ufth_shop_etc = Util.checkString(req.getParameter("ufth_shop_etc"));
String cnfm_apt = Util.checkString(req.getParameter("cnfm_apt"));
String cnfm_hous = Util.checkString(req.getParameter("cnfm_hous"));
String cnfm_shop_etc = Util.checkString(req.getParameter("cnfm_shop_etc"));
String alon_clam_qty = Util.checkString(req.getParameter("alon_clam_qty"));
String rdr_extn_alon = Util.checkString(req.getParameter("rdr_extn_alon"));
String pay_amt = Util.checkString(req.getParameter("pay_amt"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String sale_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_yymm")));
String sell_dept_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("sell_dept_nm")));
String sell_area_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sell_area_cd")));
String sell_area_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("sell_area_nm")));
String bo_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_nm")));
String acol_no = Util.Uni2Ksc(Util.checkString(req.getParameter("acol_no")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String clam_apt = Util.Uni2Ksc(Util.checkString(req.getParameter("clam_apt")));
String clam_hous = Util.Uni2Ksc(Util.checkString(req.getParameter("clam_hous")));
String clam_shop_etc = Util.Uni2Ksc(Util.checkString(req.getParameter("clam_shop_etc")));
String ufth_apt = Util.Uni2Ksc(Util.checkString(req.getParameter("ufth_apt")));
String ufth_hous = Util.Uni2Ksc(Util.checkString(req.getParameter("ufth_hous")));
String ufth_shop_etc = Util.Uni2Ksc(Util.checkString(req.getParameter("ufth_shop_etc")));
String cnfm_apt = Util.Uni2Ksc(Util.checkString(req.getParameter("cnfm_apt")));
String cnfm_hous = Util.Uni2Ksc(Util.checkString(req.getParameter("cnfm_hous")));
String cnfm_shop_etc = Util.Uni2Ksc(Util.checkString(req.getParameter("cnfm_shop_etc")));
String alon_clam_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("alon_clam_qty")));
String rdr_extn_alon = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extn_alon")));
String pay_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_amt")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSale_yymm(sale_yymm);
dm.setSell_dept_nm(sell_dept_nm);
dm.setSell_area_cd(sell_area_cd);
dm.setSell_area_nm(sell_area_nm);
dm.setBo_nm(bo_nm);
dm.setAcol_no(acol_no);
dm.setDlco_no(dlco_no);
dm.setClam_apt(clam_apt);
dm.setClam_hous(clam_hous);
dm.setClam_shop_etc(clam_shop_etc);
dm.setUfth_apt(ufth_apt);
dm.setUfth_hous(ufth_hous);
dm.setUfth_shop_etc(ufth_shop_etc);
dm.setCnfm_apt(cnfm_apt);
dm.setCnfm_hous(cnfm_hous);
dm.setCnfm_shop_etc(cnfm_shop_etc);
dm.setAlon_clam_qty(alon_clam_qty);
dm.setRdr_extn_alon(rdr_extn_alon);
dm.setPay_amt(pay_amt);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jul 16 10:23:10 KST 2012 */