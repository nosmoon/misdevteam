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


package chosun.ciis.hd.cost.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.cost.ds.*;
import chosun.ciis.hd.cost.rec.*;

/**
 * 
 */


public class HD_COST_1101_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String emp_no;
	public String flnm;
	public String subj_sel_dt;
	public String real_fee_subj_sel_cd;
	public String itme_seq;
	public String real_fee_subj_sel_fee;
	public String subj_sel_ptcr;
	public String dept_cd;
	public String dty_cd;
	public String posi_cd;
	public String seq;
	public String occr_dt;
	public String medi_cd;
	public String dtl_medi_cd;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public HD_COST_1101_ADM(){}
	public HD_COST_1101_ADM(String cmpy_cd, String mode, String emp_no, String flnm, String subj_sel_dt, String real_fee_subj_sel_cd, String itme_seq, String real_fee_subj_sel_fee, String subj_sel_ptcr, String dept_cd, String dty_cd, String posi_cd, String seq, String occr_dt, String medi_cd, String dtl_medi_cd, String incmg_pers_ipadd, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.emp_no = emp_no;
		this.flnm = flnm;
		this.subj_sel_dt = subj_sel_dt;
		this.real_fee_subj_sel_cd = real_fee_subj_sel_cd;
		this.itme_seq = itme_seq;
		this.real_fee_subj_sel_fee = real_fee_subj_sel_fee;
		this.subj_sel_ptcr = subj_sel_ptcr;
		this.dept_cd = dept_cd;
		this.dty_cd = dty_cd;
		this.posi_cd = posi_cd;
		this.seq = seq;
		this.occr_dt = occr_dt;
		this.medi_cd = medi_cd;
		this.dtl_medi_cd = dtl_medi_cd;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setSubj_sel_dt(String subj_sel_dt){
		this.subj_sel_dt = subj_sel_dt;
	}

	public void setReal_fee_subj_sel_cd(String real_fee_subj_sel_cd){
		this.real_fee_subj_sel_cd = real_fee_subj_sel_cd;
	}

	public void setItme_seq(String itme_seq){
		this.itme_seq = itme_seq;
	}

	public void setReal_fee_subj_sel_fee(String real_fee_subj_sel_fee){
		this.real_fee_subj_sel_fee = real_fee_subj_sel_fee;
	}

	public void setSubj_sel_ptcr(String subj_sel_ptcr){
		this.subj_sel_ptcr = subj_sel_ptcr;
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

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setDtl_medi_cd(String dtl_medi_cd){
		this.dtl_medi_cd = dtl_medi_cd;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
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

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getSubj_sel_dt(){
		return this.subj_sel_dt;
	}

	public String getReal_fee_subj_sel_cd(){
		return this.real_fee_subj_sel_cd;
	}

	public String getItme_seq(){
		return this.itme_seq;
	}

	public String getReal_fee_subj_sel_fee(){
		return this.real_fee_subj_sel_fee;
	}

	public String getSubj_sel_ptcr(){
		return this.subj_sel_ptcr;
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

	public String getSeq(){
		return this.seq;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getDtl_medi_cd(){
		return this.dtl_medi_cd;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_COST_1101_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_COST_1101_ADM dm = (HD_COST_1101_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.flnm);
		cstmt.setString(7, dm.subj_sel_dt);
		cstmt.setString(8, dm.real_fee_subj_sel_cd);
		cstmt.setString(9, dm.itme_seq);
		cstmt.setString(10, dm.real_fee_subj_sel_fee);
		cstmt.setString(11, dm.subj_sel_ptcr);
		cstmt.setString(12, dm.dept_cd);
		cstmt.setString(13, dm.dty_cd);
		cstmt.setString(14, dm.posi_cd);
		cstmt.setString(15, dm.seq);
		cstmt.setString(16, dm.occr_dt);
		cstmt.setString(17, dm.medi_cd);
		cstmt.setString(18, dm.dtl_medi_cd);
		cstmt.setString(19, dm.incmg_pers_ipadd);
		cstmt.setString(20, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.cost.ds.HD_COST_1101_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("subj_sel_dt = [" + getSubj_sel_dt() + "]");
		System.out.println("real_fee_subj_sel_cd = [" + getReal_fee_subj_sel_cd() + "]");
		System.out.println("itme_seq = [" + getItme_seq() + "]");
		System.out.println("real_fee_subj_sel_fee = [" + getReal_fee_subj_sel_fee() + "]");
		System.out.println("subj_sel_ptcr = [" + getSubj_sel_ptcr() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("dty_cd = [" + getDty_cd() + "]");
		System.out.println("posi_cd = [" + getPosi_cd() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("dtl_medi_cd = [" + getDtl_medi_cd() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
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
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String flnm = req.getParameter("flnm");
if( flnm == null){
	System.out.println(this.toString+" : flnm is null" );
}else{
	System.out.println(this.toString+" : flnm is "+flnm );
}
String subj_sel_dt = req.getParameter("subj_sel_dt");
if( subj_sel_dt == null){
	System.out.println(this.toString+" : subj_sel_dt is null" );
}else{
	System.out.println(this.toString+" : subj_sel_dt is "+subj_sel_dt );
}
String real_fee_subj_sel_cd = req.getParameter("real_fee_subj_sel_cd");
if( real_fee_subj_sel_cd == null){
	System.out.println(this.toString+" : real_fee_subj_sel_cd is null" );
}else{
	System.out.println(this.toString+" : real_fee_subj_sel_cd is "+real_fee_subj_sel_cd );
}
String itme_seq = req.getParameter("itme_seq");
if( itme_seq == null){
	System.out.println(this.toString+" : itme_seq is null" );
}else{
	System.out.println(this.toString+" : itme_seq is "+itme_seq );
}
String real_fee_subj_sel_fee = req.getParameter("real_fee_subj_sel_fee");
if( real_fee_subj_sel_fee == null){
	System.out.println(this.toString+" : real_fee_subj_sel_fee is null" );
}else{
	System.out.println(this.toString+" : real_fee_subj_sel_fee is "+real_fee_subj_sel_fee );
}
String subj_sel_ptcr = req.getParameter("subj_sel_ptcr");
if( subj_sel_ptcr == null){
	System.out.println(this.toString+" : subj_sel_ptcr is null" );
}else{
	System.out.println(this.toString+" : subj_sel_ptcr is "+subj_sel_ptcr );
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
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String occr_dt = req.getParameter("occr_dt");
if( occr_dt == null){
	System.out.println(this.toString+" : occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_dt is "+occr_dt );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String dtl_medi_cd = req.getParameter("dtl_medi_cd");
if( dtl_medi_cd == null){
	System.out.println(this.toString+" : dtl_medi_cd is null" );
}else{
	System.out.println(this.toString+" : dtl_medi_cd is "+dtl_medi_cd );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String mode = Util.checkString(req.getParameter("mode"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String flnm = Util.checkString(req.getParameter("flnm"));
String subj_sel_dt = Util.checkString(req.getParameter("subj_sel_dt"));
String real_fee_subj_sel_cd = Util.checkString(req.getParameter("real_fee_subj_sel_cd"));
String itme_seq = Util.checkString(req.getParameter("itme_seq"));
String real_fee_subj_sel_fee = Util.checkString(req.getParameter("real_fee_subj_sel_fee"));
String subj_sel_ptcr = Util.checkString(req.getParameter("subj_sel_ptcr"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String dty_cd = Util.checkString(req.getParameter("dty_cd"));
String posi_cd = Util.checkString(req.getParameter("posi_cd"));
String seq = Util.checkString(req.getParameter("seq"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String dtl_medi_cd = Util.checkString(req.getParameter("dtl_medi_cd"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String subj_sel_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("subj_sel_dt")));
String real_fee_subj_sel_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("real_fee_subj_sel_cd")));
String itme_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("itme_seq")));
String real_fee_subj_sel_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("real_fee_subj_sel_fee")));
String subj_sel_ptcr = Util.Uni2Ksc(Util.checkString(req.getParameter("subj_sel_ptcr")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String dty_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dty_cd")));
String posi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("posi_cd")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String dtl_medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dtl_medi_cd")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setEmp_no(emp_no);
dm.setFlnm(flnm);
dm.setSubj_sel_dt(subj_sel_dt);
dm.setReal_fee_subj_sel_cd(real_fee_subj_sel_cd);
dm.setItme_seq(itme_seq);
dm.setReal_fee_subj_sel_fee(real_fee_subj_sel_fee);
dm.setSubj_sel_ptcr(subj_sel_ptcr);
dm.setDept_cd(dept_cd);
dm.setDty_cd(dty_cd);
dm.setPosi_cd(posi_cd);
dm.setSeq(seq);
dm.setOccr_dt(occr_dt);
dm.setMedi_cd(medi_cd);
dm.setDtl_medi_cd(dtl_medi_cd);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 06 15:04:01 KST 2012 */