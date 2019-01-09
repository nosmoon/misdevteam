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


package chosun.ciis.ad.res.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_RES_1320_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String medi_cd;
	public String chg_pers;
	public String auth;
	public String preng_occr_dt;
	public String preng_occr_seq;
	public String chrg_aprv;
	public String part_chf_aprv;
	public String team_chf_aprv;
	public String apr_advt_fee;

	public AD_RES_1320_UDM(){}
	public AD_RES_1320_UDM(String cmpy_cd, String medi_cd, String chg_pers, String auth, String preng_occr_dt, String preng_occr_seq, String chrg_aprv, String part_chf_aprv, String team_chf_aprv, String apr_advt_fee){
		this.cmpy_cd = cmpy_cd;
		this.medi_cd = medi_cd;
		this.chg_pers = chg_pers;
		this.auth = auth;
		this.preng_occr_dt = preng_occr_dt;
		this.preng_occr_seq = preng_occr_seq;
		this.chrg_aprv = chrg_aprv;
		this.part_chf_aprv = part_chf_aprv;
		this.team_chf_aprv = team_chf_aprv;
		this.apr_advt_fee = apr_advt_fee;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setAuth(String auth){
		this.auth = auth;
	}

	public void setPreng_occr_dt(String preng_occr_dt){
		this.preng_occr_dt = preng_occr_dt;
	}

	public void setPreng_occr_seq(String preng_occr_seq){
		this.preng_occr_seq = preng_occr_seq;
	}

	public void setChrg_aprv(String chrg_aprv){
		this.chrg_aprv = chrg_aprv;
	}

	public void setPart_chf_aprv(String part_chf_aprv){
		this.part_chf_aprv = part_chf_aprv;
	}

	public void setTeam_chf_aprv(String team_chf_aprv){
		this.team_chf_aprv = team_chf_aprv;
	}

	public void setApr_advt_fee(String apr_advt_fee){
		this.apr_advt_fee = apr_advt_fee;
	}
	
	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getAuth(){
		return this.auth;
	}

	public String getPreng_occr_dt(){
		return this.preng_occr_dt;
	}

	public String getPreng_occr_seq(){
		return this.preng_occr_seq;
	}

	public String getChrg_aprv(){
		return this.chrg_aprv;
	}

	public String getPart_chf_aprv(){
		return this.part_chf_aprv;
	}

	public String getTeam_chf_aprv(){
		return this.team_chf_aprv;
	}
	
	public String getApr_advt_fee(){
		return this.apr_advt_fee;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_RES_1320_U(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_RES_1320_UDM dm = (AD_RES_1320_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.medi_cd);
		cstmt.setString(5, dm.chg_pers);
		cstmt.setString(6, dm.auth);
		cstmt.setString(7, dm.preng_occr_dt);
		cstmt.setString(8, dm.preng_occr_seq);
		cstmt.setString(9, dm.chrg_aprv);
		cstmt.setString(10, dm.part_chf_aprv);
		cstmt.setString(11, dm.team_chf_aprv);
		cstmt.setString(12, dm.apr_advt_fee);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.res.ds.AD_RES_1320_UDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("chg_pers = [" + getChg_pers() + "]");
		System.out.println("auth = [" + getAuth() + "]");
		System.out.println("preng_occr_dt = [" + getPreng_occr_dt() + "]");
		System.out.println("preng_occr_seq = [" + getPreng_occr_seq() + "]");
		System.out.println("chrg_aprv = [" + getChrg_aprv() + "]");
		System.out.println("part_chf_aprv = [" + getPart_chf_aprv() + "]");
		System.out.println("team_chf_aprv = [" + getTeam_chf_aprv() + "]");
		System.out.println("apr_advt_fee = [" + getApr_advt_fee() + "]");
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
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String chg_pers = req.getParameter("chg_pers");
if( chg_pers == null){
	System.out.println(this.toString+" : chg_pers is null" );
}else{
	System.out.println(this.toString+" : chg_pers is "+chg_pers );
}
String auth = req.getParameter("auth");
if( auth == null){
	System.out.println(this.toString+" : auth is null" );
}else{
	System.out.println(this.toString+" : auth is "+auth );
}
String preng_occr_dt = req.getParameter("preng_occr_dt");
if( preng_occr_dt == null){
	System.out.println(this.toString+" : preng_occr_dt is null" );
}else{
	System.out.println(this.toString+" : preng_occr_dt is "+preng_occr_dt );
}
String preng_occr_seq = req.getParameter("preng_occr_seq");
if( preng_occr_seq == null){
	System.out.println(this.toString+" : preng_occr_seq is null" );
}else{
	System.out.println(this.toString+" : preng_occr_seq is "+preng_occr_seq );
}
String chrg_aprv = req.getParameter("chrg_aprv");
if( chrg_aprv == null){
	System.out.println(this.toString+" : chrg_aprv is null" );
}else{
	System.out.println(this.toString+" : chrg_aprv is "+chrg_aprv );
}
String part_chf_aprv = req.getParameter("part_chf_aprv");
if( part_chf_aprv == null){
	System.out.println(this.toString+" : part_chf_aprv is null" );
}else{
	System.out.println(this.toString+" : part_chf_aprv is "+part_chf_aprv );
}
String team_chf_aprv = req.getParameter("team_chf_aprv");
if( team_chf_aprv == null){
	System.out.println(this.toString+" : team_chf_aprv is null" );
}else{
	System.out.println(this.toString+" : team_chf_aprv is "+team_chf_aprv );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
String auth = Util.checkString(req.getParameter("auth"));
String preng_occr_dt = Util.checkString(req.getParameter("preng_occr_dt"));
String preng_occr_seq = Util.checkString(req.getParameter("preng_occr_seq"));
String chrg_aprv = Util.checkString(req.getParameter("chrg_aprv"));
String part_chf_aprv = Util.checkString(req.getParameter("part_chf_aprv"));
String team_chf_aprv = Util.checkString(req.getParameter("team_chf_aprv"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
String auth = Util.Uni2Ksc(Util.checkString(req.getParameter("auth")));
String preng_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("preng_occr_dt")));
String preng_occr_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("preng_occr_seq")));
String chrg_aprv = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_aprv")));
String part_chf_aprv = Util.Uni2Ksc(Util.checkString(req.getParameter("part_chf_aprv")));
String team_chf_aprv = Util.Uni2Ksc(Util.checkString(req.getParameter("team_chf_aprv")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMedi_cd(medi_cd);
dm.setChg_pers(chg_pers);
dm.setAuth(auth);
dm.setPreng_occr_dt(preng_occr_dt);
dm.setPreng_occr_seq(preng_occr_seq);
dm.setChrg_aprv(chrg_aprv);
dm.setPart_chf_aprv(part_chf_aprv);
dm.setTeam_chf_aprv(team_chf_aprv);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 28 14:25:19 KST 2009 */