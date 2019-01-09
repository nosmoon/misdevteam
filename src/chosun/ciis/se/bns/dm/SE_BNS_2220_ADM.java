/***************************************************************************************************
* 파일명 : SE_BNS_2220_ADM.java
* 기능 : 판매 - 판촉물관리 - 판촉물매출마감
* 작성일자 : 2009-05-25
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.bns.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.bns.ds.*;
import chosun.ciis.se.bns.rec.*;

/**
 * 
 */


public class SE_BNS_2220_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd		;
	public String clos_yn		;
	public String mode			;
	public String divn_dt		;
	public String incmg_pers	;
	public String incmg_pers_ip	;

	public SE_BNS_2220_ADM(){}
	public SE_BNS_2220_ADM(String cmpy_cd, String clos_yn, String mode, String divn_dt, String incmg_pers, String incmg_pers_ip){
		this.cmpy_cd 		= cmpy_cd		;
		this.clos_yn 		= clos_yn		;
		this.mode 			= mode			;
		this.divn_dt 		= divn_dt		;
		this.incmg_pers 	= incmg_pers	;
		this.incmg_pers_ip 	= incmg_pers_ip	;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setDivn_dt(String divn_dt){
		this.divn_dt = divn_dt;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getClos_yn(){
		return this.clos_yn;
	}

	public String getMode(){
		return this.mode;
	}

	public String getDivn_dt(){
		return this.divn_dt;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getSQL(){
		 return "{ call SP_SE_BNS_2220_A( ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_BNS_2220_ADM dm = (SE_BNS_2220_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd		);
		cstmt.setString(4, dm.clos_yn		);
		cstmt.setString(5, dm.mode			);
		cstmt.setString(6, dm.divn_dt		);
		cstmt.setString(7, dm.incmg_pers	);
		cstmt.setString(8, dm.incmg_pers_ip	);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.bns.ds.SE_BNS_2220_ADataSet();
	}
	
    public void print(){
        System.out.println("cmpy_cd 		= " + getCmpy_cd		());
        System.out.println("clos_yn 		= " + getClos_yn		());
        System.out.println("mode 			= " + getMode			());
        System.out.println("divn_dt 		= " + getDivn_dt		());
        System.out.println("incmg_pers 		= " + getIncmg_pers		());
        System.out.println("incmg_pers_ip 	= " + getIncmg_pers_ip	());
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
String clos_yn = req.getParameter("clos_yn");
if( clos_yn == null){
	System.out.println(this.toString+" : clos_yn is null" );
}else{
	System.out.println(this.toString+" : clos_yn is "+clos_yn );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String divn_dt = req.getParameter("divn_dt");
if( divn_dt == null){
	System.out.println(this.toString+" : divn_dt is null" );
}else{
	System.out.println(this.toString+" : divn_dt is "+divn_dt );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String clos_yn = Util.checkString(req.getParameter("clos_yn"));
String mode = Util.checkString(req.getParameter("mode"));
String divn_dt = Util.checkString(req.getParameter("divn_dt"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String clos_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("clos_yn")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String divn_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("divn_dt")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setClos_yn(clos_yn);
dm.setMode(mode);
dm.setDivn_dt(divn_dt);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 25 20:25:55 KST 2009 */