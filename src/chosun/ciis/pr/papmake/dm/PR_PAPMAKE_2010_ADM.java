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


public class PR_PAPMAKE_2010_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String gubun;
	public String cmpy_cd;
	public String yymm;
	public String fac_clsf;
	public String dept_clsf;
	public String mang_nops;
	public String prt_nops;
	public String prt_board_nops;
	public String repa_nops;
	public String nwsp_high_nops;
	public String send_nops;
	public String cmpos_nops;
	public String mony_trad_nops;
	public String edt_side_nops;
	public String advt_incmg_nops;
	public String ofcr_nops;
	public String gen_affr_nops;
	public String remk;
	public String seq;
	public String ref_matt;
	public String incmg_pers_ipaddr;
	public String incmg_pers;
	public String incmg_dt_tm;
	public String chg_pers;
	public String chg_dt_tm;

	public PR_PAPMAKE_2010_ADM(){}
	public PR_PAPMAKE_2010_ADM(String gubun, String cmpy_cd, String yymm, String fac_clsf, String dept_clsf, String mang_nops, String prt_nops, String prt_board_nops, String repa_nops, String nwsp_high_nops, String send_nops, String cmpos_nops, String mony_trad_nops, String edt_side_nops, String advt_incmg_nops, String ofcr_nops, String gen_affr_nops, String remk, String seq, String ref_matt, String incmg_pers_ipaddr, String incmg_pers, String incmg_dt_tm, String chg_pers, String chg_dt_tm){
		this.gubun = gubun;
		this.cmpy_cd = cmpy_cd;
		this.yymm = yymm;
		this.fac_clsf = fac_clsf;
		this.dept_clsf = dept_clsf;
		this.mang_nops = mang_nops;
		this.prt_nops = prt_nops;
		this.prt_board_nops = prt_board_nops;
		this.repa_nops = repa_nops;
		this.nwsp_high_nops = nwsp_high_nops;
		this.send_nops = send_nops;
		this.cmpos_nops = cmpos_nops;
		this.mony_trad_nops = mony_trad_nops;
		this.edt_side_nops = edt_side_nops;
		this.advt_incmg_nops = advt_incmg_nops;
		this.ofcr_nops = ofcr_nops;
		this.gen_affr_nops = gen_affr_nops;
		this.remk = remk;
		this.seq = seq;
		this.ref_matt = ref_matt;
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

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setDept_clsf(String dept_clsf){
		this.dept_clsf = dept_clsf;
	}

	public void setMang_nops(String mang_nops){
		this.mang_nops = mang_nops;
	}

	public void setPrt_nops(String prt_nops){
		this.prt_nops = prt_nops;
	}

	public void setPrt_board_nops(String prt_board_nops){
		this.prt_board_nops = prt_board_nops;
	}

	public void setRepa_nops(String repa_nops){
		this.repa_nops = repa_nops;
	}

	public void setNwsp_high_nops(String nwsp_high_nops){
		this.nwsp_high_nops = nwsp_high_nops;
	}

	public void setSend_nops(String send_nops){
		this.send_nops = send_nops;
	}

	public void setCmpos_nops(String cmpos_nops){
		this.cmpos_nops = cmpos_nops;
	}

	public void setMony_trad_nops(String mony_trad_nops){
		this.mony_trad_nops = mony_trad_nops;
	}

	public void setEdt_side_nops(String edt_side_nops){
		this.edt_side_nops = edt_side_nops;
	}

	public void setAdvt_incmg_nops(String advt_incmg_nops){
		this.advt_incmg_nops = advt_incmg_nops;
	}

	public void setOfcr_nops(String ofcr_nops){
		this.ofcr_nops = ofcr_nops;
	}

	public void setGen_affr_nops(String gen_affr_nops){
		this.gen_affr_nops = gen_affr_nops;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setRef_matt(String ref_matt){
		this.ref_matt = ref_matt;
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

	public String getYymm(){
		return this.yymm;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getDept_clsf(){
		return this.dept_clsf;
	}

	public String getMang_nops(){
		return this.mang_nops;
	}

	public String getPrt_nops(){
		return this.prt_nops;
	}

	public String getPrt_board_nops(){
		return this.prt_board_nops;
	}

	public String getRepa_nops(){
		return this.repa_nops;
	}

	public String getNwsp_high_nops(){
		return this.nwsp_high_nops;
	}

	public String getSend_nops(){
		return this.send_nops;
	}

	public String getCmpos_nops(){
		return this.cmpos_nops;
	}

	public String getMony_trad_nops(){
		return this.mony_trad_nops;
	}

	public String getEdt_side_nops(){
		return this.edt_side_nops;
	}

	public String getAdvt_incmg_nops(){
		return this.advt_incmg_nops;
	}

	public String getOfcr_nops(){
		return this.ofcr_nops;
	}

	public String getGen_affr_nops(){
		return this.gen_affr_nops;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getRef_matt(){
		return this.ref_matt;
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
		 return "{ call MISMAT.SP_PR_PAPMAKE_2010_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PR_PAPMAKE_2010_ADM dm = (PR_PAPMAKE_2010_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.gubun);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.yymm);
		cstmt.setString(6, dm.fac_clsf);
		cstmt.setString(7, dm.dept_clsf);
		cstmt.setString(8, dm.mang_nops);
		cstmt.setString(9, dm.prt_nops);
		cstmt.setString(10, dm.prt_board_nops);
		cstmt.setString(11, dm.repa_nops);
		cstmt.setString(12, dm.nwsp_high_nops);
		cstmt.setString(13, dm.send_nops);
		cstmt.setString(14, dm.cmpos_nops);
		cstmt.setString(15, dm.mony_trad_nops);
		cstmt.setString(16, dm.edt_side_nops);
		cstmt.setString(17, dm.advt_incmg_nops);
		cstmt.setString(18, dm.ofcr_nops);
		cstmt.setString(19, dm.gen_affr_nops);
		cstmt.setString(20, dm.remk);
		cstmt.setString(21, dm.seq);
		cstmt.setString(22, dm.ref_matt);
		cstmt.setString(23, dm.incmg_pers_ipaddr);
		cstmt.setString(24, dm.incmg_pers);
		cstmt.setString(25, dm.incmg_dt_tm);
		cstmt.setString(26, dm.chg_pers);
		cstmt.setString(27, dm.chg_dt_tm);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pr.papmake.ds.PR_PAPMAKE_2010_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("gubun = [" + getGubun() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("yymm = [" + getYymm() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
		System.out.println("dept_clsf = [" + getDept_clsf() + "]");
		System.out.println("mang_nops = [" + getMang_nops() + "]");
		System.out.println("prt_nops = [" + getPrt_nops() + "]");
		System.out.println("prt_board_nops = [" + getPrt_board_nops() + "]");
		System.out.println("repa_nops = [" + getRepa_nops() + "]");
		System.out.println("nwsp_high_nops = [" + getNwsp_high_nops() + "]");
		System.out.println("send_nops = [" + getSend_nops() + "]");
		System.out.println("cmpos_nops = [" + getCmpos_nops() + "]");
		System.out.println("mony_trad_nops = [" + getMony_trad_nops() + "]");
		System.out.println("edt_side_nops = [" + getEdt_side_nops() + "]");
		System.out.println("advt_incmg_nops = [" + getAdvt_incmg_nops() + "]");
		System.out.println("ofcr_nops = [" + getOfcr_nops() + "]");
		System.out.println("gen_affr_nops = [" + getGen_affr_nops() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("ref_matt = [" + getRef_matt() + "]");
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
String dept_clsf = req.getParameter("dept_clsf");
if( dept_clsf == null){
	System.out.println(this.toString+" : dept_clsf is null" );
}else{
	System.out.println(this.toString+" : dept_clsf is "+dept_clsf );
}
String mang_nops = req.getParameter("mang_nops");
if( mang_nops == null){
	System.out.println(this.toString+" : mang_nops is null" );
}else{
	System.out.println(this.toString+" : mang_nops is "+mang_nops );
}
String prt_nops = req.getParameter("prt_nops");
if( prt_nops == null){
	System.out.println(this.toString+" : prt_nops is null" );
}else{
	System.out.println(this.toString+" : prt_nops is "+prt_nops );
}
String prt_board_nops = req.getParameter("prt_board_nops");
if( prt_board_nops == null){
	System.out.println(this.toString+" : prt_board_nops is null" );
}else{
	System.out.println(this.toString+" : prt_board_nops is "+prt_board_nops );
}
String repa_nops = req.getParameter("repa_nops");
if( repa_nops == null){
	System.out.println(this.toString+" : repa_nops is null" );
}else{
	System.out.println(this.toString+" : repa_nops is "+repa_nops );
}
String nwsp_high_nops = req.getParameter("nwsp_high_nops");
if( nwsp_high_nops == null){
	System.out.println(this.toString+" : nwsp_high_nops is null" );
}else{
	System.out.println(this.toString+" : nwsp_high_nops is "+nwsp_high_nops );
}
String send_nops = req.getParameter("send_nops");
if( send_nops == null){
	System.out.println(this.toString+" : send_nops is null" );
}else{
	System.out.println(this.toString+" : send_nops is "+send_nops );
}
String cmpos_nops = req.getParameter("cmpos_nops");
if( cmpos_nops == null){
	System.out.println(this.toString+" : cmpos_nops is null" );
}else{
	System.out.println(this.toString+" : cmpos_nops is "+cmpos_nops );
}
String mony_trad_nops = req.getParameter("mony_trad_nops");
if( mony_trad_nops == null){
	System.out.println(this.toString+" : mony_trad_nops is null" );
}else{
	System.out.println(this.toString+" : mony_trad_nops is "+mony_trad_nops );
}
String edt_side_nops = req.getParameter("edt_side_nops");
if( edt_side_nops == null){
	System.out.println(this.toString+" : edt_side_nops is null" );
}else{
	System.out.println(this.toString+" : edt_side_nops is "+edt_side_nops );
}
String advt_incmg_nops = req.getParameter("advt_incmg_nops");
if( advt_incmg_nops == null){
	System.out.println(this.toString+" : advt_incmg_nops is null" );
}else{
	System.out.println(this.toString+" : advt_incmg_nops is "+advt_incmg_nops );
}
String ofcr_nops = req.getParameter("ofcr_nops");
if( ofcr_nops == null){
	System.out.println(this.toString+" : ofcr_nops is null" );
}else{
	System.out.println(this.toString+" : ofcr_nops is "+ofcr_nops );
}
String gen_affr_nops = req.getParameter("gen_affr_nops");
if( gen_affr_nops == null){
	System.out.println(this.toString+" : gen_affr_nops is null" );
}else{
	System.out.println(this.toString+" : gen_affr_nops is "+gen_affr_nops );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String ref_matt = req.getParameter("ref_matt");
if( ref_matt == null){
	System.out.println(this.toString+" : ref_matt is null" );
}else{
	System.out.println(this.toString+" : ref_matt is "+ref_matt );
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
String yymm = Util.checkString(req.getParameter("yymm"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String dept_clsf = Util.checkString(req.getParameter("dept_clsf"));
String mang_nops = Util.checkString(req.getParameter("mang_nops"));
String prt_nops = Util.checkString(req.getParameter("prt_nops"));
String prt_board_nops = Util.checkString(req.getParameter("prt_board_nops"));
String repa_nops = Util.checkString(req.getParameter("repa_nops"));
String nwsp_high_nops = Util.checkString(req.getParameter("nwsp_high_nops"));
String send_nops = Util.checkString(req.getParameter("send_nops"));
String cmpos_nops = Util.checkString(req.getParameter("cmpos_nops"));
String mony_trad_nops = Util.checkString(req.getParameter("mony_trad_nops"));
String edt_side_nops = Util.checkString(req.getParameter("edt_side_nops"));
String advt_incmg_nops = Util.checkString(req.getParameter("advt_incmg_nops"));
String ofcr_nops = Util.checkString(req.getParameter("ofcr_nops"));
String gen_affr_nops = Util.checkString(req.getParameter("gen_affr_nops"));
String remk = Util.checkString(req.getParameter("remk"));
String seq = Util.checkString(req.getParameter("seq"));
String ref_matt = Util.checkString(req.getParameter("ref_matt"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_dt_tm = Util.checkString(req.getParameter("incmg_dt_tm"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
String chg_dt_tm = Util.checkString(req.getParameter("chg_dt_tm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String dept_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_clsf")));
String mang_nops = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_nops")));
String prt_nops = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_nops")));
String prt_board_nops = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_board_nops")));
String repa_nops = Util.Uni2Ksc(Util.checkString(req.getParameter("repa_nops")));
String nwsp_high_nops = Util.Uni2Ksc(Util.checkString(req.getParameter("nwsp_high_nops")));
String send_nops = Util.Uni2Ksc(Util.checkString(req.getParameter("send_nops")));
String cmpos_nops = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpos_nops")));
String mony_trad_nops = Util.Uni2Ksc(Util.checkString(req.getParameter("mony_trad_nops")));
String edt_side_nops = Util.Uni2Ksc(Util.checkString(req.getParameter("edt_side_nops")));
String advt_incmg_nops = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_incmg_nops")));
String ofcr_nops = Util.Uni2Ksc(Util.checkString(req.getParameter("ofcr_nops")));
String gen_affr_nops = Util.Uni2Ksc(Util.checkString(req.getParameter("gen_affr_nops")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String ref_matt = Util.Uni2Ksc(Util.checkString(req.getParameter("ref_matt")));
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
dm.setYymm(yymm);
dm.setFac_clsf(fac_clsf);
dm.setDept_clsf(dept_clsf);
dm.setMang_nops(mang_nops);
dm.setPrt_nops(prt_nops);
dm.setPrt_board_nops(prt_board_nops);
dm.setRepa_nops(repa_nops);
dm.setNwsp_high_nops(nwsp_high_nops);
dm.setSend_nops(send_nops);
dm.setCmpos_nops(cmpos_nops);
dm.setMony_trad_nops(mony_trad_nops);
dm.setEdt_side_nops(edt_side_nops);
dm.setAdvt_incmg_nops(advt_incmg_nops);
dm.setOfcr_nops(ofcr_nops);
dm.setGen_affr_nops(gen_affr_nops);
dm.setRemk(remk);
dm.setSeq(seq);
dm.setRef_matt(ref_matt);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_dt_tm(incmg_dt_tm);
dm.setChg_pers(chg_pers);
dm.setChg_dt_tm(chg_dt_tm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 14 09:36:17 KST 2009 */