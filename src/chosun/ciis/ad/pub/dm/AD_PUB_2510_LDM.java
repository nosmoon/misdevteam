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


package chosun.ciis.ad.pub.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.pub.ds.*;
import chosun.ciis.ad.pub.rec.*;

/**
 * 
 */


public class AD_PUB_2510_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String medi_cd;
	public String frdt;
	public String todt;
	public String today;
	public String wd_clsf;
	public String dt_clfs;
	public String nwsps;
	public String jasa_yb;
	public String chro_clsf;
	public String sect_clsf_cd;
	public String sect_nm_cd;
	public String sect_all;

	public AD_PUB_2510_LDM(){}
	public AD_PUB_2510_LDM(String cmpy_cd, String medi_cd, String frdt, String todt, String today, String wd_clsf, String dt_clfs, String nwsps, String jasa_yb, String chro_clsf, String sect_clsf_cd, String sect_nm_cd, String sect_all){
		this.cmpy_cd = cmpy_cd;
		this.medi_cd = medi_cd;
		this.frdt = frdt;
		this.todt = todt;
		this.today = today;
		this.wd_clsf = wd_clsf;
		this.dt_clfs = dt_clfs;
		this.nwsps = nwsps;
		this.jasa_yb = jasa_yb;
		this.chro_clsf = chro_clsf;
		this.sect_clsf_cd = sect_clsf_cd;
		this.sect_nm_cd = sect_nm_cd;
		this.sect_all = sect_all;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setToday(String today){
		this.today = today;
	}

	public void setWd_clsf(String wd_clsf){
		this.wd_clsf = wd_clsf;
	}

	public void setDt_clfs(String dt_clfs){
		this.dt_clfs = dt_clfs;
	}

	public void setNwsps(String nwsps){
		this.nwsps = nwsps;
	}

	public void setJasa_yb(String jasa_yb){
		this.jasa_yb = jasa_yb;
	}

	public void setChro_clsf(String chro_clsf){
		this.chro_clsf = chro_clsf;
	}

	public void setSect_clsf_cd(String sect_clsf_cd){
		this.sect_clsf_cd = sect_clsf_cd;
	}

	public void setSect_nm_cd(String sect_nm_cd){
		this.sect_nm_cd = sect_nm_cd;
	}

	public void setSect_all(String sect_all){
		this.sect_all = sect_all;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getToday(){
		return this.today;
	}

	public String getWd_clsf(){
		return this.wd_clsf;
	}

	public String getDt_clfs(){
		return this.dt_clfs;
	}

	public String getNwsps(){
		return this.nwsps;
	}

	public String getJasa_yb(){
		return this.jasa_yb;
	}

	public String getChro_clsf(){
		return this.chro_clsf;
	}

	public String getSect_clsf_cd(){
		return this.sect_clsf_cd;
	}

	public String getSect_nm_cd(){
		return this.sect_nm_cd;
	}

	public String getSect_all(){
		return this.sect_all;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_PUB_2510_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_PUB_2510_LDM dm = (AD_PUB_2510_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.medi_cd);
		cstmt.setString(5, dm.frdt);
		cstmt.setString(6, dm.todt);
		cstmt.setString(7, dm.today);
		cstmt.setString(8, dm.wd_clsf);
		cstmt.setString(9, dm.dt_clfs);
		cstmt.setString(10, dm.nwsps);
		cstmt.setString(11, dm.jasa_yb);
		cstmt.setString(12, dm.chro_clsf);
		cstmt.setString(13, dm.sect_clsf_cd);
		cstmt.setString(14, dm.sect_nm_cd);
		cstmt.setString(15, dm.sect_all);
		cstmt.registerOutParameter(16, Types.VARCHAR);
		cstmt.registerOutParameter(17, Types.VARCHAR);
		cstmt.registerOutParameter(18, Types.VARCHAR);
		cstmt.registerOutParameter(19, Types.VARCHAR);
		cstmt.registerOutParameter(20, Types.VARCHAR);
		cstmt.registerOutParameter(21, Types.VARCHAR);
		cstmt.registerOutParameter(22, Types.VARCHAR);
		cstmt.registerOutParameter(23, Types.VARCHAR);
		cstmt.registerOutParameter(24, Types.VARCHAR);
		cstmt.registerOutParameter(25, Types.VARCHAR);
		cstmt.registerOutParameter(26, Types.VARCHAR);
		cstmt.registerOutParameter(27, Types.VARCHAR);
		cstmt.registerOutParameter(28, Types.VARCHAR);
		cstmt.registerOutParameter(29, Types.VARCHAR);
		cstmt.registerOutParameter(30, Types.VARCHAR);
		cstmt.registerOutParameter(31, Types.VARCHAR);
		cstmt.registerOutParameter(32, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.pub.ds.AD_PUB_2510_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("frdt = [" + getFrdt() + "]");
		System.out.println("todt = [" + getTodt() + "]");
		System.out.println("today = [" + getToday() + "]");
		System.out.println("wd_clsf = [" + getWd_clsf() + "]");
		System.out.println("dt_clfs = [" + getDt_clfs() + "]");
		System.out.println("nwsps = [" + getNwsps() + "]");
		System.out.println("jasa_yb = [" + getJasa_yb() + "]");
		System.out.println("chro_clsf = [" + getChro_clsf() + "]");
		System.out.println("sect_clsf_cd = [" + getSect_clsf_cd() + "]");
		System.out.println("sect_nm_cd = [" + getSect_nm_cd() + "]");
		System.out.println("sect_all = [" + getSect_all() + "]");
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
String frdt = req.getParameter("frdt");
if( frdt == null){
	System.out.println(this.toString+" : frdt is null" );
}else{
	System.out.println(this.toString+" : frdt is "+frdt );
}
String todt = req.getParameter("todt");
if( todt == null){
	System.out.println(this.toString+" : todt is null" );
}else{
	System.out.println(this.toString+" : todt is "+todt );
}
String today = req.getParameter("today");
if( today == null){
	System.out.println(this.toString+" : today is null" );
}else{
	System.out.println(this.toString+" : today is "+today );
}
String wd_clsf = req.getParameter("wd_clsf");
if( wd_clsf == null){
	System.out.println(this.toString+" : wd_clsf is null" );
}else{
	System.out.println(this.toString+" : wd_clsf is "+wd_clsf );
}
String dt_clfs = req.getParameter("dt_clfs");
if( dt_clfs == null){
	System.out.println(this.toString+" : dt_clfs is null" );
}else{
	System.out.println(this.toString+" : dt_clfs is "+dt_clfs );
}
String nwsps = req.getParameter("nwsps");
if( nwsps == null){
	System.out.println(this.toString+" : nwsps is null" );
}else{
	System.out.println(this.toString+" : nwsps is "+nwsps );
}
String jasa_yb = req.getParameter("jasa_yb");
if( jasa_yb == null){
	System.out.println(this.toString+" : jasa_yb is null" );
}else{
	System.out.println(this.toString+" : jasa_yb is "+jasa_yb );
}
String chro_clsf = req.getParameter("chro_clsf");
if( chro_clsf == null){
	System.out.println(this.toString+" : chro_clsf is null" );
}else{
	System.out.println(this.toString+" : chro_clsf is "+chro_clsf );
}
String sect_clsf_cd = req.getParameter("sect_clsf_cd");
if( sect_clsf_cd == null){
	System.out.println(this.toString+" : sect_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : sect_clsf_cd is "+sect_clsf_cd );
}
String sect_nm_cd = req.getParameter("sect_nm_cd");
if( sect_nm_cd == null){
	System.out.println(this.toString+" : sect_nm_cd is null" );
}else{
	System.out.println(this.toString+" : sect_nm_cd is "+sect_nm_cd );
}
String sect_all = req.getParameter("sect_all");
if( sect_all == null){
	System.out.println(this.toString+" : sect_all is null" );
}else{
	System.out.println(this.toString+" : sect_all is "+sect_all );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String today = Util.checkString(req.getParameter("today"));
String wd_clsf = Util.checkString(req.getParameter("wd_clsf"));
String dt_clfs = Util.checkString(req.getParameter("dt_clfs"));
String nwsps = Util.checkString(req.getParameter("nwsps"));
String jasa_yb = Util.checkString(req.getParameter("jasa_yb"));
String chro_clsf = Util.checkString(req.getParameter("chro_clsf"));
String sect_clsf_cd = Util.checkString(req.getParameter("sect_clsf_cd"));
String sect_nm_cd = Util.checkString(req.getParameter("sect_nm_cd"));
String sect_all = Util.checkString(req.getParameter("sect_all"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String today = Util.Uni2Ksc(Util.checkString(req.getParameter("today")));
String wd_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("wd_clsf")));
String dt_clfs = Util.Uni2Ksc(Util.checkString(req.getParameter("dt_clfs")));
String nwsps = Util.Uni2Ksc(Util.checkString(req.getParameter("nwsps")));
String jasa_yb = Util.Uni2Ksc(Util.checkString(req.getParameter("jasa_yb")));
String chro_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("chro_clsf")));
String sect_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_clsf_cd")));
String sect_nm_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_nm_cd")));
String sect_all = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_all")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMedi_cd(medi_cd);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setToday(today);
dm.setWd_clsf(wd_clsf);
dm.setDt_clfs(dt_clfs);
dm.setNwsps(nwsps);
dm.setJasa_yb(jasa_yb);
dm.setChro_clsf(chro_clsf);
dm.setSect_clsf_cd(sect_clsf_cd);
dm.setSect_nm_cd(sect_nm_cd);
dm.setSect_all(sect_all);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jul 31 18:46:09 KST 2017 */