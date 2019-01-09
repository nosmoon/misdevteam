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


package chosun.ciis.en.innexp.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.en.innexp.ds.*;
import chosun.ciis.en.innexp.rec.*;

/**
 * 
 */


public class EN_INNEXP_2002_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String evnt_yy;
	public String evnt_cd;
	public String evnt_seq;
	public String basi_dt;
	public String dept_cd;
	public String tab_mode;

	public EN_INNEXP_2002_LDM(){}
	public EN_INNEXP_2002_LDM(String cmpy_cd, String evnt_yy, String evnt_cd, String evnt_seq, String basi_dt, String dept_cd, String tab_mode){
		this.cmpy_cd = cmpy_cd;
		this.evnt_yy = evnt_yy;
		this.evnt_cd = evnt_cd;
		this.evnt_seq = evnt_seq;
		this.basi_dt = basi_dt;
		this.dept_cd = dept_cd;
		this.tab_mode = tab_mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEvnt_yy(String evnt_yy){
		this.evnt_yy = evnt_yy;
	}

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public void setEvnt_seq(String evnt_seq){
		this.evnt_seq = evnt_seq;
	}

	public void setBasi_dt(String basi_dt){
		this.basi_dt = basi_dt;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setTab_mode(String tab_mode){
		this.tab_mode = tab_mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEvnt_yy(){
		return this.evnt_yy;
	}

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getEvnt_seq(){
		return this.evnt_seq;
	}

	public String getBasi_dt(){
		return this.basi_dt;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getTab_mode(){
		return this.tab_mode;
	}

	public String getSQL(){
		 return "{ call MISENP.SP_EN_INNEXP_2002_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		EN_INNEXP_2002_LDM dm = (EN_INNEXP_2002_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.evnt_yy);
		cstmt.setString(5, dm.evnt_cd);
		cstmt.setString(6, dm.evnt_seq);
		cstmt.setString(7, dm.basi_dt);
		cstmt.setString(8, dm.dept_cd);
		cstmt.setString(9, dm.tab_mode);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.en.innexp.ds.EN_INNEXP_2002_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("evnt_yy = [" + getEvnt_yy() + "]");
		System.out.println("evnt_cd = [" + getEvnt_cd() + "]");
		System.out.println("evnt_seq = [" + getEvnt_seq() + "]");
		System.out.println("basi_dt = [" + getBasi_dt() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("tab_mode = [" + getTab_mode() + "]");
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
String evnt_yy = req.getParameter("evnt_yy");
if( evnt_yy == null){
	System.out.println(this.toString+" : evnt_yy is null" );
}else{
	System.out.println(this.toString+" : evnt_yy is "+evnt_yy );
}
String evnt_cd = req.getParameter("evnt_cd");
if( evnt_cd == null){
	System.out.println(this.toString+" : evnt_cd is null" );
}else{
	System.out.println(this.toString+" : evnt_cd is "+evnt_cd );
}
String evnt_seq = req.getParameter("evnt_seq");
if( evnt_seq == null){
	System.out.println(this.toString+" : evnt_seq is null" );
}else{
	System.out.println(this.toString+" : evnt_seq is "+evnt_seq );
}
String basi_dt = req.getParameter("basi_dt");
if( basi_dt == null){
	System.out.println(this.toString+" : basi_dt is null" );
}else{
	System.out.println(this.toString+" : basi_dt is "+basi_dt );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String tab_mode = req.getParameter("tab_mode");
if( tab_mode == null){
	System.out.println(this.toString+" : tab_mode is null" );
}else{
	System.out.println(this.toString+" : tab_mode is "+tab_mode );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String evnt_yy = Util.checkString(req.getParameter("evnt_yy"));
String evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
String evnt_seq = Util.checkString(req.getParameter("evnt_seq"));
String basi_dt = Util.checkString(req.getParameter("basi_dt"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String tab_mode = Util.checkString(req.getParameter("tab_mode"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String evnt_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_yy")));
String evnt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_cd")));
String evnt_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_seq")));
String basi_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_dt")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String tab_mode = Util.Uni2Ksc(Util.checkString(req.getParameter("tab_mode")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEvnt_yy(evnt_yy);
dm.setEvnt_cd(evnt_cd);
dm.setEvnt_seq(evnt_seq);
dm.setBasi_dt(basi_dt);
dm.setDept_cd(dept_cd);
dm.setTab_mode(tab_mode);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 29 18:05:10 KST 2009 */