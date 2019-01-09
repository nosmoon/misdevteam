/***************************************************************************************************
* 파일명 : SE_SND_3420_LDM.java
* 기능 : 판매 - 발송관리 - 대표노선, 노선 설정
* 작성일자 : 2009-05-14
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.snd.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.snd.ds.*;
import chosun.ciis.se.snd.rec.*;

/**
 * 
 */


public class SE_SND_3420_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd			;
	public String rptv_route_clsf	;
	public String rptv_route_cd		;
	public String incmg_pers		;

	public SE_SND_3420_LDM(){}
	public SE_SND_3420_LDM(String cmpy_cd, String rptv_route_clsf, String rptv_route_cd, String incmg_pers){
		this.cmpy_cd 			= cmpy_cd			;
		this.rptv_route_clsf 	= rptv_route_clsf	;
		this.rptv_route_cd 		= rptv_route_cd		;
		this.incmg_pers 		= incmg_pers		;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setRptv_route_clsf(String rptv_route_clsf){
		this.rptv_route_clsf = rptv_route_clsf;
	}

	public void setRptv_route_cd(String rptv_route_cd){
		this.rptv_route_cd = rptv_route_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getRptv_route_clsf(){
		return this.rptv_route_clsf;
	}

	public String getRptv_route_cd(){
		return this.rptv_route_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call SP_SE_SND_3420_L( ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_SND_3420_LDM dm = (SE_SND_3420_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd			);
		cstmt.setString(4, dm.rptv_route_clsf	);
		cstmt.setString(5, dm.rptv_route_cd		);
		cstmt.setString(6, dm.incmg_pers		);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.snd.ds.SE_SND_3420_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd 		= " + getCmpy_cd());
        System.out.println("rptv_route_clsf = " + getRptv_route_clsf());
        System.out.println("rptv_route_cd 	= " + getRptv_route_cd());
        System.out.println("incmg_pers 		= " + getIncmg_pers());
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
String rptv_route_clsf = req.getParameter("rptv_route_clsf");
if( rptv_route_clsf == null){
	System.out.println(this.toString+" : rptv_route_clsf is null" );
}else{
	System.out.println(this.toString+" : rptv_route_clsf is "+rptv_route_clsf );
}
String rptv_route_cd = req.getParameter("rptv_route_cd");
if( rptv_route_cd == null){
	System.out.println(this.toString+" : rptv_route_cd is null" );
}else{
	System.out.println(this.toString+" : rptv_route_cd is "+rptv_route_cd );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String rptv_route_clsf = Util.checkString(req.getParameter("rptv_route_clsf"));
String rptv_route_cd = Util.checkString(req.getParameter("rptv_route_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String rptv_route_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("rptv_route_clsf")));
String rptv_route_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("rptv_route_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setRptv_route_clsf(rptv_route_clsf);
dm.setRptv_route_cd(rptv_route_cd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 14 17:12:53 KST 2009 */