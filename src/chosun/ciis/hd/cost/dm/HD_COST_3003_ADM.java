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


public class HD_COST_3003_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String emp_no;
	public String flnm;
	public String duty_dt;
	public String item_cd;
	public String prsnt_tm;
	public String finish_tm;
	public String finish_dd_clsf;
	public String cont;
	public String pay_cost;
	public String dept_cd;
	public String dty_cd;
	public String posi_cd;
	public String seq;
	public String occr_dt;
	public String medi_cd;
	public String dtl_medi_cd;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public HD_COST_3003_ADM(){}
	public HD_COST_3003_ADM(String cmpy_cd, String mode, String emp_no, String flnm, String duty_dt, String item_cd, String prsnt_tm, String finish_tm, String finish_dd_clsf, String cont, String pay_cost, String dept_cd, String dty_cd, String posi_cd, String seq, String occr_dt, String medi_cd, String dtl_medi_cd, String incmg_pers_ipadd, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.emp_no = emp_no;
		this.flnm = flnm;
		this.duty_dt = duty_dt;
		this.item_cd = item_cd;
		this.prsnt_tm = prsnt_tm;
		this.finish_tm = finish_tm;
		this.finish_dd_clsf = finish_dd_clsf;
		this.cont = cont;
		this.pay_cost = pay_cost;
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

	public void setDuty_dt(String duty_dt){
		this.duty_dt = duty_dt;
	}

	public void setItem_cd(String item_cd){
		this.item_cd = item_cd;
	}

	public void setPrsnt_tm(String prsnt_tm){
		this.prsnt_tm = prsnt_tm;
	}

	public void setFinish_tm(String finish_tm){
		this.finish_tm = finish_tm;
	}

	public void setFinish_dd_clsf(String finish_dd_clsf){
		this.finish_dd_clsf = finish_dd_clsf;
	}

	public void setCont(String cont){
		this.cont = cont;
	}

	public void setPay_cost(String pay_cost){
		this.pay_cost = pay_cost;
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

	public String getDuty_dt(){
		return this.duty_dt;
	}

	public String getItem_cd(){
		return this.item_cd;
	}

	public String getPrsnt_tm(){
		return this.prsnt_tm;
	}

	public String getFinish_tm(){
		return this.finish_tm;
	}

	public String getFinish_dd_clsf(){
		return this.finish_dd_clsf;
	}

	public String getCont(){
		return this.cont;
	}

	public String getPay_cost(){
		return this.pay_cost;
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
		 return "{ call MISHDL.SP_HD_COST_3003_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_COST_3003_ADM dm = (HD_COST_3003_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.flnm);
		cstmt.setString(7, dm.duty_dt);
		cstmt.setString(8, dm.item_cd);
		cstmt.setString(9, dm.prsnt_tm);
		cstmt.setString(10, dm.finish_tm);
		cstmt.setString(11, dm.finish_dd_clsf);
		cstmt.setString(12, dm.cont);
		cstmt.setString(13, dm.pay_cost);
		cstmt.setString(14, dm.dept_cd);
		cstmt.setString(15, dm.dty_cd);
		cstmt.setString(16, dm.posi_cd);
		cstmt.setString(17, dm.seq);
		cstmt.setString(18, dm.occr_dt);
		cstmt.setString(19, dm.medi_cd);
		cstmt.setString(20, dm.dtl_medi_cd);
		cstmt.setString(21, dm.incmg_pers_ipadd);
		cstmt.setString(22, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.cost.ds.HD_COST_3003_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("duty_dt = [" + getDuty_dt() + "]");
		System.out.println("item_cd = [" + getItem_cd() + "]");
		System.out.println("prsnt_tm = [" + getPrsnt_tm() + "]");
		System.out.println("finish_tm = [" + getFinish_tm() + "]");
		System.out.println("finish_dd_clsf = [" + getFinish_dd_clsf() + "]");
		System.out.println("cont = [" + getCont() + "]");
		System.out.println("pay_cost = [" + getPay_cost() + "]");
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
String duty_dt = req.getParameter("duty_dt");
if( duty_dt == null){
	System.out.println(this.toString+" : duty_dt is null" );
}else{
	System.out.println(this.toString+" : duty_dt is "+duty_dt );
}
String item_cd = req.getParameter("item_cd");
if( item_cd == null){
	System.out.println(this.toString+" : item_cd is null" );
}else{
	System.out.println(this.toString+" : item_cd is "+item_cd );
}
String prsnt_tm = req.getParameter("prsnt_tm");
if( prsnt_tm == null){
	System.out.println(this.toString+" : prsnt_tm is null" );
}else{
	System.out.println(this.toString+" : prsnt_tm is "+prsnt_tm );
}
String finish_tm = req.getParameter("finish_tm");
if( finish_tm == null){
	System.out.println(this.toString+" : finish_tm is null" );
}else{
	System.out.println(this.toString+" : finish_tm is "+finish_tm );
}
String finish_dd_clsf = req.getParameter("finish_dd_clsf");
if( finish_dd_clsf == null){
	System.out.println(this.toString+" : finish_dd_clsf is null" );
}else{
	System.out.println(this.toString+" : finish_dd_clsf is "+finish_dd_clsf );
}
String cont = req.getParameter("cont");
if( cont == null){
	System.out.println(this.toString+" : cont is null" );
}else{
	System.out.println(this.toString+" : cont is "+cont );
}
String pay_cost = req.getParameter("pay_cost");
if( pay_cost == null){
	System.out.println(this.toString+" : pay_cost is null" );
}else{
	System.out.println(this.toString+" : pay_cost is "+pay_cost );
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
String duty_dt = Util.checkString(req.getParameter("duty_dt"));
String item_cd = Util.checkString(req.getParameter("item_cd"));
String prsnt_tm = Util.checkString(req.getParameter("prsnt_tm"));
String finish_tm = Util.checkString(req.getParameter("finish_tm"));
String finish_dd_clsf = Util.checkString(req.getParameter("finish_dd_clsf"));
String cont = Util.checkString(req.getParameter("cont"));
String pay_cost = Util.checkString(req.getParameter("pay_cost"));
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
String duty_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("duty_dt")));
String item_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("item_cd")));
String prsnt_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("prsnt_tm")));
String finish_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("finish_tm")));
String finish_dd_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("finish_dd_clsf")));
String cont = Util.Uni2Ksc(Util.checkString(req.getParameter("cont")));
String pay_cost = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_cost")));
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
dm.setDuty_dt(duty_dt);
dm.setItem_cd(item_cd);
dm.setPrsnt_tm(prsnt_tm);
dm.setFinish_tm(finish_tm);
dm.setFinish_dd_clsf(finish_dd_clsf);
dm.setCont(cont);
dm.setPay_cost(pay_cost);
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


/* 작성시간 : Mon Nov 12 17:04:07 KST 2012 */