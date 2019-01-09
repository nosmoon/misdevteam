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


package chosun.ciis.mt.etcpc.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.etcpc.ds.*;
import chosun.ciis.mt.etcpc.rec.*;

/**
 * 
 */


public class MT_ETCPC_2103_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mchn_mang_no;
	public String modl_mang_no;
	public String serl_no;
	public String buy_dt;
	public String aset_no;
	public String use_pers;
	public String use_pers_flnm;
	public String use_deptcd;
	public String use_dept_nm;
	public String use_usag;
	public String pay_dt;
	public String pay_kind;
	public String mchn_stat;
	public String kep_plac;
	public String acpt_dt;
	public String rsrt_dt;
	public String wste_dd_pers;
	public String monitor_mang_no;
	public String repa_item_yn;
	public String wste_obj_item_yn;
	public String lend_item_rsrt_plan_dt;
	public String lend_item_yn;
	public String ipaddr;
	public String remk;
	public String incmg_pers_ipaddr;
	public String incmg_pers;
	public String chg_pers;
	public String gubun;

	public MT_ETCPC_2103_ADM(){}
	public MT_ETCPC_2103_ADM(String cmpy_cd, String mchn_mang_no, String modl_mang_no, String serl_no, String buy_dt, String aset_no, String use_pers, String use_pers_flnm, String use_deptcd, String use_dept_nm, String use_usag, String pay_dt, String pay_kind, String mchn_stat, String kep_plac, String acpt_dt, String rsrt_dt, String wste_dd_pers, String monitor_mang_no, String repa_item_yn, String wste_obj_item_yn, String lend_item_rsrt_plan_dt, String lend_item_yn, String ipaddr, String remk, String incmg_pers_ipaddr, String incmg_pers, String chg_pers, String gubun){
		this.cmpy_cd = cmpy_cd;
		this.mchn_mang_no = mchn_mang_no;
		this.modl_mang_no = modl_mang_no;
		this.serl_no = serl_no;
		this.buy_dt = buy_dt;
		this.aset_no = aset_no;
		this.use_pers = use_pers;
		this.use_pers_flnm = use_pers_flnm;
		this.use_deptcd = use_deptcd;
		this.use_dept_nm = use_dept_nm;
		this.use_usag = use_usag;
		this.pay_dt = pay_dt;
		this.pay_kind = pay_kind;
		this.mchn_stat = mchn_stat;
		this.kep_plac = kep_plac;
		this.acpt_dt = acpt_dt;
		this.rsrt_dt = rsrt_dt;
		this.wste_dd_pers = wste_dd_pers;
		this.monitor_mang_no = monitor_mang_no;
		this.repa_item_yn = repa_item_yn;
		this.wste_obj_item_yn = wste_obj_item_yn;
		this.lend_item_rsrt_plan_dt = lend_item_rsrt_plan_dt;
		this.lend_item_yn = lend_item_yn;
		this.ipaddr = ipaddr;
		this.remk = remk;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
		this.chg_pers = chg_pers;
		this.gubun = gubun;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMchn_mang_no(String mchn_mang_no){
		this.mchn_mang_no = mchn_mang_no;
	}

	public void setModl_mang_no(String modl_mang_no){
		this.modl_mang_no = modl_mang_no;
	}

	public void setSerl_no(String serl_no){
		this.serl_no = serl_no;
	}

	public void setBuy_dt(String buy_dt){
		this.buy_dt = buy_dt;
	}

	public void setAset_no(String aset_no){
		this.aset_no = aset_no;
	}

	public void setUse_pers(String use_pers){
		this.use_pers = use_pers;
	}

	public void setUse_pers_flnm(String use_pers_flnm){
		this.use_pers_flnm = use_pers_flnm;
	}

	public void setUse_deptcd(String use_deptcd){
		this.use_deptcd = use_deptcd;
	}

	public void setUse_dept_nm(String use_dept_nm){
		this.use_dept_nm = use_dept_nm;
	}

	public void setUse_usag(String use_usag){
		this.use_usag = use_usag;
	}

	public void setPay_dt(String pay_dt){
		this.pay_dt = pay_dt;
	}

	public void setPay_kind(String pay_kind){
		this.pay_kind = pay_kind;
	}

	public void setMchn_stat(String mchn_stat){
		this.mchn_stat = mchn_stat;
	}

	public void setKep_plac(String kep_plac){
		this.kep_plac = kep_plac;
	}

	public void setAcpt_dt(String acpt_dt){
		this.acpt_dt = acpt_dt;
	}

	public void setRsrt_dt(String rsrt_dt){
		this.rsrt_dt = rsrt_dt;
	}

	public void setWste_dd_pers(String wste_dd_pers){
		this.wste_dd_pers = wste_dd_pers;
	}

	public void setMonitor_mang_no(String monitor_mang_no){
		this.monitor_mang_no = monitor_mang_no;
	}

	public void setRepa_item_yn(String repa_item_yn){
		this.repa_item_yn = repa_item_yn;
	}

	public void setWste_obj_item_yn(String wste_obj_item_yn){
		this.wste_obj_item_yn = wste_obj_item_yn;
	}

	public void setLend_item_rsrt_plan_dt(String lend_item_rsrt_plan_dt){
		this.lend_item_rsrt_plan_dt = lend_item_rsrt_plan_dt;
	}

	public void setLend_item_yn(String lend_item_yn){
		this.lend_item_yn = lend_item_yn;
	}

	public void setIpaddr(String ipaddr){
		this.ipaddr = ipaddr;
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

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMchn_mang_no(){
		return this.mchn_mang_no;
	}

	public String getModl_mang_no(){
		return this.modl_mang_no;
	}

	public String getSerl_no(){
		return this.serl_no;
	}

	public String getBuy_dt(){
		return this.buy_dt;
	}

	public String getAset_no(){
		return this.aset_no;
	}

	public String getUse_pers(){
		return this.use_pers;
	}

	public String getUse_pers_flnm(){
		return this.use_pers_flnm;
	}

	public String getUse_deptcd(){
		return this.use_deptcd;
	}

	public String getUse_dept_nm(){
		return this.use_dept_nm;
	}

	public String getUse_usag(){
		return this.use_usag;
	}

	public String getPay_dt(){
		return this.pay_dt;
	}

	public String getPay_kind(){
		return this.pay_kind;
	}

	public String getMchn_stat(){
		return this.mchn_stat;
	}

	public String getKep_plac(){
		return this.kep_plac;
	}

	public String getAcpt_dt(){
		return this.acpt_dt;
	}

	public String getRsrt_dt(){
		return this.rsrt_dt;
	}

	public String getWste_dd_pers(){
		return this.wste_dd_pers;
	}

	public String getMonitor_mang_no(){
		return this.monitor_mang_no;
	}

	public String getRepa_item_yn(){
		return this.repa_item_yn;
	}

	public String getWste_obj_item_yn(){
		return this.wste_obj_item_yn;
	}

	public String getLend_item_rsrt_plan_dt(){
		return this.lend_item_rsrt_plan_dt;
	}

	public String getLend_item_yn(){
		return this.lend_item_yn;
	}

	public String getIpaddr(){
		return this.ipaddr;
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

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_ETCPC_2103_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_ETCPC_2103_ADM dm = (MT_ETCPC_2103_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mchn_mang_no);
		cstmt.setString(5, dm.modl_mang_no);
		cstmt.setString(6, dm.serl_no);
		cstmt.setString(7, dm.buy_dt);
		cstmt.setString(8, dm.aset_no);
		cstmt.setString(9, dm.use_pers);
		cstmt.setString(10, dm.use_pers_flnm);
		cstmt.setString(11, dm.use_deptcd);
		cstmt.setString(12, dm.use_dept_nm);
		cstmt.setString(13, dm.use_usag);
		cstmt.setString(14, dm.pay_dt);
		cstmt.setString(15, dm.pay_kind);
		cstmt.setString(16, dm.mchn_stat);
		cstmt.setString(17, dm.kep_plac);
		cstmt.setString(18, dm.acpt_dt);
		cstmt.setString(19, dm.rsrt_dt);
		cstmt.setString(20, dm.wste_dd_pers);
		cstmt.setString(21, dm.monitor_mang_no);
		cstmt.setString(22, dm.repa_item_yn);
		cstmt.setString(23, dm.wste_obj_item_yn);
		cstmt.setString(24, dm.lend_item_rsrt_plan_dt);
		cstmt.setString(25, dm.lend_item_yn);
		cstmt.setString(26, dm.ipaddr);
		cstmt.setString(27, dm.remk);
		cstmt.setString(28, dm.incmg_pers_ipaddr);
		cstmt.setString(29, dm.incmg_pers);
		cstmt.setString(30, dm.chg_pers);
		cstmt.setString(31, dm.gubun);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.etcpc.ds.MT_ETCPC_2103_ADataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("mchn_mang_no = " + getMchn_mang_no());
        System.out.println("modl_mang_no = " + getModl_mang_no());
        System.out.println("serl_no = " + getSerl_no());
        System.out.println("buy_dt = " + getBuy_dt());
        System.out.println("aset_no = " + getAset_no());
        System.out.println("use_pers = " + getUse_pers());
        System.out.println("use_pers_flnm = " + getUse_pers_flnm());
        System.out.println("use_deptcd = " + getUse_deptcd());
        System.out.println("use_dept_nm = " + getUse_dept_nm());
        System.out.println("use_usag = " + getUse_usag());
        System.out.println("pay_dt = " + getPay_dt());
        System.out.println("pay_kind = " + getPay_kind());
        System.out.println("mchn_stat = " + getMchn_stat());
        System.out.println("kep_plac = " + getKep_plac());
        System.out.println("acpt_dt = " + getAcpt_dt());
        System.out.println("rsrt_dt = " + getRsrt_dt());
        System.out.println("wste_dd_pers = " + getWste_dd_pers());
        System.out.println("monitor_mang_no = " + getMonitor_mang_no());
        System.out.println("repa_item_yn = " + getRepa_item_yn());
        System.out.println("wste_obj_item_yn = " + getWste_obj_item_yn());
        System.out.println("lend_item_rsrt_plan_dt = " + getLend_item_rsrt_plan_dt());
        System.out.println("lend_item_yn = " + getLend_item_yn());
        System.out.println("ipaddr = " + getIpaddr());
        System.out.println("remk = " + getRemk());
        System.out.println("incmg_pers_ipaddr = " + getIncmg_pers_ipaddr());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("chg_pers = " + getChg_pers());
        System.out.println("gubun = " + getGubun());
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
String mchn_mang_no = req.getParameter("mchn_mang_no");
if( mchn_mang_no == null){
	System.out.println(this.toString+" : mchn_mang_no is null" );
}else{
	System.out.println(this.toString+" : mchn_mang_no is "+mchn_mang_no );
}
String modl_mang_no = req.getParameter("modl_mang_no");
if( modl_mang_no == null){
	System.out.println(this.toString+" : modl_mang_no is null" );
}else{
	System.out.println(this.toString+" : modl_mang_no is "+modl_mang_no );
}
String serl_no = req.getParameter("serl_no");
if( serl_no == null){
	System.out.println(this.toString+" : serl_no is null" );
}else{
	System.out.println(this.toString+" : serl_no is "+serl_no );
}
String buy_dt = req.getParameter("buy_dt");
if( buy_dt == null){
	System.out.println(this.toString+" : buy_dt is null" );
}else{
	System.out.println(this.toString+" : buy_dt is "+buy_dt );
}
String aset_no = req.getParameter("aset_no");
if( aset_no == null){
	System.out.println(this.toString+" : aset_no is null" );
}else{
	System.out.println(this.toString+" : aset_no is "+aset_no );
}
String use_pers = req.getParameter("use_pers");
if( use_pers == null){
	System.out.println(this.toString+" : use_pers is null" );
}else{
	System.out.println(this.toString+" : use_pers is "+use_pers );
}
String use_pers_flnm = req.getParameter("use_pers_flnm");
if( use_pers_flnm == null){
	System.out.println(this.toString+" : use_pers_flnm is null" );
}else{
	System.out.println(this.toString+" : use_pers_flnm is "+use_pers_flnm );
}
String use_deptcd = req.getParameter("use_deptcd");
if( use_deptcd == null){
	System.out.println(this.toString+" : use_deptcd is null" );
}else{
	System.out.println(this.toString+" : use_deptcd is "+use_deptcd );
}
String use_dept_nm = req.getParameter("use_dept_nm");
if( use_dept_nm == null){
	System.out.println(this.toString+" : use_dept_nm is null" );
}else{
	System.out.println(this.toString+" : use_dept_nm is "+use_dept_nm );
}
String use_usag = req.getParameter("use_usag");
if( use_usag == null){
	System.out.println(this.toString+" : use_usag is null" );
}else{
	System.out.println(this.toString+" : use_usag is "+use_usag );
}
String pay_dt = req.getParameter("pay_dt");
if( pay_dt == null){
	System.out.println(this.toString+" : pay_dt is null" );
}else{
	System.out.println(this.toString+" : pay_dt is "+pay_dt );
}
String pay_kind = req.getParameter("pay_kind");
if( pay_kind == null){
	System.out.println(this.toString+" : pay_kind is null" );
}else{
	System.out.println(this.toString+" : pay_kind is "+pay_kind );
}
String mchn_stat = req.getParameter("mchn_stat");
if( mchn_stat == null){
	System.out.println(this.toString+" : mchn_stat is null" );
}else{
	System.out.println(this.toString+" : mchn_stat is "+mchn_stat );
}
String kep_plac = req.getParameter("kep_plac");
if( kep_plac == null){
	System.out.println(this.toString+" : kep_plac is null" );
}else{
	System.out.println(this.toString+" : kep_plac is "+kep_plac );
}
String acpt_dt = req.getParameter("acpt_dt");
if( acpt_dt == null){
	System.out.println(this.toString+" : acpt_dt is null" );
}else{
	System.out.println(this.toString+" : acpt_dt is "+acpt_dt );
}
String rsrt_dt = req.getParameter("rsrt_dt");
if( rsrt_dt == null){
	System.out.println(this.toString+" : rsrt_dt is null" );
}else{
	System.out.println(this.toString+" : rsrt_dt is "+rsrt_dt );
}
String wste_dd_pers = req.getParameter("wste_dd_pers");
if( wste_dd_pers == null){
	System.out.println(this.toString+" : wste_dd_pers is null" );
}else{
	System.out.println(this.toString+" : wste_dd_pers is "+wste_dd_pers );
}
String monitor_mang_no = req.getParameter("monitor_mang_no");
if( monitor_mang_no == null){
	System.out.println(this.toString+" : monitor_mang_no is null" );
}else{
	System.out.println(this.toString+" : monitor_mang_no is "+monitor_mang_no );
}
String repa_item_yn = req.getParameter("repa_item_yn");
if( repa_item_yn == null){
	System.out.println(this.toString+" : repa_item_yn is null" );
}else{
	System.out.println(this.toString+" : repa_item_yn is "+repa_item_yn );
}
String wste_obj_item_yn = req.getParameter("wste_obj_item_yn");
if( wste_obj_item_yn == null){
	System.out.println(this.toString+" : wste_obj_item_yn is null" );
}else{
	System.out.println(this.toString+" : wste_obj_item_yn is "+wste_obj_item_yn );
}
String lend_item_rsrt_plan_dt = req.getParameter("lend_item_rsrt_plan_dt");
if( lend_item_rsrt_plan_dt == null){
	System.out.println(this.toString+" : lend_item_rsrt_plan_dt is null" );
}else{
	System.out.println(this.toString+" : lend_item_rsrt_plan_dt is "+lend_item_rsrt_plan_dt );
}
String lend_item_yn = req.getParameter("lend_item_yn");
if( lend_item_yn == null){
	System.out.println(this.toString+" : lend_item_yn is null" );
}else{
	System.out.println(this.toString+" : lend_item_yn is "+lend_item_yn );
}
String ipaddr = req.getParameter("ipaddr");
if( ipaddr == null){
	System.out.println(this.toString+" : ipaddr is null" );
}else{
	System.out.println(this.toString+" : ipaddr is "+ipaddr );
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
String chg_pers = req.getParameter("chg_pers");
if( chg_pers == null){
	System.out.println(this.toString+" : chg_pers is null" );
}else{
	System.out.println(this.toString+" : chg_pers is "+chg_pers );
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
String mchn_mang_no = Util.checkString(req.getParameter("mchn_mang_no"));
String modl_mang_no = Util.checkString(req.getParameter("modl_mang_no"));
String serl_no = Util.checkString(req.getParameter("serl_no"));
String buy_dt = Util.checkString(req.getParameter("buy_dt"));
String aset_no = Util.checkString(req.getParameter("aset_no"));
String use_pers = Util.checkString(req.getParameter("use_pers"));
String use_pers_flnm = Util.checkString(req.getParameter("use_pers_flnm"));
String use_deptcd = Util.checkString(req.getParameter("use_deptcd"));
String use_dept_nm = Util.checkString(req.getParameter("use_dept_nm"));
String use_usag = Util.checkString(req.getParameter("use_usag"));
String pay_dt = Util.checkString(req.getParameter("pay_dt"));
String pay_kind = Util.checkString(req.getParameter("pay_kind"));
String mchn_stat = Util.checkString(req.getParameter("mchn_stat"));
String kep_plac = Util.checkString(req.getParameter("kep_plac"));
String acpt_dt = Util.checkString(req.getParameter("acpt_dt"));
String rsrt_dt = Util.checkString(req.getParameter("rsrt_dt"));
String wste_dd_pers = Util.checkString(req.getParameter("wste_dd_pers"));
String monitor_mang_no = Util.checkString(req.getParameter("monitor_mang_no"));
String repa_item_yn = Util.checkString(req.getParameter("repa_item_yn"));
String wste_obj_item_yn = Util.checkString(req.getParameter("wste_obj_item_yn"));
String lend_item_rsrt_plan_dt = Util.checkString(req.getParameter("lend_item_rsrt_plan_dt"));
String lend_item_yn = Util.checkString(req.getParameter("lend_item_yn"));
String ipaddr = Util.checkString(req.getParameter("ipaddr"));
String remk = Util.checkString(req.getParameter("remk"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
String gubun = Util.checkString(req.getParameter("gubun"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mchn_mang_no = Util.Uni2Ksc(Util.checkString(req.getParameter("mchn_mang_no")));
String modl_mang_no = Util.Uni2Ksc(Util.checkString(req.getParameter("modl_mang_no")));
String serl_no = Util.Uni2Ksc(Util.checkString(req.getParameter("serl_no")));
String buy_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("buy_dt")));
String aset_no = Util.Uni2Ksc(Util.checkString(req.getParameter("aset_no")));
String use_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("use_pers")));
String use_pers_flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("use_pers_flnm")));
String use_deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("use_deptcd")));
String use_dept_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("use_dept_nm")));
String use_usag = Util.Uni2Ksc(Util.checkString(req.getParameter("use_usag")));
String pay_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_dt")));
String pay_kind = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_kind")));
String mchn_stat = Util.Uni2Ksc(Util.checkString(req.getParameter("mchn_stat")));
String kep_plac = Util.Uni2Ksc(Util.checkString(req.getParameter("kep_plac")));
String acpt_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("acpt_dt")));
String rsrt_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("rsrt_dt")));
String wste_dd_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("wste_dd_pers")));
String monitor_mang_no = Util.Uni2Ksc(Util.checkString(req.getParameter("monitor_mang_no")));
String repa_item_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("repa_item_yn")));
String wste_obj_item_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("wste_obj_item_yn")));
String lend_item_rsrt_plan_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("lend_item_rsrt_plan_dt")));
String lend_item_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("lend_item_yn")));
String ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("ipaddr")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMchn_mang_no(mchn_mang_no);
dm.setModl_mang_no(modl_mang_no);
dm.setSerl_no(serl_no);
dm.setBuy_dt(buy_dt);
dm.setAset_no(aset_no);
dm.setUse_pers(use_pers);
dm.setUse_pers_flnm(use_pers_flnm);
dm.setUse_deptcd(use_deptcd);
dm.setUse_dept_nm(use_dept_nm);
dm.setUse_usag(use_usag);
dm.setPay_dt(pay_dt);
dm.setPay_kind(pay_kind);
dm.setMchn_stat(mchn_stat);
dm.setKep_plac(kep_plac);
dm.setAcpt_dt(acpt_dt);
dm.setRsrt_dt(rsrt_dt);
dm.setWste_dd_pers(wste_dd_pers);
dm.setMonitor_mang_no(monitor_mang_no);
dm.setRepa_item_yn(repa_item_yn);
dm.setWste_obj_item_yn(wste_obj_item_yn);
dm.setLend_item_rsrt_plan_dt(lend_item_rsrt_plan_dt);
dm.setLend_item_yn(lend_item_yn);
dm.setIpaddr(ipaddr);
dm.setRemk(remk);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
dm.setChg_pers(chg_pers);
dm.setGubun(gubun);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 23 20:20:41 KST 2009 */