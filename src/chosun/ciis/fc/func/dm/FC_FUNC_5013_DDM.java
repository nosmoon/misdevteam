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


package chosun.ciis.fc.func.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.ds.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_5013_DDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String insr_clsf_cd;
	public String insr_no;
	public String comp_dt;
	public String nomach_adpay_bal;
	public String cost_gain_stot;
	public String rcpay_amt_stot;
	public String sum_cost_gain_stot;
	public String sum_rcpay_amt_stot;
	public String incmg_pers;
	public String incmg_pers_ipadd;
	public String slip_occr_dt;
	public String slip_clsf_cd;
	public String slip_seq;

	public FC_FUNC_5013_DDM(){}
	public FC_FUNC_5013_DDM(String cmpy_cd, String insr_clsf_cd, String insr_no, String comp_dt, String nomach_adpay_bal, String cost_gain_stot, String rcpay_amt_stot, String sum_cost_gain_stot, String sum_rcpay_amt_stot, String incmg_pers, String incmg_pers_ipadd, String slip_occr_dt, String slip_clsf_cd, String slip_seq){
		this.cmpy_cd = cmpy_cd;
		this.insr_clsf_cd = insr_clsf_cd;
		this.insr_no = insr_no;
		this.comp_dt = comp_dt;
		this.nomach_adpay_bal = nomach_adpay_bal;
		this.cost_gain_stot = cost_gain_stot;
		this.rcpay_amt_stot = rcpay_amt_stot;
		this.sum_cost_gain_stot = sum_cost_gain_stot;
		this.sum_rcpay_amt_stot = sum_rcpay_amt_stot;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.slip_occr_dt = slip_occr_dt;
		this.slip_clsf_cd = slip_clsf_cd;
		this.slip_seq = slip_seq;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setInsr_clsf_cd(String insr_clsf_cd){
		this.insr_clsf_cd = insr_clsf_cd;
	}

	public void setInsr_no(String insr_no){
		this.insr_no = insr_no;
	}

	public void setComp_dt(String comp_dt){
		this.comp_dt = comp_dt;
	}

	public void setNomach_adpay_bal(String nomach_adpay_bal){
		this.nomach_adpay_bal = nomach_adpay_bal;
	}

	public void setCost_gain_stot(String cost_gain_stot){
		this.cost_gain_stot = cost_gain_stot;
	}

	public void setRcpay_amt_stot(String rcpay_amt_stot){
		this.rcpay_amt_stot = rcpay_amt_stot;
	}

	public void setSum_cost_gain_stot(String sum_cost_gain_stot){
		this.sum_cost_gain_stot = sum_cost_gain_stot;
	}

	public void setSum_rcpay_amt_stot(String sum_rcpay_amt_stot){
		this.sum_rcpay_amt_stot = sum_rcpay_amt_stot;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getInsr_clsf_cd(){
		return this.insr_clsf_cd;
	}

	public String getInsr_no(){
		return this.insr_no;
	}

	public String getComp_dt(){
		return this.comp_dt;
	}

	public String getNomach_adpay_bal(){
		return this.nomach_adpay_bal;
	}

	public String getCost_gain_stot(){
		return this.cost_gain_stot;
	}

	public String getRcpay_amt_stot(){
		return this.rcpay_amt_stot;
	}

	public String getSum_cost_gain_stot(){
		return this.sum_cost_gain_stot;
	}

	public String getSum_rcpay_amt_stot(){
		return this.sum_rcpay_amt_stot;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_5013_D(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_5013_DDM dm = (FC_FUNC_5013_DDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.insr_clsf_cd);
		cstmt.setString(5, dm.insr_no);
		cstmt.setString(6, dm.comp_dt);
		cstmt.setString(7, dm.nomach_adpay_bal);
		cstmt.setString(8, dm.cost_gain_stot);
		cstmt.setString(9, dm.rcpay_amt_stot);
		cstmt.setString(10, dm.sum_cost_gain_stot);
		cstmt.setString(11, dm.sum_rcpay_amt_stot);
		cstmt.setString(12, dm.incmg_pers);
		cstmt.setString(13, dm.incmg_pers_ipadd);
		cstmt.setString(14, dm.slip_occr_dt);
		cstmt.setString(15, dm.slip_clsf_cd);
		cstmt.setString(16, dm.slip_seq);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_5013_DDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("insr_clsf_cd = [" + getInsr_clsf_cd() + "]");
		System.out.println("insr_no = [" + getInsr_no() + "]");
		System.out.println("comp_dt = [" + getComp_dt() + "]");
		System.out.println("nomach_adpay_bal = [" + getNomach_adpay_bal() + "]");
		System.out.println("cost_gain_stot = [" + getCost_gain_stot() + "]");
		System.out.println("rcpay_amt_stot = [" + getRcpay_amt_stot() + "]");
		System.out.println("sum_cost_gain_stot = [" + getSum_cost_gain_stot() + "]");
		System.out.println("sum_rcpay_amt_stot = [" + getSum_rcpay_amt_stot() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("slip_occr_dt = [" + getSlip_occr_dt() + "]");
		System.out.println("slip_clsf_cd = [" + getSlip_clsf_cd() + "]");
		System.out.println("slip_seq = [" + getSlip_seq() + "]");
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
String insr_clsf_cd = req.getParameter("insr_clsf_cd");
if( insr_clsf_cd == null){
	System.out.println(this.toString+" : insr_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : insr_clsf_cd is "+insr_clsf_cd );
}
String insr_no = req.getParameter("insr_no");
if( insr_no == null){
	System.out.println(this.toString+" : insr_no is null" );
}else{
	System.out.println(this.toString+" : insr_no is "+insr_no );
}
String comp_dt = req.getParameter("comp_dt");
if( comp_dt == null){
	System.out.println(this.toString+" : comp_dt is null" );
}else{
	System.out.println(this.toString+" : comp_dt is "+comp_dt );
}
String nomach_adpay_bal = req.getParameter("nomach_adpay_bal");
if( nomach_adpay_bal == null){
	System.out.println(this.toString+" : nomach_adpay_bal is null" );
}else{
	System.out.println(this.toString+" : nomach_adpay_bal is "+nomach_adpay_bal );
}
String cost_gain_stot = req.getParameter("cost_gain_stot");
if( cost_gain_stot == null){
	System.out.println(this.toString+" : cost_gain_stot is null" );
}else{
	System.out.println(this.toString+" : cost_gain_stot is "+cost_gain_stot );
}
String rcpay_amt_stot = req.getParameter("rcpay_amt_stot");
if( rcpay_amt_stot == null){
	System.out.println(this.toString+" : rcpay_amt_stot is null" );
}else{
	System.out.println(this.toString+" : rcpay_amt_stot is "+rcpay_amt_stot );
}
String sum_cost_gain_stot = req.getParameter("sum_cost_gain_stot");
if( sum_cost_gain_stot == null){
	System.out.println(this.toString+" : sum_cost_gain_stot is null" );
}else{
	System.out.println(this.toString+" : sum_cost_gain_stot is "+sum_cost_gain_stot );
}
String sum_rcpay_amt_stot = req.getParameter("sum_rcpay_amt_stot");
if( sum_rcpay_amt_stot == null){
	System.out.println(this.toString+" : sum_rcpay_amt_stot is null" );
}else{
	System.out.println(this.toString+" : sum_rcpay_amt_stot is "+sum_rcpay_amt_stot );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String slip_occr_dt = req.getParameter("slip_occr_dt");
if( slip_occr_dt == null){
	System.out.println(this.toString+" : slip_occr_dt is null" );
}else{
	System.out.println(this.toString+" : slip_occr_dt is "+slip_occr_dt );
}
String slip_clsf_cd = req.getParameter("slip_clsf_cd");
if( slip_clsf_cd == null){
	System.out.println(this.toString+" : slip_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : slip_clsf_cd is "+slip_clsf_cd );
}
String slip_seq = req.getParameter("slip_seq");
if( slip_seq == null){
	System.out.println(this.toString+" : slip_seq is null" );
}else{
	System.out.println(this.toString+" : slip_seq is "+slip_seq );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String insr_clsf_cd = Util.checkString(req.getParameter("insr_clsf_cd"));
String insr_no = Util.checkString(req.getParameter("insr_no"));
String comp_dt = Util.checkString(req.getParameter("comp_dt"));
String nomach_adpay_bal = Util.checkString(req.getParameter("nomach_adpay_bal"));
String cost_gain_stot = Util.checkString(req.getParameter("cost_gain_stot"));
String rcpay_amt_stot = Util.checkString(req.getParameter("rcpay_amt_stot"));
String sum_cost_gain_stot = Util.checkString(req.getParameter("sum_cost_gain_stot"));
String sum_rcpay_amt_stot = Util.checkString(req.getParameter("sum_rcpay_amt_stot"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
String slip_seq = Util.checkString(req.getParameter("slip_seq"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String insr_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("insr_clsf_cd")));
String insr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("insr_no")));
String comp_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("comp_dt")));
String nomach_adpay_bal = Util.Uni2Ksc(Util.checkString(req.getParameter("nomach_adpay_bal")));
String cost_gain_stot = Util.Uni2Ksc(Util.checkString(req.getParameter("cost_gain_stot")));
String rcpay_amt_stot = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpay_amt_stot")));
String sum_cost_gain_stot = Util.Uni2Ksc(Util.checkString(req.getParameter("sum_cost_gain_stot")));
String sum_rcpay_amt_stot = Util.Uni2Ksc(Util.checkString(req.getParameter("sum_rcpay_amt_stot")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt")));
String slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd")));
String slip_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_seq")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setInsr_clsf_cd(insr_clsf_cd);
dm.setInsr_no(insr_no);
dm.setComp_dt(comp_dt);
dm.setNomach_adpay_bal(nomach_adpay_bal);
dm.setCost_gain_stot(cost_gain_stot);
dm.setRcpay_amt_stot(rcpay_amt_stot);
dm.setSum_cost_gain_stot(sum_cost_gain_stot);
dm.setSum_rcpay_amt_stot(sum_rcpay_amt_stot);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setSlip_occr_dt(slip_occr_dt);
dm.setSlip_clsf_cd(slip_clsf_cd);
dm.setSlip_seq(slip_seq);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 31 19:51:56 KST 2009 */