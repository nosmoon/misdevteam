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


package chosun.ciis.mc.budg.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.budg.ds.*;
import chosun.ciis.mc.budg.rec.*;

/**
 * 
 */


public class MC_BUDG_2073_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String evnt_cd;
	public String evnt_nm;
	public String cd_gubun;
	public String from_cd;
	public String to_cd;
	public String bgn_dt;
	public String last_dt;

	public MC_BUDG_2073_LDM(){}
	public MC_BUDG_2073_LDM(String cmpy_cd, String evnt_cd, String evnt_nm, String cd_gubun, String from_cd, String to_cd, String bgn_dt, String last_dt){
		this.cmpy_cd = cmpy_cd;
		this.evnt_cd = evnt_cd;
		this.evnt_nm = evnt_nm;
		this.cd_gubun = cd_gubun;
		this.from_cd = from_cd;
		this.to_cd = to_cd;
		this.bgn_dt = bgn_dt;
		this.last_dt = last_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public void setEvnt_nm(String evnt_nm){
		this.evnt_nm = evnt_nm;
	}

	public void setCd_gubun(String cd_gubun){
		this.cd_gubun = cd_gubun;
	}

	public void setFrom_cd(String from_cd){
		this.from_cd = from_cd;
	}

	public void setTo_cd(String to_cd){
		this.to_cd = to_cd;
	}

	public void setBgn_dt(String bgn_dt){
		this.bgn_dt = bgn_dt;
	}

	public void setLast_dt(String last_dt){
		this.last_dt = last_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getEvnt_nm(){
		return this.evnt_nm;
	}

	public String getCd_gubun(){
		return this.cd_gubun;
	}

	public String getFrom_cd(){
		return this.from_cd;
	}

	public String getTo_cd(){
		return this.to_cd;
	}

	public String getBgn_dt(){
		return this.bgn_dt;
	}

	public String getLast_dt(){
		return this.last_dt;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_BUDG_2073_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_BUDG_2073_LDM dm = (MC_BUDG_2073_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.evnt_cd);
		cstmt.setString(5, dm.evnt_nm);
		cstmt.setString(6, dm.cd_gubun);
		cstmt.setString(7, dm.from_cd);
		cstmt.setString(8, dm.to_cd);
		cstmt.setString(9, dm.bgn_dt);
		cstmt.setString(10, dm.last_dt);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.budg.ds.MC_BUDG_2073_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("evnt_cd = [" + getEvnt_cd() + "]");
		System.out.println("evnt_nm = [" + getEvnt_nm() + "]");
		System.out.println("cd_gubun = [" + getCd_gubun() + "]");
		System.out.println("from_cd = [" + getFrom_cd() + "]");
		System.out.println("to_cd = [" + getTo_cd() + "]");
		System.out.println("bgn_dt = [" + getBgn_dt() + "]");
		System.out.println("last_dt = [" + getLast_dt() + "]");
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
String evnt_cd = req.getParameter("evnt_cd");
if( evnt_cd == null){
	System.out.println(this.toString+" : evnt_cd is null" );
}else{
	System.out.println(this.toString+" : evnt_cd is "+evnt_cd );
}
String evnt_nm = req.getParameter("evnt_nm");
if( evnt_nm == null){
	System.out.println(this.toString+" : evnt_nm is null" );
}else{
	System.out.println(this.toString+" : evnt_nm is "+evnt_nm );
}
String cd_gubun = req.getParameter("cd_gubun");
if( cd_gubun == null){
	System.out.println(this.toString+" : cd_gubun is null" );
}else{
	System.out.println(this.toString+" : cd_gubun is "+cd_gubun );
}
String from_cd = req.getParameter("from_cd");
if( from_cd == null){
	System.out.println(this.toString+" : from_cd is null" );
}else{
	System.out.println(this.toString+" : from_cd is "+from_cd );
}
String to_cd = req.getParameter("to_cd");
if( to_cd == null){
	System.out.println(this.toString+" : to_cd is null" );
}else{
	System.out.println(this.toString+" : to_cd is "+to_cd );
}
String bgn_dt = req.getParameter("bgn_dt");
if( bgn_dt == null){
	System.out.println(this.toString+" : bgn_dt is null" );
}else{
	System.out.println(this.toString+" : bgn_dt is "+bgn_dt );
}
String last_dt = req.getParameter("last_dt");
if( last_dt == null){
	System.out.println(this.toString+" : last_dt is null" );
}else{
	System.out.println(this.toString+" : last_dt is "+last_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
String evnt_nm = Util.checkString(req.getParameter("evnt_nm"));
String cd_gubun = Util.checkString(req.getParameter("cd_gubun"));
String from_cd = Util.checkString(req.getParameter("from_cd"));
String to_cd = Util.checkString(req.getParameter("to_cd"));
String bgn_dt = Util.checkString(req.getParameter("bgn_dt"));
String last_dt = Util.checkString(req.getParameter("last_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String evnt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_cd")));
String evnt_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_nm")));
String cd_gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("cd_gubun")));
String from_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("from_cd")));
String to_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("to_cd")));
String bgn_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("bgn_dt")));
String last_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("last_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEvnt_cd(evnt_cd);
dm.setEvnt_nm(evnt_nm);
dm.setCd_gubun(cd_gubun);
dm.setFrom_cd(from_cd);
dm.setTo_cd(to_cd);
dm.setBgn_dt(bgn_dt);
dm.setLast_dt(last_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 15 15:28:51 KST 2009 */