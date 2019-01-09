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


public class FC_ACCT_2172_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String slip_occr_dt;
	public String slip_clsf_cd;
	public String slip_seq;
	public String tmsg_type;
	public String stmt_clsf;
	public String pers_clsf;
	public String semuro_id;
	public String incmg_pers_ip;
	public String incmg_pers;

	public FC_ACCT_2172_ADM(){}
	public FC_ACCT_2172_ADM(String cmpy_cd, String slip_occr_dt, String slip_clsf_cd, String slip_seq, String tmsg_type, String stmt_clsf, String pers_clsf, String semuro_id, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.slip_occr_dt = slip_occr_dt;
		this.slip_clsf_cd = slip_clsf_cd;
		this.slip_seq = slip_seq;
		this.tmsg_type = tmsg_type;
		this.stmt_clsf = stmt_clsf;
		this.pers_clsf = pers_clsf;
		this.semuro_id = semuro_id;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
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

	public void setTmsg_type(String tmsg_type){
		this.tmsg_type = tmsg_type;
	}

	public void setStmt_clsf(String stmt_clsf){
		this.stmt_clsf = stmt_clsf;
	}

	public void setPers_clsf(String pers_clsf){
		this.pers_clsf = pers_clsf;
	}

	public void setSemuro_id(String semuro_id){
		this.semuro_id = semuro_id;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
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

	public String getTmsg_type(){
		return this.tmsg_type;
	}

	public String getStmt_clsf(){
		return this.stmt_clsf;
	}

	public String getPers_clsf(){
		return this.pers_clsf;
	}

	public String getSemuro_id(){
		return this.semuro_id;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2172_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2172_ADM dm = (FC_ACCT_2172_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.slip_occr_dt);
		cstmt.setString(5, dm.slip_clsf_cd);
		cstmt.setString(6, dm.slip_seq);
		cstmt.setString(7, dm.tmsg_type);
		cstmt.setString(8, dm.stmt_clsf);
		cstmt.setString(9, dm.pers_clsf);
		cstmt.setString(10, dm.semuro_id);
		cstmt.setString(11, dm.incmg_pers_ip);
		cstmt.setString(12, dm.incmg_pers);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2172_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("slip_occr_dt = [" + getSlip_occr_dt() + "]");
		System.out.println("slip_clsf_cd = [" + getSlip_clsf_cd() + "]");
		System.out.println("slip_seq = [" + getSlip_seq() + "]");
		System.out.println("tmsg_type = [" + getTmsg_type() + "]");
		System.out.println("stmt_clsf = [" + getStmt_clsf() + "]");
		System.out.println("pers_clsf = [" + getPers_clsf() + "]");
		System.out.println("semuro_id = [" + getSemuro_id() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
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
String tmsg_type = req.getParameter("tmsg_type");
if( tmsg_type == null){
	System.out.println(this.toString+" : tmsg_type is null" );
}else{
	System.out.println(this.toString+" : tmsg_type is "+tmsg_type );
}
String stmt_clsf = req.getParameter("stmt_clsf");
if( stmt_clsf == null){
	System.out.println(this.toString+" : stmt_clsf is null" );
}else{
	System.out.println(this.toString+" : stmt_clsf is "+stmt_clsf );
}
String pers_clsf = req.getParameter("pers_clsf");
if( pers_clsf == null){
	System.out.println(this.toString+" : pers_clsf is null" );
}else{
	System.out.println(this.toString+" : pers_clsf is "+pers_clsf );
}
String semuro_id = req.getParameter("semuro_id");
if( semuro_id == null){
	System.out.println(this.toString+" : semuro_id is null" );
}else{
	System.out.println(this.toString+" : semuro_id is "+semuro_id );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
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
String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
String slip_seq = Util.checkString(req.getParameter("slip_seq"));
String tmsg_type = Util.checkString(req.getParameter("tmsg_type"));
String stmt_clsf = Util.checkString(req.getParameter("stmt_clsf"));
String pers_clsf = Util.checkString(req.getParameter("pers_clsf"));
String semuro_id = Util.checkString(req.getParameter("semuro_id"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt")));
String slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd")));
String slip_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_seq")));
String tmsg_type = Util.Uni2Ksc(Util.checkString(req.getParameter("tmsg_type")));
String stmt_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("stmt_clsf")));
String pers_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("pers_clsf")));
String semuro_id = Util.Uni2Ksc(Util.checkString(req.getParameter("semuro_id")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSlip_occr_dt(slip_occr_dt);
dm.setSlip_clsf_cd(slip_clsf_cd);
dm.setSlip_seq(slip_seq);
dm.setTmsg_type(tmsg_type);
dm.setStmt_clsf(stmt_clsf);
dm.setPers_clsf(pers_clsf);
dm.setSemuro_id(semuro_id);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Aug 14 10:07:22 KST 2009 */