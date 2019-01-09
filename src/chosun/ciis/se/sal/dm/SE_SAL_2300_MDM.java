/***************************************************************************************************
* 파일명 : SE_SAL_2300_MDM.java
* 기능 : 판매 - 지대관리 - 매출관리 - 출장전자료조회
* 작성일자 : 2009-04-07
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.sal.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.sal.ds.*;
import chosun.ciis.se.sal.rec.*;

/**
 * 
 */


public class SE_SAL_2300_MDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd	;
	public String auth_gb	;
	public String incmg_pers;
	public String base_dt	;
	public String feat_clsf	;

	public SE_SAL_2300_MDM(){}
	public SE_SAL_2300_MDM(String cmpy_cd, String auth_gb, String incmg_pers, String base_dt, String feat_clsf){
		this.cmpy_cd 	= cmpy_cd	;
		this.auth_gb 	= auth_gb	;
		this.incmg_pers = incmg_pers;
		this.base_dt 	= base_dt	;
		this.feat_clsf 	= feat_clsf	;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAuth_gb(String auth_gb){
		this.auth_gb = auth_gb;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setBase_dt(String base_dt){
		this.base_dt = base_dt;
	}

	public void setFeat_clsf(String feat_clsf){
		this.feat_clsf = feat_clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAuth_gb(){
		return this.auth_gb;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getBase_dt(){
		return this.base_dt;
	}

	public String getFeat_clsf(){
		return this.feat_clsf;
	}

	public String getSQL(){
		 return "{ call SP_SE_SAL_2300_M( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_SAL_2300_MDM dm = (SE_SAL_2300_MDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd	);
		cstmt.setString(4, dm.auth_gb	);
		cstmt.setString(5, dm.incmg_pers);
		cstmt.setString(6, dm.base_dt	);
		cstmt.setString(7, dm.feat_clsf	);
		cstmt.registerOutParameter( 8, OracleTypes.CURSOR);
		cstmt.registerOutParameter( 9, OracleTypes.CURSOR);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.sal.ds.SE_SAL_2300_MDataSet();
	}

    public void print(){
        System.out.println("cmpy_cd 	= " + getCmpy_cd		());
        System.out.println("auth_gb 	= " + getAuth_gb		());
        System.out.println("incmg_pers 	= " + getIncmg_pers		());
        System.out.println("base_dt 	= " + getBase_dt		());
        System.out.println("feat_clsf 	= " + getFeat_clsf		());
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
String auth_gb = req.getParameter("auth_gb");
if( auth_gb == null){
	System.out.println(this.toString+" : auth_gb is null" );
}else{
	System.out.println(this.toString+" : auth_gb is "+auth_gb );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String base_dt = req.getParameter("base_dt");
if( base_dt == null){
	System.out.println(this.toString+" : base_dt is null" );
}else{
	System.out.println(this.toString+" : base_dt is "+base_dt );
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
String auth_gb = Util.checkString(req.getParameter("auth_gb"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String base_dt = Util.checkString(req.getParameter("base_dt"));
String feat_clsf = Util.checkString(req.getParameter("feat_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String auth_gb = Util.Uni2Ksc(Util.checkString(req.getParameter("auth_gb")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String base_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("base_dt")));
String feat_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("feat_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setAuth_gb(auth_gb);
dm.setIncmg_pers(incmg_pers);
dm.setBase_dt(base_dt);
dm.setFeat_clsf(feat_clsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 07 14:06:53 KST 2009 */