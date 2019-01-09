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


package chosun.ciis.is.sal.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.sal.ds.*;
import chosun.ciis.is.sal.rec.*;

/**
 * 
 */


public class IS_SAL_1020_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String make_dt_fr;
	public String make_dt_to;
	public String slip_occr_dt_fr;
	public String slip_occr_dt_to;
	public String dlco_clsf_cd_seq;
	public String erplace_cd;
	public String prof_type_cd;
	public String incmg_pers;

	public IS_SAL_1020_LDM(){}
	public IS_SAL_1020_LDM(String cmpy_cd, String make_dt_fr, String make_dt_to, String slip_occr_dt_fr, String slip_occr_dt_to, String dlco_clsf_cd_seq, String erplace_cd, String prof_type_cd, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.make_dt_fr = make_dt_fr;
		this.make_dt_to = make_dt_to;
		this.slip_occr_dt_fr = slip_occr_dt_fr;
		this.slip_occr_dt_to = slip_occr_dt_to;
		this.dlco_clsf_cd_seq = dlco_clsf_cd_seq;
		this.erplace_cd = erplace_cd;
		this.prof_type_cd = prof_type_cd;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMake_dt_fr(String make_dt_fr){
		this.make_dt_fr = make_dt_fr;
	}

	public void setMake_dt_to(String make_dt_to){
		this.make_dt_to = make_dt_to;
	}

	public void setSlip_occr_dt_fr(String slip_occr_dt_fr){
		this.slip_occr_dt_fr = slip_occr_dt_fr;
	}

	public void setSlip_occr_dt_to(String slip_occr_dt_to){
		this.slip_occr_dt_to = slip_occr_dt_to;
	}

	public void setDlco_clsf_cd_seq(String dlco_clsf_cd_seq){
		this.dlco_clsf_cd_seq = dlco_clsf_cd_seq;
	}

	public void setErplace_cd(String erplace_cd){
		this.erplace_cd = erplace_cd;
	}

	public void setProf_type_cd(String prof_type_cd){
		this.prof_type_cd = prof_type_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMake_dt_fr(){
		return this.make_dt_fr;
	}

	public String getMake_dt_to(){
		return this.make_dt_to;
	}

	public String getSlip_occr_dt_fr(){
		return this.slip_occr_dt_fr;
	}

	public String getSlip_occr_dt_to(){
		return this.slip_occr_dt_to;
	}

	public String getDlco_clsf_cd_seq(){
		return this.dlco_clsf_cd_seq;
	}

	public String getErplace_cd(){
		return this.erplace_cd;
	}

	public String getProf_type_cd(){
		return this.prof_type_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_SAL_1020_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_SAL_1020_LDM dm = (IS_SAL_1020_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.make_dt_fr);
		cstmt.setString(5, dm.make_dt_to);
		cstmt.setString(6, dm.slip_occr_dt_fr);
		cstmt.setString(7, dm.slip_occr_dt_to);
		cstmt.setString(8, dm.dlco_clsf_cd_seq);
		cstmt.setString(9, dm.erplace_cd);
		cstmt.setString(10, dm.prof_type_cd);
		cstmt.setString(11, dm.incmg_pers);
		cstmt.registerOutParameter(12, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.sal.ds.IS_SAL_1020_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("make_dt_fr = [" + getMake_dt_fr() + "]");
		System.out.println("make_dt_to = [" + getMake_dt_to() + "]");
		System.out.println("slip_occr_dt_fr = [" + getSlip_occr_dt_fr() + "]");
		System.out.println("slip_occr_dt_to = [" + getSlip_occr_dt_to() + "]");
		System.out.println("dlco_clsf_cd_seq = [" + getDlco_clsf_cd_seq() + "]");
		System.out.println("erplace_cd = [" + getErplace_cd() + "]");
		System.out.println("prof_type_cd = [" + getProf_type_cd() + "]");
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
String make_dt_fr = req.getParameter("make_dt_fr");
if( make_dt_fr == null){
	System.out.println(this.toString+" : make_dt_fr is null" );
}else{
	System.out.println(this.toString+" : make_dt_fr is "+make_dt_fr );
}
String make_dt_to = req.getParameter("make_dt_to");
if( make_dt_to == null){
	System.out.println(this.toString+" : make_dt_to is null" );
}else{
	System.out.println(this.toString+" : make_dt_to is "+make_dt_to );
}
String slip_occr_dt_fr = req.getParameter("slip_occr_dt_fr");
if( slip_occr_dt_fr == null){
	System.out.println(this.toString+" : slip_occr_dt_fr is null" );
}else{
	System.out.println(this.toString+" : slip_occr_dt_fr is "+slip_occr_dt_fr );
}
String slip_occr_dt_to = req.getParameter("slip_occr_dt_to");
if( slip_occr_dt_to == null){
	System.out.println(this.toString+" : slip_occr_dt_to is null" );
}else{
	System.out.println(this.toString+" : slip_occr_dt_to is "+slip_occr_dt_to );
}
String dlco_clsf_cd_seq = req.getParameter("dlco_clsf_cd_seq");
if( dlco_clsf_cd_seq == null){
	System.out.println(this.toString+" : dlco_clsf_cd_seq is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf_cd_seq is "+dlco_clsf_cd_seq );
}
String erplace_cd = req.getParameter("erplace_cd");
if( erplace_cd == null){
	System.out.println(this.toString+" : erplace_cd is null" );
}else{
	System.out.println(this.toString+" : erplace_cd is "+erplace_cd );
}
String prof_type_cd = req.getParameter("prof_type_cd");
if( prof_type_cd == null){
	System.out.println(this.toString+" : prof_type_cd is null" );
}else{
	System.out.println(this.toString+" : prof_type_cd is "+prof_type_cd );
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
String make_dt_fr = Util.checkString(req.getParameter("make_dt_fr"));
String make_dt_to = Util.checkString(req.getParameter("make_dt_to"));
String slip_occr_dt_fr = Util.checkString(req.getParameter("slip_occr_dt_fr"));
String slip_occr_dt_to = Util.checkString(req.getParameter("slip_occr_dt_to"));
String dlco_clsf_cd_seq = Util.checkString(req.getParameter("dlco_clsf_cd_seq"));
String erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
String prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String make_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("make_dt_fr")));
String make_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("make_dt_to")));
String slip_occr_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt_fr")));
String slip_occr_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt_to")));
String dlco_clsf_cd_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd_seq")));
String erplace_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("erplace_cd")));
String prof_type_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("prof_type_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMake_dt_fr(make_dt_fr);
dm.setMake_dt_to(make_dt_to);
dm.setSlip_occr_dt_fr(slip_occr_dt_fr);
dm.setSlip_occr_dt_to(slip_occr_dt_to);
dm.setDlco_clsf_cd_seq(dlco_clsf_cd_seq);
dm.setErplace_cd(erplace_cd);
dm.setProf_type_cd(prof_type_cd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 10 13:31:21 KST 2012 */