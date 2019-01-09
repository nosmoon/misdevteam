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


package chosun.ciis.mt.etcimpt.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.etcimpt.ds.*;
import chosun.ciis.mt.etcimpt.rec.*;

/**
 * 
 */


public class MT_ETCIMPT_1221_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mst_mode;
	public String cmpy_cd;
	public String yy;
	public String seq;
	public String leas_clsf;
	public String sub_seq;
	public String cost_case_titl;
	public String real_ship_dt;
	public String ship_port;
	public String ariv_port;
	public String entr_dt;
	public String cd;
	public String impt_occr_cost;
	public String vat_clsf;
	public String proc_yn;
	public String remk;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String chg_pers;

	public MT_ETCIMPT_1221_ADM(){}
	public MT_ETCIMPT_1221_ADM(String mst_mode, String cmpy_cd, String yy, String seq, String leas_clsf, String sub_seq, String cost_case_titl, String real_ship_dt, String ship_port, String ariv_port, String entr_dt, String cd, String impt_occr_cost, String vat_clsf, String proc_yn, String remk, String incmg_pers_ipadd, String incmg_pers, String chg_pers){
		this.mst_mode = mst_mode;
		this.cmpy_cd = cmpy_cd;
		this.yy = yy;
		this.seq = seq;
		this.leas_clsf = leas_clsf;
		this.sub_seq = sub_seq;
		this.cost_case_titl = cost_case_titl;
		this.real_ship_dt = real_ship_dt;
		this.ship_port = ship_port;
		this.ariv_port = ariv_port;
		this.entr_dt = entr_dt;
		this.cd = cd;
		this.impt_occr_cost = impt_occr_cost;
		this.vat_clsf = vat_clsf;
		this.proc_yn = proc_yn;
		this.remk = remk;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
		this.chg_pers = chg_pers;
	}

	public void setMst_mode(String mst_mode){
		this.mst_mode = mst_mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setYy(String yy){
		this.yy = yy;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setLeas_clsf(String leas_clsf){
		this.leas_clsf = leas_clsf;
	}

	public void setSub_seq(String sub_seq){
		this.sub_seq = sub_seq;
	}

	public void setCost_case_titl(String cost_case_titl){
		this.cost_case_titl = cost_case_titl;
	}

	public void setReal_ship_dt(String real_ship_dt){
		this.real_ship_dt = real_ship_dt;
	}

	public void setShip_port(String ship_port){
		this.ship_port = ship_port;
	}

	public void setAriv_port(String ariv_port){
		this.ariv_port = ariv_port;
	}

	public void setEntr_dt(String entr_dt){
		this.entr_dt = entr_dt;
	}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setImpt_occr_cost(String impt_occr_cost){
		this.impt_occr_cost = impt_occr_cost;
	}

	public void setVat_clsf(String vat_clsf){
		this.vat_clsf = vat_clsf;
	}

	public void setProc_yn(String proc_yn){
		this.proc_yn = proc_yn;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public String getMst_mode(){
		return this.mst_mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getYy(){
		return this.yy;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getLeas_clsf(){
		return this.leas_clsf;
	}

	public String getSub_seq(){
		return this.sub_seq;
	}

	public String getCost_case_titl(){
		return this.cost_case_titl;
	}

	public String getReal_ship_dt(){
		return this.real_ship_dt;
	}

	public String getShip_port(){
		return this.ship_port;
	}

	public String getAriv_port(){
		return this.ariv_port;
	}

	public String getEntr_dt(){
		return this.entr_dt;
	}

	public String getCd(){
		return this.cd;
	}

	public String getImpt_occr_cost(){
		return this.impt_occr_cost;
	}

	public String getVat_clsf(){
		return this.vat_clsf;
	}

	public String getProc_yn(){
		return this.proc_yn;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_ETCIMPT_1221_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_ETCIMPT_1221_ADM dm = (MT_ETCIMPT_1221_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mst_mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.yy);
		cstmt.setString(6, dm.seq);
		cstmt.setString(7, dm.leas_clsf);
		cstmt.setString(8, dm.sub_seq);
		cstmt.setString(9, dm.cost_case_titl);
		cstmt.setString(10, dm.real_ship_dt);
		cstmt.setString(11, dm.ship_port);
		cstmt.setString(12, dm.ariv_port);
		cstmt.setString(13, dm.entr_dt);
		cstmt.setString(14, dm.cd);
		cstmt.setString(15, dm.impt_occr_cost);
		cstmt.setString(16, dm.vat_clsf);
		cstmt.setString(17, dm.proc_yn);
		cstmt.setString(18, dm.remk);
		cstmt.setString(19, dm.incmg_pers_ipadd);
		cstmt.setString(20, dm.incmg_pers);
		cstmt.setString(21, dm.chg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.etcimpt.ds.MT_ETCIMPT_1221_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mst_mode = [" + getMst_mode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("yy = [" + getYy() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("leas_clsf = [" + getLeas_clsf() + "]");
		System.out.println("sub_seq = [" + getSub_seq() + "]");
		System.out.println("cost_case_titl = [" + getCost_case_titl() + "]");
		System.out.println("real_ship_dt = [" + getReal_ship_dt() + "]");
		System.out.println("ship_port = [" + getShip_port() + "]");
		System.out.println("ariv_port = [" + getAriv_port() + "]");
		System.out.println("entr_dt = [" + getEntr_dt() + "]");
		System.out.println("cd = [" + getCd() + "]");
		System.out.println("impt_occr_cost = [" + getImpt_occr_cost() + "]");
		System.out.println("vat_clsf = [" + getVat_clsf() + "]");
		System.out.println("proc_yn = [" + getProc_yn() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("chg_pers = [" + getChg_pers() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String mst_mode = req.getParameter("mst_mode");
if( mst_mode == null){
	System.out.println(this.toString+" : mst_mode is null" );
}else{
	System.out.println(this.toString+" : mst_mode is "+mst_mode );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String yy = req.getParameter("yy");
if( yy == null){
	System.out.println(this.toString+" : yy is null" );
}else{
	System.out.println(this.toString+" : yy is "+yy );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String leas_clsf = req.getParameter("leas_clsf");
if( leas_clsf == null){
	System.out.println(this.toString+" : leas_clsf is null" );
}else{
	System.out.println(this.toString+" : leas_clsf is "+leas_clsf );
}
String sub_seq = req.getParameter("sub_seq");
if( sub_seq == null){
	System.out.println(this.toString+" : sub_seq is null" );
}else{
	System.out.println(this.toString+" : sub_seq is "+sub_seq );
}
String cost_case_titl = req.getParameter("cost_case_titl");
if( cost_case_titl == null){
	System.out.println(this.toString+" : cost_case_titl is null" );
}else{
	System.out.println(this.toString+" : cost_case_titl is "+cost_case_titl );
}
String real_ship_dt = req.getParameter("real_ship_dt");
if( real_ship_dt == null){
	System.out.println(this.toString+" : real_ship_dt is null" );
}else{
	System.out.println(this.toString+" : real_ship_dt is "+real_ship_dt );
}
String ship_port = req.getParameter("ship_port");
if( ship_port == null){
	System.out.println(this.toString+" : ship_port is null" );
}else{
	System.out.println(this.toString+" : ship_port is "+ship_port );
}
String ariv_port = req.getParameter("ariv_port");
if( ariv_port == null){
	System.out.println(this.toString+" : ariv_port is null" );
}else{
	System.out.println(this.toString+" : ariv_port is "+ariv_port );
}
String entr_dt = req.getParameter("entr_dt");
if( entr_dt == null){
	System.out.println(this.toString+" : entr_dt is null" );
}else{
	System.out.println(this.toString+" : entr_dt is "+entr_dt );
}
String cd = req.getParameter("cd");
if( cd == null){
	System.out.println(this.toString+" : cd is null" );
}else{
	System.out.println(this.toString+" : cd is "+cd );
}
String impt_occr_cost = req.getParameter("impt_occr_cost");
if( impt_occr_cost == null){
	System.out.println(this.toString+" : impt_occr_cost is null" );
}else{
	System.out.println(this.toString+" : impt_occr_cost is "+impt_occr_cost );
}
String vat_clsf = req.getParameter("vat_clsf");
if( vat_clsf == null){
	System.out.println(this.toString+" : vat_clsf is null" );
}else{
	System.out.println(this.toString+" : vat_clsf is "+vat_clsf );
}
String proc_yn = req.getParameter("proc_yn");
if( proc_yn == null){
	System.out.println(this.toString+" : proc_yn is null" );
}else{
	System.out.println(this.toString+" : proc_yn is "+proc_yn );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mst_mode = Util.checkString(req.getParameter("mst_mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String yy = Util.checkString(req.getParameter("yy"));
String seq = Util.checkString(req.getParameter("seq"));
String leas_clsf = Util.checkString(req.getParameter("leas_clsf"));
String sub_seq = Util.checkString(req.getParameter("sub_seq"));
String cost_case_titl = Util.checkString(req.getParameter("cost_case_titl"));
String real_ship_dt = Util.checkString(req.getParameter("real_ship_dt"));
String ship_port = Util.checkString(req.getParameter("ship_port"));
String ariv_port = Util.checkString(req.getParameter("ariv_port"));
String entr_dt = Util.checkString(req.getParameter("entr_dt"));
String cd = Util.checkString(req.getParameter("cd"));
String impt_occr_cost = Util.checkString(req.getParameter("impt_occr_cost"));
String vat_clsf = Util.checkString(req.getParameter("vat_clsf"));
String proc_yn = Util.checkString(req.getParameter("proc_yn"));
String remk = Util.checkString(req.getParameter("remk"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mst_mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mst_mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String yy = Util.Uni2Ksc(Util.checkString(req.getParameter("yy")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String leas_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_clsf")));
String sub_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("sub_seq")));
String cost_case_titl = Util.Uni2Ksc(Util.checkString(req.getParameter("cost_case_titl")));
String real_ship_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("real_ship_dt")));
String ship_port = Util.Uni2Ksc(Util.checkString(req.getParameter("ship_port")));
String ariv_port = Util.Uni2Ksc(Util.checkString(req.getParameter("ariv_port")));
String entr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("entr_dt")));
String cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cd")));
String impt_occr_cost = Util.Uni2Ksc(Util.checkString(req.getParameter("impt_occr_cost")));
String vat_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("vat_clsf")));
String proc_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_yn")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMst_mode(mst_mode);
dm.setCmpy_cd(cmpy_cd);
dm.setYy(yy);
dm.setSeq(seq);
dm.setLeas_clsf(leas_clsf);
dm.setSub_seq(sub_seq);
dm.setCost_case_titl(cost_case_titl);
dm.setReal_ship_dt(real_ship_dt);
dm.setShip_port(ship_port);
dm.setAriv_port(ariv_port);
dm.setEntr_dt(entr_dt);
dm.setCd(cd);
dm.setImpt_occr_cost(impt_occr_cost);
dm.setVat_clsf(vat_clsf);
dm.setProc_yn(proc_yn);
dm.setRemk(remk);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
dm.setChg_pers(chg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Jul 04 20:16:13 KST 2009 */