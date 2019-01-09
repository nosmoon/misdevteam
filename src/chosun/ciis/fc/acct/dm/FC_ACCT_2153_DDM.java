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


public class FC_ACCT_2153_DDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String rcpm_slip_occr_dt;
	public String rcpm_slip_clsf_cd;
	public String rcpm_slip_seq;
	public String rcpm_slip_sub_seq;
	public String incmg_pers;
	public String incmg_pers_ipadd;

	public FC_ACCT_2153_DDM(){}
	public FC_ACCT_2153_DDM(String cmpy_cd, String rcpm_slip_occr_dt, String rcpm_slip_clsf_cd, String rcpm_slip_seq, String rcpm_slip_sub_seq, String incmg_pers, String incmg_pers_ipadd){
		this.cmpy_cd = cmpy_cd;
		this.rcpm_slip_occr_dt = rcpm_slip_occr_dt;
		this.rcpm_slip_clsf_cd = rcpm_slip_clsf_cd;
		this.rcpm_slip_seq = rcpm_slip_seq;
		this.rcpm_slip_sub_seq = rcpm_slip_sub_seq;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setRcpm_slip_occr_dt(String rcpm_slip_occr_dt){
		this.rcpm_slip_occr_dt = rcpm_slip_occr_dt;
	}

	public void setRcpm_slip_clsf_cd(String rcpm_slip_clsf_cd){
		this.rcpm_slip_clsf_cd = rcpm_slip_clsf_cd;
	}

	public void setRcpm_slip_seq(String rcpm_slip_seq){
		this.rcpm_slip_seq = rcpm_slip_seq;
	}

	public void setRcpm_slip_sub_seq(String rcpm_slip_sub_seq){
		this.rcpm_slip_sub_seq = rcpm_slip_sub_seq;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getRcpm_slip_occr_dt(){
		return this.rcpm_slip_occr_dt;
	}

	public String getRcpm_slip_clsf_cd(){
		return this.rcpm_slip_clsf_cd;
	}

	public String getRcpm_slip_seq(){
		return this.rcpm_slip_seq;
	}

	public String getRcpm_slip_sub_seq(){
		return this.rcpm_slip_sub_seq;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2153_D(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2153_DDM dm = (FC_ACCT_2153_DDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.rcpm_slip_occr_dt);
		cstmt.setString(5, dm.rcpm_slip_clsf_cd);
		cstmt.setString(6, dm.rcpm_slip_seq);
		cstmt.setString(7, dm.rcpm_slip_sub_seq);
		cstmt.setString(8, dm.incmg_pers);
		cstmt.setString(9, dm.incmg_pers_ipadd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2153_DDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("rcpm_slip_occr_dt = [" + getRcpm_slip_occr_dt() + "]");
		System.out.println("rcpm_slip_clsf_cd = [" + getRcpm_slip_clsf_cd() + "]");
		System.out.println("rcpm_slip_seq = [" + getRcpm_slip_seq() + "]");
		System.out.println("rcpm_slip_sub_seq = [" + getRcpm_slip_sub_seq() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
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
String rcpm_slip_occr_dt = req.getParameter("rcpm_slip_occr_dt");
if( rcpm_slip_occr_dt == null){
	System.out.println(this.toString+" : rcpm_slip_occr_dt is null" );
}else{
	System.out.println(this.toString+" : rcpm_slip_occr_dt is "+rcpm_slip_occr_dt );
}
String rcpm_slip_clsf_cd = req.getParameter("rcpm_slip_clsf_cd");
if( rcpm_slip_clsf_cd == null){
	System.out.println(this.toString+" : rcpm_slip_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : rcpm_slip_clsf_cd is "+rcpm_slip_clsf_cd );
}
String rcpm_slip_seq = req.getParameter("rcpm_slip_seq");
if( rcpm_slip_seq == null){
	System.out.println(this.toString+" : rcpm_slip_seq is null" );
}else{
	System.out.println(this.toString+" : rcpm_slip_seq is "+rcpm_slip_seq );
}
String rcpm_slip_sub_seq = req.getParameter("rcpm_slip_sub_seq");
if( rcpm_slip_sub_seq == null){
	System.out.println(this.toString+" : rcpm_slip_sub_seq is null" );
}else{
	System.out.println(this.toString+" : rcpm_slip_sub_seq is "+rcpm_slip_sub_seq );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String rcpm_slip_occr_dt = Util.checkString(req.getParameter("rcpm_slip_occr_dt"));
String rcpm_slip_clsf_cd = Util.checkString(req.getParameter("rcpm_slip_clsf_cd"));
String rcpm_slip_seq = Util.checkString(req.getParameter("rcpm_slip_seq"));
String rcpm_slip_sub_seq = Util.checkString(req.getParameter("rcpm_slip_sub_seq"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String rcpm_slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_slip_occr_dt")));
String rcpm_slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_slip_clsf_cd")));
String rcpm_slip_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_slip_seq")));
String rcpm_slip_sub_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_slip_sub_seq")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setRcpm_slip_occr_dt(rcpm_slip_occr_dt);
dm.setRcpm_slip_clsf_cd(rcpm_slip_clsf_cd);
dm.setRcpm_slip_seq(rcpm_slip_seq);
dm.setRcpm_slip_sub_seq(rcpm_slip_sub_seq);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 29 21:26:44 KST 2009 */