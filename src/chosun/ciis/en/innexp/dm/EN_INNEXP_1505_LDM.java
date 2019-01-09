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


public class EN_INNEXP_1505_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String evnt_frdt_f;
	public String evnt_frdt_t;
	public String clsf;

	public EN_INNEXP_1505_LDM(){}
	public EN_INNEXP_1505_LDM(String cmpy_cd, String evnt_frdt_f, String evnt_frdt_t, String clsf){
		this.cmpy_cd = cmpy_cd;
		this.evnt_frdt_f = evnt_frdt_f;
		this.evnt_frdt_t = evnt_frdt_t;
		this.clsf = clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEvnt_frdt_f(String evnt_frdt_f){
		this.evnt_frdt_f = evnt_frdt_f;
	}

	public void setEvnt_frdt_t(String evnt_frdt_t){
		this.evnt_frdt_t = evnt_frdt_t;
	}

	public void setClsf(String clsf){
		this.clsf = clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEvnt_frdt_f(){
		return this.evnt_frdt_f;
	}

	public String getEvnt_frdt_t(){
		return this.evnt_frdt_t;
	}

	public String getClsf(){
		return this.clsf;
	}

	public String getSQL(){
		 return "{ call MISENP.SP_EN_INNEXP_1505_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		EN_INNEXP_1505_LDM dm = (EN_INNEXP_1505_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.evnt_frdt_f);
		cstmt.setString(5, dm.evnt_frdt_t);
		cstmt.setString(6, dm.clsf);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.en.innexp.ds.EN_INNEXP_1505_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("evnt_frdt_f = [" + getEvnt_frdt_f() + "]");
		System.out.println("evnt_frdt_t = [" + getEvnt_frdt_t() + "]");
		System.out.println("clsf = [" + getClsf() + "]");
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
String evnt_frdt_f = req.getParameter("evnt_frdt_f");
if( evnt_frdt_f == null){
	System.out.println(this.toString+" : evnt_frdt_f is null" );
}else{
	System.out.println(this.toString+" : evnt_frdt_f is "+evnt_frdt_f );
}
String evnt_frdt_t = req.getParameter("evnt_frdt_t");
if( evnt_frdt_t == null){
	System.out.println(this.toString+" : evnt_frdt_t is null" );
}else{
	System.out.println(this.toString+" : evnt_frdt_t is "+evnt_frdt_t );
}
String clsf = req.getParameter("clsf");
if( clsf == null){
	System.out.println(this.toString+" : clsf is null" );
}else{
	System.out.println(this.toString+" : clsf is "+clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String evnt_frdt_f = Util.checkString(req.getParameter("evnt_frdt_f"));
String evnt_frdt_t = Util.checkString(req.getParameter("evnt_frdt_t"));
String clsf = Util.checkString(req.getParameter("clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String evnt_frdt_f = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_frdt_f")));
String evnt_frdt_t = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_frdt_t")));
String clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEvnt_frdt_f(evnt_frdt_f);
dm.setEvnt_frdt_t(evnt_frdt_t);
dm.setClsf(clsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 24 14:49:00 KST 2009 */