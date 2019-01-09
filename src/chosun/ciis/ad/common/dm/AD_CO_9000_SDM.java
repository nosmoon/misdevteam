/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 2009-01-29
* 작성자 : 김태길
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ad.common.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_CO_9000_SDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String action;
	public String cmpy_cd;
	public String srch_cd;
	public String job_clsf;
	public String cd_clsf;

	public AD_CO_9000_SDM(){}
	public AD_CO_9000_SDM(String action, String cmpy_cd, String srch_cd, String job_clsf, String cd_clsf){
		this.action = action;
		this.cmpy_cd = cmpy_cd;
		this.srch_cd = srch_cd;
		this.job_clsf = job_clsf;
		this.cd_clsf = cd_clsf;
	}

	public void setAction(String action){
		this.action = action;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSrch_cd(String srch_cd){
		this.srch_cd = srch_cd;
	}

	public void setJob_clsf(String job_clsf){
		this.job_clsf = job_clsf;
	}

	public void setCd_clsf(String cd_clsf){
		this.cd_clsf = cd_clsf;
	}

	public String getAction(){
		return this.action;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSrch_cd(){
		return this.srch_cd;
	}

	public String getJob_clsf(){
		return this.job_clsf;
	}

	public String getCd_clsf(){
		return this.cd_clsf;
	}

	public String getSQL(){
		 return "{ call SP_AD_CO_9000_S( ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_CO_9000_SDM dm = (AD_CO_9000_SDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.action);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.srch_cd);
		cstmt.registerOutParameter(5, Types.VARCHAR);
		cstmt.setString(6, dm.job_clsf);
		cstmt.setString(7, dm.cd_clsf);
		cstmt.registerOutParameter(8, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.common.ds.AD_CO_9000_SDataSet();
	}



    public void print(){
        System.out.println("action = " + getAction());
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("srch_cd = " + getSrch_cd());
        System.out.println("job_clsf = " + getJob_clsf());
        System.out.println("cd_clsf = " + getCd_clsf());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String action = req.getParameter("action");
if( action == null){
	System.out.println(this.toString+" : action is null" );
}else{
	System.out.println(this.toString+" : action is "+action );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String srch_cd = req.getParameter("srch_cd");
if( srch_cd == null){
	System.out.println(this.toString+" : srch_cd is null" );
}else{
	System.out.println(this.toString+" : srch_cd is "+srch_cd );
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

String action = Util.checkString(req.getParameter("action"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String srch_cd = Util.checkString(req.getParameter("srch_cd"));
String job_clsf = Util.checkString(req.getParameter("job_clsf"));
String cd_clsf = Util.checkString(req.getParameter("cd_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String action = Util.Uni2Ksc(Util.checkString(req.getParameter("action")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String srch_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("srch_cd")));
String job_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("job_clsf")));
String cd_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("cd_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setAction(action);
dm.setCmpy_cd(cmpy_cd);
dm.setSrch_cd(srch_cd);
dm.setJob_clsf(job_clsf);
dm.setCd_clsf(cd_clsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Feb 27 19:13:41 KST 2009 */