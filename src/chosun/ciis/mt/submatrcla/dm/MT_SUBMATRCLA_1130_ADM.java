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


public class MT_SUBMATRCLA_1130_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String gubun;
	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String sub_seq;
	public String matr_cd;
	public String item_nm;
	public String std;
	public String unit;
	public String clam_qunt;
	public String fix_qunt;
	public String uprc;
	public String amt;
	public String usag;
	public String clam_clsf;
	public String paper_clsf;
	public String recp_pers;
	public String res_yn;
	public String pay_posb_dt;
	public String job_cntc_no;
	public String remk;
	public String incmg_pers_ipaddr;
	public String incmg_pers;

	public MT_SUBMATRCLA_1130_ADM(){}
	public MT_SUBMATRCLA_1130_ADM(String gubun, String cmpy_cd, String occr_dt, String seq, String sub_seq, String matr_cd, String item_nm, String std, String unit, String clam_qunt, String fix_qunt, String uprc, String amt, String usag, String clam_clsf, String paper_clsf, String recp_pers, String res_yn, String pay_posb_dt, String job_cntc_no, String remk, String incmg_pers_ipaddr, String incmg_pers){
		this.gubun = gubun;
		this.cmpy_cd = cmpy_cd;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.sub_seq = sub_seq;
		this.matr_cd = matr_cd;
		this.item_nm = item_nm;
		this.std = std;
		this.unit = unit;
		this.clam_qunt = clam_qunt;
		this.fix_qunt = fix_qunt;
		this.uprc = uprc;
		this.amt = amt;
		this.usag = usag;
		this.clam_clsf = clam_clsf;
		this.paper_clsf = paper_clsf;
		this.recp_pers = recp_pers;
		this.res_yn = res_yn;
		this.pay_posb_dt = pay_posb_dt;
		this.job_cntc_no = job_cntc_no;
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

	public void setItem_nm(String item_nm){
		this.item_nm = item_nm;
	}

	public void setStd(String std){
		this.std = std;
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

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setUsag(String usag){
		this.usag = usag;
	}

	public void setClam_clsf(String clam_clsf){
		this.clam_clsf = clam_clsf;
	}

	public void setPaper_clsf(String paper_clsf){
		this.paper_clsf = paper_clsf;
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

	public void setJob_cntc_no(String job_cntc_no){
		this.job_cntc_no = job_cntc_no;
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

	public String getItem_nm(){
		return this.item_nm;
	}

	public String getStd(){
		return this.std;
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

	public String getUprc(){
		return this.uprc;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getUsag(){
		return this.usag;
	}

	public String getClam_clsf(){
		return this.clam_clsf;
	}

	public String getPaper_clsf(){
		return this.paper_clsf;
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

	public String getJob_cntc_no(){
		return this.job_cntc_no;
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
		 return "{ call MISMAT.SP_MT_SUBMATRCLA_1130_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_SUBMATRCLA_1130_ADM dm = (MT_SUBMATRCLA_1130_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.gubun);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.occr_dt);
		cstmt.setString(6, dm.seq);
		cstmt.setString(7, dm.sub_seq);
		cstmt.setString(8, dm.matr_cd);
		cstmt.setString(9, dm.item_nm);
		cstmt.setString(10, dm.std);
		cstmt.setString(11, dm.unit);
		cstmt.setString(12, dm.clam_qunt);
		cstmt.setString(13, dm.fix_qunt);
		cstmt.setString(14, dm.uprc);
		cstmt.setString(15, dm.amt);
		cstmt.setString(16, dm.usag);
		cstmt.setString(17, dm.clam_clsf);
		cstmt.setString(18, dm.paper_clsf);
		cstmt.setString(19, dm.recp_pers);
		cstmt.setString(20, dm.res_yn);
		cstmt.setString(21, dm.pay_posb_dt);
		cstmt.setString(22, dm.job_cntc_no);
		cstmt.setString(23, dm.remk);
		cstmt.setString(24, dm.incmg_pers_ipaddr);
		cstmt.setString(25, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.submatrcla.ds.MT_SUBMATRCLA_1130_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("gubun = [" + getGubun() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("sub_seq = [" + getSub_seq() + "]");
		System.out.println("matr_cd = [" + getMatr_cd() + "]");
		System.out.println("item_nm = [" + getItem_nm() + "]");
		System.out.println("std = [" + getStd() + "]");
		System.out.println("unit = [" + getUnit() + "]");
		System.out.println("clam_qunt = [" + getClam_qunt() + "]");
		System.out.println("fix_qunt = [" + getFix_qunt() + "]");
		System.out.println("uprc = [" + getUprc() + "]");
		System.out.println("amt = [" + getAmt() + "]");
		System.out.println("usag = [" + getUsag() + "]");
		System.out.println("clam_clsf = [" + getClam_clsf() + "]");
		System.out.println("paper_clsf = [" + getPaper_clsf() + "]");
		System.out.println("recp_pers = [" + getRecp_pers() + "]");
		System.out.println("res_yn = [" + getRes_yn() + "]");
		System.out.println("pay_posb_dt = [" + getPay_posb_dt() + "]");
		System.out.println("job_cntc_no = [" + getJob_cntc_no() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("incmg_pers_ipaddr = [" + getIncmg_pers_ipaddr() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
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
String item_nm = req.getParameter("item_nm");
if( item_nm == null){
	System.out.println(this.toString+" : item_nm is null" );
}else{
	System.out.println(this.toString+" : item_nm is "+item_nm );
}
String std = req.getParameter("std");
if( std == null){
	System.out.println(this.toString+" : std is null" );
}else{
	System.out.println(this.toString+" : std is "+std );
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
String uprc = req.getParameter("uprc");
if( uprc == null){
	System.out.println(this.toString+" : uprc is null" );
}else{
	System.out.println(this.toString+" : uprc is "+uprc );
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
String clam_clsf = req.getParameter("clam_clsf");
if( clam_clsf == null){
	System.out.println(this.toString+" : clam_clsf is null" );
}else{
	System.out.println(this.toString+" : clam_clsf is "+clam_clsf );
}
String paper_clsf = req.getParameter("paper_clsf");
if( paper_clsf == null){
	System.out.println(this.toString+" : paper_clsf is null" );
}else{
	System.out.println(this.toString+" : paper_clsf is "+paper_clsf );
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
String job_cntc_no = req.getParameter("job_cntc_no");
if( job_cntc_no == null){
	System.out.println(this.toString+" : job_cntc_no is null" );
}else{
	System.out.println(this.toString+" : job_cntc_no is "+job_cntc_no );
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
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String sub_seq = Util.checkString(req.getParameter("sub_seq"));
String matr_cd = Util.checkString(req.getParameter("matr_cd"));
String item_nm = Util.checkString(req.getParameter("item_nm"));
String std = Util.checkString(req.getParameter("std"));
String unit = Util.checkString(req.getParameter("unit"));
String clam_qunt = Util.checkString(req.getParameter("clam_qunt"));
String fix_qunt = Util.checkString(req.getParameter("fix_qunt"));
String uprc = Util.checkString(req.getParameter("uprc"));
String amt = Util.checkString(req.getParameter("amt"));
String usag = Util.checkString(req.getParameter("usag"));
String clam_clsf = Util.checkString(req.getParameter("clam_clsf"));
String paper_clsf = Util.checkString(req.getParameter("paper_clsf"));
String recp_pers = Util.checkString(req.getParameter("recp_pers"));
String res_yn = Util.checkString(req.getParameter("res_yn"));
String pay_posb_dt = Util.checkString(req.getParameter("pay_posb_dt"));
String job_cntc_no = Util.checkString(req.getParameter("job_cntc_no"));
String remk = Util.checkString(req.getParameter("remk"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String sub_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("sub_seq")));
String matr_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_cd")));
String item_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("item_nm")));
String std = Util.Uni2Ksc(Util.checkString(req.getParameter("std")));
String unit = Util.Uni2Ksc(Util.checkString(req.getParameter("unit")));
String clam_qunt = Util.Uni2Ksc(Util.checkString(req.getParameter("clam_qunt")));
String fix_qunt = Util.Uni2Ksc(Util.checkString(req.getParameter("fix_qunt")));
String uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("uprc")));
String amt = Util.Uni2Ksc(Util.checkString(req.getParameter("amt")));
String usag = Util.Uni2Ksc(Util.checkString(req.getParameter("usag")));
String clam_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("clam_clsf")));
String paper_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("paper_clsf")));
String recp_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("recp_pers")));
String res_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("res_yn")));
String pay_posb_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_posb_dt")));
String job_cntc_no = Util.Uni2Ksc(Util.checkString(req.getParameter("job_cntc_no")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setGubun(gubun);
dm.setCmpy_cd(cmpy_cd);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setSub_seq(sub_seq);
dm.setMatr_cd(matr_cd);
dm.setItem_nm(item_nm);
dm.setStd(std);
dm.setUnit(unit);
dm.setClam_qunt(clam_qunt);
dm.setFix_qunt(fix_qunt);
dm.setUprc(uprc);
dm.setAmt(amt);
dm.setUsag(usag);
dm.setClam_clsf(clam_clsf);
dm.setPaper_clsf(paper_clsf);
dm.setRecp_pers(recp_pers);
dm.setRes_yn(res_yn);
dm.setPay_posb_dt(pay_posb_dt);
dm.setJob_cntc_no(job_cntc_no);
dm.setRemk(remk);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Oct 07 21:26:56 KST 2009 */