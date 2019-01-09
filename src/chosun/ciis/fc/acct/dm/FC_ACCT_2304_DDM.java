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


package chosun.ciis.fc.acct.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.ds.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_2304_DDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String inrow;
	public String vexc_cmpy_cd;
	public String in_slip_occr_dt;
	public String in_slip_clsf_cd;
	public String in_slip_seq;
	public String incmg_pers;
	public String incmg_pers_ipadd;
	public String pch_amt;
	public String prof_type_cd;
	public String slip_clsf_cd;
	public String slip_occr_dt;
	public String slip_seq;

	public FC_ACCT_2304_DDM(){}
	public FC_ACCT_2304_DDM(String cmpy_cd, String inrow, String vexc_cmpy_cd, String in_slip_occr_dt, String in_slip_clsf_cd, String in_slip_seq, String incmg_pers, String incmg_pers_ipadd, String pch_amt, String prof_type_cd, String slip_clsf_cd, String slip_occr_dt, String slip_seq){
		this.cmpy_cd = cmpy_cd;
		this.inrow = inrow;
		this.vexc_cmpy_cd = vexc_cmpy_cd;
		this.in_slip_occr_dt = in_slip_occr_dt;
		this.in_slip_clsf_cd = in_slip_clsf_cd;
		this.in_slip_seq = in_slip_seq;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.pch_amt = pch_amt;
		this.prof_type_cd = prof_type_cd;
		this.slip_clsf_cd = slip_clsf_cd;
		this.slip_occr_dt = slip_occr_dt;
		this.slip_seq = slip_seq;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setInrow(String inrow){
		this.inrow = inrow;
	}

	public void setVexc_cmpy_cd(String vexc_cmpy_cd){
		this.vexc_cmpy_cd = vexc_cmpy_cd;
	}

	public void setIn_slip_occr_dt(String in_slip_occr_dt){
		this.in_slip_occr_dt = in_slip_occr_dt;
	}

	public void setIn_slip_clsf_cd(String in_slip_clsf_cd){
		this.in_slip_clsf_cd = in_slip_clsf_cd;
	}

	public void setIn_slip_seq(String in_slip_seq){
		this.in_slip_seq = in_slip_seq;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setPch_amt(String pch_amt){
		this.pch_amt = pch_amt;
	}

	public void setProf_type_cd(String prof_type_cd){
		this.prof_type_cd = prof_type_cd;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getInrow(){
		return this.inrow;
	}

	public String getVexc_cmpy_cd(){
		return this.vexc_cmpy_cd;
	}

	public String getIn_slip_occr_dt(){
		return this.in_slip_occr_dt;
	}

	public String getIn_slip_clsf_cd(){
		return this.in_slip_clsf_cd;
	}

	public String getIn_slip_seq(){
		return this.in_slip_seq;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getPch_amt(){
		return this.pch_amt;
	}

	public String getProf_type_cd(){
		return this.prof_type_cd;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2304_D(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2304_DDM dm = (FC_ACCT_2304_DDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.inrow);
		cstmt.setString(5, dm.vexc_cmpy_cd);
		cstmt.setString(6, dm.in_slip_occr_dt);
		cstmt.setString(7, dm.in_slip_clsf_cd);
		cstmt.setString(8, dm.in_slip_seq);
		cstmt.setString(9, dm.incmg_pers);
		cstmt.setString(10, dm.incmg_pers_ipadd);
		cstmt.setString(11, dm.pch_amt);
		cstmt.setString(12, dm.prof_type_cd);
		cstmt.setString(13, dm.slip_clsf_cd);
		cstmt.setString(14, dm.slip_occr_dt);
		cstmt.setString(15, dm.slip_seq);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2304_DDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("inrow = [" + getInrow() + "]");
		System.out.println("vexc_cmpy_cd = [" + getVexc_cmpy_cd() + "]");
		System.out.println("in_slip_occr_dt = [" + getIn_slip_occr_dt() + "]");
		System.out.println("in_slip_clsf_cd = [" + getIn_slip_clsf_cd() + "]");
		System.out.println("in_slip_seq = [" + getIn_slip_seq() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("pch_amt = [" + getPch_amt() + "]");
		System.out.println("prof_type_cd = [" + getProf_type_cd() + "]");
		System.out.println("slip_clsf_cd = [" + getSlip_clsf_cd() + "]");
		System.out.println("slip_occr_dt = [" + getSlip_occr_dt() + "]");
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
String inrow = req.getParameter("inrow");
if( inrow == null){
	System.out.println(this.toString+" : inrow is null" );
}else{
	System.out.println(this.toString+" : inrow is "+inrow );
}
String vexc_cmpy_cd = req.getParameter("vexc_cmpy_cd");
if( vexc_cmpy_cd == null){
	System.out.println(this.toString+" : vexc_cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : vexc_cmpy_cd is "+vexc_cmpy_cd );
}
String in_slip_occr_dt = req.getParameter("in_slip_occr_dt");
if( in_slip_occr_dt == null){
	System.out.println(this.toString+" : in_slip_occr_dt is null" );
}else{
	System.out.println(this.toString+" : in_slip_occr_dt is "+in_slip_occr_dt );
}
String in_slip_clsf_cd = req.getParameter("in_slip_clsf_cd");
if( in_slip_clsf_cd == null){
	System.out.println(this.toString+" : in_slip_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : in_slip_clsf_cd is "+in_slip_clsf_cd );
}
String in_slip_seq = req.getParameter("in_slip_seq");
if( in_slip_seq == null){
	System.out.println(this.toString+" : in_slip_seq is null" );
}else{
	System.out.println(this.toString+" : in_slip_seq is "+in_slip_seq );
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
String pch_amt = req.getParameter("pch_amt");
if( pch_amt == null){
	System.out.println(this.toString+" : pch_amt is null" );
}else{
	System.out.println(this.toString+" : pch_amt is "+pch_amt );
}
String prof_type_cd = req.getParameter("prof_type_cd");
if( prof_type_cd == null){
	System.out.println(this.toString+" : prof_type_cd is null" );
}else{
	System.out.println(this.toString+" : prof_type_cd is "+prof_type_cd );
}
String slip_clsf_cd = req.getParameter("slip_clsf_cd");
if( slip_clsf_cd == null){
	System.out.println(this.toString+" : slip_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : slip_clsf_cd is "+slip_clsf_cd );
}
String slip_occr_dt = req.getParameter("slip_occr_dt");
if( slip_occr_dt == null){
	System.out.println(this.toString+" : slip_occr_dt is null" );
}else{
	System.out.println(this.toString+" : slip_occr_dt is "+slip_occr_dt );
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
String inrow = Util.checkString(req.getParameter("inrow"));
String vexc_cmpy_cd = Util.checkString(req.getParameter("vexc_cmpy_cd"));
String in_slip_occr_dt = Util.checkString(req.getParameter("in_slip_occr_dt"));
String in_slip_clsf_cd = Util.checkString(req.getParameter("in_slip_clsf_cd"));
String in_slip_seq = Util.checkString(req.getParameter("in_slip_seq"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String pch_amt = Util.checkString(req.getParameter("pch_amt"));
String prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
String slip_seq = Util.checkString(req.getParameter("slip_seq"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String inrow = Util.Uni2Ksc(Util.checkString(req.getParameter("inrow")));
String vexc_cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("vexc_cmpy_cd")));
String in_slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("in_slip_occr_dt")));
String in_slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("in_slip_clsf_cd")));
String in_slip_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("in_slip_seq")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String pch_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("pch_amt")));
String prof_type_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("prof_type_cd")));
String slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd")));
String slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt")));
String slip_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_seq")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setInrow(inrow);
dm.setVexc_cmpy_cd(vexc_cmpy_cd);
dm.setIn_slip_occr_dt(in_slip_occr_dt);
dm.setIn_slip_clsf_cd(in_slip_clsf_cd);
dm.setIn_slip_seq(in_slip_seq);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setPch_amt(pch_amt);
dm.setProf_type_cd(prof_type_cd);
dm.setSlip_clsf_cd(slip_clsf_cd);
dm.setSlip_occr_dt(slip_occr_dt);
dm.setSlip_seq(slip_seq);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 27 22:02:22 KST 2009 */