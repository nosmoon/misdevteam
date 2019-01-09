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


package chosun.ciis.fc.co.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.co.ds.*;
import chosun.ciis.fc.co.rec.*;

/**
 * 
 */


public class FC_CO_8080_SDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String job_clsf;
	public String cd_clsf;
	public String cd;
	public String mang_cd_3;

	public FC_CO_8080_SDM(){}
	public FC_CO_8080_SDM(String cmpy_cd, String job_clsf, String cd_clsf, String cd, String mang_cd_3){
		this.cmpy_cd = cmpy_cd;
		this.job_clsf = job_clsf;
		this.cd_clsf = cd_clsf;
		this.cd = cd;
		this.mang_cd_3 = mang_cd_3;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setJob_clsf(String job_clsf){
		this.job_clsf = job_clsf;
	}

	public void setCd_clsf(String cd_clsf){
		this.cd_clsf = cd_clsf;
	}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setMang_cd_3(String mang_cd_3){
		this.mang_cd_3 = mang_cd_3;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getJob_clsf(){
		return this.job_clsf;
	}

	public String getCd_clsf(){
		return this.cd_clsf;
	}

	public String getCd(){
		return this.cd;
	}

	public String getMang_cd_3(){
		return this.mang_cd_3;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_CO_8080_S(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_CO_8080_SDM dm = (FC_CO_8080_SDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.job_clsf);
		cstmt.setString(5, dm.cd_clsf);
		cstmt.setString(6, dm.cd);
		cstmt.setString(7, dm.mang_cd_3);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.co.ds.FC_CO_8080_SDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("job_clsf = [" + getJob_clsf() + "]");
		System.out.println("cd_clsf = [" + getCd_clsf() + "]");
		System.out.println("cd = [" + getCd() + "]");
		System.out.println("mang_cd_3 = [" + getMang_cd_3() + "]");
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
String job_clsf = req.getParameter("job_clsf");
if( job_clsf == null){
	System.out.println(this.toString+" : job_clsf is null" );
}else{
	System.out.println(this.toString+" : job_clsf is "+job_clsf );
}
String cd_clsf = req.getParameter("cd_clsf");
if( cd_clsf == null){
	System.out.println(this.toString+" : cd_clsf is null" );
}else{
	System.out.println(this.toString+" : cd_clsf is "+cd_clsf );
}
String cd = req.getParameter("cd");
if( cd == null){
	System.out.println(this.toString+" : cd is null" );
}else{
	System.out.println(this.toString+" : cd is "+cd );
}
String mang_cd_3 = req.getParameter("mang_cd_3");
if( mang_cd_3 == null){
	System.out.println(this.toString+" : mang_cd_3 is null" );
}else{
	System.out.println(this.toString+" : mang_cd_3 is "+mang_cd_3 );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String job_clsf = Util.checkString(req.getParameter("job_clsf"));
String cd_clsf = Util.checkString(req.getParameter("cd_clsf"));
String cd = Util.checkString(req.getParameter("cd"));
String mang_cd_3 = Util.checkString(req.getParameter("mang_cd_3"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String job_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("job_clsf")));
String cd_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("cd_clsf")));
String cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cd")));
String mang_cd_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_cd_3")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setJob_clsf(job_clsf);
dm.setCd_clsf(cd_clsf);
dm.setCd(cd);
dm.setMang_cd_3(mang_cd_3);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Sep 28 16:57:09 KST 2009 */