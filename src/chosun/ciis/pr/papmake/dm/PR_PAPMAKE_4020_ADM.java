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


package chosun.ciis.pr.papmake.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pr.papmake.ds.*;
import chosun.ciis.pr.papmake.rec.*;

/**
 * 
 */


public class PR_PAPMAKE_4020_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String yymm;
	public String fac_clsf;
	public String fac_clsf_2;
	public String issu_dt;
	public String medi_cd;
	public String sect_cd;
	public String issu_pcnt;
	public String clr_pcnt;
	public String dual_out_clsf;
	public String all_slip_qty;
	public String all_slip_qty_1;
	public String seq;
	public String base_servcost;
	public String basi_excs_servcost;
	public String basi_sep_prtn_servcost;
	public String crps_cost;
	public String dduc_cost;
	public String incmg_pers_ipaddr;
	public String incmg_pers;
	public String chg_pers;

	public PR_PAPMAKE_4020_ADM(){}
	public PR_PAPMAKE_4020_ADM(String cmpy_cd, String yymm, String fac_clsf, String fac_clsf_2, String issu_dt, String medi_cd, String sect_cd, String issu_pcnt, String clr_pcnt, String dual_out_clsf, String all_slip_qty, String all_slip_qty_1, String seq, String base_servcost, String basi_excs_servcost, String basi_sep_prtn_servcost, String crps_cost, String dduc_cost, String incmg_pers_ipaddr, String incmg_pers, String chg_pers){
		this.cmpy_cd = cmpy_cd;
		this.yymm = yymm;
		this.fac_clsf = fac_clsf;
		this.fac_clsf_2 = fac_clsf_2;
		this.issu_dt = issu_dt;
		this.medi_cd = medi_cd;
		this.sect_cd = sect_cd;
		this.issu_pcnt = issu_pcnt;
		this.clr_pcnt = clr_pcnt;
		this.dual_out_clsf = dual_out_clsf;
		this.all_slip_qty = all_slip_qty;
		this.all_slip_qty_1 = all_slip_qty_1;
		this.seq = seq;
		this.base_servcost = base_servcost;
		this.basi_excs_servcost = basi_excs_servcost;
		this.basi_sep_prtn_servcost = basi_sep_prtn_servcost;
		this.crps_cost = crps_cost;
		this.dduc_cost = dduc_cost;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
		this.chg_pers = chg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setFac_clsf_2(String fac_clsf_2){
		this.fac_clsf_2 = fac_clsf_2;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setIssu_pcnt(String issu_pcnt){
		this.issu_pcnt = issu_pcnt;
	}

	public void setClr_pcnt(String clr_pcnt){
		this.clr_pcnt = clr_pcnt;
	}

	public void setDual_out_clsf(String dual_out_clsf){
		this.dual_out_clsf = dual_out_clsf;
	}

	public void setAll_slip_qty(String all_slip_qty){
		this.all_slip_qty = all_slip_qty;
	}

	public void setAll_slip_qty_1(String all_slip_qty_1){
		this.all_slip_qty_1 = all_slip_qty_1;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setBase_servcost(String base_servcost){
		this.base_servcost = base_servcost;
	}

	public void setBasi_excs_servcost(String basi_excs_servcost){
		this.basi_excs_servcost = basi_excs_servcost;
	}

	public void setBasi_sep_prtn_servcost(String basi_sep_prtn_servcost){
		this.basi_sep_prtn_servcost = basi_sep_prtn_servcost;
	}

	public void setCrps_cost(String crps_cost){
		this.crps_cost = crps_cost;
	}

	public void setDduc_cost(String dduc_cost){
		this.dduc_cost = dduc_cost;
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

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getFac_clsf_2(){
		return this.fac_clsf_2;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getIssu_pcnt(){
		return this.issu_pcnt;
	}

	public String getClr_pcnt(){
		return this.clr_pcnt;
	}

	public String getDual_out_clsf(){
		return this.dual_out_clsf;
	}

	public String getAll_slip_qty(){
		return this.all_slip_qty;
	}

	public String getAll_slip_qty_1(){
		return this.all_slip_qty_1;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getBase_servcost(){
		return this.base_servcost;
	}

	public String getBasi_excs_servcost(){
		return this.basi_excs_servcost;
	}

	public String getBasi_sep_prtn_servcost(){
		return this.basi_sep_prtn_servcost;
	}

	public String getCrps_cost(){
		return this.crps_cost;
	}

	public String getDduc_cost(){
		return this.dduc_cost;
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

	public String getSQL(){
		 return "{ call MISMAT.SP_PR_PAPMAKE_4020_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PR_PAPMAKE_4020_ADM dm = (PR_PAPMAKE_4020_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.yymm);
		cstmt.setString(5, dm.fac_clsf);
		cstmt.setString(6, dm.fac_clsf_2);
		cstmt.setString(7, dm.issu_dt);
		cstmt.setString(8, dm.medi_cd);
		cstmt.setString(9, dm.sect_cd);
		cstmt.setString(10, dm.issu_pcnt);
		cstmt.setString(11, dm.clr_pcnt);
		cstmt.setString(12, dm.dual_out_clsf);
		cstmt.setString(13, dm.all_slip_qty);
		cstmt.setString(14, dm.all_slip_qty_1);
		cstmt.setString(15, dm.seq);
		cstmt.setString(16, dm.base_servcost);
		cstmt.setString(17, dm.basi_excs_servcost);
		cstmt.setString(18, dm.basi_sep_prtn_servcost);
		cstmt.setString(19, dm.crps_cost);
		cstmt.setString(20, dm.dduc_cost);
		cstmt.setString(21, dm.incmg_pers_ipaddr);
		cstmt.setString(22, dm.incmg_pers);
		cstmt.setString(23, dm.chg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pr.papmake.ds.PR_PAPMAKE_4020_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("yymm = [" + getYymm() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
		System.out.println("fac_clsf_2 = [" + getFac_clsf_2() + "]");
		System.out.println("issu_dt = [" + getIssu_dt() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("sect_cd = [" + getSect_cd() + "]");
		System.out.println("issu_pcnt = [" + getIssu_pcnt() + "]");
		System.out.println("clr_pcnt = [" + getClr_pcnt() + "]");
		System.out.println("dual_out_clsf = [" + getDual_out_clsf() + "]");
		System.out.println("all_slip_qty = [" + getAll_slip_qty() + "]");
		System.out.println("all_slip_qty_1 = [" + getAll_slip_qty_1() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("base_servcost = [" + getBase_servcost() + "]");
		System.out.println("basi_excs_servcost = [" + getBasi_excs_servcost() + "]");
		System.out.println("basi_sep_prtn_servcost = [" + getBasi_sep_prtn_servcost() + "]");
		System.out.println("crps_cost = [" + getCrps_cost() + "]");
		System.out.println("dduc_cost = [" + getDduc_cost() + "]");
		System.out.println("incmg_pers_ipaddr = [" + getIncmg_pers_ipaddr() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("chg_pers = [" + getChg_pers() + "]");
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
String yymm = req.getParameter("yymm");
if( yymm == null){
	System.out.println(this.toString+" : yymm is null" );
}else{
	System.out.println(this.toString+" : yymm is "+yymm );
}
String fac_clsf = req.getParameter("fac_clsf");
if( fac_clsf == null){
	System.out.println(this.toString+" : fac_clsf is null" );
}else{
	System.out.println(this.toString+" : fac_clsf is "+fac_clsf );
}
String fac_clsf_2 = req.getParameter("fac_clsf_2");
if( fac_clsf_2 == null){
	System.out.println(this.toString+" : fac_clsf_2 is null" );
}else{
	System.out.println(this.toString+" : fac_clsf_2 is "+fac_clsf_2 );
}
String issu_dt = req.getParameter("issu_dt");
if( issu_dt == null){
	System.out.println(this.toString+" : issu_dt is null" );
}else{
	System.out.println(this.toString+" : issu_dt is "+issu_dt );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String sect_cd = req.getParameter("sect_cd");
if( sect_cd == null){
	System.out.println(this.toString+" : sect_cd is null" );
}else{
	System.out.println(this.toString+" : sect_cd is "+sect_cd );
}
String issu_pcnt = req.getParameter("issu_pcnt");
if( issu_pcnt == null){
	System.out.println(this.toString+" : issu_pcnt is null" );
}else{
	System.out.println(this.toString+" : issu_pcnt is "+issu_pcnt );
}
String clr_pcnt = req.getParameter("clr_pcnt");
if( clr_pcnt == null){
	System.out.println(this.toString+" : clr_pcnt is null" );
}else{
	System.out.println(this.toString+" : clr_pcnt is "+clr_pcnt );
}
String dual_out_clsf = req.getParameter("dual_out_clsf");
if( dual_out_clsf == null){
	System.out.println(this.toString+" : dual_out_clsf is null" );
}else{
	System.out.println(this.toString+" : dual_out_clsf is "+dual_out_clsf );
}
String all_slip_qty = req.getParameter("all_slip_qty");
if( all_slip_qty == null){
	System.out.println(this.toString+" : all_slip_qty is null" );
}else{
	System.out.println(this.toString+" : all_slip_qty is "+all_slip_qty );
}
String all_slip_qty_1 = req.getParameter("all_slip_qty_1");
if( all_slip_qty_1 == null){
	System.out.println(this.toString+" : all_slip_qty_1 is null" );
}else{
	System.out.println(this.toString+" : all_slip_qty_1 is "+all_slip_qty_1 );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String base_servcost = req.getParameter("base_servcost");
if( base_servcost == null){
	System.out.println(this.toString+" : base_servcost is null" );
}else{
	System.out.println(this.toString+" : base_servcost is "+base_servcost );
}
String basi_excs_servcost = req.getParameter("basi_excs_servcost");
if( basi_excs_servcost == null){
	System.out.println(this.toString+" : basi_excs_servcost is null" );
}else{
	System.out.println(this.toString+" : basi_excs_servcost is "+basi_excs_servcost );
}
String basi_sep_prtn_servcost = req.getParameter("basi_sep_prtn_servcost");
if( basi_sep_prtn_servcost == null){
	System.out.println(this.toString+" : basi_sep_prtn_servcost is null" );
}else{
	System.out.println(this.toString+" : basi_sep_prtn_servcost is "+basi_sep_prtn_servcost );
}
String crps_cost = req.getParameter("crps_cost");
if( crps_cost == null){
	System.out.println(this.toString+" : crps_cost is null" );
}else{
	System.out.println(this.toString+" : crps_cost is "+crps_cost );
}
String dduc_cost = req.getParameter("dduc_cost");
if( dduc_cost == null){
	System.out.println(this.toString+" : dduc_cost is null" );
}else{
	System.out.println(this.toString+" : dduc_cost is "+dduc_cost );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String yymm = Util.checkString(req.getParameter("yymm"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String fac_clsf_2 = Util.checkString(req.getParameter("fac_clsf_2"));
String issu_dt = Util.checkString(req.getParameter("issu_dt"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String sect_cd = Util.checkString(req.getParameter("sect_cd"));
String issu_pcnt = Util.checkString(req.getParameter("issu_pcnt"));
String clr_pcnt = Util.checkString(req.getParameter("clr_pcnt"));
String dual_out_clsf = Util.checkString(req.getParameter("dual_out_clsf"));
String all_slip_qty = Util.checkString(req.getParameter("all_slip_qty"));
String all_slip_qty_1 = Util.checkString(req.getParameter("all_slip_qty_1"));
String seq = Util.checkString(req.getParameter("seq"));
String base_servcost = Util.checkString(req.getParameter("base_servcost"));
String basi_excs_servcost = Util.checkString(req.getParameter("basi_excs_servcost"));
String basi_sep_prtn_servcost = Util.checkString(req.getParameter("basi_sep_prtn_servcost"));
String crps_cost = Util.checkString(req.getParameter("crps_cost"));
String dduc_cost = Util.checkString(req.getParameter("dduc_cost"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String fac_clsf_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf_2")));
String issu_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String sect_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_cd")));
String issu_pcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_pcnt")));
String clr_pcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("clr_pcnt")));
String dual_out_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("dual_out_clsf")));
String all_slip_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("all_slip_qty")));
String all_slip_qty_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("all_slip_qty_1")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String base_servcost = Util.Uni2Ksc(Util.checkString(req.getParameter("base_servcost")));
String basi_excs_servcost = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_excs_servcost")));
String basi_sep_prtn_servcost = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_sep_prtn_servcost")));
String crps_cost = Util.Uni2Ksc(Util.checkString(req.getParameter("crps_cost")));
String dduc_cost = Util.Uni2Ksc(Util.checkString(req.getParameter("dduc_cost")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setYymm(yymm);
dm.setFac_clsf(fac_clsf);
dm.setFac_clsf_2(fac_clsf_2);
dm.setIssu_dt(issu_dt);
dm.setMedi_cd(medi_cd);
dm.setSect_cd(sect_cd);
dm.setIssu_pcnt(issu_pcnt);
dm.setClr_pcnt(clr_pcnt);
dm.setDual_out_clsf(dual_out_clsf);
dm.setAll_slip_qty(all_slip_qty);
dm.setAll_slip_qty_1(all_slip_qty_1);
dm.setSeq(seq);
dm.setBase_servcost(base_servcost);
dm.setBasi_excs_servcost(basi_excs_servcost);
dm.setBasi_sep_prtn_servcost(basi_sep_prtn_servcost);
dm.setCrps_cost(crps_cost);
dm.setDduc_cost(dduc_cost);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
dm.setChg_pers(chg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Aug 25 13:52:53 KST 2009 */