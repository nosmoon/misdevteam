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


public class FC_FUNC_6544_DDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String deps_isav_clsf_cd;
	public String deps_isav_no;
	public String recp_dt;
	public String incmg_pers;
	public String incmg_pers_ipadd;
	public String slip_occr_dt;
	public String slip_clsf_cd;
	public String slip_seq;
	public String upintsuigamt;
	public String uptotintamt;
	public String cost_gain_stot;
	public String rcpay_amt_stot;

	public FC_FUNC_6544_DDM(){}
	public FC_FUNC_6544_DDM(String cmpy_cd, String deps_isav_clsf_cd, String deps_isav_no, String recp_dt, String incmg_pers, String incmg_pers_ipadd, String slip_occr_dt, String slip_clsf_cd, String slip_seq, String upintsuigamt, String uptotintamt, String cost_gain_stot, String rcpay_amt_stot){
		this.cmpy_cd = cmpy_cd;
		this.deps_isav_clsf_cd = deps_isav_clsf_cd;
		this.deps_isav_no = deps_isav_no;
		this.recp_dt = recp_dt;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.slip_occr_dt = slip_occr_dt;
		this.slip_clsf_cd = slip_clsf_cd;
		this.slip_seq = slip_seq;
		this.upintsuigamt = upintsuigamt;
		this.uptotintamt = uptotintamt;
		this.cost_gain_stot = cost_gain_stot;
		this.rcpay_amt_stot = rcpay_amt_stot;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDeps_isav_clsf_cd(String deps_isav_clsf_cd){
		this.deps_isav_clsf_cd = deps_isav_clsf_cd;
	}

	public void setDeps_isav_no(String deps_isav_no){
		this.deps_isav_no = deps_isav_no;
	}

	public void setRecp_dt(String recp_dt){
		this.recp_dt = recp_dt;
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

	public void setUpintsuigamt(String upintsuigamt){
		this.upintsuigamt = upintsuigamt;
	}

	public void setUptotintamt(String uptotintamt){
		this.uptotintamt = uptotintamt;
	}

	public void setCost_gain_stot(String cost_gain_stot){
		this.cost_gain_stot = cost_gain_stot;
	}

	public void setRcpay_amt_stot(String rcpay_amt_stot){
		this.rcpay_amt_stot = rcpay_amt_stot;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDeps_isav_clsf_cd(){
		return this.deps_isav_clsf_cd;
	}

	public String getDeps_isav_no(){
		return this.deps_isav_no;
	}

	public String getRecp_dt(){
		return this.recp_dt;
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

	public String getUpintsuigamt(){
		return this.upintsuigamt;
	}

	public String getUptotintamt(){
		return this.uptotintamt;
	}

	public String getCost_gain_stot(){
		return this.cost_gain_stot;
	}

	public String getRcpay_amt_stot(){
		return this.rcpay_amt_stot;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_6544_D(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_6544_DDM dm = (FC_FUNC_6544_DDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.deps_isav_clsf_cd);
		cstmt.setString(5, dm.deps_isav_no);
		cstmt.setString(6, dm.recp_dt);
		cstmt.setString(7, dm.incmg_pers);
		cstmt.setString(8, dm.incmg_pers_ipadd);
		cstmt.setString(9, dm.slip_occr_dt);
		cstmt.setString(10, dm.slip_clsf_cd);
		cstmt.setString(11, dm.slip_seq);
		cstmt.setString(12, dm.upintsuigamt);
		cstmt.setString(13, dm.uptotintamt);
		cstmt.setString(14, dm.cost_gain_stot);
		cstmt.setString(15, dm.rcpay_amt_stot);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_6544_DDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("deps_isav_clsf_cd = [" + getDeps_isav_clsf_cd() + "]");
		System.out.println("deps_isav_no = [" + getDeps_isav_no() + "]");
		System.out.println("recp_dt = [" + getRecp_dt() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("slip_occr_dt = [" + getSlip_occr_dt() + "]");
		System.out.println("slip_clsf_cd = [" + getSlip_clsf_cd() + "]");
		System.out.println("slip_seq = [" + getSlip_seq() + "]");
		System.out.println("upintsuigamt = [" + getUpintsuigamt() + "]");
		System.out.println("uptotintamt = [" + getUptotintamt() + "]");
		System.out.println("cost_gain_stot = [" + getCost_gain_stot() + "]");
		System.out.println("rcpay_amt_stot = [" + getRcpay_amt_stot() + "]");
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
String deps_isav_clsf_cd = req.getParameter("deps_isav_clsf_cd");
if( deps_isav_clsf_cd == null){
	System.out.println(this.toString+" : deps_isav_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : deps_isav_clsf_cd is "+deps_isav_clsf_cd );
}
String deps_isav_no = req.getParameter("deps_isav_no");
if( deps_isav_no == null){
	System.out.println(this.toString+" : deps_isav_no is null" );
}else{
	System.out.println(this.toString+" : deps_isav_no is "+deps_isav_no );
}
String recp_dt = req.getParameter("recp_dt");
if( recp_dt == null){
	System.out.println(this.toString+" : recp_dt is null" );
}else{
	System.out.println(this.toString+" : recp_dt is "+recp_dt );
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
String upintsuigamt = req.getParameter("upintsuigamt");
if( upintsuigamt == null){
	System.out.println(this.toString+" : upintsuigamt is null" );
}else{
	System.out.println(this.toString+" : upintsuigamt is "+upintsuigamt );
}
String uptotintamt = req.getParameter("uptotintamt");
if( uptotintamt == null){
	System.out.println(this.toString+" : uptotintamt is null" );
}else{
	System.out.println(this.toString+" : uptotintamt is "+uptotintamt );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String deps_isav_clsf_cd = Util.checkString(req.getParameter("deps_isav_clsf_cd"));
String deps_isav_no = Util.checkString(req.getParameter("deps_isav_no"));
String recp_dt = Util.checkString(req.getParameter("recp_dt"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
String slip_seq = Util.checkString(req.getParameter("slip_seq"));
String upintsuigamt = Util.checkString(req.getParameter("upintsuigamt"));
String uptotintamt = Util.checkString(req.getParameter("uptotintamt"));
String cost_gain_stot = Util.checkString(req.getParameter("cost_gain_stot"));
String rcpay_amt_stot = Util.checkString(req.getParameter("rcpay_amt_stot"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String deps_isav_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_isav_clsf_cd")));
String deps_isav_no = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_isav_no")));
String recp_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("recp_dt")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt")));
String slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd")));
String slip_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_seq")));
String upintsuigamt = Util.Uni2Ksc(Util.checkString(req.getParameter("upintsuigamt")));
String uptotintamt = Util.Uni2Ksc(Util.checkString(req.getParameter("uptotintamt")));
String cost_gain_stot = Util.Uni2Ksc(Util.checkString(req.getParameter("cost_gain_stot")));
String rcpay_amt_stot = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpay_amt_stot")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDeps_isav_clsf_cd(deps_isav_clsf_cd);
dm.setDeps_isav_no(deps_isav_no);
dm.setRecp_dt(recp_dt);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setSlip_occr_dt(slip_occr_dt);
dm.setSlip_clsf_cd(slip_clsf_cd);
dm.setSlip_seq(slip_seq);
dm.setUpintsuigamt(upintsuigamt);
dm.setUptotintamt(uptotintamt);
dm.setCost_gain_stot(cost_gain_stot);
dm.setRcpay_amt_stot(rcpay_amt_stot);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 24 14:56:50 KST 2009 */