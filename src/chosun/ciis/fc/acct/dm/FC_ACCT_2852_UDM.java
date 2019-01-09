/***************************************************************************************************
* 파일명 : FC_ACCT_2852_U
* 기능 : 입금표반납처리등록
* 작성일자 : 2009-01-13
* 작성자 : 전현표
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
 * 입금표반납처리등록
 *
 */

public class FC_ACCT_2852_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String rcpm_shet_kind;
	public String rcpm_shet_no;
	public String widr_resn;
	public String widr_dt;
	public String rsrt_pers_emp_no;
	public String rcpm_shet_stat;
	public String rmks;
	public String rcpm_shet_dlv_dt;
	public String incmg_pers;

	public FC_ACCT_2852_UDM(){}
	public FC_ACCT_2852_UDM(String cmpy_cd, String rcpm_shet_kind, String rcpm_shet_no, String widr_resn, String widr_dt, String rsrt_pers_emp_no, String rcpm_shet_stat, String rmks, String rcpm_shet_dlv_dt, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.rcpm_shet_kind = rcpm_shet_kind;
		this.rcpm_shet_no = rcpm_shet_no;
		this.widr_resn = widr_resn;
		this.widr_dt = widr_dt;
		this.rsrt_pers_emp_no = rsrt_pers_emp_no;
		this.rcpm_shet_stat = rcpm_shet_stat;
		this.rmks = rmks;
		this.rcpm_shet_dlv_dt = rcpm_shet_dlv_dt;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setRcpm_shet_kind(String rcpm_shet_kind){
		this.rcpm_shet_kind = rcpm_shet_kind;
	}

	public void setRcpm_shet_no(String rcpm_shet_no){
		this.rcpm_shet_no = rcpm_shet_no;
	}

	public void setWidr_resn(String widr_resn){
		this.widr_resn = widr_resn;
	}

	public void setWidr_dt(String widr_dt){
		this.widr_dt = widr_dt;
	}

	public void setRsrt_pers_emp_no(String rsrt_pers_emp_no){
		this.rsrt_pers_emp_no = rsrt_pers_emp_no;
	}

	public void setRcpm_shet_stat(String rcpm_shet_stat){
		this.rcpm_shet_stat = rcpm_shet_stat;
	}

	public void setRmks(String rmks){
		this.rmks = rmks;
	}

	public void setRcpm_shet_dlv_dt(String rcpm_shet_dlv_dt){
		this.rcpm_shet_dlv_dt = rcpm_shet_dlv_dt;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getRcpm_shet_kind(){
		return this.rcpm_shet_kind;
	}

	public String getRcpm_shet_no(){
		return this.rcpm_shet_no;
	}

	public String getWidr_resn(){
		return this.widr_resn;
	}

	public String getWidr_dt(){
		return this.widr_dt;
	}

	public String getRsrt_pers_emp_no(){
		return this.rsrt_pers_emp_no;
	}

	public String getRcpm_shet_stat(){
		return this.rcpm_shet_stat;
	}

	public String getRmks(){
		return this.rmks;
	}

	public String getRcpm_shet_dlv_dt(){
		return this.rcpm_shet_dlv_dt;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call SP_FC_ACCT_2852_U( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2852_UDM dm = (FC_ACCT_2852_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.rcpm_shet_kind);
		cstmt.setString(5, dm.rcpm_shet_no);
		cstmt.setString(6, dm.widr_resn);
		cstmt.setString(7, dm.widr_dt);
		cstmt.setString(8, dm.rsrt_pers_emp_no);
		cstmt.setString(9, dm.rcpm_shet_stat);
		cstmt.setString(10, dm.rmks);
		cstmt.setString(11, dm.rcpm_shet_dlv_dt);
		cstmt.setString(12, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2852_UDataSet();
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
String rcpm_shet_kind = req.getParameter("rcpm_shet_kind");
if( rcpm_shet_kind == null){
	System.out.println(this.toString+" : rcpm_shet_kind is null" );
}else{
	System.out.println(this.toString+" : rcpm_shet_kind is "+rcpm_shet_kind );
}
String rcpm_shet_no = req.getParameter("rcpm_shet_no");
if( rcpm_shet_no == null){
	System.out.println(this.toString+" : rcpm_shet_no is null" );
}else{
	System.out.println(this.toString+" : rcpm_shet_no is "+rcpm_shet_no );
}
String widr_resn = req.getParameter("widr_resn");
if( widr_resn == null){
	System.out.println(this.toString+" : widr_resn is null" );
}else{
	System.out.println(this.toString+" : widr_resn is "+widr_resn );
}
String widr_dt = req.getParameter("widr_dt");
if( widr_dt == null){
	System.out.println(this.toString+" : widr_dt is null" );
}else{
	System.out.println(this.toString+" : widr_dt is "+widr_dt );
}
String rsrt_pers_emp_no = req.getParameter("rsrt_pers_emp_no");
if( rsrt_pers_emp_no == null){
	System.out.println(this.toString+" : rsrt_pers_emp_no is null" );
}else{
	System.out.println(this.toString+" : rsrt_pers_emp_no is "+rsrt_pers_emp_no );
}
String rcpm_shet_stat = req.getParameter("rcpm_shet_stat");
if( rcpm_shet_stat == null){
	System.out.println(this.toString+" : rcpm_shet_stat is null" );
}else{
	System.out.println(this.toString+" : rcpm_shet_stat is "+rcpm_shet_stat );
}
String rmks = req.getParameter("rmks");
if( rmks == null){
	System.out.println(this.toString+" : rmks is null" );
}else{
	System.out.println(this.toString+" : rmks is "+rmks );
}
String rcpm_shet_dlv_dt = req.getParameter("rcpm_shet_dlv_dt");
if( rcpm_shet_dlv_dt == null){
	System.out.println(this.toString+" : rcpm_shet_dlv_dt is null" );
}else{
	System.out.println(this.toString+" : rcpm_shet_dlv_dt is "+rcpm_shet_dlv_dt );
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
String rcpm_shet_kind = Util.checkString(req.getParameter("rcpm_shet_kind"));
String rcpm_shet_no = Util.checkString(req.getParameter("rcpm_shet_no"));
String widr_resn = Util.checkString(req.getParameter("widr_resn"));
String widr_dt = Util.checkString(req.getParameter("widr_dt"));
String rsrt_pers_emp_no = Util.checkString(req.getParameter("rsrt_pers_emp_no"));
String rcpm_shet_stat = Util.checkString(req.getParameter("rcpm_shet_stat"));
String rmks = Util.checkString(req.getParameter("rmks"));
String rcpm_shet_dlv_dt = Util.checkString(req.getParameter("rcpm_shet_dlv_dt"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String rcpm_shet_kind = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_shet_kind")));
String rcpm_shet_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_shet_no")));
String widr_resn = Util.Uni2Ksc(Util.checkString(req.getParameter("widr_resn")));
String widr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("widr_dt")));
String rsrt_pers_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rsrt_pers_emp_no")));
String rcpm_shet_stat = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_shet_stat")));
String rmks = Util.Uni2Ksc(Util.checkString(req.getParameter("rmks")));
String rcpm_shet_dlv_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_shet_dlv_dt")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setRcpm_shet_kind(rcpm_shet_kind);
dm.setRcpm_shet_no(rcpm_shet_no);
dm.setWidr_resn(widr_resn);
dm.setWidr_dt(widr_dt);
dm.setRsrt_pers_emp_no(rsrt_pers_emp_no);
dm.setRcpm_shet_stat(rcpm_shet_stat);
dm.setRmks(rmks);
dm.setRcpm_shet_dlv_dt(rcpm_shet_dlv_dt);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jan 21 14:54:55 KST 2009 */
