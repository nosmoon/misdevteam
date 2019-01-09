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


public class EN_INNEXP_3101_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String evnt_yy;
	public String evnt_frdt_fr;
	public String evnt_frdt_to;
	public String srch_clsf;

	public EN_INNEXP_3101_LDM(){}
	public EN_INNEXP_3101_LDM(String cmpy_cd, String evnt_yy, String evnt_frdt_fr, String evnt_frdt_to, String srch_clsf){
		this.cmpy_cd = cmpy_cd;
		this.evnt_yy = evnt_yy;
		this.evnt_frdt_fr = evnt_frdt_fr;
		this.evnt_frdt_to = evnt_frdt_to;
		this.srch_clsf = srch_clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEvnt_yy(String evnt_yy){
		this.evnt_yy = evnt_yy;
	}

	public void setEvnt_frdt_fr(String evnt_frdt_fr){
		this.evnt_frdt_fr = evnt_frdt_fr;
	}

	public void setEvnt_frdt_to(String evnt_frdt_to){
		this.evnt_frdt_to = evnt_frdt_to;
	}

	public void setSrch_clsf(String srch_clsf){
		this.srch_clsf = srch_clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEvnt_yy(){
		return this.evnt_yy;
	}

	public String getEvnt_frdt_fr(){
		return this.evnt_frdt_fr;
	}

	public String getEvnt_frdt_to(){
		return this.evnt_frdt_to;
	}

	public String getSrch_clsf(){
		return this.srch_clsf;
	}

	public String getSQL(){
		 return "{ call MISENP.SP_EN_INNEXP_3101_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		EN_INNEXP_3101_LDM dm = (EN_INNEXP_3101_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.evnt_yy);
		cstmt.setString(5, dm.evnt_frdt_fr);
		cstmt.setString(6, dm.evnt_frdt_to);
		cstmt.setString(7, dm.srch_clsf);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.en.innexp.ds.EN_INNEXP_3101_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("evnt_yy = " + getEvnt_yy());
        System.out.println("evnt_frdt_fr = " + getEvnt_frdt_fr());
        System.out.println("evnt_frdt_to = " + getEvnt_frdt_to());
        System.out.println("srch_clsf = " + getSrch_clsf());
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
String evnt_frdt_fr = req.getParameter("evnt_frdt_fr");
if( evnt_frdt_fr == null){
	System.out.println(this.toString+" : evnt_frdt_fr is null" );
}else{
	System.out.println(this.toString+" : evnt_frdt_fr is "+evnt_frdt_fr );
}
String evnt_frdt_to = req.getParameter("evnt_frdt_to");
if( evnt_frdt_to == null){
	System.out.println(this.toString+" : evnt_frdt_to is null" );
}else{
	System.out.println(this.toString+" : evnt_frdt_to is "+evnt_frdt_to );
}
String srch_clsf = req.getParameter("srch_clsf");
if( srch_clsf == null){
	System.out.println(this.toString+" : srch_clsf is null" );
}else{
	System.out.println(this.toString+" : srch_clsf is "+srch_clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String evnt_yy = Util.checkString(req.getParameter("evnt_yy"));
String evnt_frdt_fr = Util.checkString(req.getParameter("evnt_frdt_fr"));
String evnt_frdt_to = Util.checkString(req.getParameter("evnt_frdt_to"));
String srch_clsf = Util.checkString(req.getParameter("srch_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String evnt_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_yy")));
String evnt_frdt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_frdt_fr")));
String evnt_frdt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_frdt_to")));
String srch_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("srch_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEvnt_yy(evnt_yy);
dm.setEvnt_frdt_fr(evnt_frdt_fr);
dm.setEvnt_frdt_to(evnt_frdt_to);
dm.setSrch_clsf(srch_clsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 29 17:27:55 KST 2009 */