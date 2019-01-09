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


public class EN_INNEXP_3103_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String evnt_yy_fr;
	public String evnt_yy_to;
	public String srch_clsf;

	public EN_INNEXP_3103_LDM(){}
	public EN_INNEXP_3103_LDM(String cmpy_cd, String evnt_yy_fr, String evnt_yy_to, String srch_clsf){
		this.cmpy_cd = cmpy_cd;
		this.evnt_yy_fr = evnt_yy_fr;
		this.evnt_yy_to = evnt_yy_to;
		this.srch_clsf = srch_clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEvnt_yy_fr(String evnt_yy_fr){
		this.evnt_yy_fr = evnt_yy_fr;
	}

	public void setEvnt_yy_to(String evnt_yy_to){
		this.evnt_yy_to = evnt_yy_to;
	}

	public void setSrch_clsf(String srch_clsf){
		this.srch_clsf = srch_clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEvnt_yy_fr(){
		return this.evnt_yy_fr;
	}

	public String getEvnt_yy_to(){
		return this.evnt_yy_to;
	}

	public String getSrch_clsf(){
		return this.srch_clsf;
	}

	public String getSQL(){
		 return "{ call MISENP.SP_EN_INNEXP_3103_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		EN_INNEXP_3103_LDM dm = (EN_INNEXP_3103_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.evnt_yy_fr);
		cstmt.setString(5, dm.evnt_yy_to);
		cstmt.setString(6, dm.srch_clsf);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.en.innexp.ds.EN_INNEXP_3103_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("evnt_yy_fr = " + getEvnt_yy_fr());
        System.out.println("evnt_yy_to = " + getEvnt_yy_to());
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
String evnt_yy_fr = req.getParameter("evnt_yy_fr");
if( evnt_yy_fr == null){
	System.out.println(this.toString+" : evnt_yy_fr is null" );
}else{
	System.out.println(this.toString+" : evnt_yy_fr is "+evnt_yy_fr );
}
String evnt_yy_to = req.getParameter("evnt_yy_to");
if( evnt_yy_to == null){
	System.out.println(this.toString+" : evnt_yy_to is null" );
}else{
	System.out.println(this.toString+" : evnt_yy_to is "+evnt_yy_to );
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
String evnt_yy_fr = Util.checkString(req.getParameter("evnt_yy_fr"));
String evnt_yy_to = Util.checkString(req.getParameter("evnt_yy_to"));
String srch_clsf = Util.checkString(req.getParameter("srch_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String evnt_yy_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_yy_fr")));
String evnt_yy_to = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_yy_to")));
String srch_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("srch_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEvnt_yy_fr(evnt_yy_fr);
dm.setEvnt_yy_to(evnt_yy_to);
dm.setSrch_clsf(srch_clsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 30 17:52:37 KST 2009 */