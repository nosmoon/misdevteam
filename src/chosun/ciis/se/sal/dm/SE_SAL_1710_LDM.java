/***************************************************************************************************
* 파일명 : SE_SAL_1710_LDataSet.java
* 기능 : 판매 - 지대관리 - 매출관리 - 계산서 발행
* 작성일자 : 2009-04-17
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


public class SE_SAL_1710_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd	;
	public String yymm		;
	public String team		;
	public String part		;
	public String area		;
	public String bo_nm		;
	public String gubun		;
	public String send_gubun;
	public String elec_yn	;
	public String incmg_pers;

	public SE_SAL_1710_LDM(){}
	public SE_SAL_1710_LDM(String cmpy_cd, String yymm, String team, String part, String area, String bo_nm, String gubun, String send_gubun, String elec_yn, String incmg_pers){
		this.cmpy_cd	= cmpy_cd	;
		this.yymm 		= yymm		;
		this.team 		= team		;
		this.part 		= part		;
		this.area 		= area		;
		this.bo_nm 		= bo_nm		;
		this.gubun 		= gubun		;
		this.send_gubun = send_gubun;
		this.elec_yn 	= elec_yn	;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
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

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public void setSend_gubun(String send_gubun){
		this.send_gubun = send_gubun;
	}

	public void setElec_yn(String elec_yn){
		this.elec_yn = elec_yn;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getYymm(){
		return this.yymm;
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

	public String getBo_nm(){
		return this.bo_nm;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getSend_gubun(){
		return this.send_gubun;
	}

	public String getElec_yn(){
		return this.elec_yn;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call SP_SE_SAL_1710_L( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_SAL_1710_LDM dm = (SE_SAL_1710_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString( 3, dm.cmpy_cd		);
		cstmt.setString( 4, dm.yymm			);
		cstmt.setString( 5, dm.team			);
		cstmt.setString( 6, dm.part			);
		cstmt.setString( 7, dm.area			);
		cstmt.setString( 8, dm.bo_nm		);
		cstmt.setString( 9, dm.gubun		);
		cstmt.setString(10, dm.send_gubun	);
		cstmt.setString(11, dm.elec_yn		);
		cstmt.setString(12, dm.incmg_pers	);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
		cstmt.registerOutParameter(14, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.sal.ds.SE_SAL_1710_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd 	= " + getCmpy_cd	());
        System.out.println("yymm 		= " + getYymm		());
        System.out.println("team 		= " + getTeam		());
        System.out.println("part 		= " + getPart		());
        System.out.println("area 		= " + getArea		());
        System.out.println("bo_nm 		= " + getBo_nm		());
        System.out.println("gubun 		= " + getGubun		());
        System.out.println("send_gubun 	= " + getSend_gubun	());
        System.out.println("elec_yn 	= " + getElec_yn	());
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
String yymm = req.getParameter("yymm");
if( yymm == null){
	System.out.println(this.toString+" : yymm is null" );
}else{
	System.out.println(this.toString+" : yymm is "+yymm );
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
String bo_nm = req.getParameter("bo_nm");
if( bo_nm == null){
	System.out.println(this.toString+" : bo_nm is null" );
}else{
	System.out.println(this.toString+" : bo_nm is "+bo_nm );
}
String gubun = req.getParameter("gubun");
if( gubun == null){
	System.out.println(this.toString+" : gubun is null" );
}else{
	System.out.println(this.toString+" : gubun is "+gubun );
}
String send_gubun = req.getParameter("send_gubun");
if( send_gubun == null){
	System.out.println(this.toString+" : send_gubun is null" );
}else{
	System.out.println(this.toString+" : send_gubun is "+send_gubun );
}
String elec_yn = req.getParameter("elec_yn");
if( elec_yn == null){
	System.out.println(this.toString+" : elec_yn is null" );
}else{
	System.out.println(this.toString+" : elec_yn is "+elec_yn );
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
String yymm = Util.checkString(req.getParameter("yymm"));
String team = Util.checkString(req.getParameter("team"));
String part = Util.checkString(req.getParameter("part"));
String area = Util.checkString(req.getParameter("area"));
String bo_nm = Util.checkString(req.getParameter("bo_nm"));
String gubun = Util.checkString(req.getParameter("gubun"));
String send_gubun = Util.checkString(req.getParameter("send_gubun"));
String elec_yn = Util.checkString(req.getParameter("elec_yn"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String team = Util.Uni2Ksc(Util.checkString(req.getParameter("team")));
String part = Util.Uni2Ksc(Util.checkString(req.getParameter("part")));
String area = Util.Uni2Ksc(Util.checkString(req.getParameter("area")));
String bo_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_nm")));
String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
String send_gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("send_gubun")));
String elec_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("elec_yn")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setYymm(yymm);
dm.setTeam(team);
dm.setPart(part);
dm.setArea(area);
dm.setBo_nm(bo_nm);
dm.setGubun(gubun);
dm.setSend_gubun(send_gubun);
dm.setElec_yn(elec_yn);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 17 13:29:34 KST 2009 */