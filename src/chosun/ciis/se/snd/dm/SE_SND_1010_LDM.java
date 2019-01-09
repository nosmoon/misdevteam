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


public class SE_SND_1010_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String prt_plac_cd;
	public String route_clsf;
	public String ecnt_cd;
	public String ledt_cd;
	public String medi_cd;
	public String qty_yn;
	public String incmg_pers;

	public SE_SND_1010_LDM(){}
	public SE_SND_1010_LDM(String cmpy_cd, String prt_plac_cd, String route_clsf, String ecnt_cd, String ledt_cd, String medi_cd, String qty_yn, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.prt_plac_cd = prt_plac_cd;
		this.route_clsf = route_clsf;
		this.ecnt_cd = ecnt_cd;
		this.ledt_cd = ledt_cd;
		this.medi_cd = medi_cd;
		this.qty_yn = qty_yn;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setPrt_plac_cd(String prt_plac_cd){
		this.prt_plac_cd = prt_plac_cd;
	}

	public void setRoute_clsf(String route_clsf){
		this.route_clsf = route_clsf;
	}

	public void setEcnt_cd(String ecnt_cd){
		this.ecnt_cd = ecnt_cd;
	}

	public void setLedt_cd(String ledt_cd){
		this.ledt_cd = ledt_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setQty_yn(String qty_yn){
		this.qty_yn = qty_yn;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getPrt_plac_cd(){
		return this.prt_plac_cd;
	}

	public String getRoute_clsf(){
		return this.route_clsf;
	}

	public String getEcnt_cd(){
		return this.ecnt_cd;
	}

	public String getLedt_cd(){
		return this.ledt_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getQty_yn(){
		return this.qty_yn;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_SND_1010_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_SND_1010_LDM dm = (SE_SND_1010_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.prt_plac_cd);
		cstmt.setString(5, dm.route_clsf);
		cstmt.setString(6, dm.ecnt_cd);
		cstmt.setString(7, dm.ledt_cd);
		cstmt.setString(8, dm.medi_cd);
		cstmt.setString(9, dm.qty_yn);
		cstmt.setString(10, dm.incmg_pers);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.snd.ds.SE_SND_1010_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("prt_plac_cd = [" + getPrt_plac_cd() + "]");
		System.out.println("route_clsf = [" + getRoute_clsf() + "]");
		System.out.println("ecnt_cd = [" + getEcnt_cd() + "]");
		System.out.println("ledt_cd = [" + getLedt_cd() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("qty_yn = [" + getQty_yn() + "]");
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
String prt_plac_cd = req.getParameter("prt_plac_cd");
if( prt_plac_cd == null){
	System.out.println(this.toString+" : prt_plac_cd is null" );
}else{
	System.out.println(this.toString+" : prt_plac_cd is "+prt_plac_cd );
}
String route_clsf = req.getParameter("route_clsf");
if( route_clsf == null){
	System.out.println(this.toString+" : route_clsf is null" );
}else{
	System.out.println(this.toString+" : route_clsf is "+route_clsf );
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
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String qty_yn = req.getParameter("qty_yn");
if( qty_yn == null){
	System.out.println(this.toString+" : qty_yn is null" );
}else{
	System.out.println(this.toString+" : qty_yn is "+qty_yn );
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
String prt_plac_cd = Util.checkString(req.getParameter("prt_plac_cd"));
String route_clsf = Util.checkString(req.getParameter("route_clsf"));
String ecnt_cd = Util.checkString(req.getParameter("ecnt_cd"));
String ledt_cd = Util.checkString(req.getParameter("ledt_cd"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String qty_yn = Util.checkString(req.getParameter("qty_yn"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String prt_plac_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_plac_cd")));
String route_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("route_clsf")));
String ecnt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("ecnt_cd")));
String ledt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("ledt_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String qty_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("qty_yn")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setPrt_plac_cd(prt_plac_cd);
dm.setRoute_clsf(route_clsf);
dm.setEcnt_cd(ecnt_cd);
dm.setLedt_cd(ledt_cd);
dm.setMedi_cd(medi_cd);
dm.setQty_yn(qty_yn);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 03 13:51:41 KST 2009 */