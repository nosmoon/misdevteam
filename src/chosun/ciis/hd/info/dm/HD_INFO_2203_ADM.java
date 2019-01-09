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


package chosun.ciis.hd.info.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.info.ds.*;
import chosun.ciis.hd.info.rec.*;

/**
 * 
 */


public class HD_INFO_2203_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String occr_dt;
	public String seq;
	public String dept_cd;
	public String dty_cd;
	public String posi_cd;
	public String flnm;
	public String flnm_engl;
	public String flnm_chin;
	public String prn;
	public String bi_yymm;
	public String issu_resn;
	public String real_fee_paymt_yn;
	public String real_fee_paymt_amt;
	public String id_card_typ;
	public String issu_dt;
	public String issu_yn;
	public String remk;
	public String proc_stat;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String gubun;

	public HD_INFO_2203_ADM(){}
	public HD_INFO_2203_ADM(String cmpy_cd, String emp_no, String occr_dt, String seq, String dept_cd, String dty_cd, String posi_cd, String flnm, String flnm_engl, String flnm_chin, String prn, String bi_yymm, String issu_resn, String real_fee_paymt_yn, String real_fee_paymt_amt, String id_card_typ, String issu_dt, String issu_yn, String remk, String proc_stat, String incmg_pers_ipadd, String incmg_pers, String gubun){
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.dept_cd = dept_cd;
		this.dty_cd = dty_cd;
		this.posi_cd = posi_cd;
		this.flnm = flnm;
		this.flnm_engl = flnm_engl;
		this.flnm_chin = flnm_chin;
		this.prn = prn;
		this.bi_yymm = bi_yymm;
		this.issu_resn = issu_resn;
		this.real_fee_paymt_yn = real_fee_paymt_yn;
		this.real_fee_paymt_amt = real_fee_paymt_amt;
		this.id_card_typ = id_card_typ;
		this.issu_dt = issu_dt;
		this.issu_yn = issu_yn;
		this.remk = remk;
		this.proc_stat = proc_stat;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
		this.gubun = gubun;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setFlnm_engl(String flnm_engl){
		this.flnm_engl = flnm_engl;
	}

	public void setFlnm_chin(String flnm_chin){
		this.flnm_chin = flnm_chin;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setBi_yymm(String bi_yymm){
		this.bi_yymm = bi_yymm;
	}

	public void setIssu_resn(String issu_resn){
		this.issu_resn = issu_resn;
	}

	public void setReal_fee_paymt_yn(String real_fee_paymt_yn){
		this.real_fee_paymt_yn = real_fee_paymt_yn;
	}

	public void setReal_fee_paymt_amt(String real_fee_paymt_amt){
		this.real_fee_paymt_amt = real_fee_paymt_amt;
	}

	public void setId_card_typ(String id_card_typ){
		this.id_card_typ = id_card_typ;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setIssu_yn(String issu_yn){
		this.issu_yn = issu_yn;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getFlnm_engl(){
		return this.flnm_engl;
	}

	public String getFlnm_chin(){
		return this.flnm_chin;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getBi_yymm(){
		return this.bi_yymm;
	}

	public String getIssu_resn(){
		return this.issu_resn;
	}

	public String getReal_fee_paymt_yn(){
		return this.real_fee_paymt_yn;
	}

	public String getReal_fee_paymt_amt(){
		return this.real_fee_paymt_amt;
	}

	public String getId_card_typ(){
		return this.id_card_typ;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getIssu_yn(){
		return this.issu_yn;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_INFO_2203_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_INFO_2203_ADM dm = (HD_INFO_2203_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.emp_no);
		cstmt.setString(5, dm.occr_dt);
		cstmt.setString(6, dm.seq);
		cstmt.setString(7, dm.dept_cd);
		cstmt.setString(8, dm.dty_cd);
		cstmt.setString(9, dm.posi_cd);
		cstmt.setString(10, dm.flnm);
		cstmt.setString(11, dm.flnm_engl);
		cstmt.setString(12, dm.flnm_chin);
		cstmt.setString(13, dm.prn);
		cstmt.setString(14, dm.bi_yymm);
		cstmt.setString(15, dm.issu_resn);
		cstmt.setString(16, dm.real_fee_paymt_yn);
		cstmt.setString(17, dm.real_fee_paymt_amt);
		cstmt.setString(18, dm.id_card_typ);
		cstmt.setString(19, dm.issu_dt);
		cstmt.setString(20, dm.issu_yn);
		cstmt.setString(21, dm.remk);
		cstmt.setString(22, dm.proc_stat);
		cstmt.setString(23, dm.incmg_pers_ipadd);
		cstmt.setString(24, dm.incmg_pers);
		cstmt.setString(25, dm.gubun);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.info.ds.HD_INFO_2203_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("dty_cd = [" + getDty_cd() + "]");
		System.out.println("posi_cd = [" + getPosi_cd() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("flnm_engl = [" + getFlnm_engl() + "]");
		System.out.println("flnm_chin = [" + getFlnm_chin() + "]");
		System.out.println("prn = [" + getPrn() + "]");
		System.out.println("bi_yymm = [" + getBi_yymm() + "]");
		System.out.println("issu_resn = [" + getIssu_resn() + "]");
		System.out.println("real_fee_paymt_yn = [" + getReal_fee_paymt_yn() + "]");
		System.out.println("real_fee_paymt_amt = [" + getReal_fee_paymt_amt() + "]");
		System.out.println("id_card_typ = [" + getId_card_typ() + "]");
		System.out.println("issu_dt = [" + getIssu_dt() + "]");
		System.out.println("issu_yn = [" + getIssu_yn() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("proc_stat = [" + getProc_stat() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("gubun = [" + getGubun() + "]");
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
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
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
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String dty_cd = req.getParameter("dty_cd");
if( dty_cd == null){
	System.out.println(this.toString+" : dty_cd is null" );
}else{
	System.out.println(this.toString+" : dty_cd is "+dty_cd );
}
String posi_cd = req.getParameter("posi_cd");
if( posi_cd == null){
	System.out.println(this.toString+" : posi_cd is null" );
}else{
	System.out.println(this.toString+" : posi_cd is "+posi_cd );
}
String flnm = req.getParameter("flnm");
if( flnm == null){
	System.out.println(this.toString+" : flnm is null" );
}else{
	System.out.println(this.toString+" : flnm is "+flnm );
}
String flnm_engl = req.getParameter("flnm_engl");
if( flnm_engl == null){
	System.out.println(this.toString+" : flnm_engl is null" );
}else{
	System.out.println(this.toString+" : flnm_engl is "+flnm_engl );
}
String flnm_chin = req.getParameter("flnm_chin");
if( flnm_chin == null){
	System.out.println(this.toString+" : flnm_chin is null" );
}else{
	System.out.println(this.toString+" : flnm_chin is "+flnm_chin );
}
String prn = req.getParameter("prn");
if( prn == null){
	System.out.println(this.toString+" : prn is null" );
}else{
	System.out.println(this.toString+" : prn is "+prn );
}
String bi_yymm = req.getParameter("bi_yymm");
if( bi_yymm == null){
	System.out.println(this.toString+" : bi_yymm is null" );
}else{
	System.out.println(this.toString+" : bi_yymm is "+bi_yymm );
}
String issu_resn = req.getParameter("issu_resn");
if( issu_resn == null){
	System.out.println(this.toString+" : issu_resn is null" );
}else{
	System.out.println(this.toString+" : issu_resn is "+issu_resn );
}
String real_fee_paymt_yn = req.getParameter("real_fee_paymt_yn");
if( real_fee_paymt_yn == null){
	System.out.println(this.toString+" : real_fee_paymt_yn is null" );
}else{
	System.out.println(this.toString+" : real_fee_paymt_yn is "+real_fee_paymt_yn );
}
String real_fee_paymt_amt = req.getParameter("real_fee_paymt_amt");
if( real_fee_paymt_amt == null){
	System.out.println(this.toString+" : real_fee_paymt_amt is null" );
}else{
	System.out.println(this.toString+" : real_fee_paymt_amt is "+real_fee_paymt_amt );
}
String id_card_typ = req.getParameter("id_card_typ");
if( id_card_typ == null){
	System.out.println(this.toString+" : id_card_typ is null" );
}else{
	System.out.println(this.toString+" : id_card_typ is "+id_card_typ );
}
String issu_dt = req.getParameter("issu_dt");
if( issu_dt == null){
	System.out.println(this.toString+" : issu_dt is null" );
}else{
	System.out.println(this.toString+" : issu_dt is "+issu_dt );
}
String issu_yn = req.getParameter("issu_yn");
if( issu_yn == null){
	System.out.println(this.toString+" : issu_yn is null" );
}else{
	System.out.println(this.toString+" : issu_yn is "+issu_yn );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String proc_stat = req.getParameter("proc_stat");
if( proc_stat == null){
	System.out.println(this.toString+" : proc_stat is null" );
}else{
	System.out.println(this.toString+" : proc_stat is "+proc_stat );
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
String emp_no = Util.checkString(req.getParameter("emp_no"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String dty_cd = Util.checkString(req.getParameter("dty_cd"));
String posi_cd = Util.checkString(req.getParameter("posi_cd"));
String flnm = Util.checkString(req.getParameter("flnm"));
String flnm_engl = Util.checkString(req.getParameter("flnm_engl"));
String flnm_chin = Util.checkString(req.getParameter("flnm_chin"));
String prn = Util.checkString(req.getParameter("prn"));
String bi_yymm = Util.checkString(req.getParameter("bi_yymm"));
String issu_resn = Util.checkString(req.getParameter("issu_resn"));
String real_fee_paymt_yn = Util.checkString(req.getParameter("real_fee_paymt_yn"));
String real_fee_paymt_amt = Util.checkString(req.getParameter("real_fee_paymt_amt"));
String id_card_typ = Util.checkString(req.getParameter("id_card_typ"));
String issu_dt = Util.checkString(req.getParameter("issu_dt"));
String issu_yn = Util.checkString(req.getParameter("issu_yn"));
String remk = Util.checkString(req.getParameter("remk"));
String proc_stat = Util.checkString(req.getParameter("proc_stat"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String gubun = Util.checkString(req.getParameter("gubun"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String dty_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dty_cd")));
String posi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("posi_cd")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String flnm_engl = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm_engl")));
String flnm_chin = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm_chin")));
String prn = Util.Uni2Ksc(Util.checkString(req.getParameter("prn")));
String bi_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("bi_yymm")));
String issu_resn = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_resn")));
String real_fee_paymt_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("real_fee_paymt_yn")));
String real_fee_paymt_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("real_fee_paymt_amt")));
String id_card_typ = Util.Uni2Ksc(Util.checkString(req.getParameter("id_card_typ")));
String issu_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt")));
String issu_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_yn")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String proc_stat = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_stat")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setDept_cd(dept_cd);
dm.setDty_cd(dty_cd);
dm.setPosi_cd(posi_cd);
dm.setFlnm(flnm);
dm.setFlnm_engl(flnm_engl);
dm.setFlnm_chin(flnm_chin);
dm.setPrn(prn);
dm.setBi_yymm(bi_yymm);
dm.setIssu_resn(issu_resn);
dm.setReal_fee_paymt_yn(real_fee_paymt_yn);
dm.setReal_fee_paymt_amt(real_fee_paymt_amt);
dm.setId_card_typ(id_card_typ);
dm.setIssu_dt(issu_dt);
dm.setIssu_yn(issu_yn);
dm.setRemk(remk);
dm.setProc_stat(proc_stat);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
dm.setGubun(gubun);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jun 02 15:55:34 KST 2009 */