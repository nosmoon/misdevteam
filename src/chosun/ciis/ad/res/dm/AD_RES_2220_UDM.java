/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 정호근
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


public class AD_RES_2220_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String medi_cd;
	public String chg_pers;
	public String chg_dt_tm;
	public String auth;
	public String seq;
	public String preng_occr_dt;
	public String preng_occr_seq;
	public String chrg_aprv;
	public String team_chf_aprv;

	public AD_RES_2220_UDM(){}
	public AD_RES_2220_UDM(String cmpy_cd, String medi_cd, String chg_pers, String chg_dt_tm, String auth, String seq, String preng_occr_dt, String preng_occr_seq, String chrg_aprv, String team_chf_aprv){
		this.cmpy_cd = cmpy_cd;
		this.medi_cd = medi_cd;
		this.chg_pers = chg_pers;
		this.chg_dt_tm = chg_dt_tm;
		this.auth = auth;
		this.seq = seq;
		this.preng_occr_dt = preng_occr_dt;
		this.preng_occr_seq = preng_occr_seq;
		this.chrg_aprv = chrg_aprv;
		this.team_chf_aprv = team_chf_aprv;
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

	public void setChg_dt_tm(String chg_dt_tm){
		this.chg_dt_tm = chg_dt_tm;
	}

	public void setAuth(String auth){
		this.auth = auth;
	}

	public void setSeq(String seq){
		this.seq = seq;
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

	public void setTeam_chf_aprv(String team_chf_aprv){
		this.team_chf_aprv = team_chf_aprv;
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

	public String getChg_dt_tm(){
		return this.chg_dt_tm;
	}

	public String getAuth(){
		return this.auth;
	}

	public String getSeq(){
		return this.seq;
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

	public String getTeam_chf_aprv(){
		return this.team_chf_aprv;
	}

	public String getSQL(){
		 return "{ call SP_AD_RES_2220_U( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_RES_2220_UDM dm = (AD_RES_2220_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.medi_cd);
		cstmt.setString(5, dm.chg_pers);
		cstmt.setString(6, dm.chg_dt_tm);
		cstmt.setString(7, dm.auth);
		cstmt.setString(8, dm.seq);
		cstmt.setString(9, dm.preng_occr_dt);
		cstmt.setString(10, dm.preng_occr_seq);
		cstmt.setString(11, dm.chrg_aprv);
		cstmt.setString(12, dm.team_chf_aprv);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.res.ds.AD_RES_2220_UDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("medi_cd = " + getMedi_cd());
        System.out.println("chg_pers = " + getChg_pers());
        System.out.println("chg_dt_tm = " + getChg_dt_tm());
        System.out.println("auth = " + getAuth());
        System.out.println("seq = " + getSeq());
        System.out.println("preng_occr_dt = " + getPreng_occr_dt());
        System.out.println("preng_occr_seq = " + getPreng_occr_seq());
        System.out.println("chrg_aprv = " + getChrg_aprv());
        System.out.println("team_chf_aprv = " + getTeam_chf_aprv());
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
String chg_dt_tm = req.getParameter("chg_dt_tm");
if( chg_dt_tm == null){
	System.out.println(this.toString+" : chg_dt_tm is null" );
}else{
	System.out.println(this.toString+" : chg_dt_tm is "+chg_dt_tm );
}
String auth = req.getParameter("auth");
if( auth == null){
	System.out.println(this.toString+" : auth is null" );
}else{
	System.out.println(this.toString+" : auth is "+auth );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
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
String chg_dt_tm = Util.checkString(req.getParameter("chg_dt_tm"));
String auth = Util.checkString(req.getParameter("auth"));
String seq = Util.checkString(req.getParameter("seq"));
String preng_occr_dt = Util.checkString(req.getParameter("preng_occr_dt"));
String preng_occr_seq = Util.checkString(req.getParameter("preng_occr_seq"));
String chrg_aprv = Util.checkString(req.getParameter("chrg_aprv"));
String team_chf_aprv = Util.checkString(req.getParameter("team_chf_aprv"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
String chg_dt_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_dt_tm")));
String auth = Util.Uni2Ksc(Util.checkString(req.getParameter("auth")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String preng_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("preng_occr_dt")));
String preng_occr_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("preng_occr_seq")));
String chrg_aprv = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_aprv")));
String team_chf_aprv = Util.Uni2Ksc(Util.checkString(req.getParameter("team_chf_aprv")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMedi_cd(medi_cd);
dm.setChg_pers(chg_pers);
dm.setChg_dt_tm(chg_dt_tm);
dm.setAuth(auth);
dm.setSeq(seq);
dm.setPreng_occr_dt(preng_occr_dt);
dm.setPreng_occr_seq(preng_occr_seq);
dm.setChrg_aprv(chrg_aprv);
dm.setTeam_chf_aprv(team_chf_aprv);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Feb 11 11:33:09 KST 2009 */