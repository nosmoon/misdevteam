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


package chosun.ciis.mt.commatr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.commatr.ds.*;
import chosun.ciis.mt.commatr.rec.*;

/**
 * 
 */


public class MT_COMMATR_9102_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String incmg_pers_ipaddr;
	public String incmg_pers;
	public String mode;
	public String aply_dt;
	public String cd;
	public String uprc;

	public MT_COMMATR_9102_ADM(){}
	public MT_COMMATR_9102_ADM(String cmpy_cd, String incmg_pers_ipaddr, String incmg_pers, String mode, String aply_dt, String cd, String uprc){
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
		this.mode = mode;
		this.aply_dt = aply_dt;
		this.cd = cd;
		this.uprc = uprc;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIncmg_pers_ipaddr(String incmg_pers_ipaddr){
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setAply_dt(String aply_dt){
		this.aply_dt = aply_dt;
	}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIncmg_pers_ipaddr(){
		return this.incmg_pers_ipaddr;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getMode(){
		return this.mode;
	}

	public String getAply_dt(){
		return this.aply_dt;
	}

	public String getCd(){
		return this.cd;
	}

	public String getUprc(){
		return this.uprc;
	}


	public String getSQL(){
		 return "{ call MISMAT.SP_MT_COMMATR_9102_A(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_COMMATR_9102_ADM dm = (MT_COMMATR_9102_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.incmg_pers_ipaddr);
		cstmt.setString(5, dm.incmg_pers);
		cstmt.setString(6, dm.mode);
		cstmt.setString(7, dm.cd);
		cstmt.setString(8, dm.aply_dt);
		cstmt.setString(9, dm.uprc);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.commatr.ds.MT_COMMATR_9102_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("incmg_pers_ipaddr = [" + getIncmg_pers_ipaddr() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("aply_dt = [" + getAply_dt() + "]");
		System.out.println("pj_kind = [" + getCd() + "]");
		System.out.println("uprc = [" + getUprc() + "]");
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
String incmg_pers_ipaddr = req.getParameter("incmg_pers_ipaddr");
if( incmg_pers_ipaddr == null){
	System.out.println(this.toString+" : incmg_pers_ipaddr is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipaddr is "+incmg_pers_ipaddr );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String aply_dt = req.getParameter("aply_dt");
if( aply_dt == null){
	System.out.println(this.toString+" : aply_dt is null" );
}else{
	System.out.println(this.toString+" : aply_dt is "+aply_dt );
}
String pj_kind = req.getParameter("pj_kind");
if( pj_kind == null){
	System.out.println(this.toString+" : pj_kind is null" );
}else{
	System.out.println(this.toString+" : pj_kind is "+pj_kind );
}
String uprc = req.getParameter("uprc");
if( uprc == null){
	System.out.println(this.toString+" : uprc is null" );
}else{
	System.out.println(this.toString+" : uprc is "+uprc );
}
String simb_wgt = req.getParameter("simb_wgt");
if( simb_wgt == null){
	System.out.println(this.toString+" : simb_wgt is null" );
}else{
	System.out.println(this.toString+" : simb_wgt is "+simb_wgt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String mode = Util.checkString(req.getParameter("mode"));
String aply_dt = Util.checkString(req.getParameter("aply_dt"));
String pj_kind = Util.checkString(req.getParameter("pj_kind"));
String uprc = Util.checkString(req.getParameter("uprc"));
String simb_wgt = Util.checkString(req.getParameter("simb_wgt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String aply_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_dt")));
String pj_kind = Util.Uni2Ksc(Util.checkString(req.getParameter("pj_kind")));
String uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("uprc")));
String simb_wgt = Util.Uni2Ksc(Util.checkString(req.getParameter("simb_wgt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
dm.setMode(mode);
dm.setAply_dt(aply_dt);
dm.setPj_kind(pj_kind);
dm.setUprc(uprc);
dm.setSimb_wgt(simb_wgt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 11 14:36:59 KST 2009 */