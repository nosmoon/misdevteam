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


public class EN_INNEXP_1504_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt_f;
	public String occr_dt_t;
	public String evnt_yy;
	public String evnt_cd;
	public String evnt_seq;

	public EN_INNEXP_1504_LDM(){}
	public EN_INNEXP_1504_LDM(String cmpy_cd, String occr_dt_f, String occr_dt_t, String evnt_yy, String evnt_cd, String evnt_seq){
		this.cmpy_cd = cmpy_cd;
		this.occr_dt_f = occr_dt_f;
		this.occr_dt_t = occr_dt_t;
		this.evnt_yy = evnt_yy;
		this.evnt_cd = evnt_cd;
		this.evnt_seq = evnt_seq;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt_f(String occr_dt_f){
		this.occr_dt_f = occr_dt_f;
	}

	public void setOccr_dt_t(String occr_dt_t){
		this.occr_dt_t = occr_dt_t;
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

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_dt_f(){
		return this.occr_dt_f;
	}

	public String getOccr_dt_t(){
		return this.occr_dt_t;
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

	public String getSQL(){
		 return "{ call MISENP.SP_EN_INNEXP_1504_L(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		EN_INNEXP_1504_LDM dm = (EN_INNEXP_1504_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.occr_dt_f);
		cstmt.setString(5, dm.occr_dt_t);
		cstmt.setString(6, dm.evnt_yy);
		cstmt.setString(7, dm.evnt_cd);
		cstmt.setString(8, dm.evnt_seq);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.en.innexp.ds.EN_INNEXP_1504_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("occr_dt_f = [" + getOccr_dt_f() + "]");
		System.out.println("occr_dt_t = [" + getOccr_dt_t() + "]");
		System.out.println("evnt_yy = [" + getEvnt_yy() + "]");
		System.out.println("evnt_cd = [" + getEvnt_cd() + "]");
		System.out.println("evnt_seq = [" + getEvnt_seq() + "]");
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
String occr_dt_f = req.getParameter("occr_dt_f");
if( occr_dt_f == null){
	System.out.println(this.toString+" : occr_dt_f is null" );
}else{
	System.out.println(this.toString+" : occr_dt_f is "+occr_dt_f );
}
String occr_dt_t = req.getParameter("occr_dt_t");
if( occr_dt_t == null){
	System.out.println(this.toString+" : occr_dt_t is null" );
}else{
	System.out.println(this.toString+" : occr_dt_t is "+occr_dt_t );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String occr_dt_f = Util.checkString(req.getParameter("occr_dt_f"));
String occr_dt_t = Util.checkString(req.getParameter("occr_dt_t"));
String evnt_yy = Util.checkString(req.getParameter("evnt_yy"));
String evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
String evnt_seq = Util.checkString(req.getParameter("evnt_seq"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_dt_f = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt_f")));
String occr_dt_t = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt_t")));
String evnt_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_yy")));
String evnt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_cd")));
String evnt_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_seq")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setOccr_dt_f(occr_dt_f);
dm.setOccr_dt_t(occr_dt_t);
dm.setEvnt_yy(evnt_yy);
dm.setEvnt_cd(evnt_cd);
dm.setEvnt_seq(evnt_seq);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 24 13:12:52 KST 2009 */