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


public class PR_PAPMAKE_1004_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String issu_dt;
	public String fac_clsf;
	public String medi_cd;
	public String seq;
	public String medi_nm;
	public String ecnt;
	public String ledt_nm;
	public String last_side;
	public String rmsg_tm;
	public String prt_bgn_tm;
	public String prt_end_tm;
	public String prt_qty;
	public String out_gate;
	public String apcut_err;
	public String runcut_err;
	public String remk;
	public String duty_dt;
	public String seq2;
	public String medi_cd_2;
	public String pcnt;
	public String clr_pcnt;
	public String pj_qty;
	public String remk_2;
	public String seq3;
	public String medi_cd_3;
	public String incmg_pers_ipaddr;
	public String incmg_pers;

	public PR_PAPMAKE_1004_ADM(){}
	public PR_PAPMAKE_1004_ADM(String cmpy_cd, String issu_dt, String fac_clsf, String medi_cd, String seq, String medi_nm, String ecnt, String ledt_nm, String last_side, String rmsg_tm, String prt_bgn_tm, String prt_end_tm, String prt_qty, String out_gate, String apcut_err, String runcut_err, String remk, String duty_dt, String seq2, String medi_cd_2, String pcnt, String clr_pcnt, String pj_qty, String remk_2, String seq3, String medi_cd_3, String incmg_pers_ipaddr, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.issu_dt = issu_dt;
		this.fac_clsf = fac_clsf;
		this.medi_cd = medi_cd;
		this.seq = seq;
		this.medi_nm = medi_nm;
		this.ecnt = ecnt;
		this.ledt_nm = ledt_nm;
		this.last_side = last_side;
		this.rmsg_tm = rmsg_tm;
		this.prt_bgn_tm = prt_bgn_tm;
		this.prt_end_tm = prt_end_tm;
		this.prt_qty = prt_qty;
		this.out_gate = out_gate;
		this.apcut_err = apcut_err;
		this.runcut_err = runcut_err;
		this.remk = remk;
		this.duty_dt = duty_dt;
		this.seq2 = seq2;
		this.medi_cd_2 = medi_cd_2;
		this.pcnt = pcnt;
		this.clr_pcnt = clr_pcnt;
		this.pj_qty = pj_qty;
		this.remk_2 = remk_2;
		this.seq3 = seq3;
		this.medi_cd_3 = medi_cd_3;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setEcnt(String ecnt){
		this.ecnt = ecnt;
	}

	public void setLedt_nm(String ledt_nm){
		this.ledt_nm = ledt_nm;
	}

	public void setLast_side(String last_side){
		this.last_side = last_side;
	}

	public void setRmsg_tm(String rmsg_tm){
		this.rmsg_tm = rmsg_tm;
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

	public void setOut_gate(String out_gate){
		this.out_gate = out_gate;
	}

	public void setApcut_err(String apcut_err){
		this.apcut_err = apcut_err;
	}

	public void setRuncut_err(String runcut_err){
		this.runcut_err = runcut_err;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setDuty_dt(String duty_dt){
		this.duty_dt = duty_dt;
	}

	public void setSeq2(String seq2){
		this.seq2 = seq2;
	}

	public void setMedi_cd_2(String medi_cd_2){
		this.medi_cd_2 = medi_cd_2;
	}

	public void setPcnt(String pcnt){
		this.pcnt = pcnt;
	}

	public void setClr_pcnt(String clr_pcnt){
		this.clr_pcnt = clr_pcnt;
	}

	public void setPj_qty(String pj_qty){
		this.pj_qty = pj_qty;
	}

	public void setRemk_2(String remk_2){
		this.remk_2 = remk_2;
	}

	public void setSeq3(String seq3){
		this.seq3 = seq3;
	}

	public void setMedi_cd_3(String medi_cd_3){
		this.medi_cd_3 = medi_cd_3;
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

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getEcnt(){
		return this.ecnt;
	}

	public String getLedt_nm(){
		return this.ledt_nm;
	}

	public String getLast_side(){
		return this.last_side;
	}

	public String getRmsg_tm(){
		return this.rmsg_tm;
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

	public String getOut_gate(){
		return this.out_gate;
	}

	public String getApcut_err(){
		return this.apcut_err;
	}

	public String getRuncut_err(){
		return this.runcut_err;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getDuty_dt(){
		return this.duty_dt;
	}

	public String getSeq2(){
		return this.seq2;
	}

	public String getMedi_cd_2(){
		return this.medi_cd_2;
	}

	public String getPcnt(){
		return this.pcnt;
	}

	public String getClr_pcnt(){
		return this.clr_pcnt;
	}

	public String getPj_qty(){
		return this.pj_qty;
	}

	public String getRemk_2(){
		return this.remk_2;
	}

	public String getSeq3(){
		return this.seq3;
	}

	public String getMedi_cd_3(){
		return this.medi_cd_3;
	}

	public String getIncmg_pers_ipaddr(){
		return this.incmg_pers_ipaddr;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_PR_PAPMAKE_1004_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PR_PAPMAKE_1004_ADM dm = (PR_PAPMAKE_1004_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.issu_dt);
		cstmt.setString(5, dm.fac_clsf);
		cstmt.setString(6, dm.medi_cd);
		cstmt.setString(7, dm.seq);
		cstmt.setString(8, dm.medi_nm);
		cstmt.setString(9, dm.ecnt);
		cstmt.setString(10, dm.ledt_nm);
		cstmt.setString(11, dm.last_side);
		cstmt.setString(12, dm.rmsg_tm);
		cstmt.setString(13, dm.prt_bgn_tm);
		cstmt.setString(14, dm.prt_end_tm);
		cstmt.setString(15, dm.prt_qty);
		cstmt.setString(16, dm.out_gate);
		cstmt.setString(17, dm.apcut_err);
		cstmt.setString(18, dm.runcut_err);
		cstmt.setString(19, dm.remk);
		cstmt.setString(20, dm.duty_dt);
		cstmt.setString(21, dm.seq2);
		cstmt.setString(22, dm.medi_cd_2);
		cstmt.setString(23, dm.pcnt);
		cstmt.setString(24, dm.clr_pcnt);
		cstmt.setString(25, dm.pj_qty);
		cstmt.setString(26, dm.remk_2);
		cstmt.setString(27, dm.seq3);
		cstmt.setString(28, dm.medi_cd_3);
		cstmt.setString(29, dm.incmg_pers_ipaddr);
		cstmt.setString(30, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pr.papmake.ds.PR_PAPMAKE_1004_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("issu_dt = [" + getIssu_dt() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("medi_nm = [" + getMedi_nm() + "]");
		System.out.println("ecnt = [" + getEcnt() + "]");
		System.out.println("ledt_nm = [" + getLedt_nm() + "]");
		System.out.println("last_side = [" + getLast_side() + "]");
		System.out.println("rmsg_tm = [" + getRmsg_tm() + "]");
		System.out.println("prt_bgn_tm = [" + getPrt_bgn_tm() + "]");
		System.out.println("prt_end_tm = [" + getPrt_end_tm() + "]");
		System.out.println("prt_qty = [" + getPrt_qty() + "]");
		System.out.println("out_gate = [" + getOut_gate() + "]");
		System.out.println("apcut_err = [" + getApcut_err() + "]");
		System.out.println("runcut_err = [" + getRuncut_err() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("duty_dt = [" + getDuty_dt() + "]");
		System.out.println("seq2 = [" + getSeq2() + "]");
		System.out.println("medi_cd_2 = [" + getMedi_cd_2() + "]");
		System.out.println("pcnt = [" + getPcnt() + "]");
		System.out.println("clr_pcnt = [" + getClr_pcnt() + "]");
		System.out.println("pj_qty = [" + getPj_qty() + "]");
		System.out.println("remk_2 = [" + getRemk_2() + "]");
		System.out.println("seq3 = [" + getSeq3() + "]");
		System.out.println("medi_cd_3 = [" + getMedi_cd_3() + "]");
		System.out.println("incmg_pers_ipaddr = [" + getIncmg_pers_ipaddr() + "]");
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
String issu_dt = req.getParameter("issu_dt");
if( issu_dt == null){
	System.out.println(this.toString+" : issu_dt is null" );
}else{
	System.out.println(this.toString+" : issu_dt is "+issu_dt );
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
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String medi_nm = req.getParameter("medi_nm");
if( medi_nm == null){
	System.out.println(this.toString+" : medi_nm is null" );
}else{
	System.out.println(this.toString+" : medi_nm is "+medi_nm );
}
String ecnt = req.getParameter("ecnt");
if( ecnt == null){
	System.out.println(this.toString+" : ecnt is null" );
}else{
	System.out.println(this.toString+" : ecnt is "+ecnt );
}
String ledt_nm = req.getParameter("ledt_nm");
if( ledt_nm == null){
	System.out.println(this.toString+" : ledt_nm is null" );
}else{
	System.out.println(this.toString+" : ledt_nm is "+ledt_nm );
}
String last_side = req.getParameter("last_side");
if( last_side == null){
	System.out.println(this.toString+" : last_side is null" );
}else{
	System.out.println(this.toString+" : last_side is "+last_side );
}
String rmsg_tm = req.getParameter("rmsg_tm");
if( rmsg_tm == null){
	System.out.println(this.toString+" : rmsg_tm is null" );
}else{
	System.out.println(this.toString+" : rmsg_tm is "+rmsg_tm );
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
String out_gate = req.getParameter("out_gate");
if( out_gate == null){
	System.out.println(this.toString+" : out_gate is null" );
}else{
	System.out.println(this.toString+" : out_gate is "+out_gate );
}
String apcut_err = req.getParameter("apcut_err");
if( apcut_err == null){
	System.out.println(this.toString+" : apcut_err is null" );
}else{
	System.out.println(this.toString+" : apcut_err is "+apcut_err );
}
String runcut_err = req.getParameter("runcut_err");
if( runcut_err == null){
	System.out.println(this.toString+" : runcut_err is null" );
}else{
	System.out.println(this.toString+" : runcut_err is "+runcut_err );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String duty_dt = req.getParameter("duty_dt");
if( duty_dt == null){
	System.out.println(this.toString+" : duty_dt is null" );
}else{
	System.out.println(this.toString+" : duty_dt is "+duty_dt );
}
String seq2 = req.getParameter("seq2");
if( seq2 == null){
	System.out.println(this.toString+" : seq2 is null" );
}else{
	System.out.println(this.toString+" : seq2 is "+seq2 );
}
String medi_cd_2 = req.getParameter("medi_cd_2");
if( medi_cd_2 == null){
	System.out.println(this.toString+" : medi_cd_2 is null" );
}else{
	System.out.println(this.toString+" : medi_cd_2 is "+medi_cd_2 );
}
String pcnt = req.getParameter("pcnt");
if( pcnt == null){
	System.out.println(this.toString+" : pcnt is null" );
}else{
	System.out.println(this.toString+" : pcnt is "+pcnt );
}
String clr_pcnt = req.getParameter("clr_pcnt");
if( clr_pcnt == null){
	System.out.println(this.toString+" : clr_pcnt is null" );
}else{
	System.out.println(this.toString+" : clr_pcnt is "+clr_pcnt );
}
String pj_qty = req.getParameter("pj_qty");
if( pj_qty == null){
	System.out.println(this.toString+" : pj_qty is null" );
}else{
	System.out.println(this.toString+" : pj_qty is "+pj_qty );
}
String remk_2 = req.getParameter("remk_2");
if( remk_2 == null){
	System.out.println(this.toString+" : remk_2 is null" );
}else{
	System.out.println(this.toString+" : remk_2 is "+remk_2 );
}
String seq3 = req.getParameter("seq3");
if( seq3 == null){
	System.out.println(this.toString+" : seq3 is null" );
}else{
	System.out.println(this.toString+" : seq3 is "+seq3 );
}
String medi_cd_3 = req.getParameter("medi_cd_3");
if( medi_cd_3 == null){
	System.out.println(this.toString+" : medi_cd_3 is null" );
}else{
	System.out.println(this.toString+" : medi_cd_3 is "+medi_cd_3 );
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
String issu_dt = Util.checkString(req.getParameter("issu_dt"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String seq = Util.checkString(req.getParameter("seq"));
String medi_nm = Util.checkString(req.getParameter("medi_nm"));
String ecnt = Util.checkString(req.getParameter("ecnt"));
String ledt_nm = Util.checkString(req.getParameter("ledt_nm"));
String last_side = Util.checkString(req.getParameter("last_side"));
String rmsg_tm = Util.checkString(req.getParameter("rmsg_tm"));
String prt_bgn_tm = Util.checkString(req.getParameter("prt_bgn_tm"));
String prt_end_tm = Util.checkString(req.getParameter("prt_end_tm"));
String prt_qty = Util.checkString(req.getParameter("prt_qty"));
String out_gate = Util.checkString(req.getParameter("out_gate"));
String apcut_err = Util.checkString(req.getParameter("apcut_err"));
String runcut_err = Util.checkString(req.getParameter("runcut_err"));
String remk = Util.checkString(req.getParameter("remk"));
String duty_dt = Util.checkString(req.getParameter("duty_dt"));
String seq2 = Util.checkString(req.getParameter("seq2"));
String medi_cd_2 = Util.checkString(req.getParameter("medi_cd_2"));
String pcnt = Util.checkString(req.getParameter("pcnt"));
String clr_pcnt = Util.checkString(req.getParameter("clr_pcnt"));
String pj_qty = Util.checkString(req.getParameter("pj_qty"));
String remk_2 = Util.checkString(req.getParameter("remk_2"));
String seq3 = Util.checkString(req.getParameter("seq3"));
String medi_cd_3 = Util.checkString(req.getParameter("medi_cd_3"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String issu_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String medi_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_nm")));
String ecnt = Util.Uni2Ksc(Util.checkString(req.getParameter("ecnt")));
String ledt_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("ledt_nm")));
String last_side = Util.Uni2Ksc(Util.checkString(req.getParameter("last_side")));
String rmsg_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("rmsg_tm")));
String prt_bgn_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_bgn_tm")));
String prt_end_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_end_tm")));
String prt_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_qty")));
String out_gate = Util.Uni2Ksc(Util.checkString(req.getParameter("out_gate")));
String apcut_err = Util.Uni2Ksc(Util.checkString(req.getParameter("apcut_err")));
String runcut_err = Util.Uni2Ksc(Util.checkString(req.getParameter("runcut_err")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String duty_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("duty_dt")));
String seq2 = Util.Uni2Ksc(Util.checkString(req.getParameter("seq2")));
String medi_cd_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd_2")));
String pcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("pcnt")));
String clr_pcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("clr_pcnt")));
String pj_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("pj_qty")));
String remk_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("remk_2")));
String seq3 = Util.Uni2Ksc(Util.checkString(req.getParameter("seq3")));
String medi_cd_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd_3")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIssu_dt(issu_dt);
dm.setFac_clsf(fac_clsf);
dm.setMedi_cd(medi_cd);
dm.setSeq(seq);
dm.setMedi_nm(medi_nm);
dm.setEcnt(ecnt);
dm.setLedt_nm(ledt_nm);
dm.setLast_side(last_side);
dm.setRmsg_tm(rmsg_tm);
dm.setPrt_bgn_tm(prt_bgn_tm);
dm.setPrt_end_tm(prt_end_tm);
dm.setPrt_qty(prt_qty);
dm.setOut_gate(out_gate);
dm.setApcut_err(apcut_err);
dm.setRuncut_err(runcut_err);
dm.setRemk(remk);
dm.setDuty_dt(duty_dt);
dm.setSeq2(seq2);
dm.setMedi_cd_2(medi_cd_2);
dm.setPcnt(pcnt);
dm.setClr_pcnt(clr_pcnt);
dm.setPj_qty(pj_qty);
dm.setRemk_2(remk_2);
dm.setSeq3(seq3);
dm.setMedi_cd_3(medi_cd_3);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 30 09:51:39 KST 2009 */