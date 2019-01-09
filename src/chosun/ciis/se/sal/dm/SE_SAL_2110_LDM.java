/***************************************************************************************************
* 파일명 : SE_SAL_2110_LDM.java
* 기능 : 판매 - 지대관리 - 매출관리 - 순매출액산출현황
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


public class SE_SAL_2110_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd		;
	public String bgn_yymm		;
	public String end_yymm		;
	public String team			;
	public String part			;
	public String area			;
	public String medi_cd		;
	public String searchgubun	;
	public String incmg_pers	;

	public SE_SAL_2110_LDM(){}
	public SE_SAL_2110_LDM(String cmpy_cd, String bgn_yymm, String end_yymm, String team, String part, String area, String medi_cd, String searchgubun, String incmg_pers){
		this.cmpy_cd 		= cmpy_cd		;
		this.bgn_yymm 		= bgn_yymm		;
		this.end_yymm 		= end_yymm		;
		this.team 			= team			;
		this.part 			= part			;
		this.area 			= area			;
		this.medi_cd 		= medi_cd		;
		this.searchgubun 	= searchgubun	;
		this.incmg_pers 	= incmg_pers	;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBgn_yymm(String bgn_yymm){
		this.bgn_yymm = bgn_yymm;
	}

	public void setEnd_yymm(String end_yymm){
		this.end_yymm = end_yymm;
	}

	public void setTeam(String team){
		this.team = team;
	}

	public void setPart(String part){
		this.part = part;
	}

	public void setArea(String area){
		this.area = area;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setSearchgubun(String searchgubun){
		this.searchgubun = searchgubun;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBgn_yymm(){
		return this.bgn_yymm;
	}

	public String getEnd_yymm(){
		return this.end_yymm;
	}

	public String getTeam(){
		return this.team;
	}

	public String getPart(){
		return this.part;
	}

	public String getArea(){
		return this.area;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getSearchgubun(){
		return this.searchgubun;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call SP_SE_SAL_2110_L( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_SAL_2110_LDM dm = (SE_SAL_2110_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString( 3, dm.cmpy_cd		);
		cstmt.setString( 4, dm.bgn_yymm		);
		cstmt.setString( 5, dm.end_yymm		);
		cstmt.setString( 6, dm.team			);
		cstmt.setString( 7, dm.part			);
		cstmt.setString( 8, dm.area			);
		cstmt.setString( 9, dm.medi_cd		);
		cstmt.setString(10, dm.searchgubun	);
		cstmt.setString(11, dm.incmg_pers	);
		cstmt.registerOutParameter(12, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.sal.ds.SE_SAL_2110_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd 	= " + getCmpy_cd	());
        System.out.println("bgn_yymm 	= " + getBgn_yymm	());
        System.out.println("end_yymm 	= " + getEnd_yymm	());
        System.out.println("team 		= " + getTeam		());
        System.out.println("part 		= " + getPart		());
        System.out.println("area 		= " + getArea		());
        System.out.println("medi_cd 	= " + getMedi_cd	());
        System.out.println("searchgubun = " + getSearchgubun());
        System.out.println("incmg_pers 	= " + getIncmg_pers	());
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
String bgn_yymm = req.getParameter("bgn_yymm");
if( bgn_yymm == null){
	System.out.println(this.toString+" : bgn_yymm is null" );
}else{
	System.out.println(this.toString+" : bgn_yymm is "+bgn_yymm );
}
String end_yymm = req.getParameter("end_yymm");
if( end_yymm == null){
	System.out.println(this.toString+" : end_yymm is null" );
}else{
	System.out.println(this.toString+" : end_yymm is "+end_yymm );
}
String team = req.getParameter("team");
if( team == null){
	System.out.println(this.toString+" : team is null" );
}else{
	System.out.println(this.toString+" : team is "+team );
}
String part = req.getParameter("part");
if( part == null){
	System.out.println(this.toString+" : part is null" );
}else{
	System.out.println(this.toString+" : part is "+part );
}
String area = req.getParameter("area");
if( area == null){
	System.out.println(this.toString+" : area is null" );
}else{
	System.out.println(this.toString+" : area is "+area );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String searchgubun = req.getParameter("searchgubun");
if( searchgubun == null){
	System.out.println(this.toString+" : searchgubun is null" );
}else{
	System.out.println(this.toString+" : searchgubun is "+searchgubun );
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
String bgn_yymm = Util.checkString(req.getParameter("bgn_yymm"));
String end_yymm = Util.checkString(req.getParameter("end_yymm"));
String team = Util.checkString(req.getParameter("team"));
String part = Util.checkString(req.getParameter("part"));
String area = Util.checkString(req.getParameter("area"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String searchgubun = Util.checkString(req.getParameter("searchgubun"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String bgn_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("bgn_yymm")));
String end_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("end_yymm")));
String team = Util.Uni2Ksc(Util.checkString(req.getParameter("team")));
String part = Util.Uni2Ksc(Util.checkString(req.getParameter("part")));
String area = Util.Uni2Ksc(Util.checkString(req.getParameter("area")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String searchgubun = Util.Uni2Ksc(Util.checkString(req.getParameter("searchgubun")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setBgn_yymm(bgn_yymm);
dm.setEnd_yymm(end_yymm);
dm.setTeam(team);
dm.setPart(part);
dm.setArea(area);
dm.setMedi_cd(medi_cd);
dm.setSearchgubun(searchgubun);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 07 13:14:22 KST 2009 */