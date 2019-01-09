/***************************************************************************************************
* 파일명 : SE_SND_2430_LDM.java
* 기능 : 판매-발송관리-수송단가변경
* 작성일자 : 2009-02-19
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


public class SE_SND_2430_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String chg_reg_dt;
	public String chg_no;
	public String tran_uprc_cd;
	public String incmg_pers;

	public SE_SND_2430_LDM(){}
	public SE_SND_2430_LDM(String cmpy_cd, String chg_reg_dt, String chg_no, String tran_uprc_cd, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.chg_reg_dt = chg_reg_dt;
		this.chg_no = chg_no;
		this.tran_uprc_cd = tran_uprc_cd;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setChg_reg_dt(String chg_reg_dt){
		this.chg_reg_dt = chg_reg_dt;
	}

	public void setChg_no(String chg_no){
		this.chg_no = chg_no;
	}

	public void setTran_uprc_cd(String tran_uprc_cd){
		this.tran_uprc_cd = tran_uprc_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getChg_reg_dt(){
		return this.chg_reg_dt;
	}

	public String getChg_no(){
		return this.chg_no;
	}

	public String getTran_uprc_cd(){
		return this.tran_uprc_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call SP_SE_SND_2430_L( ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_SND_2430_LDM dm = (SE_SND_2430_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.chg_reg_dt);
		cstmt.setString(5, dm.chg_no);
		cstmt.setString(6, dm.tran_uprc_cd);
		cstmt.setString(7, dm.incmg_pers);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.snd.ds.SE_SND_2430_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("chg_reg_dt = " + getChg_reg_dt());
        System.out.println("chg_no = " + getChg_no());
        System.out.println("tran_uprc_cd = " + getTran_uprc_cd());
        System.out.println("incmg_pers = " + getIncmg_pers());
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
String chg_reg_dt = req.getParameter("chg_reg_dt");
if( chg_reg_dt == null){
	System.out.println(this.toString+" : chg_reg_dt is null" );
}else{
	System.out.println(this.toString+" : chg_reg_dt is "+chg_reg_dt );
}
String chg_no = req.getParameter("chg_no");
if( chg_no == null){
	System.out.println(this.toString+" : chg_no is null" );
}else{
	System.out.println(this.toString+" : chg_no is "+chg_no );
}
String tran_uprc_cd = req.getParameter("tran_uprc_cd");
if( tran_uprc_cd == null){
	System.out.println(this.toString+" : tran_uprc_cd is null" );
}else{
	System.out.println(this.toString+" : tran_uprc_cd is "+tran_uprc_cd );
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
String chg_reg_dt = Util.checkString(req.getParameter("chg_reg_dt"));
String chg_no = Util.checkString(req.getParameter("chg_no"));
String tran_uprc_cd = Util.checkString(req.getParameter("tran_uprc_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String chg_reg_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_reg_dt")));
String chg_no = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_no")));
String tran_uprc_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("tran_uprc_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setChg_reg_dt(chg_reg_dt);
dm.setChg_no(chg_no);
dm.setTran_uprc_cd(tran_uprc_cd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Feb 19 20:05:17 KST 2009 */