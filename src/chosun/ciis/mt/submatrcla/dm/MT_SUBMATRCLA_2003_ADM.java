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


package chosun.ciis.mt.submatrcla.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.submatrcla.ds.*;
import chosun.ciis.mt.submatrcla.rec.*;

/**
 * 
 */


public class MT_SUBMATRCLA_2003_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String gubun;
	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String sub_seq;
	public String matr_cd;
	public String matr_nm;
	public String std_modl;
	public String unit;
	public String clam_qunt;
	public String fix_qunt;
	public String purc_uprc;
	public String amt;
	public String usag;
	public String recp_hope_dt;
	public String recp_pers;
	public String res_yn;
	public String pay_posb_dt;
	public String via_dept_yn;
	public String acpn_dt;
	public String proc_pers;
	public String canc_yn;
	public String canc_pers;
	public String buy_proc_stat;
	public String non_out_dt;
	public String incmg_pers_ipaddr;
	public String incmg_pers;
	public String incmg_dt_tm;
	public String chg_pers;
	public String chg_dt_tm;
	public String mode;
	public String medi_cd;
	public String rela_yn;

	public MT_SUBMATRCLA_2003_ADM(){}
	public MT_SUBMATRCLA_2003_ADM(String gubun, String cmpy_cd, String occr_dt, String seq, String sub_seq, String matr_cd, String matr_nm, String std_modl, String unit, String clam_qunt, String fix_qunt, String purc_uprc, String amt, String usag, String recp_hope_dt, String recp_pers, String res_yn, String pay_posb_dt, String via_dept_yn, String acpn_dt, String proc_pers, String canc_yn, String canc_pers, String buy_proc_stat, String non_out_dt, String incmg_pers_ipaddr, String incmg_pers, String incmg_dt_tm, String chg_pers, String chg_dt_tm, String mode, String medi_cd, String rela_yn){
		this.gubun = gubun;
		this.cmpy_cd = cmpy_cd;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.sub_seq = sub_seq;
		this.matr_cd = matr_cd;
		this.matr_nm = matr_nm;
		this.std_modl = std_modl;
		this.unit = unit;
		this.clam_qunt = clam_qunt;
		this.fix_qunt = fix_qunt;
		this.purc_uprc = purc_uprc;
		this.amt = amt;
		this.usag = usag;
		this.recp_hope_dt = recp_hope_dt;
		this.recp_pers = recp_pers;
		this.res_yn = res_yn;
		this.pay_posb_dt = pay_posb_dt;
		this.via_dept_yn = via_dept_yn;
		this.acpn_dt = acpn_dt;
		this.proc_pers = proc_pers;
		this.canc_yn = canc_yn;
		this.canc_pers = canc_pers;
		this.buy_proc_stat = buy_proc_stat;
		this.non_out_dt = non_out_dt;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
		this.incmg_dt_tm = incmg_dt_tm;
		this.chg_pers = chg_pers;
		this.chg_dt_tm = chg_dt_tm;
		this.mode = mode;
		this.medi_cd = medi_cd;
		this.rela_yn = rela_yn;
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

	public void setSub_seq(String sub_seq){
		this.sub_seq = sub_seq;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setMatr_nm(String matr_nm){
		this.matr_nm = matr_nm;
	}

	public void setStd_modl(String std_modl){
		this.std_modl = std_modl;
	}

	public void setUnit(String unit){
		this.unit = unit;
	}

	public void setClam_qunt(String clam_qunt){
		this.clam_qunt = clam_qunt;
	}

	public void setFix_qunt(String fix_qunt){
		this.fix_qunt = fix_qunt;
	}

	public void setPurc_uprc(String purc_uprc){
		this.purc_uprc = purc_uprc;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setUsag(String usag){
		this.usag = usag;
	}

	public void setRecp_hope_dt(String recp_hope_dt){
		this.recp_hope_dt = recp_hope_dt;
	}

	public void setRecp_pers(String recp_pers){
		this.recp_pers = recp_pers;
	}

	public void setRes_yn(String res_yn){
		this.res_yn = res_yn;
	}

	public void setPay_posb_dt(String pay_posb_dt){
		this.pay_posb_dt = pay_posb_dt;
	}

	public void setVia_dept_yn(String via_dept_yn){
		this.via_dept_yn = via_dept_yn;
	}

	public void setAcpn_dt(String acpn_dt){
		this.acpn_dt = acpn_dt;
	}

	public void setProc_pers(String proc_pers){
		this.proc_pers = proc_pers;
	}

	public void setCanc_yn(String canc_yn){
		this.canc_yn = canc_yn;
	}

	public void setCanc_pers(String canc_pers){
		this.canc_pers = canc_pers;
	}

	public void setBuy_proc_stat(String buy_proc_stat){
		this.buy_proc_stat = buy_proc_stat;
	}

	public void setNon_out_dt(String non_out_dt){
		this.non_out_dt = non_out_dt;
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

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setRela_yn(String rela_yn){
		this.rela_yn = rela_yn;
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

	public String getSub_seq(){
		return this.sub_seq;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getMatr_nm(){
		return this.matr_nm;
	}

	public String getStd_modl(){
		return this.std_modl;
	}

	public String getUnit(){
		return this.unit;
	}

	public String getClam_qunt(){
		return this.clam_qunt;
	}

	public String getFix_qunt(){
		return this.fix_qunt;
	}

	public String getPurc_uprc(){
		return this.purc_uprc;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getUsag(){
		return this.usag;
	}

	public String getRecp_hope_dt(){
		return this.recp_hope_dt;
	}

	public String getRecp_pers(){
		return this.recp_pers;
	}

	public String getRes_yn(){
		return this.res_yn;
	}

	public String getPay_posb_dt(){
		return this.pay_posb_dt;
	}

	public String getVia_dept_yn(){
		return this.via_dept_yn;
	}

	public String getAcpn_dt(){
		return this.acpn_dt;
	}

	public String getProc_pers(){
		return this.proc_pers;
	}

	public String getCanc_yn(){
		return this.canc_yn;
	}

	public String getCanc_pers(){
		return this.canc_pers;
	}

	public String getBuy_proc_stat(){
		return this.buy_proc_stat;
	}

	public String getNon_out_dt(){
		return this.non_out_dt;
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

	public String getMode(){
		return this.mode;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getRela_yn(){
		return this.rela_yn;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_SUBMATRCLA_2003_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_SUBMATRCLA_2003_ADM dm = (MT_SUBMATRCLA_2003_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.gubun);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.occr_dt);
		cstmt.setString(6, dm.seq);
		cstmt.setString(7, dm.sub_seq);
		cstmt.setString(8, dm.matr_cd);
		cstmt.setString(9, dm.matr_nm);
		cstmt.setString(10, dm.std_modl);
		cstmt.setString(11, dm.unit);
		cstmt.setString(12, dm.clam_qunt);
		cstmt.setString(13, dm.fix_qunt);
		cstmt.setString(14, dm.purc_uprc);
		cstmt.setString(15, dm.amt);
		cstmt.setString(16, dm.usag);
		cstmt.setString(17, dm.recp_hope_dt);
		cstmt.setString(18, dm.recp_pers);
		cstmt.setString(19, dm.res_yn);
		cstmt.setString(20, dm.pay_posb_dt);
		cstmt.setString(21, dm.via_dept_yn);
		cstmt.setString(22, dm.acpn_dt);
		cstmt.setString(23, dm.proc_pers);
		cstmt.setString(24, dm.canc_yn);
		cstmt.setString(25, dm.canc_pers);
		cstmt.setString(26, dm.buy_proc_stat);
		cstmt.setString(27, dm.non_out_dt);
		cstmt.setString(28, dm.incmg_pers_ipaddr);
		cstmt.setString(29, dm.incmg_pers);
		cstmt.setString(30, dm.incmg_dt_tm);
		cstmt.setString(31, dm.chg_pers);
		cstmt.setString(32, dm.chg_dt_tm);
		cstmt.setString(33, dm.mode);
		cstmt.setString(34, dm.medi_cd);
		cstmt.setString(35, dm.rela_yn);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.submatrcla.ds.MT_SUBMATRCLA_2003_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("gubun = [" + getGubun() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("sub_seq = [" + getSub_seq() + "]");
		System.out.println("matr_cd = [" + getMatr_cd() + "]");
		System.out.println("matr_nm = [" + getMatr_nm() + "]");
		System.out.println("std_modl = [" + getStd_modl() + "]");
		System.out.println("unit = [" + getUnit() + "]");
		System.out.println("clam_qunt = [" + getClam_qunt() + "]");
		System.out.println("fix_qunt = [" + getFix_qunt() + "]");
		System.out.println("purc_uprc = [" + getPurc_uprc() + "]");
		System.out.println("amt = [" + getAmt() + "]");
		System.out.println("usag = [" + getUsag() + "]");
		System.out.println("recp_hope_dt = [" + getRecp_hope_dt() + "]");
		System.out.println("recp_pers = [" + getRecp_pers() + "]");
		System.out.println("res_yn = [" + getRes_yn() + "]");
		System.out.println("pay_posb_dt = [" + getPay_posb_dt() + "]");
		System.out.println("via_dept_yn = [" + getVia_dept_yn() + "]");
		System.out.println("acpn_dt = [" + getAcpn_dt() + "]");
		System.out.println("proc_pers = [" + getProc_pers() + "]");
		System.out.println("canc_yn = [" + getCanc_yn() + "]");
		System.out.println("canc_pers = [" + getCanc_pers() + "]");
		System.out.println("buy_proc_stat = [" + getBuy_proc_stat() + "]");
		System.out.println("non_out_dt = [" + getNon_out_dt() + "]");
		System.out.println("incmg_pers_ipaddr = [" + getIncmg_pers_ipaddr() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_dt_tm = [" + getIncmg_dt_tm() + "]");
		System.out.println("chg_pers = [" + getChg_pers() + "]");
		System.out.println("chg_dt_tm = [" + getChg_dt_tm() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("rela_yn = [" + getRela_yn() + "]");
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
String sub_seq = req.getParameter("sub_seq");
if( sub_seq == null){
	System.out.println(this.toString+" : sub_seq is null" );
}else{
	System.out.println(this.toString+" : sub_seq is "+sub_seq );
}
String matr_cd = req.getParameter("matr_cd");
if( matr_cd == null){
	System.out.println(this.toString+" : matr_cd is null" );
}else{
	System.out.println(this.toString+" : matr_cd is "+matr_cd );
}
String matr_nm = req.getParameter("matr_nm");
if( matr_nm == null){
	System.out.println(this.toString+" : matr_nm is null" );
}else{
	System.out.println(this.toString+" : matr_nm is "+matr_nm );
}
String std_modl = req.getParameter("std_modl");
if( std_modl == null){
	System.out.println(this.toString+" : std_modl is null" );
}else{
	System.out.println(this.toString+" : std_modl is "+std_modl );
}
String unit = req.getParameter("unit");
if( unit == null){
	System.out.println(this.toString+" : unit is null" );
}else{
	System.out.println(this.toString+" : unit is "+unit );
}
String clam_qunt = req.getParameter("clam_qunt");
if( clam_qunt == null){
	System.out.println(this.toString+" : clam_qunt is null" );
}else{
	System.out.println(this.toString+" : clam_qunt is "+clam_qunt );
}
String fix_qunt = req.getParameter("fix_qunt");
if( fix_qunt == null){
	System.out.println(this.toString+" : fix_qunt is null" );
}else{
	System.out.println(this.toString+" : fix_qunt is "+fix_qunt );
}
String purc_uprc = req.getParameter("purc_uprc");
if( purc_uprc == null){
	System.out.println(this.toString+" : purc_uprc is null" );
}else{
	System.out.println(this.toString+" : purc_uprc is "+purc_uprc );
}
String amt = req.getParameter("amt");
if( amt == null){
	System.out.println(this.toString+" : amt is null" );
}else{
	System.out.println(this.toString+" : amt is "+amt );
}
String usag = req.getParameter("usag");
if( usag == null){
	System.out.println(this.toString+" : usag is null" );
}else{
	System.out.println(this.toString+" : usag is "+usag );
}
String recp_hope_dt = req.getParameter("recp_hope_dt");
if( recp_hope_dt == null){
	System.out.println(this.toString+" : recp_hope_dt is null" );
}else{
	System.out.println(this.toString+" : recp_hope_dt is "+recp_hope_dt );
}
String recp_pers = req.getParameter("recp_pers");
if( recp_pers == null){
	System.out.println(this.toString+" : recp_pers is null" );
}else{
	System.out.println(this.toString+" : recp_pers is "+recp_pers );
}
String res_yn = req.getParameter("res_yn");
if( res_yn == null){
	System.out.println(this.toString+" : res_yn is null" );
}else{
	System.out.println(this.toString+" : res_yn is "+res_yn );
}
String pay_posb_dt = req.getParameter("pay_posb_dt");
if( pay_posb_dt == null){
	System.out.println(this.toString+" : pay_posb_dt is null" );
}else{
	System.out.println(this.toString+" : pay_posb_dt is "+pay_posb_dt );
}
String via_dept_yn = req.getParameter("via_dept_yn");
if( via_dept_yn == null){
	System.out.println(this.toString+" : via_dept_yn is null" );
}else{
	System.out.println(this.toString+" : via_dept_yn is "+via_dept_yn );
}
String acpn_dt = req.getParameter("acpn_dt");
if( acpn_dt == null){
	System.out.println(this.toString+" : acpn_dt is null" );
}else{
	System.out.println(this.toString+" : acpn_dt is "+acpn_dt );
}
String proc_pers = req.getParameter("proc_pers");
if( proc_pers == null){
	System.out.println(this.toString+" : proc_pers is null" );
}else{
	System.out.println(this.toString+" : proc_pers is "+proc_pers );
}
String canc_yn = req.getParameter("canc_yn");
if( canc_yn == null){
	System.out.println(this.toString+" : canc_yn is null" );
}else{
	System.out.println(this.toString+" : canc_yn is "+canc_yn );
}
String canc_pers = req.getParameter("canc_pers");
if( canc_pers == null){
	System.out.println(this.toString+" : canc_pers is null" );
}else{
	System.out.println(this.toString+" : canc_pers is "+canc_pers );
}
String buy_proc_stat = req.getParameter("buy_proc_stat");
if( buy_proc_stat == null){
	System.out.println(this.toString+" : buy_proc_stat is null" );
}else{
	System.out.println(this.toString+" : buy_proc_stat is "+buy_proc_stat );
}
String non_out_dt = req.getParameter("non_out_dt");
if( non_out_dt == null){
	System.out.println(this.toString+" : non_out_dt is null" );
}else{
	System.out.println(this.toString+" : non_out_dt is "+non_out_dt );
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
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String rela_yn = req.getParameter("rela_yn");
if( rela_yn == null){
	System.out.println(this.toString+" : rela_yn is null" );
}else{
	System.out.println(this.toString+" : rela_yn is "+rela_yn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String gubun = Util.checkString(req.getParameter("gubun"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String sub_seq = Util.checkString(req.getParameter("sub_seq"));
String matr_cd = Util.checkString(req.getParameter("matr_cd"));
String matr_nm = Util.checkString(req.getParameter("matr_nm"));
String std_modl = Util.checkString(req.getParameter("std_modl"));
String unit = Util.checkString(req.getParameter("unit"));
String clam_qunt = Util.checkString(req.getParameter("clam_qunt"));
String fix_qunt = Util.checkString(req.getParameter("fix_qunt"));
String purc_uprc = Util.checkString(req.getParameter("purc_uprc"));
String amt = Util.checkString(req.getParameter("amt"));
String usag = Util.checkString(req.getParameter("usag"));
String recp_hope_dt = Util.checkString(req.getParameter("recp_hope_dt"));
String recp_pers = Util.checkString(req.getParameter("recp_pers"));
String res_yn = Util.checkString(req.getParameter("res_yn"));
String pay_posb_dt = Util.checkString(req.getParameter("pay_posb_dt"));
String via_dept_yn = Util.checkString(req.getParameter("via_dept_yn"));
String acpn_dt = Util.checkString(req.getParameter("acpn_dt"));
String proc_pers = Util.checkString(req.getParameter("proc_pers"));
String canc_yn = Util.checkString(req.getParameter("canc_yn"));
String canc_pers = Util.checkString(req.getParameter("canc_pers"));
String buy_proc_stat = Util.checkString(req.getParameter("buy_proc_stat"));
String non_out_dt = Util.checkString(req.getParameter("non_out_dt"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_dt_tm = Util.checkString(req.getParameter("incmg_dt_tm"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
String chg_dt_tm = Util.checkString(req.getParameter("chg_dt_tm"));
String mode = Util.checkString(req.getParameter("mode"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String rela_yn = Util.checkString(req.getParameter("rela_yn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String sub_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("sub_seq")));
String matr_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_cd")));
String matr_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_nm")));
String std_modl = Util.Uni2Ksc(Util.checkString(req.getParameter("std_modl")));
String unit = Util.Uni2Ksc(Util.checkString(req.getParameter("unit")));
String clam_qunt = Util.Uni2Ksc(Util.checkString(req.getParameter("clam_qunt")));
String fix_qunt = Util.Uni2Ksc(Util.checkString(req.getParameter("fix_qunt")));
String purc_uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("purc_uprc")));
String amt = Util.Uni2Ksc(Util.checkString(req.getParameter("amt")));
String usag = Util.Uni2Ksc(Util.checkString(req.getParameter("usag")));
String recp_hope_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("recp_hope_dt")));
String recp_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("recp_pers")));
String res_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("res_yn")));
String pay_posb_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_posb_dt")));
String via_dept_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("via_dept_yn")));
String acpn_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("acpn_dt")));
String proc_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_pers")));
String canc_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("canc_yn")));
String canc_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("canc_pers")));
String buy_proc_stat = Util.Uni2Ksc(Util.checkString(req.getParameter("buy_proc_stat")));
String non_out_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("non_out_dt")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_dt_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_dt_tm")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
String chg_dt_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_dt_tm")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String rela_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("rela_yn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setGubun(gubun);
dm.setCmpy_cd(cmpy_cd);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setSub_seq(sub_seq);
dm.setMatr_cd(matr_cd);
dm.setMatr_nm(matr_nm);
dm.setStd_modl(std_modl);
dm.setUnit(unit);
dm.setClam_qunt(clam_qunt);
dm.setFix_qunt(fix_qunt);
dm.setPurc_uprc(purc_uprc);
dm.setAmt(amt);
dm.setUsag(usag);
dm.setRecp_hope_dt(recp_hope_dt);
dm.setRecp_pers(recp_pers);
dm.setRes_yn(res_yn);
dm.setPay_posb_dt(pay_posb_dt);
dm.setVia_dept_yn(via_dept_yn);
dm.setAcpn_dt(acpn_dt);
dm.setProc_pers(proc_pers);
dm.setCanc_yn(canc_yn);
dm.setCanc_pers(canc_pers);
dm.setBuy_proc_stat(buy_proc_stat);
dm.setNon_out_dt(non_out_dt);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_dt_tm(incmg_dt_tm);
dm.setChg_pers(chg_pers);
dm.setChg_dt_tm(chg_dt_tm);
dm.setMode(mode);
dm.setMedi_cd(medi_cd);
dm.setRela_yn(rela_yn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sun Apr 05 15:21:13 KST 2009 */