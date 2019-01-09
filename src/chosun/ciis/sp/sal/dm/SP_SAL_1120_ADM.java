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


public class SP_SAL_1120_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String work_yymm;
	public String sale_yymm;
	public String dlco_cd;
	public String sale_item;
	public String ordr_no;
	public String sale_cost;
	public String qunt;
	public String clamt_mthd;
	public String suply_amt;
	public String vat_amt;
	public String ordr_amt;
	public String ipln_amt;
	public String ipln_meda_amt;
	public String gds_no;
	public String gds_nm;
	public String ordr_dt;
	public String suply_pers_ern;
	public String suply_pers_nm;
	public String incmg_pers_ip;
	public String incmg_pers;

	public SP_SAL_1120_ADM(){}
	public SP_SAL_1120_ADM(String cmpy_cd, String work_yymm, String sale_yymm, String dlco_cd, String sale_item, String ordr_no, String sale_cost, String qunt, String clamt_mthd, String suply_amt, String vat_amt, String ordr_amt, String ipln_amt, String ipln_meda_amt, String gds_no, String gds_nm, String ordr_dt, String suply_pers_ern, String suply_pers_nm, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.work_yymm = work_yymm;
		this.sale_yymm = sale_yymm;
		this.dlco_cd = dlco_cd;
		this.sale_item = sale_item;
		this.ordr_no = ordr_no;
		this.sale_cost = sale_cost;
		this.qunt = qunt;
		this.clamt_mthd = clamt_mthd;
		this.suply_amt = suply_amt;
		this.vat_amt = vat_amt;
		this.ordr_amt = ordr_amt;
		this.ipln_amt = ipln_amt;
		this.ipln_meda_amt = ipln_meda_amt;
		this.gds_no = gds_no;
		this.gds_nm = gds_nm;
		this.ordr_dt = ordr_dt;
		this.suply_pers_ern = suply_pers_ern;
		this.suply_pers_nm = suply_pers_nm;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setWork_yymm(String work_yymm){
		this.work_yymm = work_yymm;
	}

	public void setSale_yymm(String sale_yymm){
		this.sale_yymm = sale_yymm;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setSale_item(String sale_item){
		this.sale_item = sale_item;
	}

	public void setOrdr_no(String ordr_no){
		this.ordr_no = ordr_no;
	}

	public void setSale_cost(String sale_cost){
		this.sale_cost = sale_cost;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public void setClamt_mthd(String clamt_mthd){
		this.clamt_mthd = clamt_mthd;
	}

	public void setSuply_amt(String suply_amt){
		this.suply_amt = suply_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setOrdr_amt(String ordr_amt){
		this.ordr_amt = ordr_amt;
	}

	public void setIpln_amt(String ipln_amt){
		this.ipln_amt = ipln_amt;
	}

	public void setIpln_meda_amt(String ipln_meda_amt){
		this.ipln_meda_amt = ipln_meda_amt;
	}

	public void setGds_no(String gds_no){
		this.gds_no = gds_no;
	}

	public void setGds_nm(String gds_nm){
		this.gds_nm = gds_nm;
	}

	public void setOrdr_dt(String ordr_dt){
		this.ordr_dt = ordr_dt;
	}

	public void setSuply_pers_ern(String suply_pers_ern){
		this.suply_pers_ern = suply_pers_ern;
	}

	public void setSuply_pers_nm(String suply_pers_nm){
		this.suply_pers_nm = suply_pers_nm;
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

	public String getWork_yymm(){
		return this.work_yymm;
	}

	public String getSale_yymm(){
		return this.sale_yymm;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getSale_item(){
		return this.sale_item;
	}

	public String getOrdr_no(){
		return this.ordr_no;
	}

	public String getSale_cost(){
		return this.sale_cost;
	}

	public String getQunt(){
		return this.qunt;
	}

	public String getClamt_mthd(){
		return this.clamt_mthd;
	}

	public String getSuply_amt(){
		return this.suply_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}

	public String getOrdr_amt(){
		return this.ordr_amt;
	}

	public String getIpln_amt(){
		return this.ipln_amt;
	}

	public String getIpln_meda_amt(){
		return this.ipln_meda_amt;
	}

	public String getGds_no(){
		return this.gds_no;
	}

	public String getGds_nm(){
		return this.gds_nm;
	}

	public String getOrdr_dt(){
		return this.ordr_dt;
	}

	public String getSuply_pers_ern(){
		return this.suply_pers_ern;
	}

	public String getSuply_pers_nm(){
		return this.suply_pers_nm;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_SP_SAL_1120_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SP_SAL_1120_ADM dm = (SP_SAL_1120_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.work_yymm);
		cstmt.setString(5, dm.sale_yymm);
		cstmt.setString(6, dm.dlco_cd);
		cstmt.setString(7, dm.sale_item);
		cstmt.setString(8, dm.ordr_no);
		cstmt.setString(9, dm.sale_cost);
		cstmt.setString(10, dm.qunt);
		cstmt.setString(11, dm.clamt_mthd);
		cstmt.setString(12, dm.suply_amt);
		cstmt.setString(13, dm.vat_amt);
		cstmt.setString(14, dm.ordr_amt);
		cstmt.setString(15, dm.ipln_amt);
		cstmt.setString(16, dm.ipln_meda_amt);
		cstmt.setString(17, dm.gds_no);
		cstmt.setString(18, dm.gds_nm);
		cstmt.setString(19, dm.ordr_dt);
		cstmt.setString(20, dm.suply_pers_ern);
		cstmt.setString(21, dm.suply_pers_nm);
		cstmt.setString(22, dm.incmg_pers_ip);
		cstmt.setString(23, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.sp.sal.ds.SP_SAL_1120_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("work_yymm = [" + getWork_yymm() + "]");
		System.out.println("sale_yymm = [" + getSale_yymm() + "]");
		System.out.println("dlco_cd = [" + getDlco_cd() + "]");
		System.out.println("sale_item = [" + getSale_item() + "]");
		System.out.println("ordr_no = [" + getOrdr_no() + "]");
		System.out.println("sale_cost = [" + getSale_cost() + "]");
		System.out.println("qunt = [" + getQunt() + "]");
		System.out.println("clamt_mthd = [" + getClamt_mthd() + "]");
		System.out.println("suply_amt = [" + getSuply_amt() + "]");
		System.out.println("vat_amt = [" + getVat_amt() + "]");
		System.out.println("ordr_amt = [" + getOrdr_amt() + "]");
		System.out.println("ipln_amt = [" + getIpln_amt() + "]");
		System.out.println("ipln_meda_amt = [" + getIpln_meda_amt() + "]");
		System.out.println("gds_no = [" + getGds_no() + "]");
		System.out.println("gds_nm = [" + getGds_nm() + "]");
		System.out.println("ordr_dt = [" + getOrdr_dt() + "]");
		System.out.println("suply_pers_ern = [" + getSuply_pers_ern() + "]");
		System.out.println("suply_pers_nm = [" + getSuply_pers_nm() + "]");
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
String work_yymm = req.getParameter("work_yymm");
if( work_yymm == null){
	System.out.println(this.toString+" : work_yymm is null" );
}else{
	System.out.println(this.toString+" : work_yymm is "+work_yymm );
}
String sale_yymm = req.getParameter("sale_yymm");
if( sale_yymm == null){
	System.out.println(this.toString+" : sale_yymm is null" );
}else{
	System.out.println(this.toString+" : sale_yymm is "+sale_yymm );
}
String dlco_cd = req.getParameter("dlco_cd");
if( dlco_cd == null){
	System.out.println(this.toString+" : dlco_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_cd is "+dlco_cd );
}
String sale_item = req.getParameter("sale_item");
if( sale_item == null){
	System.out.println(this.toString+" : sale_item is null" );
}else{
	System.out.println(this.toString+" : sale_item is "+sale_item );
}
String ordr_no = req.getParameter("ordr_no");
if( ordr_no == null){
	System.out.println(this.toString+" : ordr_no is null" );
}else{
	System.out.println(this.toString+" : ordr_no is "+ordr_no );
}
String sale_cost = req.getParameter("sale_cost");
if( sale_cost == null){
	System.out.println(this.toString+" : sale_cost is null" );
}else{
	System.out.println(this.toString+" : sale_cost is "+sale_cost );
}
String qunt = req.getParameter("qunt");
if( qunt == null){
	System.out.println(this.toString+" : qunt is null" );
}else{
	System.out.println(this.toString+" : qunt is "+qunt );
}
String clamt_mthd = req.getParameter("clamt_mthd");
if( clamt_mthd == null){
	System.out.println(this.toString+" : clamt_mthd is null" );
}else{
	System.out.println(this.toString+" : clamt_mthd is "+clamt_mthd );
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
String ordr_amt = req.getParameter("ordr_amt");
if( ordr_amt == null){
	System.out.println(this.toString+" : ordr_amt is null" );
}else{
	System.out.println(this.toString+" : ordr_amt is "+ordr_amt );
}
String ipln_amt = req.getParameter("ipln_amt");
if( ipln_amt == null){
	System.out.println(this.toString+" : ipln_amt is null" );
}else{
	System.out.println(this.toString+" : ipln_amt is "+ipln_amt );
}
String ipln_meda_amt = req.getParameter("ipln_meda_amt");
if( ipln_meda_amt == null){
	System.out.println(this.toString+" : ipln_meda_amt is null" );
}else{
	System.out.println(this.toString+" : ipln_meda_amt is "+ipln_meda_amt );
}
String gds_no = req.getParameter("gds_no");
if( gds_no == null){
	System.out.println(this.toString+" : gds_no is null" );
}else{
	System.out.println(this.toString+" : gds_no is "+gds_no );
}
String gds_nm = req.getParameter("gds_nm");
if( gds_nm == null){
	System.out.println(this.toString+" : gds_nm is null" );
}else{
	System.out.println(this.toString+" : gds_nm is "+gds_nm );
}
String ordr_dt = req.getParameter("ordr_dt");
if( ordr_dt == null){
	System.out.println(this.toString+" : ordr_dt is null" );
}else{
	System.out.println(this.toString+" : ordr_dt is "+ordr_dt );
}
String suply_pers_ern = req.getParameter("suply_pers_ern");
if( suply_pers_ern == null){
	System.out.println(this.toString+" : suply_pers_ern is null" );
}else{
	System.out.println(this.toString+" : suply_pers_ern is "+suply_pers_ern );
}
String suply_pers_nm = req.getParameter("suply_pers_nm");
if( suply_pers_nm == null){
	System.out.println(this.toString+" : suply_pers_nm is null" );
}else{
	System.out.println(this.toString+" : suply_pers_nm is "+suply_pers_nm );
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
String work_yymm = Util.checkString(req.getParameter("work_yymm"));
String sale_yymm = Util.checkString(req.getParameter("sale_yymm"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
String sale_item = Util.checkString(req.getParameter("sale_item"));
String ordr_no = Util.checkString(req.getParameter("ordr_no"));
String sale_cost = Util.checkString(req.getParameter("sale_cost"));
String qunt = Util.checkString(req.getParameter("qunt"));
String clamt_mthd = Util.checkString(req.getParameter("clamt_mthd"));
String suply_amt = Util.checkString(req.getParameter("suply_amt"));
String vat_amt = Util.checkString(req.getParameter("vat_amt"));
String ordr_amt = Util.checkString(req.getParameter("ordr_amt"));
String ipln_amt = Util.checkString(req.getParameter("ipln_amt"));
String ipln_meda_amt = Util.checkString(req.getParameter("ipln_meda_amt"));
String gds_no = Util.checkString(req.getParameter("gds_no"));
String gds_nm = Util.checkString(req.getParameter("gds_nm"));
String ordr_dt = Util.checkString(req.getParameter("ordr_dt"));
String suply_pers_ern = Util.checkString(req.getParameter("suply_pers_ern"));
String suply_pers_nm = Util.checkString(req.getParameter("suply_pers_nm"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String work_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("work_yymm")));
String sale_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_yymm")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
String sale_item = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_item")));
String ordr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("ordr_no")));
String sale_cost = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_cost")));
String qunt = Util.Uni2Ksc(Util.checkString(req.getParameter("qunt")));
String clamt_mthd = Util.Uni2Ksc(Util.checkString(req.getParameter("clamt_mthd")));
String suply_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("suply_amt")));
String vat_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("vat_amt")));
String ordr_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("ordr_amt")));
String ipln_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("ipln_amt")));
String ipln_meda_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("ipln_meda_amt")));
String gds_no = Util.Uni2Ksc(Util.checkString(req.getParameter("gds_no")));
String gds_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("gds_nm")));
String ordr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("ordr_dt")));
String suply_pers_ern = Util.Uni2Ksc(Util.checkString(req.getParameter("suply_pers_ern")));
String suply_pers_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("suply_pers_nm")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setWork_yymm(work_yymm);
dm.setSale_yymm(sale_yymm);
dm.setDlco_cd(dlco_cd);
dm.setSale_item(sale_item);
dm.setOrdr_no(ordr_no);
dm.setSale_cost(sale_cost);
dm.setQunt(qunt);
dm.setClamt_mthd(clamt_mthd);
dm.setSuply_amt(suply_amt);
dm.setVat_amt(vat_amt);
dm.setOrdr_amt(ordr_amt);
dm.setIpln_amt(ipln_amt);
dm.setIpln_meda_amt(ipln_meda_amt);
dm.setGds_no(gds_no);
dm.setGds_nm(gds_nm);
dm.setOrdr_dt(ordr_dt);
dm.setSuply_pers_ern(suply_pers_ern);
dm.setSuply_pers_nm(suply_pers_nm);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Aug 10 20:38:20 KST 2012 */