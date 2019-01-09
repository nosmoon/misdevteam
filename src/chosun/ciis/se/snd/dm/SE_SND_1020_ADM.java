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


package chosun.ciis.se.snd.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.snd.ds.*;
import chosun.ciis.se.snd.rec.*;

/**
 * 
 */


public class SE_SND_1020_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String rptv_route_clsf;
	public String rptv_route_cd;
	public String rptv_route_nm;
	public String prt_plac_cd;
	public String ecnt_cd;
	public String ledt_cd;
	public String route_rank;
	public String route_cd;
	public String route_nm;
	public String prt_plac_cd_key;
	public String rptv_route_clsf_key;
	public String rptv_route_cd_key;
	public String incmg_pers_ip;
	public String incmg_pers;

	public SE_SND_1020_ADM(){}
	public SE_SND_1020_ADM(String cmpy_cd, String mode, String rptv_route_clsf, String rptv_route_cd, String rptv_route_nm, String prt_plac_cd, String ecnt_cd, String ledt_cd, String route_rank, String route_cd, String route_nm, String prt_plac_cd_key, String rptv_route_clsf_key, String rptv_route_cd_key, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.rptv_route_clsf = rptv_route_clsf;
		this.rptv_route_cd = rptv_route_cd;
		this.rptv_route_nm = rptv_route_nm;
		this.prt_plac_cd = prt_plac_cd;
		this.ecnt_cd = ecnt_cd;
		this.ledt_cd = ledt_cd;
		this.route_rank = route_rank;
		this.route_cd = route_cd;
		this.route_nm = route_nm;
		this.prt_plac_cd_key = prt_plac_cd_key;
		this.rptv_route_clsf_key = rptv_route_clsf_key;
		this.rptv_route_cd_key = rptv_route_cd_key;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setRptv_route_clsf(String rptv_route_clsf){
		this.rptv_route_clsf = rptv_route_clsf;
	}

	public void setRptv_route_cd(String rptv_route_cd){
		this.rptv_route_cd = rptv_route_cd;
	}

	public void setRptv_route_nm(String rptv_route_nm){
		this.rptv_route_nm = rptv_route_nm;
	}

	public void setPrt_plac_cd(String prt_plac_cd){
		this.prt_plac_cd = prt_plac_cd;
	}

	public void setEcnt_cd(String ecnt_cd){
		this.ecnt_cd = ecnt_cd;
	}

	public void setLedt_cd(String ledt_cd){
		this.ledt_cd = ledt_cd;
	}

	public void setRoute_rank(String route_rank){
		this.route_rank = route_rank;
	}

	public void setRoute_cd(String route_cd){
		this.route_cd = route_cd;
	}

	public void setRoute_nm(String route_nm){
		this.route_nm = route_nm;
	}

	public void setPrt_plac_cd_key(String prt_plac_cd_key){
		this.prt_plac_cd_key = prt_plac_cd_key;
	}

	public void setRptv_route_clsf_key(String rptv_route_clsf_key){
		this.rptv_route_clsf_key = rptv_route_clsf_key;
	}

	public void setRptv_route_cd_key(String rptv_route_cd_key){
		this.rptv_route_cd_key = rptv_route_cd_key;
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

	public String getMode(){
		return this.mode;
	}

	public String getRptv_route_clsf(){
		return this.rptv_route_clsf;
	}

	public String getRptv_route_cd(){
		return this.rptv_route_cd;
	}

	public String getRptv_route_nm(){
		return this.rptv_route_nm;
	}

	public String getPrt_plac_cd(){
		return this.prt_plac_cd;
	}

	public String getEcnt_cd(){
		return this.ecnt_cd;
	}

	public String getLedt_cd(){
		return this.ledt_cd;
	}

	public String getRoute_rank(){
		return this.route_rank;
	}

	public String getRoute_cd(){
		return this.route_cd;
	}

	public String getRoute_nm(){
		return this.route_nm;
	}

	public String getPrt_plac_cd_key(){
		return this.prt_plac_cd_key;
	}

	public String getRptv_route_clsf_key(){
		return this.rptv_route_clsf_key;
	}

	public String getRptv_route_cd_key(){
		return this.rptv_route_cd_key;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_SND_1020_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_SND_1020_ADM dm = (SE_SND_1020_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.rptv_route_clsf);
		cstmt.setString(6, dm.rptv_route_cd);
		cstmt.setString(7, dm.rptv_route_nm);
		cstmt.setString(8, dm.prt_plac_cd);
		cstmt.setString(9, dm.ecnt_cd);
		cstmt.setString(10, dm.ledt_cd);
		cstmt.setString(11, dm.route_rank);
		cstmt.setString(12, dm.route_cd);
		cstmt.setString(13, dm.route_nm);
		cstmt.setString(14, dm.prt_plac_cd_key);
		cstmt.setString(15, dm.rptv_route_clsf_key);
		cstmt.setString(16, dm.rptv_route_cd_key);
		cstmt.setString(17, dm.incmg_pers_ip);
		cstmt.setString(18, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.snd.ds.SE_SND_1020_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("rptv_route_clsf = [" + getRptv_route_clsf() + "]");
		System.out.println("rptv_route_cd = [" + getRptv_route_cd() + "]");
		System.out.println("rptv_route_nm = [" + getRptv_route_nm() + "]");
		System.out.println("prt_plac_cd = [" + getPrt_plac_cd() + "]");
		System.out.println("ecnt_cd = [" + getEcnt_cd() + "]");
		System.out.println("ledt_cd = [" + getLedt_cd() + "]");
		System.out.println("route_rank = [" + getRoute_rank() + "]");
		System.out.println("route_cd = [" + getRoute_cd() + "]");
		System.out.println("route_nm = [" + getRoute_nm() + "]");
		System.out.println("prt_plac_cd_key = [" + getPrt_plac_cd_key() + "]");
		System.out.println("rptv_route_clsf_key = [" + getRptv_route_clsf_key() + "]");
		System.out.println("rptv_route_cd_key = [" + getRptv_route_cd_key() + "]");
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
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String rptv_route_clsf = req.getParameter("rptv_route_clsf");
if( rptv_route_clsf == null){
	System.out.println(this.toString+" : rptv_route_clsf is null" );
}else{
	System.out.println(this.toString+" : rptv_route_clsf is "+rptv_route_clsf );
}
String rptv_route_cd = req.getParameter("rptv_route_cd");
if( rptv_route_cd == null){
	System.out.println(this.toString+" : rptv_route_cd is null" );
}else{
	System.out.println(this.toString+" : rptv_route_cd is "+rptv_route_cd );
}
String rptv_route_nm = req.getParameter("rptv_route_nm");
if( rptv_route_nm == null){
	System.out.println(this.toString+" : rptv_route_nm is null" );
}else{
	System.out.println(this.toString+" : rptv_route_nm is "+rptv_route_nm );
}
String prt_plac_cd = req.getParameter("prt_plac_cd");
if( prt_plac_cd == null){
	System.out.println(this.toString+" : prt_plac_cd is null" );
}else{
	System.out.println(this.toString+" : prt_plac_cd is "+prt_plac_cd );
}
String ecnt_cd = req.getParameter("ecnt_cd");
if( ecnt_cd == null){
	System.out.println(this.toString+" : ecnt_cd is null" );
}else{
	System.out.println(this.toString+" : ecnt_cd is "+ecnt_cd );
}
String ledt_cd = req.getParameter("ledt_cd");
if( ledt_cd == null){
	System.out.println(this.toString+" : ledt_cd is null" );
}else{
	System.out.println(this.toString+" : ledt_cd is "+ledt_cd );
}
String route_rank = req.getParameter("route_rank");
if( route_rank == null){
	System.out.println(this.toString+" : route_rank is null" );
}else{
	System.out.println(this.toString+" : route_rank is "+route_rank );
}
String route_cd = req.getParameter("route_cd");
if( route_cd == null){
	System.out.println(this.toString+" : route_cd is null" );
}else{
	System.out.println(this.toString+" : route_cd is "+route_cd );
}
String route_nm = req.getParameter("route_nm");
if( route_nm == null){
	System.out.println(this.toString+" : route_nm is null" );
}else{
	System.out.println(this.toString+" : route_nm is "+route_nm );
}
String prt_plac_cd_key = req.getParameter("prt_plac_cd_key");
if( prt_plac_cd_key == null){
	System.out.println(this.toString+" : prt_plac_cd_key is null" );
}else{
	System.out.println(this.toString+" : prt_plac_cd_key is "+prt_plac_cd_key );
}
String rptv_route_clsf_key = req.getParameter("rptv_route_clsf_key");
if( rptv_route_clsf_key == null){
	System.out.println(this.toString+" : rptv_route_clsf_key is null" );
}else{
	System.out.println(this.toString+" : rptv_route_clsf_key is "+rptv_route_clsf_key );
}
String rptv_route_cd_key = req.getParameter("rptv_route_cd_key");
if( rptv_route_cd_key == null){
	System.out.println(this.toString+" : rptv_route_cd_key is null" );
}else{
	System.out.println(this.toString+" : rptv_route_cd_key is "+rptv_route_cd_key );
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
String mode = Util.checkString(req.getParameter("mode"));
String rptv_route_clsf = Util.checkString(req.getParameter("rptv_route_clsf"));
String rptv_route_cd = Util.checkString(req.getParameter("rptv_route_cd"));
String rptv_route_nm = Util.checkString(req.getParameter("rptv_route_nm"));
String prt_plac_cd = Util.checkString(req.getParameter("prt_plac_cd"));
String ecnt_cd = Util.checkString(req.getParameter("ecnt_cd"));
String ledt_cd = Util.checkString(req.getParameter("ledt_cd"));
String route_rank = Util.checkString(req.getParameter("route_rank"));
String route_cd = Util.checkString(req.getParameter("route_cd"));
String route_nm = Util.checkString(req.getParameter("route_nm"));
String prt_plac_cd_key = Util.checkString(req.getParameter("prt_plac_cd_key"));
String rptv_route_clsf_key = Util.checkString(req.getParameter("rptv_route_clsf_key"));
String rptv_route_cd_key = Util.checkString(req.getParameter("rptv_route_cd_key"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String rptv_route_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("rptv_route_clsf")));
String rptv_route_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("rptv_route_cd")));
String rptv_route_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("rptv_route_nm")));
String prt_plac_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_plac_cd")));
String ecnt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("ecnt_cd")));
String ledt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("ledt_cd")));
String route_rank = Util.Uni2Ksc(Util.checkString(req.getParameter("route_rank")));
String route_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("route_cd")));
String route_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("route_nm")));
String prt_plac_cd_key = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_plac_cd_key")));
String rptv_route_clsf_key = Util.Uni2Ksc(Util.checkString(req.getParameter("rptv_route_clsf_key")));
String rptv_route_cd_key = Util.Uni2Ksc(Util.checkString(req.getParameter("rptv_route_cd_key")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setRptv_route_clsf(rptv_route_clsf);
dm.setRptv_route_cd(rptv_route_cd);
dm.setRptv_route_nm(rptv_route_nm);
dm.setPrt_plac_cd(prt_plac_cd);
dm.setEcnt_cd(ecnt_cd);
dm.setLedt_cd(ledt_cd);
dm.setRoute_rank(route_rank);
dm.setRoute_cd(route_cd);
dm.setRoute_nm(route_nm);
dm.setPrt_plac_cd_key(prt_plac_cd_key);
dm.setRptv_route_clsf_key(rptv_route_clsf_key);
dm.setRptv_route_cd_key(rptv_route_cd_key);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 09 17:18:48 KST 2009 */