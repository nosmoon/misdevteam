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


package chosun.ciis.mt.etcbook.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.etcbook.ds.*;
import chosun.ciis.mt.etcbook.rec.*;

/**
 * 
 */


public class MT_ETCBOOK_1300_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String clam_dt_fr;
	public String clam_dt_to;
	public String subs_frdt;
	public String sbend_dt;

	public MT_ETCBOOK_1300_LDM(){}
	public MT_ETCBOOK_1300_LDM(String cmpy_cd, String clam_dt_fr, String clam_dt_to, String subs_frdt, String sbend_dt){
		this.cmpy_cd = cmpy_cd;
		this.clam_dt_fr = clam_dt_fr;
		this.clam_dt_to = clam_dt_to;
		this.subs_frdt = subs_frdt;
		this.sbend_dt = sbend_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setClam_dt_fr(String clam_dt_fr){
		this.clam_dt_fr = clam_dt_fr;
	}

	public void setClam_dt_to(String clam_dt_to){
		this.clam_dt_to = clam_dt_to;
	}

	public void setSubs_frdt(String subs_frdt){
		this.subs_frdt = subs_frdt;
	}

	public void setSbend_dt(String sbend_dt){
		this.sbend_dt = sbend_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getClam_dt_fr(){
		return this.clam_dt_fr;
	}

	public String getClam_dt_to(){
		return this.clam_dt_to;
	}

	public String getSubs_frdt(){
		return this.subs_frdt;
	}

	public String getSbend_dt(){
		return this.sbend_dt;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_ETCBOOK_1300_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_ETCBOOK_1300_LDM dm = (MT_ETCBOOK_1300_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.clam_dt_fr);
		cstmt.setString(5, dm.clam_dt_to);
		cstmt.setString(6, dm.subs_frdt);
		cstmt.setString(7, dm.sbend_dt);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.etcbook.ds.MT_ETCBOOK_1300_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("clam_dt_fr = [" + getClam_dt_fr() + "]");
		System.out.println("clam_dt_to = [" + getClam_dt_to() + "]");
		System.out.println("subs_frdt = [" + getSubs_frdt() + "]");
		System.out.println("sbend_dt = [" + getSbend_dt() + "]");
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
String clam_dt_fr = req.getParameter("clam_dt_fr");
if( clam_dt_fr == null){
	System.out.println(this.toString+" : clam_dt_fr is null" );
}else{
	System.out.println(this.toString+" : clam_dt_fr is "+clam_dt_fr );
}
String clam_dt_to = req.getParameter("clam_dt_to");
if( clam_dt_to == null){
	System.out.println(this.toString+" : clam_dt_to is null" );
}else{
	System.out.println(this.toString+" : clam_dt_to is "+clam_dt_to );
}
String subs_frdt = req.getParameter("subs_frdt");
if( subs_frdt == null){
	System.out.println(this.toString+" : subs_frdt is null" );
}else{
	System.out.println(this.toString+" : subs_frdt is "+subs_frdt );
}
String sbend_dt = req.getParameter("sbend_dt");
if( sbend_dt == null){
	System.out.println(this.toString+" : sbend_dt is null" );
}else{
	System.out.println(this.toString+" : sbend_dt is "+sbend_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String clam_dt_fr = Util.checkString(req.getParameter("clam_dt_fr"));
String clam_dt_to = Util.checkString(req.getParameter("clam_dt_to"));
String subs_frdt = Util.checkString(req.getParameter("subs_frdt"));
String sbend_dt = Util.checkString(req.getParameter("sbend_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String clam_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("clam_dt_fr")));
String clam_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("clam_dt_to")));
String subs_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("subs_frdt")));
String sbend_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("sbend_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setClam_dt_fr(clam_dt_fr);
dm.setClam_dt_to(clam_dt_to);
dm.setSubs_frdt(subs_frdt);
dm.setSbend_dt(sbend_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 21 16:57:53 KST 2009 */