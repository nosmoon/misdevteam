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


public class PR_PRTEXEC_1302_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String gubun;
	public String occr_dt;
	public String seq;
	public String aply_dt;
	public String fac_clsf;
	public String medi_cd;
	public String sect_cd;
	public String ecnt;
	public String issu_pcnt;
	public String clr_pcnt;
	public String off_plat_tm;
	public String clr_off_plat_tm;
	public String trsm_end_tm;
	public String prt_bgn_tm;
	public String prt_end_tm;
	public String prt_qty;
	public String incmg_pers_ipaddr;
	public String incmg_pers;

	public PR_PRTEXEC_1302_ADM(){}
	public PR_PRTEXEC_1302_ADM(String cmpy_cd, String gubun, String occr_dt, String seq, String aply_dt, String fac_clsf, String medi_cd, String sect_cd, String ecnt, String issu_pcnt, String clr_pcnt, String off_plat_tm, String clr_off_plat_tm, String trsm_end_tm, String prt_bgn_tm, String prt_end_tm, String prt_qty, String incmg_pers_ipaddr, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.gubun = gubun;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.aply_dt = aply_dt;
		this.fac_clsf = fac_clsf;
		this.medi_cd = medi_cd;
		this.sect_cd = sect_cd;
		this.ecnt = ecnt;
		this.issu_pcnt = issu_pcnt;
		this.clr_pcnt = clr_pcnt;
		this.off_plat_tm = off_plat_tm;
		this.clr_off_plat_tm = clr_off_plat_tm;
		this.trsm_end_tm = trsm_end_tm;
		this.prt_bgn_tm = prt_bgn_tm;
		this.prt_end_tm = prt_end_tm;
		this.prt_qty = prt_qty;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setAply_dt(String aply_dt){
		this.aply_dt = aply_dt;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setEcnt(String ecnt){
		this.ecnt = ecnt;
	}

	public void setIssu_pcnt(String issu_pcnt){
		this.issu_pcnt = issu_pcnt;
	}

	public void setClr_pcnt(String clr_pcnt){
		this.clr_pcnt = clr_pcnt;
	}

	public void setOff_plat_tm(String off_plat_tm){
		this.off_plat_tm = off_plat_tm;
	}

	public void setClr_off_plat_tm(String clr_off_plat_tm){
		this.clr_off_plat_tm = clr_off_plat_tm;
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

	public void setPrt_qty(String prt_qty){
		this.prt_qty = prt_qty;
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

	public String getGubun(){
		return this.gubun;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getAply_dt(){
		return this.aply_dt;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getEcnt(){
		return this.ecnt;
	}

	public String getIssu_pcnt(){
		return this.issu_pcnt;
	}

	public String getClr_pcnt(){
		return this.clr_pcnt;
	}

	public String getOff_plat_tm(){
		return this.off_plat_tm;
	}

	public String getClr_off_plat_tm(){
		return this.clr_off_plat_tm;
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

	public String getPrt_qty(){
		return this.prt_qty;
	}

	public String getIncmg_pers_ipaddr(){
		return this.incmg_pers_ipaddr;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call SP_PR_PRTEXEC_1302_A( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PR_PRTEXEC_1302_ADM dm = (PR_PRTEXEC_1302_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.gubun);
		cstmt.setString(5, dm.occr_dt);
		cstmt.setString(6, dm.seq);
		cstmt.setString(7, dm.aply_dt);
		cstmt.setString(8, dm.fac_clsf);
		cstmt.setString(9, dm.medi_cd);
		cstmt.setString(10, dm.sect_cd);
		cstmt.setString(11, dm.ecnt);
		cstmt.setString(12, dm.issu_pcnt);
		cstmt.setString(13, dm.clr_pcnt);
		cstmt.setString(14, dm.off_plat_tm);
		cstmt.setString(15, dm.clr_off_plat_tm);
		cstmt.setString(16, dm.trsm_end_tm);
		cstmt.setString(17, dm.prt_bgn_tm);
		cstmt.setString(18, dm.prt_end_tm);
		cstmt.setString(19, dm.prt_qty);
		cstmt.setString(20, dm.incmg_pers_ipaddr);
		cstmt.setString(21, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pr.prtexec.ds.PR_PRTEXEC_1302_ADataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("gubun = " + getGubun());
        System.out.println("occr_dt = " + getOccr_dt());
        System.out.println("seq = " + getSeq());
        System.out.println("aply_dt = " + getAply_dt());
        System.out.println("fac_clsf = " + getFac_clsf());
        System.out.println("medi_cd = " + getMedi_cd());
        System.out.println("sect_cd = " + getSect_cd());
        System.out.println("ecnt = " + getEcnt());
        System.out.println("issu_pcnt = " + getIssu_pcnt());
        System.out.println("clr_pcnt = " + getClr_pcnt());
        System.out.println("off_plat_tm = " + getOff_plat_tm());
        System.out.println("clr_off_plat_tm = " + getClr_off_plat_tm());
        System.out.println("trsm_end_tm = " + getTrsm_end_tm());
        System.out.println("prt_bgn_tm = " + getPrt_bgn_tm());
        System.out.println("prt_end_tm = " + getPrt_end_tm());
        System.out.println("prt_qty = " + getPrt_qty());
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
String gubun = req.getParameter("gubun");
if( gubun == null){
	System.out.println(this.toString+" : gubun is null" );
}else{
	System.out.println(this.toString+" : gubun is "+gubun );
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
String aply_dt = req.getParameter("aply_dt");
if( aply_dt == null){
	System.out.println(this.toString+" : aply_dt is null" );
}else{
	System.out.println(this.toString+" : aply_dt is "+aply_dt );
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
String off_plat_tm = req.getParameter("off_plat_tm");
if( off_plat_tm == null){
	System.out.println(this.toString+" : off_plat_tm is null" );
}else{
	System.out.println(this.toString+" : off_plat_tm is "+off_plat_tm );
}
String clr_off_plat_tm = req.getParameter("clr_off_plat_tm");
if( clr_off_plat_tm == null){
	System.out.println(this.toString+" : clr_off_plat_tm is null" );
}else{
	System.out.println(this.toString+" : clr_off_plat_tm is "+clr_off_plat_tm );
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
String prt_qty = req.getParameter("prt_qty");
if( prt_qty == null){
	System.out.println(this.toString+" : prt_qty is null" );
}else{
	System.out.println(this.toString+" : prt_qty is "+prt_qty );
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
String gubun = Util.checkString(req.getParameter("gubun"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String aply_dt = Util.checkString(req.getParameter("aply_dt"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String sect_cd = Util.checkString(req.getParameter("sect_cd"));
String ecnt = Util.checkString(req.getParameter("ecnt"));
String issu_pcnt = Util.checkString(req.getParameter("issu_pcnt"));
String clr_pcnt = Util.checkString(req.getParameter("clr_pcnt"));
String off_plat_tm = Util.checkString(req.getParameter("off_plat_tm"));
String clr_off_plat_tm = Util.checkString(req.getParameter("clr_off_plat_tm"));
String trsm_end_tm = Util.checkString(req.getParameter("trsm_end_tm"));
String prt_bgn_tm = Util.checkString(req.getParameter("prt_bgn_tm"));
String prt_end_tm = Util.checkString(req.getParameter("prt_end_tm"));
String prt_qty = Util.checkString(req.getParameter("prt_qty"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String aply_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_dt")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String sect_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_cd")));
String ecnt = Util.Uni2Ksc(Util.checkString(req.getParameter("ecnt")));
String issu_pcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_pcnt")));
String clr_pcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("clr_pcnt")));
String off_plat_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("off_plat_tm")));
String clr_off_plat_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("clr_off_plat_tm")));
String trsm_end_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("trsm_end_tm")));
String prt_bgn_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_bgn_tm")));
String prt_end_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_end_tm")));
String prt_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_qty")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setGubun(gubun);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setAply_dt(aply_dt);
dm.setFac_clsf(fac_clsf);
dm.setMedi_cd(medi_cd);
dm.setSect_cd(sect_cd);
dm.setEcnt(ecnt);
dm.setIssu_pcnt(issu_pcnt);
dm.setClr_pcnt(clr_pcnt);
dm.setOff_plat_tm(off_plat_tm);
dm.setClr_off_plat_tm(clr_off_plat_tm);
dm.setTrsm_end_tm(trsm_end_tm);
dm.setPrt_bgn_tm(prt_bgn_tm);
dm.setPrt_end_tm(prt_end_tm);
dm.setPrt_qty(prt_qty);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 21 18:42:23 KST 2009 */