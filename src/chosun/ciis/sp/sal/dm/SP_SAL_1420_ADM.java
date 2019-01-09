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


public class SP_SAL_1420_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String sale_yymm;
	public String sale_item_cd;
	public String rcpm_clsf;
	public String dlco_no;
	public String medi_nm;
	public String qty;
	public String uprc;
	public String amt;
	public String sale_seq;
	public String incmg_pers_ip;
	public String incmg_pers;

	public SP_SAL_1420_ADM(){}
	public SP_SAL_1420_ADM(String cmpy_cd, String sale_yymm, String sale_item_cd, String rcpm_clsf, String dlco_no, String medi_nm, String qty, String uprc, String amt, String sale_seq, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.sale_yymm = sale_yymm;
		this.sale_item_cd = sale_item_cd;
		this.rcpm_clsf = rcpm_clsf;
		this.dlco_no = dlco_no;
		this.medi_nm = medi_nm;
		this.qty = qty;
		this.uprc = uprc;
		this.amt = amt;
		this.sale_seq = sale_seq;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSale_yymm(String sale_yymm){
		this.sale_yymm = sale_yymm;
	}

	public void setSale_item_cd(String sale_item_cd){
		this.sale_item_cd = sale_item_cd;
	}

	public void setRcpm_clsf(String rcpm_clsf){
		this.rcpm_clsf = rcpm_clsf;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setQty(String qty){
		this.qty = qty;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setSale_seq(String sale_seq){
		this.sale_seq = sale_seq;
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

	public String getSale_item_cd(){
		return this.sale_item_cd;
	}

	public String getRcpm_clsf(){
		return this.rcpm_clsf;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getQty(){
		return this.qty;
	}

	public String getUprc(){
		return this.uprc;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getSale_seq(){
		return this.sale_seq;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_SP_SAL_1420_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SP_SAL_1420_ADM dm = (SP_SAL_1420_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.sale_yymm);
		cstmt.setString(5, dm.sale_item_cd);
		cstmt.setString(6, dm.rcpm_clsf);
		cstmt.setString(7, dm.dlco_no);
		cstmt.setString(8, dm.medi_nm);
		cstmt.setString(9, dm.qty);
		cstmt.setString(10, dm.uprc);
		cstmt.setString(11, dm.amt);
		cstmt.setString(12, dm.sale_seq);
		cstmt.setString(13, dm.incmg_pers_ip);
		cstmt.setString(14, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.sp.sal.ds.SP_SAL_1420_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("sale_yymm = [" + getSale_yymm() + "]");
		System.out.println("sale_item_cd = [" + getSale_item_cd() + "]");
		System.out.println("rcpm_clsf = [" + getRcpm_clsf() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("medi_nm = [" + getMedi_nm() + "]");
		System.out.println("qty = [" + getQty() + "]");
		System.out.println("uprc = [" + getUprc() + "]");
		System.out.println("amt = [" + getAmt() + "]");
		System.out.println("sale_seq = [" + getSale_seq() + "]");
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
String sale_item_cd = req.getParameter("sale_item_cd");
if( sale_item_cd == null){
	System.out.println(this.toString+" : sale_item_cd is null" );
}else{
	System.out.println(this.toString+" : sale_item_cd is "+sale_item_cd );
}
String rcpm_clsf = req.getParameter("rcpm_clsf");
if( rcpm_clsf == null){
	System.out.println(this.toString+" : rcpm_clsf is null" );
}else{
	System.out.println(this.toString+" : rcpm_clsf is "+rcpm_clsf );
}
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
String medi_nm = req.getParameter("medi_nm");
if( medi_nm == null){
	System.out.println(this.toString+" : medi_nm is null" );
}else{
	System.out.println(this.toString+" : medi_nm is "+medi_nm );
}
String qty = req.getParameter("qty");
if( qty == null){
	System.out.println(this.toString+" : qty is null" );
}else{
	System.out.println(this.toString+" : qty is "+qty );
}
String uprc = req.getParameter("uprc");
if( uprc == null){
	System.out.println(this.toString+" : uprc is null" );
}else{
	System.out.println(this.toString+" : uprc is "+uprc );
}
String amt = req.getParameter("amt");
if( amt == null){
	System.out.println(this.toString+" : amt is null" );
}else{
	System.out.println(this.toString+" : amt is "+amt );
}
String sale_seq = req.getParameter("sale_seq");
if( sale_seq == null){
	System.out.println(this.toString+" : sale_seq is null" );
}else{
	System.out.println(this.toString+" : sale_seq is "+sale_seq );
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
String sale_item_cd = Util.checkString(req.getParameter("sale_item_cd"));
String rcpm_clsf = Util.checkString(req.getParameter("rcpm_clsf"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String medi_nm = Util.checkString(req.getParameter("medi_nm"));
String qty = Util.checkString(req.getParameter("qty"));
String uprc = Util.checkString(req.getParameter("uprc"));
String amt = Util.checkString(req.getParameter("amt"));
String sale_seq = Util.checkString(req.getParameter("sale_seq"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String sale_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_yymm")));
String sale_item_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_item_cd")));
String rcpm_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_clsf")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String medi_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_nm")));
String qty = Util.Uni2Ksc(Util.checkString(req.getParameter("qty")));
String uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("uprc")));
String amt = Util.Uni2Ksc(Util.checkString(req.getParameter("amt")));
String sale_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_seq")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSale_yymm(sale_yymm);
dm.setSale_item_cd(sale_item_cd);
dm.setRcpm_clsf(rcpm_clsf);
dm.setDlco_no(dlco_no);
dm.setMedi_nm(medi_nm);
dm.setQty(qty);
dm.setUprc(uprc);
dm.setAmt(amt);
dm.setSale_seq(sale_seq);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 12 10:54:33 KST 2012 */