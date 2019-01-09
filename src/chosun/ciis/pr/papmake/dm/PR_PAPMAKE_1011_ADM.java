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
import chosun.ciis.pr.sendmg.ds.*;
import chosun.ciis.pr.sendmg.rec.*;

/**
 * 
 */


public class PR_PAPMAKE_1011_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String gubun;
	public String cmpy_cd;
	public String duty_dt;
	public String fac_clsf;
	public String wk_duty_nops;
	public String ngt_duty_nops;
	public String dtfree_nops;
	public String vaca_nops;
	public String dspch_nops;
	public String etc_nops;
	public String night_shift_liab_pers;
	public String mchn_1_duty_pers;
	public String mchn_2_duty_pers;
	public String mchn_3_duty_pers;
	public String mchn_4_duty_pers;
	public String mchn_duty_pers;
	public String befo_duty_pers;
	public String prt_board_duty_pers;
	public String send_duty_pers;
	public String etc_duty_pers;
	public String remk;
	public String incmg_pers_ipaddr;
	public String incmg_pers;

	public PR_PAPMAKE_1011_ADM(){}
	public PR_PAPMAKE_1011_ADM(String gubun, String cmpy_cd, String duty_dt, String fac_clsf, String wk_duty_nops, String ngt_duty_nops, String dtfree_nops, String vaca_nops, String dspch_nops, String etc_nops, String night_shift_liab_pers, String mchn_1_duty_pers, String mchn_2_duty_pers, String mchn_3_duty_pers, String mchn_4_duty_pers, String mchn_duty_pers, String befo_duty_pers, String prt_board_duty_pers, String send_duty_pers, String etc_duty_pers, String remk, String incmg_pers_ipaddr, String incmg_pers){
		this.gubun = gubun;
		this.cmpy_cd = cmpy_cd;
		this.duty_dt = duty_dt;
		this.fac_clsf = fac_clsf;
		this.wk_duty_nops = wk_duty_nops;
		this.ngt_duty_nops = ngt_duty_nops;
		this.dtfree_nops = dtfree_nops;
		this.vaca_nops = vaca_nops;
		this.dspch_nops = dspch_nops;
		this.etc_nops = etc_nops;
		this.night_shift_liab_pers = night_shift_liab_pers;
		this.mchn_1_duty_pers = mchn_1_duty_pers;
		this.mchn_2_duty_pers = mchn_2_duty_pers;
		this.mchn_3_duty_pers = mchn_3_duty_pers;
		this.mchn_4_duty_pers = mchn_4_duty_pers;
		this.mchn_duty_pers = mchn_duty_pers;
		this.befo_duty_pers = befo_duty_pers;
		this.prt_board_duty_pers = prt_board_duty_pers;
		this.send_duty_pers = send_duty_pers;
		this.etc_duty_pers = etc_duty_pers;
		this.remk = remk;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
	}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDuty_dt(String duty_dt){
		this.duty_dt = duty_dt;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setWk_duty_nops(String wk_duty_nops){
		this.wk_duty_nops = wk_duty_nops;
	}

	public void setNgt_duty_nops(String ngt_duty_nops){
		this.ngt_duty_nops = ngt_duty_nops;
	}

	public void setDtfree_nops(String dtfree_nops){
		this.dtfree_nops = dtfree_nops;
	}

	public void setVaca_nops(String vaca_nops){
		this.vaca_nops = vaca_nops;
	}

	public void setDspch_nops(String dspch_nops){
		this.dspch_nops = dspch_nops;
	}

	public void setEtc_nops(String etc_nops){
		this.etc_nops = etc_nops;
	}

	public void setNight_shift_liab_pers(String night_shift_liab_pers){
		this.night_shift_liab_pers = night_shift_liab_pers;
	}

	public void setMchn_1_duty_pers(String mchn_1_duty_pers){
		this.mchn_1_duty_pers = mchn_1_duty_pers;
	}

	public void setMchn_2_duty_pers(String mchn_2_duty_pers){
		this.mchn_2_duty_pers = mchn_2_duty_pers;
	}

	public void setMchn_3_duty_pers(String mchn_3_duty_pers){
		this.mchn_3_duty_pers = mchn_3_duty_pers;
	}

	public void setMchn_4_duty_pers(String mchn_4_duty_pers){
		this.mchn_4_duty_pers = mchn_4_duty_pers;
	}

	public void setMchn_duty_pers(String mchn_duty_pers){
		this.mchn_duty_pers = mchn_duty_pers;
	}

	public void setBefo_duty_pers(String befo_duty_pers){
		this.befo_duty_pers = befo_duty_pers;
	}

	public void setPrt_board_duty_pers(String prt_board_duty_pers){
		this.prt_board_duty_pers = prt_board_duty_pers;
	}

	public void setSend_duty_pers(String send_duty_pers){
		this.send_duty_pers = send_duty_pers;
	}

	public void setEtc_duty_pers(String etc_duty_pers){
		this.etc_duty_pers = etc_duty_pers;
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

	public String getGubun(){
		return this.gubun;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDuty_dt(){
		return this.duty_dt;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getWk_duty_nops(){
		return this.wk_duty_nops;
	}

	public String getNgt_duty_nops(){
		return this.ngt_duty_nops;
	}

	public String getDtfree_nops(){
		return this.dtfree_nops;
	}

	public String getVaca_nops(){
		return this.vaca_nops;
	}

	public String getDspch_nops(){
		return this.dspch_nops;
	}

	public String getEtc_nops(){
		return this.etc_nops;
	}

	public String getNight_shift_liab_pers(){
		return this.night_shift_liab_pers;
	}

	public String getMchn_1_duty_pers(){
		return this.mchn_1_duty_pers;
	}

	public String getMchn_2_duty_pers(){
		return this.mchn_2_duty_pers;
	}

	public String getMchn_3_duty_pers(){
		return this.mchn_3_duty_pers;
	}

	public String getMchn_4_duty_pers(){
		return this.mchn_4_duty_pers;
	}

	public String getMchn_duty_pers(){
		return this.mchn_duty_pers;
	}

	public String getBefo_duty_pers(){
		return this.befo_duty_pers;
	}

	public String getPrt_board_duty_pers(){
		return this.prt_board_duty_pers;
	}

	public String getSend_duty_pers(){
		return this.send_duty_pers;
	}

	public String getEtc_duty_pers(){
		return this.etc_duty_pers;
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

	public String getSQL(){
		 return "{ call SP_PR_PAPMAKE_1011_A( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PR_PAPMAKE_1011_ADM dm = (PR_PAPMAKE_1011_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.gubun);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.duty_dt);
		cstmt.setString(6, dm.fac_clsf);
		cstmt.setString(7, dm.wk_duty_nops);
		cstmt.setString(8, dm.ngt_duty_nops);
		cstmt.setString(9, dm.dtfree_nops);
		cstmt.setString(10, dm.vaca_nops);
		cstmt.setString(11, dm.dspch_nops);
		cstmt.setString(12, dm.etc_nops);
		cstmt.setString(13, dm.night_shift_liab_pers);
		cstmt.setString(14, dm.mchn_1_duty_pers);
		cstmt.setString(15, dm.mchn_2_duty_pers);
		cstmt.setString(16, dm.mchn_3_duty_pers);
		cstmt.setString(17, dm.mchn_4_duty_pers);
		cstmt.setString(18, dm.mchn_duty_pers);
		cstmt.setString(19, dm.befo_duty_pers);
		cstmt.setString(20, dm.prt_board_duty_pers);
		cstmt.setString(21, dm.send_duty_pers);
		cstmt.setString(22, dm.etc_duty_pers);
		cstmt.setString(23, dm.remk);
		cstmt.setString(24, dm.incmg_pers_ipaddr);
		cstmt.setString(25, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pr.papmake.ds.PR_PAPMAKE_1011_ADataSet();
	}



    public void print(){
        System.out.println("gubun = " + getGubun());
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("duty_dt = " + getDuty_dt());
        System.out.println("fac_clsf = " + getFac_clsf());
        System.out.println("wk_duty_nops = " + getWk_duty_nops());
        System.out.println("ngt_duty_nops = " + getNgt_duty_nops());
        System.out.println("dtfree_nops = " + getDtfree_nops());
        System.out.println("vaca_nops = " + getVaca_nops());
        System.out.println("dspch_nops = " + getDspch_nops());
        System.out.println("etc_nops = " + getEtc_nops());
        System.out.println("night_shift_liab_pers = " + getNight_shift_liab_pers());
        System.out.println("mchn_1_duty_pers = " + getMchn_1_duty_pers());
        System.out.println("mchn_2_duty_pers = " + getMchn_2_duty_pers());
        System.out.println("mchn_3_duty_pers = " + getMchn_3_duty_pers());
        System.out.println("mchn_4_duty_pers = " + getMchn_4_duty_pers());
        System.out.println("mchn_duty_pers = " + getMchn_duty_pers());
        System.out.println("befo_duty_pers = " + getBefo_duty_pers());
        System.out.println("prt_board_duty_pers = " + getPrt_board_duty_pers());
        System.out.println("send_duty_pers = " + getSend_duty_pers());
        System.out.println("etc_duty_pers = " + getEtc_duty_pers());
        System.out.println("remk = " + getRemk());
        System.out.println("incmg_pers_ipaddr = " + getIncmg_pers_ipaddr());
        System.out.println("incmg_pers = " + getIncmg_pers());
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
String duty_dt = req.getParameter("duty_dt");
if( duty_dt == null){
	System.out.println(this.toString+" : duty_dt is null" );
}else{
	System.out.println(this.toString+" : duty_dt is "+duty_dt );
}
String fac_clsf = req.getParameter("fac_clsf");
if( fac_clsf == null){
	System.out.println(this.toString+" : fac_clsf is null" );
}else{
	System.out.println(this.toString+" : fac_clsf is "+fac_clsf );
}
String wk_duty_nops = req.getParameter("wk_duty_nops");
if( wk_duty_nops == null){
	System.out.println(this.toString+" : wk_duty_nops is null" );
}else{
	System.out.println(this.toString+" : wk_duty_nops is "+wk_duty_nops );
}
String ngt_duty_nops = req.getParameter("ngt_duty_nops");
if( ngt_duty_nops == null){
	System.out.println(this.toString+" : ngt_duty_nops is null" );
}else{
	System.out.println(this.toString+" : ngt_duty_nops is "+ngt_duty_nops );
}
String dtfree_nops = req.getParameter("dtfree_nops");
if( dtfree_nops == null){
	System.out.println(this.toString+" : dtfree_nops is null" );
}else{
	System.out.println(this.toString+" : dtfree_nops is "+dtfree_nops );
}
String vaca_nops = req.getParameter("vaca_nops");
if( vaca_nops == null){
	System.out.println(this.toString+" : vaca_nops is null" );
}else{
	System.out.println(this.toString+" : vaca_nops is "+vaca_nops );
}
String dspch_nops = req.getParameter("dspch_nops");
if( dspch_nops == null){
	System.out.println(this.toString+" : dspch_nops is null" );
}else{
	System.out.println(this.toString+" : dspch_nops is "+dspch_nops );
}
String etc_nops = req.getParameter("etc_nops");
if( etc_nops == null){
	System.out.println(this.toString+" : etc_nops is null" );
}else{
	System.out.println(this.toString+" : etc_nops is "+etc_nops );
}
String night_shift_liab_pers = req.getParameter("night_shift_liab_pers");
if( night_shift_liab_pers == null){
	System.out.println(this.toString+" : night_shift_liab_pers is null" );
}else{
	System.out.println(this.toString+" : night_shift_liab_pers is "+night_shift_liab_pers );
}
String mchn_1_duty_pers = req.getParameter("mchn_1_duty_pers");
if( mchn_1_duty_pers == null){
	System.out.println(this.toString+" : mchn_1_duty_pers is null" );
}else{
	System.out.println(this.toString+" : mchn_1_duty_pers is "+mchn_1_duty_pers );
}
String mchn_2_duty_pers = req.getParameter("mchn_2_duty_pers");
if( mchn_2_duty_pers == null){
	System.out.println(this.toString+" : mchn_2_duty_pers is null" );
}else{
	System.out.println(this.toString+" : mchn_2_duty_pers is "+mchn_2_duty_pers );
}
String mchn_3_duty_pers = req.getParameter("mchn_3_duty_pers");
if( mchn_3_duty_pers == null){
	System.out.println(this.toString+" : mchn_3_duty_pers is null" );
}else{
	System.out.println(this.toString+" : mchn_3_duty_pers is "+mchn_3_duty_pers );
}
String mchn_4_duty_pers = req.getParameter("mchn_4_duty_pers");
if( mchn_4_duty_pers == null){
	System.out.println(this.toString+" : mchn_4_duty_pers is null" );
}else{
	System.out.println(this.toString+" : mchn_4_duty_pers is "+mchn_4_duty_pers );
}
String mchn_duty_pers = req.getParameter("mchn_duty_pers");
if( mchn_duty_pers == null){
	System.out.println(this.toString+" : mchn_duty_pers is null" );
}else{
	System.out.println(this.toString+" : mchn_duty_pers is "+mchn_duty_pers );
}
String befo_duty_pers = req.getParameter("befo_duty_pers");
if( befo_duty_pers == null){
	System.out.println(this.toString+" : befo_duty_pers is null" );
}else{
	System.out.println(this.toString+" : befo_duty_pers is "+befo_duty_pers );
}
String prt_board_duty_pers = req.getParameter("prt_board_duty_pers");
if( prt_board_duty_pers == null){
	System.out.println(this.toString+" : prt_board_duty_pers is null" );
}else{
	System.out.println(this.toString+" : prt_board_duty_pers is "+prt_board_duty_pers );
}
String send_duty_pers = req.getParameter("send_duty_pers");
if( send_duty_pers == null){
	System.out.println(this.toString+" : send_duty_pers is null" );
}else{
	System.out.println(this.toString+" : send_duty_pers is "+send_duty_pers );
}
String etc_duty_pers = req.getParameter("etc_duty_pers");
if( etc_duty_pers == null){
	System.out.println(this.toString+" : etc_duty_pers is null" );
}else{
	System.out.println(this.toString+" : etc_duty_pers is "+etc_duty_pers );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String gubun = Util.checkString(req.getParameter("gubun"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String duty_dt = Util.checkString(req.getParameter("duty_dt"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String wk_duty_nops = Util.checkString(req.getParameter("wk_duty_nops"));
String ngt_duty_nops = Util.checkString(req.getParameter("ngt_duty_nops"));
String dtfree_nops = Util.checkString(req.getParameter("dtfree_nops"));
String vaca_nops = Util.checkString(req.getParameter("vaca_nops"));
String dspch_nops = Util.checkString(req.getParameter("dspch_nops"));
String etc_nops = Util.checkString(req.getParameter("etc_nops"));
String night_shift_liab_pers = Util.checkString(req.getParameter("night_shift_liab_pers"));
String mchn_1_duty_pers = Util.checkString(req.getParameter("mchn_1_duty_pers"));
String mchn_2_duty_pers = Util.checkString(req.getParameter("mchn_2_duty_pers"));
String mchn_3_duty_pers = Util.checkString(req.getParameter("mchn_3_duty_pers"));
String mchn_4_duty_pers = Util.checkString(req.getParameter("mchn_4_duty_pers"));
String mchn_duty_pers = Util.checkString(req.getParameter("mchn_duty_pers"));
String befo_duty_pers = Util.checkString(req.getParameter("befo_duty_pers"));
String prt_board_duty_pers = Util.checkString(req.getParameter("prt_board_duty_pers"));
String send_duty_pers = Util.checkString(req.getParameter("send_duty_pers"));
String etc_duty_pers = Util.checkString(req.getParameter("etc_duty_pers"));
String remk = Util.checkString(req.getParameter("remk"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String duty_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("duty_dt")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String wk_duty_nops = Util.Uni2Ksc(Util.checkString(req.getParameter("wk_duty_nops")));
String ngt_duty_nops = Util.Uni2Ksc(Util.checkString(req.getParameter("ngt_duty_nops")));
String dtfree_nops = Util.Uni2Ksc(Util.checkString(req.getParameter("dtfree_nops")));
String vaca_nops = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_nops")));
String dspch_nops = Util.Uni2Ksc(Util.checkString(req.getParameter("dspch_nops")));
String etc_nops = Util.Uni2Ksc(Util.checkString(req.getParameter("etc_nops")));
String night_shift_liab_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("night_shift_liab_pers")));
String mchn_1_duty_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("mchn_1_duty_pers")));
String mchn_2_duty_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("mchn_2_duty_pers")));
String mchn_3_duty_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("mchn_3_duty_pers")));
String mchn_4_duty_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("mchn_4_duty_pers")));
String mchn_duty_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("mchn_duty_pers")));
String befo_duty_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("befo_duty_pers")));
String prt_board_duty_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_board_duty_pers")));
String send_duty_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("send_duty_pers")));
String etc_duty_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("etc_duty_pers")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setGubun(gubun);
dm.setCmpy_cd(cmpy_cd);
dm.setDuty_dt(duty_dt);
dm.setFac_clsf(fac_clsf);
dm.setWk_duty_nops(wk_duty_nops);
dm.setNgt_duty_nops(ngt_duty_nops);
dm.setDtfree_nops(dtfree_nops);
dm.setVaca_nops(vaca_nops);
dm.setDspch_nops(dspch_nops);
dm.setEtc_nops(etc_nops);
dm.setNight_shift_liab_pers(night_shift_liab_pers);
dm.setMchn_1_duty_pers(mchn_1_duty_pers);
dm.setMchn_2_duty_pers(mchn_2_duty_pers);
dm.setMchn_3_duty_pers(mchn_3_duty_pers);
dm.setMchn_4_duty_pers(mchn_4_duty_pers);
dm.setMchn_duty_pers(mchn_duty_pers);
dm.setBefo_duty_pers(befo_duty_pers);
dm.setPrt_board_duty_pers(prt_board_duty_pers);
dm.setSend_duty_pers(send_duty_pers);
dm.setEtc_duty_pers(etc_duty_pers);
dm.setRemk(remk);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jun 05 19:09:57 KST 2009 */