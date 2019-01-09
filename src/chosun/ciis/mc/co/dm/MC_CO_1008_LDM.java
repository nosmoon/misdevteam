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


package chosun.ciis.mc.co.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.co.ds.*;
import chosun.ciis.mc.co.rec.*;

/**
 * 
 */


public class MC_CO_1008_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String cd;
	public String cdnm;
	public String job_clsf;
	public String cd_clsf;

	public MC_CO_1008_LDM(){}
	public MC_CO_1008_LDM(String cmpy_cd, String cd, String cdnm, String job_clsf, String cd_clsf){
		this.cmpy_cd = cmpy_cd;
		this.cd = cd;
		this.cdnm = cdnm;
		this.job_clsf = job_clsf;
		this.cd_clsf = cd_clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setCdnm(String cdnm){
		this.cdnm = cdnm;
	}

	public void setJob_clsf(String job_clsf){
		this.job_clsf = job_clsf;
	}

	public void setCd_clsf(String cd_clsf){
		this.cd_clsf = cd_clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getCd(){
		return this.cd;
	}

	public String getCdnm(){
		return this.cdnm;
	}

	public String getJob_clsf(){
		return this.job_clsf;
	}

	public String getCd_clsf(){
		return this.cd_clsf;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_CO_1008_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_CO_1008_LDM dm = (MC_CO_1008_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.cd);
		cstmt.setString(5, dm.cdnm);
		cstmt.setString(6, dm.job_clsf);
		cstmt.setString(7, dm.cd_clsf);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.co.ds.MC_CO_1008_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("cd = " + getCd());
        System.out.println("cdnm = " + getCdnm());
        System.out.println("job_clsf = " + getJob_clsf());
        System.out.println("cd_clsf = " + getCd_clsf());
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
String cd = req.getParameter("cd");
if( cd == null){
	System.out.println(this.toString+" : cd is null" );
}else{
	System.out.println(this.toString+" : cd is "+cd );
}
String cdnm = req.getParameter("cdnm");
if( cdnm == null){
	System.out.println(this.toString+" : cdnm is null" );
}else{
	System.out.println(this.toString+" : cdnm is "+cdnm );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String cd = Util.checkString(req.getParameter("cd"));
String cdnm = Util.checkString(req.getParameter("cdnm"));
String job_clsf = Util.checkString(req.getParameter("job_clsf"));
String cd_clsf = Util.checkString(req.getParameter("cd_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cd")));
String cdnm = Util.Uni2Ksc(Util.checkString(req.getParameter("cdnm")));
String job_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("job_clsf")));
String cd_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("cd_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setCd(cd);
dm.setCdnm(cdnm);
dm.setJob_clsf(job_clsf);
dm.setCd_clsf(cd_clsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Feb 09 14:19:12 KST 2009 */