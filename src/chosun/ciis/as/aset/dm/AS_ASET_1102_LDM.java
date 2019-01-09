/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.as.aset.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.aset.ds.*;
import chosun.ciis.as.aset.rec.*;

/**
 * 
 */


public class AS_ASET_1102_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String fr_chg_dt;
	public String to_chg_dt;
	public String chg_clsf;

	public AS_ASET_1102_LDM(){}
	public AS_ASET_1102_LDM(String cmpy_cd, String fr_chg_dt, String to_chg_dt, String chg_clsf){
		this.cmpy_cd = cmpy_cd;
		this.fr_chg_dt = fr_chg_dt;
		this.to_chg_dt = to_chg_dt;
		this.chg_clsf = chg_clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFr_chg_dt(String fr_chg_dt){
		this.fr_chg_dt = fr_chg_dt;
	}

	public void setTo_chg_dt(String to_chg_dt){
		this.to_chg_dt = to_chg_dt;
	}

	public void setChg_clsf(String chg_clsf){
		this.chg_clsf = chg_clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFr_chg_dt(){
		return this.fr_chg_dt;
	}

	public String getTo_chg_dt(){
		return this.to_chg_dt;
	}

	public String getChg_clsf(){
		return this.chg_clsf;
	}

	public String getSQL(){
		 return "{ call MISAST.SP_AS_ASET_1102_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AS_ASET_1102_LDM dm = (AS_ASET_1102_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.fr_chg_dt);
		cstmt.setString(5, dm.to_chg_dt);
		cstmt.setString(6, dm.chg_clsf);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.as.aset.ds.AS_ASET_1102_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("fr_chg_dt = " + getFr_chg_dt());
        System.out.println("to_chg_dt = " + getTo_chg_dt());
        System.out.println("chg_clsf = " + getChg_clsf());
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
String fr_chg_dt = req.getParameter("fr_chg_dt");
if( fr_chg_dt == null){
	System.out.println(this.toString+" : fr_chg_dt is null" );
}else{
	System.out.println(this.toString+" : fr_chg_dt is "+fr_chg_dt );
}
String to_chg_dt = req.getParameter("to_chg_dt");
if( to_chg_dt == null){
	System.out.println(this.toString+" : to_chg_dt is null" );
}else{
	System.out.println(this.toString+" : to_chg_dt is "+to_chg_dt );
}
String chg_clsf = req.getParameter("chg_clsf");
if( chg_clsf == null){
	System.out.println(this.toString+" : chg_clsf is null" );
}else{
	System.out.println(this.toString+" : chg_clsf is "+chg_clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String fr_chg_dt = Util.checkString(req.getParameter("fr_chg_dt"));
String to_chg_dt = Util.checkString(req.getParameter("to_chg_dt"));
String chg_clsf = Util.checkString(req.getParameter("chg_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String fr_chg_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_chg_dt")));
String to_chg_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("to_chg_dt")));
String chg_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFr_chg_dt(fr_chg_dt);
dm.setTo_chg_dt(to_chg_dt);
dm.setChg_clsf(chg_clsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 26 17:52:31 KST 2009 */