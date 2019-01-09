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


public class MT_ETCCAR_5420_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String gubun;
	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String buy_lent_clsf;
	public String control;
	public String car_no;
	public String car_modl;
	public String mnft_cmpy;
	public String engn_dsplt;
	public String engnclsf;
	public String gearbx;
	public String rid_nops;
	public String oil_kind;
	public String own_clsf;
	public String use_usag;
	public String cmpy_mang_nm;
	public String use_pers;
	public String buy_dt;
	public String buy_amt;
	public String carp_car_clsf;
	public String carp_car_dt;
	public String remk;
	public String incmg_pers_ipaddr;
	public String incmg_pers;
	public String incmg_dt_tm;
	public String chg_pers;
	public String chg_dt_tm;

	public MT_ETCCAR_5420_ADM(){}
	public MT_ETCCAR_5420_ADM(String gubun, String cmpy_cd, String occr_dt, String seq, String buy_lent_clsf, String control, String car_no, String car_modl, String mnft_cmpy, String engn_dsplt, String engnclsf, String gearbx, String rid_nops, String oil_kind, String own_clsf, String use_usag, String cmpy_mang_nm, String use_pers, String buy_dt, String buy_amt, String carp_car_clsf, String carp_car_dt, String remk, String incmg_pers_ipaddr, String incmg_pers, String incmg_dt_tm, String chg_pers, String chg_dt_tm){
		this.gubun = gubun;
		this.cmpy_cd = cmpy_cd;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.buy_lent_clsf = buy_lent_clsf;
		this.control = control;
		this.car_no = car_no;
		this.car_modl = car_modl;
		this.mnft_cmpy = mnft_cmpy;
		this.engn_dsplt = engn_dsplt;
		this.engnclsf = engnclsf;
		this.gearbx = gearbx;
		this.rid_nops = rid_nops;
		this.oil_kind = oil_kind;
		this.own_clsf = own_clsf;
		this.use_usag = use_usag;
		this.cmpy_mang_nm = cmpy_mang_nm;
		this.use_pers = use_pers;
		this.buy_dt = buy_dt;
		this.buy_amt = buy_amt;
		this.carp_car_clsf = carp_car_clsf;
		this.carp_car_dt = carp_car_dt;
		this.remk = remk;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
		this.incmg_dt_tm = incmg_dt_tm;
		this.chg_pers = chg_pers;
		this.chg_dt_tm = chg_dt_tm;
	}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setBuy_lent_clsf(String buy_lent_clsf){
		this.buy_lent_clsf = buy_lent_clsf;
	}

	public void setControl(String control){
		this.control = control;
	}

	public void setCar_no(String car_no){
		this.car_no = car_no;
	}

	public void setCar_modl(String car_modl){
		this.car_modl = car_modl;
	}

	public void setMnft_cmpy(String mnft_cmpy){
		this.mnft_cmpy = mnft_cmpy;
	}

	public void setEngn_dsplt(String engn_dsplt){
		this.engn_dsplt = engn_dsplt;
	}

	public void setEngnclsf(String engnclsf){
		this.engnclsf = engnclsf;
	}

	public void setGearbx(String gearbx){
		this.gearbx = gearbx;
	}

	public void setRid_nops(String rid_nops){
		this.rid_nops = rid_nops;
	}

	public void setOil_kind(String oil_kind){
		this.oil_kind = oil_kind;
	}

	public void setOwn_clsf(String own_clsf){
		this.own_clsf = own_clsf;
	}

	public void setUse_usag(String use_usag){
		this.use_usag = use_usag;
	}

	public void setCmpy_mang_nm(String cmpy_mang_nm){
		this.cmpy_mang_nm = cmpy_mang_nm;
	}

	public void setUse_pers(String use_pers){
		this.use_pers = use_pers;
	}

	public void setBuy_dt(String buy_dt){
		this.buy_dt = buy_dt;
	}

	public void setBuy_amt(String buy_amt){
		this.buy_amt = buy_amt;
	}

	public void setCarp_car_clsf(String carp_car_clsf){
		this.carp_car_clsf = carp_car_clsf;
	}

	public void setCarp_car_dt(String carp_car_dt){
		this.carp_car_dt = carp_car_dt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setIncmg_pers_ipaddr(String incmg_pers_ipaddr){
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_dt_tm(String incmg_dt_tm){
		this.incmg_dt_tm = incmg_dt_tm;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setChg_dt_tm(String chg_dt_tm){
		this.chg_dt_tm = chg_dt_tm;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getBuy_lent_clsf(){
		return this.buy_lent_clsf;
	}

	public String getControl(){
		return this.control;
	}

	public String getCar_no(){
		return this.car_no;
	}

	public String getCar_modl(){
		return this.car_modl;
	}

	public String getMnft_cmpy(){
		return this.mnft_cmpy;
	}

	public String getEngn_dsplt(){
		return this.engn_dsplt;
	}

	public String getEngnclsf(){
		return this.engnclsf;
	}

	public String getGearbx(){
		return this.gearbx;
	}

	public String getRid_nops(){
		return this.rid_nops;
	}

	public String getOil_kind(){
		return this.oil_kind;
	}

	public String getOwn_clsf(){
		return this.own_clsf;
	}

	public String getUse_usag(){
		return this.use_usag;
	}

	public String getCmpy_mang_nm(){
		return this.cmpy_mang_nm;
	}

	public String getUse_pers(){
		return this.use_pers;
	}

	public String getBuy_dt(){
		return this.buy_dt;
	}

	public String getBuy_amt(){
		return this.buy_amt;
	}

	public String getCarp_car_clsf(){
		return this.carp_car_clsf;
	}

	public String getCarp_car_dt(){
		return this.carp_car_dt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getIncmg_pers_ipaddr(){
		return this.incmg_pers_ipaddr;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_dt_tm(){
		return this.incmg_dt_tm;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getChg_dt_tm(){
		return this.chg_dt_tm;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_ETCCAR_5420_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_ETCCAR_5420_ADM dm = (MT_ETCCAR_5420_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.gubun);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.occr_dt);
		cstmt.setString(6, dm.seq);
		cstmt.setString(7, dm.buy_lent_clsf);
		cstmt.setString(8, dm.control);
		cstmt.setString(9, dm.car_no);
		cstmt.setString(10, dm.car_modl);
		cstmt.setString(11, dm.mnft_cmpy);
		cstmt.setString(12, dm.engn_dsplt);
		cstmt.setString(13, dm.engnclsf);
		cstmt.setString(14, dm.gearbx);
		cstmt.setString(15, dm.rid_nops);
		cstmt.setString(16, dm.oil_kind);
		cstmt.setString(17, dm.own_clsf);
		cstmt.setString(18, dm.use_usag);
		cstmt.setString(19, dm.cmpy_mang_nm);
		cstmt.setString(20, dm.use_pers);
		cstmt.setString(21, dm.buy_dt);
		cstmt.setString(22, dm.buy_amt);
		cstmt.setString(23, dm.carp_car_clsf);
		cstmt.setString(24, dm.carp_car_dt);
		cstmt.setString(25, dm.remk);
		cstmt.setString(26, dm.incmg_pers_ipaddr);
		cstmt.setString(27, dm.incmg_pers);
		cstmt.setString(28, dm.incmg_dt_tm);
		cstmt.setString(29, dm.chg_pers);
		cstmt.setString(30, dm.chg_dt_tm);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.etccar.ds.MT_ETCCAR_5420_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("gubun = [" + getGubun() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("buy_lent_clsf = [" + getBuy_lent_clsf() + "]");
		System.out.println("control = [" + getControl() + "]");
		System.out.println("car_no = [" + getCar_no() + "]");
		System.out.println("car_modl = [" + getCar_modl() + "]");
		System.out.println("mnft_cmpy = [" + getMnft_cmpy() + "]");
		System.out.println("engn_dsplt = [" + getEngn_dsplt() + "]");
		System.out.println("engnclsf = [" + getEngnclsf() + "]");
		System.out.println("gearbx = [" + getGearbx() + "]");
		System.out.println("rid_nops = [" + getRid_nops() + "]");
		System.out.println("oil_kind = [" + getOil_kind() + "]");
		System.out.println("own_clsf = [" + getOwn_clsf() + "]");
		System.out.println("use_usag = [" + getUse_usag() + "]");
		System.out.println("cmpy_mang_nm = [" + getCmpy_mang_nm() + "]");
		System.out.println("use_pers = [" + getUse_pers() + "]");
		System.out.println("buy_dt = [" + getBuy_dt() + "]");
		System.out.println("buy_amt = [" + getBuy_amt() + "]");
		System.out.println("carp_car_clsf = [" + getCarp_car_clsf() + "]");
		System.out.println("carp_car_dt = [" + getCarp_car_dt() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("incmg_pers_ipaddr = [" + getIncmg_pers_ipaddr() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_dt_tm = [" + getIncmg_dt_tm() + "]");
		System.out.println("chg_pers = [" + getChg_pers() + "]");
		System.out.println("chg_dt_tm = [" + getChg_dt_tm() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String gubun = req.getParameter("gubun");
if( gubun == null){
	System.out.println(this.toString+" : gubun is null" );
}else{
	System.out.println(this.toString+" : gubun is "+gubun );
}
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
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String buy_lent_clsf = req.getParameter("buy_lent_clsf");
if( buy_lent_clsf == null){
	System.out.println(this.toString+" : buy_lent_clsf is null" );
}else{
	System.out.println(this.toString+" : buy_lent_clsf is "+buy_lent_clsf );
}
String control = req.getParameter("control");
if( control == null){
	System.out.println(this.toString+" : control is null" );
}else{
	System.out.println(this.toString+" : control is "+control );
}
String car_no = req.getParameter("car_no");
if( car_no == null){
	System.out.println(this.toString+" : car_no is null" );
}else{
	System.out.println(this.toString+" : car_no is "+car_no );
}
String car_modl = req.getParameter("car_modl");
if( car_modl == null){
	System.out.println(this.toString+" : car_modl is null" );
}else{
	System.out.println(this.toString+" : car_modl is "+car_modl );
}
String mnft_cmpy = req.getParameter("mnft_cmpy");
if( mnft_cmpy == null){
	System.out.println(this.toString+" : mnft_cmpy is null" );
}else{
	System.out.println(this.toString+" : mnft_cmpy is "+mnft_cmpy );
}
String engn_dsplt = req.getParameter("engn_dsplt");
if( engn_dsplt == null){
	System.out.println(this.toString+" : engn_dsplt is null" );
}else{
	System.out.println(this.toString+" : engn_dsplt is "+engn_dsplt );
}
String engnclsf = req.getParameter("engnclsf");
if( engnclsf == null){
	System.out.println(this.toString+" : engnclsf is null" );
}else{
	System.out.println(this.toString+" : engnclsf is "+engnclsf );
}
String gearbx = req.getParameter("gearbx");
if( gearbx == null){
	System.out.println(this.toString+" : gearbx is null" );
}else{
	System.out.println(this.toString+" : gearbx is "+gearbx );
}
String rid_nops = req.getParameter("rid_nops");
if( rid_nops == null){
	System.out.println(this.toString+" : rid_nops is null" );
}else{
	System.out.println(this.toString+" : rid_nops is "+rid_nops );
}
String oil_kind = req.getParameter("oil_kind");
if( oil_kind == null){
	System.out.println(this.toString+" : oil_kind is null" );
}else{
	System.out.println(this.toString+" : oil_kind is "+oil_kind );
}
String own_clsf = req.getParameter("own_clsf");
if( own_clsf == null){
	System.out.println(this.toString+" : own_clsf is null" );
}else{
	System.out.println(this.toString+" : own_clsf is "+own_clsf );
}
String use_usag = req.getParameter("use_usag");
if( use_usag == null){
	System.out.println(this.toString+" : use_usag is null" );
}else{
	System.out.println(this.toString+" : use_usag is "+use_usag );
}
String cmpy_mang_nm = req.getParameter("cmpy_mang_nm");
if( cmpy_mang_nm == null){
	System.out.println(this.toString+" : cmpy_mang_nm is null" );
}else{
	System.out.println(this.toString+" : cmpy_mang_nm is "+cmpy_mang_nm );
}
String use_pers = req.getParameter("use_pers");
if( use_pers == null){
	System.out.println(this.toString+" : use_pers is null" );
}else{
	System.out.println(this.toString+" : use_pers is "+use_pers );
}
String buy_dt = req.getParameter("buy_dt");
if( buy_dt == null){
	System.out.println(this.toString+" : buy_dt is null" );
}else{
	System.out.println(this.toString+" : buy_dt is "+buy_dt );
}
String buy_amt = req.getParameter("buy_amt");
if( buy_amt == null){
	System.out.println(this.toString+" : buy_amt is null" );
}else{
	System.out.println(this.toString+" : buy_amt is "+buy_amt );
}
String carp_car_clsf = req.getParameter("carp_car_clsf");
if( carp_car_clsf == null){
	System.out.println(this.toString+" : carp_car_clsf is null" );
}else{
	System.out.println(this.toString+" : carp_car_clsf is "+carp_car_clsf );
}
String carp_car_dt = req.getParameter("carp_car_dt");
if( carp_car_dt == null){
	System.out.println(this.toString+" : carp_car_dt is null" );
}else{
	System.out.println(this.toString+" : carp_car_dt is "+carp_car_dt );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
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
String incmg_dt_tm = req.getParameter("incmg_dt_tm");
if( incmg_dt_tm == null){
	System.out.println(this.toString+" : incmg_dt_tm is null" );
}else{
	System.out.println(this.toString+" : incmg_dt_tm is "+incmg_dt_tm );
}
String chg_pers = req.getParameter("chg_pers");
if( chg_pers == null){
	System.out.println(this.toString+" : chg_pers is null" );
}else{
	System.out.println(this.toString+" : chg_pers is "+chg_pers );
}
String chg_dt_tm = req.getParameter("chg_dt_tm");
if( chg_dt_tm == null){
	System.out.println(this.toString+" : chg_dt_tm is null" );
}else{
	System.out.println(this.toString+" : chg_dt_tm is "+chg_dt_tm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String gubun = Util.checkString(req.getParameter("gubun"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String buy_lent_clsf = Util.checkString(req.getParameter("buy_lent_clsf"));
String control = Util.checkString(req.getParameter("control"));
String car_no = Util.checkString(req.getParameter("car_no"));
String car_modl = Util.checkString(req.getParameter("car_modl"));
String mnft_cmpy = Util.checkString(req.getParameter("mnft_cmpy"));
String engn_dsplt = Util.checkString(req.getParameter("engn_dsplt"));
String engnclsf = Util.checkString(req.getParameter("engnclsf"));
String gearbx = Util.checkString(req.getParameter("gearbx"));
String rid_nops = Util.checkString(req.getParameter("rid_nops"));
String oil_kind = Util.checkString(req.getParameter("oil_kind"));
String own_clsf = Util.checkString(req.getParameter("own_clsf"));
String use_usag = Util.checkString(req.getParameter("use_usag"));
String cmpy_mang_nm = Util.checkString(req.getParameter("cmpy_mang_nm"));
String use_pers = Util.checkString(req.getParameter("use_pers"));
String buy_dt = Util.checkString(req.getParameter("buy_dt"));
String buy_amt = Util.checkString(req.getParameter("buy_amt"));
String carp_car_clsf = Util.checkString(req.getParameter("carp_car_clsf"));
String carp_car_dt = Util.checkString(req.getParameter("carp_car_dt"));
String remk = Util.checkString(req.getParameter("remk"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_dt_tm = Util.checkString(req.getParameter("incmg_dt_tm"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
String chg_dt_tm = Util.checkString(req.getParameter("chg_dt_tm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String buy_lent_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("buy_lent_clsf")));
String control = Util.Uni2Ksc(Util.checkString(req.getParameter("control")));
String car_no = Util.Uni2Ksc(Util.checkString(req.getParameter("car_no")));
String car_modl = Util.Uni2Ksc(Util.checkString(req.getParameter("car_modl")));
String mnft_cmpy = Util.Uni2Ksc(Util.checkString(req.getParameter("mnft_cmpy")));
String engn_dsplt = Util.Uni2Ksc(Util.checkString(req.getParameter("engn_dsplt")));
String engnclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("engnclsf")));
String gearbx = Util.Uni2Ksc(Util.checkString(req.getParameter("gearbx")));
String rid_nops = Util.Uni2Ksc(Util.checkString(req.getParameter("rid_nops")));
String oil_kind = Util.Uni2Ksc(Util.checkString(req.getParameter("oil_kind")));
String own_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("own_clsf")));
String use_usag = Util.Uni2Ksc(Util.checkString(req.getParameter("use_usag")));
String cmpy_mang_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_mang_nm")));
String use_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("use_pers")));
String buy_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("buy_dt")));
String buy_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("buy_amt")));
String carp_car_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("carp_car_clsf")));
String carp_car_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("carp_car_dt")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_dt_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_dt_tm")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
String chg_dt_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_dt_tm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setGubun(gubun);
dm.setCmpy_cd(cmpy_cd);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setBuy_lent_clsf(buy_lent_clsf);
dm.setControl(control);
dm.setCar_no(car_no);
dm.setCar_modl(car_modl);
dm.setMnft_cmpy(mnft_cmpy);
dm.setEngn_dsplt(engn_dsplt);
dm.setEngnclsf(engnclsf);
dm.setGearbx(gearbx);
dm.setRid_nops(rid_nops);
dm.setOil_kind(oil_kind);
dm.setOwn_clsf(own_clsf);
dm.setUse_usag(use_usag);
dm.setCmpy_mang_nm(cmpy_mang_nm);
dm.setUse_pers(use_pers);
dm.setBuy_dt(buy_dt);
dm.setBuy_amt(buy_amt);
dm.setCarp_car_clsf(carp_car_clsf);
dm.setCarp_car_dt(carp_car_dt);
dm.setRemk(remk);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_dt_tm(incmg_dt_tm);
dm.setChg_pers(chg_pers);
dm.setChg_dt_tm(chg_dt_tm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 24 14:34:10 KST 2009 */