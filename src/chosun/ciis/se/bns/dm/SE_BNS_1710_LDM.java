/***************************************************************************************************
* 파일명 : SE_BNS_1710_LDM.java
* 기능 : 판매-판촉물관리 - 판촉물배분현황조회
* 작성일자 : 2009-05-04
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


public class SE_BNS_1710_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd		;
	public String team			;
	public String part			;
	public String area			;
	public String bns_item_cd	;
	public String divn_yymm		;
	public String searchgubun	;
	public String incmg_pers	;

	public SE_BNS_1710_LDM(){}
	public SE_BNS_1710_LDM(String cmpy_cd, String team, String part, String area, String bns_item_cd, String divn_yymm, String searchgubun, String incmg_pers){
		this.cmpy_cd 		= cmpy_cd		;
		this.team 			= team			;
		this.part 			= part			;
		this.area 			= area			;
		this.bns_item_cd 	= bns_item_cd	;
		this.divn_yymm 		= divn_yymm		;
		this.searchgubun	= searchgubun	;
		this.incmg_pers 	= incmg_pers	;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
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

	public void setBns_item_cd(String bns_item_cd){
		this.bns_item_cd = bns_item_cd;
	}

	public void setDivn_yymm(String divn_yymm){
		this.divn_yymm = divn_yymm;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
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

	public String getBns_item_cd(){
		return this.bns_item_cd;
	}

	public String getDivn_yymm(){
		return this.divn_yymm;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call SP_SE_BNS_1710_L( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_BNS_1710_LDM dm = (SE_BNS_1710_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString( 3, dm.cmpy_cd		);
		cstmt.setString( 4, dm.team			);
		cstmt.setString( 5, dm.part			);
		cstmt.setString( 6, dm.area			);
		cstmt.setString( 7, dm.bns_item_cd	);
		cstmt.setString( 8, dm.divn_yymm	);
		cstmt.setString( 9, dm.searchgubun  );
		cstmt.setString(10, dm.incmg_pers	);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.bns.ds.SE_BNS_1710_LDataSet();
	}

    public void print(){
        System.out.println("cmpy_cd 	= " + getCmpy_cd	());
        System.out.println("team 		= " + getTeam		());
        System.out.println("part 		= " + getPart		());
        System.out.println("area 		= " + getArea		());
        System.out.println("bns_item_cd = " + getBns_item_cd());
        System.out.println("divn_yymm 	= " + getDivn_yymm	());
        System.out.println("searchgubun	= " + getSearchgubun());
        System.out.println("incmg_pers 	= " + getIncmg_pers	());
    }
	public String getSearchgubun() {
		return searchgubun;
	}
	public void setSearchgubun(String searchgubun) {
		this.searchgubun = searchgubun;
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
String bns_item_cd = req.getParameter("bns_item_cd");
if( bns_item_cd == null){
	System.out.println(this.toString+" : bns_item_cd is null" );
}else{
	System.out.println(this.toString+" : bns_item_cd is "+bns_item_cd );
}
String divn_yymm = req.getParameter("divn_yymm");
if( divn_yymm == null){
	System.out.println(this.toString+" : divn_yymm is null" );
}else{
	System.out.println(this.toString+" : divn_yymm is "+divn_yymm );
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
String team = Util.checkString(req.getParameter("team"));
String part = Util.checkString(req.getParameter("part"));
String area = Util.checkString(req.getParameter("area"));
String bns_item_cd = Util.checkString(req.getParameter("bns_item_cd"));
String divn_yymm = Util.checkString(req.getParameter("divn_yymm"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String team = Util.Uni2Ksc(Util.checkString(req.getParameter("team")));
String part = Util.Uni2Ksc(Util.checkString(req.getParameter("part")));
String area = Util.Uni2Ksc(Util.checkString(req.getParameter("area")));
String bns_item_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bns_item_cd")));
String divn_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("divn_yymm")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setTeam(team);
dm.setPart(part);
dm.setArea(area);
dm.setBns_item_cd(bns_item_cd);
dm.setDivn_yymm(divn_yymm);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 04 14:08:41 KST 2009 */