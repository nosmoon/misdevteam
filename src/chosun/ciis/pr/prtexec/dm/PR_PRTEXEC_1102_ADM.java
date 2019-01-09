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


package chosun.ciis.pr.prtexec.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pr.prtexec.ds.*;
import chosun.ciis.pr.prtexec.rec.*;

/**
 * 
 */


public class PR_PRTEXEC_1102_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String gubun;
	public String prt_dt;
	public String fac_clsf;
	public String medi_cd;
	public String medi_nm;
	public String sect_cd;
	public String ecnt;
	public String seq;
	public String clr_off_plat_tm;
	public String off_plat_tm;
	public String trsm_end_tm;
	public String prt_bgn_tm;
	public String prt_end_tm;
	public String slip_qty;
	public String real_prt_qty;
	public String bad_nwsp_qty;
	public String card_qty;
	public String dqty;
	public String apcut_err;
	public String driv_cut_err;
	public String remk;
	public String prt_ex_qunt;
	public String incmg_pers_ipaddr;
	public String incmg_pers;

	public PR_PRTEXEC_1102_ADM(){}
	public PR_PRTEXEC_1102_ADM(String cmpy_cd, String mode, String gubun, String prt_dt, String fac_clsf, String medi_cd, String medi_nm, String sect_cd, String ecnt, String seq, String clr_off_plat_tm, String off_plat_tm, String trsm_end_tm, String prt_bgn_tm, String prt_end_tm, String slip_qty, String real_prt_qty, String bad_nwsp_qty, String card_qty, String dqty, String apcut_err, String driv_cut_err, String remk, String prt_ex_qunt, String incmg_pers_ipaddr, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.gubun = gubun;
		this.prt_dt = prt_dt;
		this.fac_clsf = fac_clsf;
		this.medi_cd = medi_cd;
		this.medi_nm = medi_nm;
		this.sect_cd = sect_cd;
		this.ecnt = ecnt;
		this.seq = seq;
		this.clr_off_plat_tm = clr_off_plat_tm;
		this.off_plat_tm = off_plat_tm;
		this.trsm_end_tm = trsm_end_tm;
		this.prt_bgn_tm = prt_bgn_tm;
		this.prt_end_tm = prt_end_tm;
		this.slip_qty = slip_qty;
		this.real_prt_qty = real_prt_qty;
		this.bad_nwsp_qty = bad_nwsp_qty;
		this.card_qty = card_qty;
		this.dqty = dqty;
		this.apcut_err = apcut_err;
		this.driv_cut_err = driv_cut_err;
		this.remk = remk;
		this.prt_ex_qunt = prt_ex_qunt;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public void setPrt_dt(String prt_dt){
		this.prt_dt = prt_dt;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setEcnt(String ecnt){
		this.ecnt = ecnt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setClr_off_plat_tm(String clr_off_plat_tm){
		this.clr_off_plat_tm = clr_off_plat_tm;
	}

	public void setOff_plat_tm(String off_plat_tm){
		this.off_plat_tm = off_plat_tm;
	}

	public void setTrsm_end_tm(String trsm_end_tm){
		this.trsm_end_tm = trsm_end_tm;
	}

	public void setPrt_bgn_tm(String prt_bgn_tm){
		this.prt_bgn_tm = prt_bgn_tm;
	}

	public void setPrt_end_tm(String prt_end_tm){
		this.prt_end_tm = prt_end_tm;
	}

	public void setSlip_qty(String slip_qty){
		this.slip_qty = slip_qty;
	}

	public void setReal_prt_qty(String real_prt_qty){
		this.real_prt_qty = real_prt_qty;
	}

	public void setBad_nwsp_qty(String bad_nwsp_qty){
		this.bad_nwsp_qty = bad_nwsp_qty;
	}

	public void setCard_qty(String card_qty){
		this.card_qty = card_qty;
	}

	public void setDqty(String dqty){
		this.dqty = dqty;
	}

	public void setApcut_err(String apcut_err){
		this.apcut_err = apcut_err;
	}

	public void setDriv_cut_err(String driv_cut_err){
		this.driv_cut_err = driv_cut_err;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setPrt_ex_qunt(String prt_ex_qunt){
		this.prt_ex_qunt = prt_ex_qunt;
	}

	public void setIncmg_pers_ipaddr(String incmg_pers_ipaddr){
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMode(){
		return this.mode;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getPrt_dt(){
		return this.prt_dt;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getEcnt(){
		return this.ecnt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getClr_off_plat_tm(){
		return this.clr_off_plat_tm;
	}

	public String getOff_plat_tm(){
		return this.off_plat_tm;
	}

	public String getTrsm_end_tm(){
		return this.trsm_end_tm;
	}

	public String getPrt_bgn_tm(){
		return this.prt_bgn_tm;
	}

	public String getPrt_end_tm(){
		return this.prt_end_tm;
	}

	public String getSlip_qty(){
		return this.slip_qty;
	}

	public String getReal_prt_qty(){
		return this.real_prt_qty;
	}

	public String getBad_nwsp_qty(){
		return this.bad_nwsp_qty;
	}

	public String getCard_qty(){
		return this.card_qty;
	}

	public String getDqty(){
		return this.dqty;
	}

	public String getApcut_err(){
		return this.apcut_err;
	}

	public String getDriv_cut_err(){
		return this.driv_cut_err;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getPrt_ex_qunt(){
		return this.prt_ex_qunt;
	}

	public String getIncmg_pers_ipaddr(){
		return this.incmg_pers_ipaddr;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call SP_PR_PRTEXEC_1102_A( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PR_PRTEXEC_1102_ADM dm = (PR_PRTEXEC_1102_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.gubun);
		cstmt.setString(6, dm.prt_dt);
		cstmt.setString(7, dm.fac_clsf);
		cstmt.setString(8, dm.medi_cd);
		cstmt.setString(9, dm.medi_nm);
		cstmt.setString(10, dm.sect_cd);
		cstmt.setString(11, dm.ecnt);
		cstmt.setString(12, dm.seq);
		cstmt.setString(13, dm.clr_off_plat_tm);
		cstmt.setString(14, dm.off_plat_tm);
		cstmt.setString(15, dm.trsm_end_tm);
		cstmt.setString(16, dm.prt_bgn_tm);
		cstmt.setString(17, dm.prt_end_tm);
		cstmt.setString(18, dm.slip_qty);
		cstmt.setString(19, dm.real_prt_qty);
		cstmt.setString(20, dm.bad_nwsp_qty);
		cstmt.setString(21, dm.card_qty);
		cstmt.setString(22, dm.dqty);
		cstmt.setString(23, dm.apcut_err);
		cstmt.setString(24, dm.driv_cut_err);
		cstmt.setString(25, dm.remk);
		cstmt.setString(26, dm.prt_ex_qunt);
		cstmt.setString(27, dm.incmg_pers_ipaddr);
		cstmt.setString(28, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pr.prtexec.ds.PR_PRTEXEC_1102_ADataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("mode = " + getMode());
        System.out.println("gubun = " + getGubun());
        System.out.println("prt_dt = " + getPrt_dt());
        System.out.println("fac_clsf = " + getFac_clsf());
        System.out.println("medi_cd = " + getMedi_cd());
        System.out.println("medi_nm = " + getMedi_nm());
        System.out.println("sect_cd = " + getSect_cd());
        System.out.println("ecnt = " + getEcnt());
        System.out.println("seq = " + getSeq());
        System.out.println("clr_off_plat_tm = " + getClr_off_plat_tm());
        System.out.println("off_plat_tm = " + getOff_plat_tm());
        System.out.println("trsm_end_tm = " + getTrsm_end_tm());
        System.out.println("prt_bgn_tm = " + getPrt_bgn_tm());
        System.out.println("prt_end_tm = " + getPrt_end_tm());
        System.out.println("slip_qty = " + getSlip_qty());
        System.out.println("real_prt_qty = " + getReal_prt_qty());
        System.out.println("bad_nwsp_qty = " + getBad_nwsp_qty());
        System.out.println("card_qty = " + getCard_qty());
        System.out.println("dqty = " + getDqty());
        System.out.println("apcut_err = " + getApcut_err());
        System.out.println("driv_cut_err = " + getDriv_cut_err());
        System.out.println("remk = " + getRemk());
        System.out.println("prt_ex_qunt = " + getPrt_ex_qunt());
        System.out.println("incmg_pers_ipaddr = " + getIncmg_pers_ipaddr());
        System.out.println("incmg_pers = " + getIncmg_pers());
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
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String gubun = req.getParameter("gubun");
if( gubun == null){
	System.out.println(this.toString+" : gubun is null" );
}else{
	System.out.println(this.toString+" : gubun is "+gubun );
}
String prt_dt = req.getParameter("prt_dt");
if( prt_dt == null){
	System.out.println(this.toString+" : prt_dt is null" );
}else{
	System.out.println(this.toString+" : prt_dt is "+prt_dt );
}
String fac_clsf = req.getParameter("fac_clsf");
if( fac_clsf == null){
	System.out.println(this.toString+" : fac_clsf is null" );
}else{
	System.out.println(this.toString+" : fac_clsf is "+fac_clsf );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String medi_nm = req.getParameter("medi_nm");
if( medi_nm == null){
	System.out.println(this.toString+" : medi_nm is null" );
}else{
	System.out.println(this.toString+" : medi_nm is "+medi_nm );
}
String sect_cd = req.getParameter("sect_cd");
if( sect_cd == null){
	System.out.println(this.toString+" : sect_cd is null" );
}else{
	System.out.println(this.toString+" : sect_cd is "+sect_cd );
}
String ecnt = req.getParameter("ecnt");
if( ecnt == null){
	System.out.println(this.toString+" : ecnt is null" );
}else{
	System.out.println(this.toString+" : ecnt is "+ecnt );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String clr_off_plat_tm = req.getParameter("clr_off_plat_tm");
if( clr_off_plat_tm == null){
	System.out.println(this.toString+" : clr_off_plat_tm is null" );
}else{
	System.out.println(this.toString+" : clr_off_plat_tm is "+clr_off_plat_tm );
}
String off_plat_tm = req.getParameter("off_plat_tm");
if( off_plat_tm == null){
	System.out.println(this.toString+" : off_plat_tm is null" );
}else{
	System.out.println(this.toString+" : off_plat_tm is "+off_plat_tm );
}
String trsm_end_tm = req.getParameter("trsm_end_tm");
if( trsm_end_tm == null){
	System.out.println(this.toString+" : trsm_end_tm is null" );
}else{
	System.out.println(this.toString+" : trsm_end_tm is "+trsm_end_tm );
}
String prt_bgn_tm = req.getParameter("prt_bgn_tm");
if( prt_bgn_tm == null){
	System.out.println(this.toString+" : prt_bgn_tm is null" );
}else{
	System.out.println(this.toString+" : prt_bgn_tm is "+prt_bgn_tm );
}
String prt_end_tm = req.getParameter("prt_end_tm");
if( prt_end_tm == null){
	System.out.println(this.toString+" : prt_end_tm is null" );
}else{
	System.out.println(this.toString+" : prt_end_tm is "+prt_end_tm );
}
String slip_qty = req.getParameter("slip_qty");
if( slip_qty == null){
	System.out.println(this.toString+" : slip_qty is null" );
}else{
	System.out.println(this.toString+" : slip_qty is "+slip_qty );
}
String real_prt_qty = req.getParameter("real_prt_qty");
if( real_prt_qty == null){
	System.out.println(this.toString+" : real_prt_qty is null" );
}else{
	System.out.println(this.toString+" : real_prt_qty is "+real_prt_qty );
}
String bad_nwsp_qty = req.getParameter("bad_nwsp_qty");
if( bad_nwsp_qty == null){
	System.out.println(this.toString+" : bad_nwsp_qty is null" );
}else{
	System.out.println(this.toString+" : bad_nwsp_qty is "+bad_nwsp_qty );
}
String card_qty = req.getParameter("card_qty");
if( card_qty == null){
	System.out.println(this.toString+" : card_qty is null" );
}else{
	System.out.println(this.toString+" : card_qty is "+card_qty );
}
String dqty = req.getParameter("dqty");
if( dqty == null){
	System.out.println(this.toString+" : dqty is null" );
}else{
	System.out.println(this.toString+" : dqty is "+dqty );
}
String apcut_err = req.getParameter("apcut_err");
if( apcut_err == null){
	System.out.println(this.toString+" : apcut_err is null" );
}else{
	System.out.println(this.toString+" : apcut_err is "+apcut_err );
}
String driv_cut_err = req.getParameter("driv_cut_err");
if( driv_cut_err == null){
	System.out.println(this.toString+" : driv_cut_err is null" );
}else{
	System.out.println(this.toString+" : driv_cut_err is "+driv_cut_err );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String prt_ex_qunt = req.getParameter("prt_ex_qunt");
if( prt_ex_qunt == null){
	System.out.println(this.toString+" : prt_ex_qunt is null" );
}else{
	System.out.println(this.toString+" : prt_ex_qunt is "+prt_ex_qunt );
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

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String mode = Util.checkString(req.getParameter("mode"));
String gubun = Util.checkString(req.getParameter("gubun"));
String prt_dt = Util.checkString(req.getParameter("prt_dt"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String medi_nm = Util.checkString(req.getParameter("medi_nm"));
String sect_cd = Util.checkString(req.getParameter("sect_cd"));
String ecnt = Util.checkString(req.getParameter("ecnt"));
String seq = Util.checkString(req.getParameter("seq"));
String clr_off_plat_tm = Util.checkString(req.getParameter("clr_off_plat_tm"));
String off_plat_tm = Util.checkString(req.getParameter("off_plat_tm"));
String trsm_end_tm = Util.checkString(req.getParameter("trsm_end_tm"));
String prt_bgn_tm = Util.checkString(req.getParameter("prt_bgn_tm"));
String prt_end_tm = Util.checkString(req.getParameter("prt_end_tm"));
String slip_qty = Util.checkString(req.getParameter("slip_qty"));
String real_prt_qty = Util.checkString(req.getParameter("real_prt_qty"));
String bad_nwsp_qty = Util.checkString(req.getParameter("bad_nwsp_qty"));
String card_qty = Util.checkString(req.getParameter("card_qty"));
String dqty = Util.checkString(req.getParameter("dqty"));
String apcut_err = Util.checkString(req.getParameter("apcut_err"));
String driv_cut_err = Util.checkString(req.getParameter("driv_cut_err"));
String remk = Util.checkString(req.getParameter("remk"));
String prt_ex_qunt = Util.checkString(req.getParameter("prt_ex_qunt"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
String prt_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_dt")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String medi_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_nm")));
String sect_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_cd")));
String ecnt = Util.Uni2Ksc(Util.checkString(req.getParameter("ecnt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String clr_off_plat_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("clr_off_plat_tm")));
String off_plat_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("off_plat_tm")));
String trsm_end_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("trsm_end_tm")));
String prt_bgn_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_bgn_tm")));
String prt_end_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_end_tm")));
String slip_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_qty")));
String real_prt_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("real_prt_qty")));
String bad_nwsp_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("bad_nwsp_qty")));
String card_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("card_qty")));
String dqty = Util.Uni2Ksc(Util.checkString(req.getParameter("dqty")));
String apcut_err = Util.Uni2Ksc(Util.checkString(req.getParameter("apcut_err")));
String driv_cut_err = Util.Uni2Ksc(Util.checkString(req.getParameter("driv_cut_err")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String prt_ex_qunt = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_ex_qunt")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setGubun(gubun);
dm.setPrt_dt(prt_dt);
dm.setFac_clsf(fac_clsf);
dm.setMedi_cd(medi_cd);
dm.setMedi_nm(medi_nm);
dm.setSect_cd(sect_cd);
dm.setEcnt(ecnt);
dm.setSeq(seq);
dm.setClr_off_plat_tm(clr_off_plat_tm);
dm.setOff_plat_tm(off_plat_tm);
dm.setTrsm_end_tm(trsm_end_tm);
dm.setPrt_bgn_tm(prt_bgn_tm);
dm.setPrt_end_tm(prt_end_tm);
dm.setSlip_qty(slip_qty);
dm.setReal_prt_qty(real_prt_qty);
dm.setBad_nwsp_qty(bad_nwsp_qty);
dm.setCard_qty(card_qty);
dm.setDqty(dqty);
dm.setApcut_err(apcut_err);
dm.setDriv_cut_err(driv_cut_err);
dm.setRemk(remk);
dm.setPrt_ex_qunt(prt_ex_qunt);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 17 20:01:36 KST 2009 */