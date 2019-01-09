/***************************************************************************************************
* 파일명 : SE_BNS_1170_ADM.java
* 기능 : 판촉물관리 - 판촉물등록
* 작성일자 : 2009-03-16
* 작성자 : 이민효
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


public class SE_BNS_1170_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String bns_item_cd;
	public String aply_dt;
	public String uprc;
	public String divn_uprc;
	public String insd_divn_uprc;
	public String incmgpers;
	public String incmg_pers_ip;

	public SE_BNS_1170_ADM(){}
	public SE_BNS_1170_ADM(String cmpy_cd, String mode, String bns_item_cd, String aply_dt, String uprc, String divn_uprc, String insd_divn_uprc, String incmgpers, String incmg_pers_ip){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.bns_item_cd = bns_item_cd;
		this.aply_dt = aply_dt;
		this.uprc = uprc;
		this.divn_uprc = divn_uprc;
		this.insd_divn_uprc = insd_divn_uprc;
		this.incmgpers = incmgpers;
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setBns_item_cd(String bns_item_cd){
		this.bns_item_cd = bns_item_cd;
	}

	public void setAply_dt(String aply_dt){
		this.aply_dt = aply_dt;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public void setDivn_uprc(String divn_uprc){
		this.divn_uprc = divn_uprc;
	}

	public void setInsd_divn_uprc(String insd_divn_uprc){
		this.insd_divn_uprc = insd_divn_uprc;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMode(){
		return this.mode;
	}

	public String getBns_item_cd(){
		return this.bns_item_cd;
	}

	public String getAply_dt(){
		return this.aply_dt;
	}

	public String getUprc(){
		return this.uprc;
	}

	public String getDivn_uprc(){
		return this.divn_uprc;
	}

	public String getInsd_divn_uprc(){
		return this.insd_divn_uprc;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getSQL(){
		 return "{ call SP_SE_BNS_1170_A( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_BNS_1170_ADM dm = (SE_BNS_1170_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.bns_item_cd);
		cstmt.setString(6, dm.aply_dt);
		cstmt.setString(7, dm.uprc);
		cstmt.setString(8, dm.divn_uprc);
		cstmt.setString(9, dm.insd_divn_uprc);
		cstmt.setString(10, dm.incmgpers);
		cstmt.setString(11, dm.incmg_pers_ip);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.bns.ds.SE_BNS_1170_ADataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("mode = " + getMode());
        System.out.println("bns_item_cd = " + getBns_item_cd());
        System.out.println("aply_dt = " + getAply_dt());
        System.out.println("uprc = " + getUprc());
        System.out.println("divn_uprc = " + getDivn_uprc());
        System.out.println("insd_divn_uprc = " + getInsd_divn_uprc());
        System.out.println("incmgpers = " + getIncmgpers());
        System.out.println("incmg_pers_ip = " + getIncmg_pers_ip());
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
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String bns_item_cd = req.getParameter("bns_item_cd");
if( bns_item_cd == null){
	System.out.println(this.toString+" : bns_item_cd is null" );
}else{
	System.out.println(this.toString+" : bns_item_cd is "+bns_item_cd );
}
String aply_dt = req.getParameter("aply_dt");
if( aply_dt == null){
	System.out.println(this.toString+" : aply_dt is null" );
}else{
	System.out.println(this.toString+" : aply_dt is "+aply_dt );
}
String uprc = req.getParameter("uprc");
if( uprc == null){
	System.out.println(this.toString+" : uprc is null" );
}else{
	System.out.println(this.toString+" : uprc is "+uprc );
}
String divn_uprc = req.getParameter("divn_uprc");
if( divn_uprc == null){
	System.out.println(this.toString+" : divn_uprc is null" );
}else{
	System.out.println(this.toString+" : divn_uprc is "+divn_uprc );
}
String insd_divn_uprc = req.getParameter("insd_divn_uprc");
if( insd_divn_uprc == null){
	System.out.println(this.toString+" : insd_divn_uprc is null" );
}else{
	System.out.println(this.toString+" : insd_divn_uprc is "+insd_divn_uprc );
}
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
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
String mode = Util.checkString(req.getParameter("mode"));
String bns_item_cd = Util.checkString(req.getParameter("bns_item_cd"));
String aply_dt = Util.checkString(req.getParameter("aply_dt"));
String uprc = Util.checkString(req.getParameter("uprc"));
String divn_uprc = Util.checkString(req.getParameter("divn_uprc"));
String insd_divn_uprc = Util.checkString(req.getParameter("insd_divn_uprc"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String bns_item_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bns_item_cd")));
String aply_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_dt")));
String uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("uprc")));
String divn_uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("divn_uprc")));
String insd_divn_uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("insd_divn_uprc")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setBns_item_cd(bns_item_cd);
dm.setAply_dt(aply_dt);
dm.setUprc(uprc);
dm.setDivn_uprc(divn_uprc);
dm.setInsd_divn_uprc(insd_divn_uprc);
dm.setIncmgpers(incmgpers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 16 18:34:39 KST 2009 */