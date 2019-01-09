/***************************************************************************************************
* 파일명 : SE_BAS_1210_LDM.java
* 기능 : 기준정보관리 - 매체단가관리
* 작성일자 : 2009-03-11
* 작성자 : 이민효
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.mt.papinout.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.papinout.ds.*;
import chosun.ciis.mt.papinout.rec.*;

/**
 * 
 */


public class MT_PAPINOUT_1110_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String ewh_dt;
	public String issu_dt;

	public MT_PAPINOUT_1110_LDM(){}
	public MT_PAPINOUT_1110_LDM(String cmpy_cd, String ewh_dt, String issu_dt){
		this.cmpy_cd = cmpy_cd;
		this.ewh_dt = ewh_dt;
		this.issu_dt = issu_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEwh_dt(String ewh_dt){
		this.ewh_dt = ewh_dt;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}
	
	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEwh_dt(){
		return this.ewh_dt;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getSQL(){
		 return "{ call SP_MT_PAPINOUT_1110_L( ?, ?, ?, ?, ?, ?, ? ) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_PAPINOUT_1110_LDM dm = (MT_PAPINOUT_1110_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.ewh_dt);
		cstmt.setString(5, dm.issu_dt);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
		cstmt.registerOutParameter(7, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.papinout.ds.MT_PAPINOUT_1110_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("aply_yymm_fr = " + getEwh_dt());
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
String aply_yymm_fr = req.getParameter("aply_yymm_fr");
if( aply_yymm_fr == null){
	System.out.println(this.toString+" : aply_yymm_fr is null" );
}else{
	System.out.println(this.toString+" : aply_yymm_fr is "+aply_yymm_fr );
}
String aply_yymm_to = req.getParameter("aply_yymm_to");
if( aply_yymm_to == null){
	System.out.println(this.toString+" : aply_yymm_to is null" );
}else{
	System.out.println(this.toString+" : aply_yymm_to is "+aply_yymm_to );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String sell_net_clsf = req.getParameter("sell_net_clsf");
if( sell_net_clsf == null){
	System.out.println(this.toString+" : sell_net_clsf is null" );
}else{
	System.out.println(this.toString+" : sell_net_clsf is "+sell_net_clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String aply_yymm_fr = Util.checkString(req.getParameter("aply_yymm_fr"));
String aply_yymm_to = Util.checkString(req.getParameter("aply_yymm_to"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String sell_net_clsf = Util.checkString(req.getParameter("sell_net_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String aply_yymm_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_yymm_fr")));
String aply_yymm_to = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_yymm_to")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String sell_net_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("sell_net_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setAply_yymm_fr(aply_yymm_fr);
dm.setAply_yymm_to(aply_yymm_to);
dm.setMedi_cd(medi_cd);
dm.setSell_net_clsf(sell_net_clsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Feb 09 15:29:10 KST 2009 */