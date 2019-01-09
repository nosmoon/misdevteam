/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매시스템
* 작성일자 : 2009-02-18
* 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.qty.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.qty.ds.*;
import chosun.ciis.se.qty.rec.*;

/**
 * 
 */


public class SE_QTY_1510_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String incmg_pers;
	public String team_cd;
	public String part_cd;
	public String area_cd;
	public String medi_cd;
	public String yymm;
	public String schgb;
	public String qty1;
	public String qty2;
	public String schlevel;

	public SE_QTY_1510_LDM(){}
	public SE_QTY_1510_LDM(String cmpy_cd, String incmg_pers, String team_cd, String part_cd, String area_cd, String medi_cd, String yymm, String schgb, String qty1, String qty2, String schlevel){
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers = incmg_pers;
		this.team_cd = team_cd;
		this.part_cd = part_cd;
		this.area_cd = area_cd;
		this.medi_cd = medi_cd;
		this.yymm = yymm;
		this.schgb = schgb;
		this.qty1 = qty1;
		this.qty2 = qty2;
		this.schlevel = schlevel;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setTeam_cd(String team_cd){
		this.team_cd = team_cd;
	}

	public void setPart_cd(String part_cd){
		this.part_cd = part_cd;
	}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setSchgb(String schgb){
		this.schgb = schgb;
	}

	public void setQty1(String qty1){
		this.qty1 = qty1;
	}

	public void setQty2(String qty2){
		this.qty2 = qty2;
	}

	public void setSchlevel(String schlevel){
		this.schlevel = schlevel;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getTeam_cd(){
		return this.team_cd;
	}

	public String getPart_cd(){
		return this.part_cd;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getSchgb(){
		return this.schgb;
	}

	public String getQty1(){
		return this.qty1;
	}

	public String getQty2(){
		return this.qty2;
	}

	public String getSchlevel(){
		return this.schlevel;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_QTY_1510_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_QTY_1510_LDM dm = (SE_QTY_1510_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.incmg_pers);
		cstmt.setString(5, dm.team_cd);
		cstmt.setString(6, dm.part_cd);
		cstmt.setString(7, dm.area_cd);
		cstmt.setString(8, dm.medi_cd);
		cstmt.setString(9, dm.yymm);
		cstmt.setString(10, dm.schgb);
		cstmt.setString(11, dm.qty1);
		cstmt.setString(12, dm.qty2);
		cstmt.setString(13, dm.schlevel);
		cstmt.registerOutParameter(14, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.qty.ds.SE_QTY_1510_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("team_cd = " + getTeam_cd());
        System.out.println("part_cd = " + getPart_cd());
        System.out.println("area_cd = " + getArea_cd());
        System.out.println("medi_cd = " + getMedi_cd());
        System.out.println("yymm = " + getYymm());
        System.out.println("schgb = " + getSchgb());
        System.out.println("qty1 = " + getQty1());
        System.out.println("qty2 = " + getQty2());
        System.out.println("schlevel = " + getSchlevel());
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
String team_cd = req.getParameter("team_cd");
if( team_cd == null){
	System.out.println(this.toString+" : team_cd is null" );
}else{
	System.out.println(this.toString+" : team_cd is "+team_cd );
}
String part_cd = req.getParameter("part_cd");
if( part_cd == null){
	System.out.println(this.toString+" : part_cd is null" );
}else{
	System.out.println(this.toString+" : part_cd is "+part_cd );
}
String area_cd = req.getParameter("area_cd");
if( area_cd == null){
	System.out.println(this.toString+" : area_cd is null" );
}else{
	System.out.println(this.toString+" : area_cd is "+area_cd );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String yymm = req.getParameter("yymm");
if( yymm == null){
	System.out.println(this.toString+" : yymm is null" );
}else{
	System.out.println(this.toString+" : yymm is "+yymm );
}
String schgb = req.getParameter("schgb");
if( schgb == null){
	System.out.println(this.toString+" : schgb is null" );
}else{
	System.out.println(this.toString+" : schgb is "+schgb );
}
String qty1 = req.getParameter("qty1");
if( qty1 == null){
	System.out.println(this.toString+" : qty1 is null" );
}else{
	System.out.println(this.toString+" : qty1 is "+qty1 );
}
String qty2 = req.getParameter("qty2");
if( qty2 == null){
	System.out.println(this.toString+" : qty2 is null" );
}else{
	System.out.println(this.toString+" : qty2 is "+qty2 );
}
String schlevel = req.getParameter("schlevel");
if( schlevel == null){
	System.out.println(this.toString+" : schlevel is null" );
}else{
	System.out.println(this.toString+" : schlevel is "+schlevel );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String team_cd = Util.checkString(req.getParameter("team_cd"));
String part_cd = Util.checkString(req.getParameter("part_cd"));
String area_cd = Util.checkString(req.getParameter("area_cd"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String yymm = Util.checkString(req.getParameter("yymm"));
String schgb = Util.checkString(req.getParameter("schgb"));
String qty1 = Util.checkString(req.getParameter("qty1"));
String qty2 = Util.checkString(req.getParameter("qty2"));
String schlevel = Util.checkString(req.getParameter("schlevel"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String team_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("team_cd")));
String part_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("part_cd")));
String area_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("area_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String schgb = Util.Uni2Ksc(Util.checkString(req.getParameter("schgb")));
String qty1 = Util.Uni2Ksc(Util.checkString(req.getParameter("qty1")));
String qty2 = Util.Uni2Ksc(Util.checkString(req.getParameter("qty2")));
String schlevel = Util.Uni2Ksc(Util.checkString(req.getParameter("schlevel")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers(incmg_pers);
dm.setTeam_cd(team_cd);
dm.setPart_cd(part_cd);
dm.setArea_cd(area_cd);
dm.setMedi_cd(medi_cd);
dm.setYymm(yymm);
dm.setSchgb(schgb);
dm.setQty1(qty1);
dm.setQty2(qty2);
dm.setSchlevel(schlevel);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Feb 20 17:18:59 KST 2009 */