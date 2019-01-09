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


public class AS_ASET_1201_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String dt_clsf;
	public String chg_clsf;
	public String chg_dt;

	public AS_ASET_1201_LDM(){}
	public AS_ASET_1201_LDM(String cmpy_cd, String dt_clsf, String chg_clsf, String chg_dt){
		this.cmpy_cd = cmpy_cd;
		this.dt_clsf = dt_clsf;
		this.chg_clsf = chg_clsf;
		this.chg_dt = chg_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDt_clsf(String dt_clsf){
		this.dt_clsf = dt_clsf;
	}

	public void setChg_clsf(String chg_clsf){
		this.chg_clsf = chg_clsf;
	}

	public void setChg_dt(String chg_dt){
		this.chg_dt = chg_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDt_clsf(){
		return this.dt_clsf;
	}

	public String getChg_clsf(){
		return this.chg_clsf;
	}

	public String getChg_dt(){
		return this.chg_dt;
	}

	public String getSQL(){
		 return "{ call MISAST.SP_AS_ASET_1201_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AS_ASET_1201_LDM dm = (AS_ASET_1201_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.dt_clsf);
		cstmt.setString(5, dm.chg_clsf);
		cstmt.setString(6, dm.chg_dt);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.as.aset.ds.AS_ASET_1201_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("dt_clsf = " + getDt_clsf());
        System.out.println("chg_clsf = " + getChg_clsf());
        System.out.println("chg_dt = " + getChg_dt());
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
String dt_clsf = req.getParameter("dt_clsf");
if( dt_clsf == null){
	System.out.println(this.toString+" : dt_clsf is null" );
}else{
	System.out.println(this.toString+" : dt_clsf is "+dt_clsf );
}
String chg_clsf = req.getParameter("chg_clsf");
if( chg_clsf == null){
	System.out.println(this.toString+" : chg_clsf is null" );
}else{
	System.out.println(this.toString+" : chg_clsf is "+chg_clsf );
}
String chg_dt = req.getParameter("chg_dt");
if( chg_dt == null){
	System.out.println(this.toString+" : chg_dt is null" );
}else{
	System.out.println(this.toString+" : chg_dt is "+chg_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String dt_clsf = Util.checkString(req.getParameter("dt_clsf"));
String chg_clsf = Util.checkString(req.getParameter("chg_clsf"));
String chg_dt = Util.checkString(req.getParameter("chg_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dt_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("dt_clsf")));
String chg_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_clsf")));
String chg_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDt_clsf(dt_clsf);
dm.setChg_clsf(chg_clsf);
dm.setChg_dt(chg_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 09 19:06:50 KST 2009 */