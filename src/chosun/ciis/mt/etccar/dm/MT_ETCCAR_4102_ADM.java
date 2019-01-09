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


package chosun.ciis.mt.etccar.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.etccar.ds.*;
import chosun.ciis.mt.etccar.rec.*;

/**
 * 
 */


public class MT_ETCCAR_4102_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt;
	public String clam_dt;
	public String seq;
	public String clam_item_kind;
	public String oil_clsf;
	public String use_dt;
	public String car_no;
	public String item_nm;
	public String unit_prc;
	public String qunt;
	public String clam_amt;
	public String dlco;
	public String dlco_nm;
	public String remk;
	public String clos_dt;
	public String incmg_pers_ipaddr;
	public String incmg_pers;
	public String gubun;

	public MT_ETCCAR_4102_ADM(){}
	public MT_ETCCAR_4102_ADM(String cmpy_cd, String occr_dt, String clam_dt, String seq, String clam_item_kind, String oil_clsf, String use_dt, String car_no, String item_nm, String unit_prc, String qunt, String clam_amt, String dlco, String dlco_nm, String remk, String clos_dt, String incmg_pers_ipaddr, String incmg_pers, String gubun){
		this.cmpy_cd = cmpy_cd;
		this.occr_dt = occr_dt;
		this.clam_dt = clam_dt;
		this.seq = seq;
		this.clam_item_kind = clam_item_kind;
		this.oil_clsf = oil_clsf;
		this.use_dt = use_dt;
		this.car_no = car_no;
		this.item_nm = item_nm;
		this.unit_prc = unit_prc;
		this.qunt = qunt;
		this.clam_amt = clam_amt;
		this.dlco = dlco;
		this.dlco_nm = dlco_nm;
		this.remk = remk;
		this.clos_dt = clos_dt;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
		this.gubun = gubun;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setClam_dt(String clam_dt){
		this.clam_dt = clam_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setClam_item_kind(String clam_item_kind){
		this.clam_item_kind = clam_item_kind;
	}

	public void setOil_clsf(String oil_clsf){
		this.oil_clsf = oil_clsf;
	}

	public void setUse_dt(String use_dt){
		this.use_dt = use_dt;
	}

	public void setCar_no(String car_no){
		this.car_no = car_no;
	}

	public void setItem_nm(String item_nm){
		this.item_nm = item_nm;
	}

	public void setUnit_prc(String unit_prc){
		this.unit_prc = unit_prc;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public void setClam_amt(String clam_amt){
		this.clam_amt = clam_amt;
	}

	public void setDlco(String dlco){
		this.dlco = dlco;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setClos_dt(String clos_dt){
		this.clos_dt = clos_dt;
	}

	public void setIncmg_pers_ipaddr(String incmg_pers_ipaddr){
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getClam_dt(){
		return this.clam_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getClam_item_kind(){
		return this.clam_item_kind;
	}

	public String getOil_clsf(){
		return this.oil_clsf;
	}

	public String getUse_dt(){
		return this.use_dt;
	}

	public String getCar_no(){
		return this.car_no;
	}

	public String getItem_nm(){
		return this.item_nm;
	}

	public String getUnit_prc(){
		return this.unit_prc;
	}

	public String getQunt(){
		return this.qunt;
	}

	public String getClam_amt(){
		return this.clam_amt;
	}

	public String getDlco(){
		return this.dlco;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getClos_dt(){
		return this.clos_dt;
	}

	public String getIncmg_pers_ipaddr(){
		return this.incmg_pers_ipaddr;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_ETCCAR_4102_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_ETCCAR_4102_ADM dm = (MT_ETCCAR_4102_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.occr_dt);
		cstmt.setString(5, dm.clam_dt);
		cstmt.setString(6, dm.seq);
		cstmt.setString(7, dm.clam_item_kind);
		cstmt.setString(8, dm.oil_clsf);
		cstmt.setString(9, dm.use_dt);
		cstmt.setString(10, dm.car_no);
		cstmt.setString(11, dm.item_nm);
		cstmt.setString(12, dm.unit_prc);
		cstmt.setString(13, dm.qunt);
		cstmt.setString(14, dm.clam_amt);
		cstmt.setString(15, dm.dlco);
		cstmt.setString(16, dm.dlco_nm);
		cstmt.setString(17, dm.remk);
		cstmt.setString(18, dm.clos_dt);
		cstmt.setString(19, dm.incmg_pers_ipaddr);
		cstmt.setString(20, dm.incmg_pers);
		cstmt.setString(21, dm.gubun);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.etccar.ds.MT_ETCCAR_4102_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("clam_dt = [" + getClam_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("clam_item_kind = [" + getClam_item_kind() + "]");
		System.out.println("oil_clsf = [" + getOil_clsf() + "]");
		System.out.println("use_dt = [" + getUse_dt() + "]");
		System.out.println("car_no = [" + getCar_no() + "]");
		System.out.println("item_nm = [" + getItem_nm() + "]");
		System.out.println("unit_prc = [" + getUnit_prc() + "]");
		System.out.println("qunt = [" + getQunt() + "]");
		System.out.println("clam_amt = [" + getClam_amt() + "]");
		System.out.println("dlco = [" + getDlco() + "]");
		System.out.println("dlco_nm = [" + getDlco_nm() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("clos_dt = [" + getClos_dt() + "]");
		System.out.println("incmg_pers_ipaddr = [" + getIncmg_pers_ipaddr() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("gubun = [" + getGubun() + "]");
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
String occr_dt = req.getParameter("occr_dt");
if( occr_dt == null){
	System.out.println(this.toString+" : occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_dt is "+occr_dt );
}
String clam_dt = req.getParameter("clam_dt");
if( clam_dt == null){
	System.out.println(this.toString+" : clam_dt is null" );
}else{
	System.out.println(this.toString+" : clam_dt is "+clam_dt );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String clam_item_kind = req.getParameter("clam_item_kind");
if( clam_item_kind == null){
	System.out.println(this.toString+" : clam_item_kind is null" );
}else{
	System.out.println(this.toString+" : clam_item_kind is "+clam_item_kind );
}
String oil_clsf = req.getParameter("oil_clsf");
if( oil_clsf == null){
	System.out.println(this.toString+" : oil_clsf is null" );
}else{
	System.out.println(this.toString+" : oil_clsf is "+oil_clsf );
}
String use_dt = req.getParameter("use_dt");
if( use_dt == null){
	System.out.println(this.toString+" : use_dt is null" );
}else{
	System.out.println(this.toString+" : use_dt is "+use_dt );
}
String car_no = req.getParameter("car_no");
if( car_no == null){
	System.out.println(this.toString+" : car_no is null" );
}else{
	System.out.println(this.toString+" : car_no is "+car_no );
}
String item_nm = req.getParameter("item_nm");
if( item_nm == null){
	System.out.println(this.toString+" : item_nm is null" );
}else{
	System.out.println(this.toString+" : item_nm is "+item_nm );
}
String unit_prc = req.getParameter("unit_prc");
if( unit_prc == null){
	System.out.println(this.toString+" : unit_prc is null" );
}else{
	System.out.println(this.toString+" : unit_prc is "+unit_prc );
}
String qunt = req.getParameter("qunt");
if( qunt == null){
	System.out.println(this.toString+" : qunt is null" );
}else{
	System.out.println(this.toString+" : qunt is "+qunt );
}
String clam_amt = req.getParameter("clam_amt");
if( clam_amt == null){
	System.out.println(this.toString+" : clam_amt is null" );
}else{
	System.out.println(this.toString+" : clam_amt is "+clam_amt );
}
String dlco = req.getParameter("dlco");
if( dlco == null){
	System.out.println(this.toString+" : dlco is null" );
}else{
	System.out.println(this.toString+" : dlco is "+dlco );
}
String dlco_nm = req.getParameter("dlco_nm");
if( dlco_nm == null){
	System.out.println(this.toString+" : dlco_nm is null" );
}else{
	System.out.println(this.toString+" : dlco_nm is "+dlco_nm );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String clos_dt = req.getParameter("clos_dt");
if( clos_dt == null){
	System.out.println(this.toString+" : clos_dt is null" );
}else{
	System.out.println(this.toString+" : clos_dt is "+clos_dt );
}
String incmg_pers_ipaddr = req.getParameter("incmg_pers_ipaddr");
if( incmg_pers_ipaddr == null){
	System.out.println(this.toString+" : incmg_pers_ipaddr is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipaddr is "+incmg_pers_ipaddr );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String gubun = req.getParameter("gubun");
if( gubun == null){
	System.out.println(this.toString+" : gubun is null" );
}else{
	System.out.println(this.toString+" : gubun is "+gubun );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String clam_dt = Util.checkString(req.getParameter("clam_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String clam_item_kind = Util.checkString(req.getParameter("clam_item_kind"));
String oil_clsf = Util.checkString(req.getParameter("oil_clsf"));
String use_dt = Util.checkString(req.getParameter("use_dt"));
String car_no = Util.checkString(req.getParameter("car_no"));
String item_nm = Util.checkString(req.getParameter("item_nm"));
String unit_prc = Util.checkString(req.getParameter("unit_prc"));
String qunt = Util.checkString(req.getParameter("qunt"));
String clam_amt = Util.checkString(req.getParameter("clam_amt"));
String dlco = Util.checkString(req.getParameter("dlco"));
String dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
String remk = Util.checkString(req.getParameter("remk"));
String clos_dt = Util.checkString(req.getParameter("clos_dt"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String gubun = Util.checkString(req.getParameter("gubun"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String clam_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("clam_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String clam_item_kind = Util.Uni2Ksc(Util.checkString(req.getParameter("clam_item_kind")));
String oil_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("oil_clsf")));
String use_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("use_dt")));
String car_no = Util.Uni2Ksc(Util.checkString(req.getParameter("car_no")));
String item_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("item_nm")));
String unit_prc = Util.Uni2Ksc(Util.checkString(req.getParameter("unit_prc")));
String qunt = Util.Uni2Ksc(Util.checkString(req.getParameter("qunt")));
String clam_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("clam_amt")));
String dlco = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco")));
String dlco_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_nm")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String clos_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("clos_dt")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setOccr_dt(occr_dt);
dm.setClam_dt(clam_dt);
dm.setSeq(seq);
dm.setClam_item_kind(clam_item_kind);
dm.setOil_clsf(oil_clsf);
dm.setUse_dt(use_dt);
dm.setCar_no(car_no);
dm.setItem_nm(item_nm);
dm.setUnit_prc(unit_prc);
dm.setQunt(qunt);
dm.setClam_amt(clam_amt);
dm.setDlco(dlco);
dm.setDlco_nm(dlco_nm);
dm.setRemk(remk);
dm.setClos_dt(clos_dt);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
dm.setGubun(gubun);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 25 10:15:25 KST 2012 */