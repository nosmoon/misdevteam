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


package chosun.ciis.ad.nmd.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.nmd.ds.*;
import chosun.ciis.ad.nmd.rec.*;

/**
 * 
 */


public class AD_NMD_4020_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String work_clsf;
	public String chpn_dt;

	public AD_NMD_4020_LDM(){}
	public AD_NMD_4020_LDM(String cmpy_cd, String work_clsf, String chpn_dt){
		this.cmpy_cd = cmpy_cd;
		this.work_clsf = work_clsf;
		this.chpn_dt = chpn_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setWork_clsf(String work_clsf){
		this.work_clsf = work_clsf;
	}

	public void setChpn_dt(String chpn_dt){
		this.chpn_dt = chpn_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getWork_clsf(){
		return this.work_clsf;
	}

	public String getChpn_dt(){
		return this.chpn_dt;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_NMD_4020_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_NMD_4020_LDM dm = (AD_NMD_4020_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.work_clsf);
		cstmt.setString(5, dm.chpn_dt);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.nmd.ds.AD_NMD_4020_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("work_clsf = [" + getWork_clsf() + "]");
		System.out.println("chpn_dt = [" + getChpn_dt() + "]");
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
String work_clsf = req.getParameter("work_clsf");
if( work_clsf == null){
	System.out.println(this.toString+" : work_clsf is null" );
}else{
	System.out.println(this.toString+" : work_clsf is "+work_clsf );
}
String chpn_dt = req.getParameter("chpn_dt");
if( chpn_dt == null){
	System.out.println(this.toString+" : chpn_dt is null" );
}else{
	System.out.println(this.toString+" : chpn_dt is "+chpn_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String work_clsf = Util.checkString(req.getParameter("work_clsf"));
String chpn_dt = Util.checkString(req.getParameter("chpn_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String work_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("work_clsf")));
String chpn_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("chpn_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setWork_clsf(work_clsf);
dm.setChpn_dt(chpn_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Feb 12 14:51:15 KST 2015 */