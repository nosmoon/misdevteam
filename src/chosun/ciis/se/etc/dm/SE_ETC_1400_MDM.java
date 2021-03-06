/***************************************************************************************************
* 파일명 : 
* 기능 : 
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.etc.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.etc.ds.*;
import chosun.ciis.se.etc.rec.*;

/**
 * 
 */


public class SE_ETC_1400_MDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String incmg_pers;
	public String auth_gb;
	public String feat_clsf;

	public SE_ETC_1400_MDM(){}
	public SE_ETC_1400_MDM(String cmpy_cd, String incmg_pers, String auth_gb, String feat_clsf){
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers = incmg_pers;
		this.auth_gb = auth_gb;
		this.feat_clsf = feat_clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setAuth_gb(String auth_gb){
		this.auth_gb = auth_gb;
	}

	public void setFeat_clsf(String feat_clsf){
		this.feat_clsf = feat_clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getAuth_gb(){
		return this.auth_gb;
	}

	public String getFeat_clsf(){
		return this.feat_clsf;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_ETC_1400_M(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_ETC_1400_MDM dm = (SE_ETC_1400_MDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.incmg_pers);
		cstmt.setString(5, dm.auth_gb);
		cstmt.setString(6, dm.feat_clsf);
		cstmt.registerOutParameter(7, Types.VARCHAR);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.etc.ds.SE_ETC_1400_MDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("auth_gb = [" + getAuth_gb() + "]");
		System.out.println("feat_clsf = [" + getFeat_clsf() + "]");
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
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String auth_gb = req.getParameter("auth_gb");
if( auth_gb == null){
	System.out.println(this.toString+" : auth_gb is null" );
}else{
	System.out.println(this.toString+" : auth_gb is "+auth_gb );
}
String feat_clsf = req.getParameter("feat_clsf");
if( feat_clsf == null){
	System.out.println(this.toString+" : feat_clsf is null" );
}else{
	System.out.println(this.toString+" : feat_clsf is "+feat_clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String auth_gb = Util.checkString(req.getParameter("auth_gb"));
String feat_clsf = Util.checkString(req.getParameter("feat_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String auth_gb = Util.Uni2Ksc(Util.checkString(req.getParameter("auth_gb")));
String feat_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("feat_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers(incmg_pers);
dm.setAuth_gb(auth_gb);
dm.setFeat_clsf(feat_clsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Aug 21 18:14:02 KST 2009 */