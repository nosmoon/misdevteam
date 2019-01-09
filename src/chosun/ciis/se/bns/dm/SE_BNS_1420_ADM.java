/***************************************************************************************************
* 파일명 : SE_BNS_1420_ADM.java
* 기능 : 판매-판촉물관리 - 판촉물발송일자관리
* 작성일자 : 2009-04-29
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


public class SE_BNS_1420_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd		;
	public String yymm			;
	public String medi_cd		;
	public String mode			;
	public String dt			;
	public String basi_mm		;
	public String bns_item_cd	;
	public String divn_dt		;
	public String chg_issu_dt	;
	public String incmg_pers	;
	public String incmg_pers_ip	;

	public SE_BNS_1420_ADM(){}
	public SE_BNS_1420_ADM(String cmpy_cd, String yymm, String medi_cd, String mode, String dt, String basi_mm, String bns_item_cd, String divn_dt, String chg_issu_dt, String incmg_pers, String incmg_pers_ip){
		this.cmpy_cd 		= cmpy_cd		;
		this.yymm 			= yymm			;
		this.medi_cd 		= medi_cd		;
		this.mode 			= mode			;
		this.dt 			= dt			;
		this.basi_mm 		= basi_mm		;
		this.bns_item_cd 	= bns_item_cd	;
		this.divn_dt 		= divn_dt		;
		this.chg_issu_dt 	= chg_issu_dt	;
		this.incmg_pers 	= incmg_pers	;
		this.incmg_pers_ip 	= incmg_pers_ip	;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setDt(String dt){
		this.dt = dt;
	}

	public void setBasi_mm(String basi_mm){
		this.basi_mm = basi_mm;
	}

	public void setBns_item_cd(String bns_item_cd){
		this.bns_item_cd = bns_item_cd;
	}

	public void setDivn_dt(String divn_dt){
		this.divn_dt = divn_dt;
	}

	public void setChg_issu_dt(String chg_issu_dt){
		this.chg_issu_dt = chg_issu_dt;
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

	public String getYymm(){
		return this.yymm;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMode(){
		return this.mode;
	}

	public String getDt(){
		return this.dt;
	}

	public String getBasi_mm(){
		return this.basi_mm;
	}

	public String getBns_item_cd(){
		return this.bns_item_cd;
	}

	public String getDivn_dt(){
		return this.divn_dt;
	}

	public String getChg_issu_dt(){
		return this.chg_issu_dt;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getSQL(){
		 return "{ call SP_SE_BNS_1420_A( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_BNS_1420_ADM dm = (SE_BNS_1420_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString( 3, dm.cmpy_cd		);
		cstmt.setString( 4, dm.yymm			);
		cstmt.setString( 5, dm.medi_cd		);
		cstmt.setString( 6, dm.mode			);
		cstmt.setString( 7, dm.dt			);
		cstmt.setString( 8, dm.basi_mm		);
		cstmt.setString( 9, dm.bns_item_cd	);
		cstmt.setString(10, dm.divn_dt		);
		cstmt.setString(11, dm.chg_issu_dt	);
		cstmt.setString(12, dm.incmg_pers	);
		cstmt.setString(13, dm.incmg_pers_ip);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.bns.ds.SE_BNS_1420_ADataSet();
	}

    public void print(){
        System.out.println("cmpy_cd 		= " + getCmpy_cd		());
        System.out.println("yymm 			= " + getYymm			());
        System.out.println("medi_cd 		= " + getMedi_cd		());
        System.out.println("mode 			= " + getMode			());
        System.out.println("dt 				= " + getDt				());
        System.out.println("basi_mm 		= " + getBasi_mm		());
        System.out.println("bns_item_cd 	= " + getBns_item_cd	());
        System.out.println("divn_dt 		= " + getDivn_dt		());
        System.out.println("chg_issu_dt 	= " + getChg_issu_dt	());
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
String yymm = req.getParameter("yymm");
if( yymm == null){
	System.out.println(this.toString+" : yymm is null" );
}else{
	System.out.println(this.toString+" : yymm is "+yymm );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String dt = req.getParameter("dt");
if( dt == null){
	System.out.println(this.toString+" : dt is null" );
}else{
	System.out.println(this.toString+" : dt is "+dt );
}
String basi_mm = req.getParameter("basi_mm");
if( basi_mm == null){
	System.out.println(this.toString+" : basi_mm is null" );
}else{
	System.out.println(this.toString+" : basi_mm is "+basi_mm );
}
String bns_item_cd = req.getParameter("bns_item_cd");
if( bns_item_cd == null){
	System.out.println(this.toString+" : bns_item_cd is null" );
}else{
	System.out.println(this.toString+" : bns_item_cd is "+bns_item_cd );
}
String divn_dt = req.getParameter("divn_dt");
if( divn_dt == null){
	System.out.println(this.toString+" : divn_dt is null" );
}else{
	System.out.println(this.toString+" : divn_dt is "+divn_dt );
}
String chg_issu_dt = req.getParameter("chg_issu_dt");
if( chg_issu_dt == null){
	System.out.println(this.toString+" : chg_issu_dt is null" );
}else{
	System.out.println(this.toString+" : chg_issu_dt is "+chg_issu_dt );
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
String yymm = Util.checkString(req.getParameter("yymm"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String mode = Util.checkString(req.getParameter("mode"));
String dt = Util.checkString(req.getParameter("dt"));
String basi_mm = Util.checkString(req.getParameter("basi_mm"));
String bns_item_cd = Util.checkString(req.getParameter("bns_item_cd"));
String divn_dt = Util.checkString(req.getParameter("divn_dt"));
String chg_issu_dt = Util.checkString(req.getParameter("chg_issu_dt"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String dt = Util.Uni2Ksc(Util.checkString(req.getParameter("dt")));
String basi_mm = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_mm")));
String bns_item_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bns_item_cd")));
String divn_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("divn_dt")));
String chg_issu_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_issu_dt")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setYymm(yymm);
dm.setMedi_cd(medi_cd);
dm.setMode(mode);
dm.setDt(dt);
dm.setBasi_mm(basi_mm);
dm.setBns_item_cd(bns_item_cd);
dm.setDivn_dt(divn_dt);
dm.setChg_issu_dt(chg_issu_dt);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 29 15:37:29 KST 2009 */