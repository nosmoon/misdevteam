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


package chosun.ciis.pr.papmake.dm;

import java.sql.*;

import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.common.dm.MT_COMMON_COCD_1000_LDM;
import chosun.ciis.pr.papmake.ds.*;
import chosun.ciis.pr.papmake.rec.*;

/**
 * 
 */


public class PR_PAPMAKE_7013_MDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String job_clsf;
	public String cd_clsf;
	public String mang_cd_1;
	public String mang_cd_2;
	public String mang_cd_3;

	public PR_PAPMAKE_7013_MDM(){}
	public PR_PAPMAKE_7013_MDM(String cmpy_cd, String job_clsf, String cd_clsf, String mang_cd_1, String mang_cd_2, String mang_cd_3){
		this.cmpy_cd = cmpy_cd;
		this.job_clsf = job_clsf;
		this.cd_clsf = cd_clsf;
		this.mang_cd_1 = mang_cd_1;
		this.mang_cd_2 = mang_cd_2;
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

	public void setMang_cd_1(String mang_cd_1) {
		this.mang_cd_1 = mang_cd_1;
	}
	
	public void setMang_cd_2(String mang_cd_2) {
		this.mang_cd_2 = mang_cd_2;
	}
	
	public void setMang_cd_3(String mang_cd_3) {
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
	
	public String getMang_cd_1() {
		return mang_cd_1;
	}
	
	public String getMang_cd_2() {
		return mang_cd_2;
	}
	
	public String getMang_cd_3() {
		return mang_cd_3;
	}
	

	public String getSQL(){
		 return "{ call MISMAT.SP_PR_PAPMAKE_7013_M(? ,? ,? ,? ,? ,?, ? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PR_PAPMAKE_7013_MDM dm = (PR_PAPMAKE_7013_MDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.job_clsf);
		cstmt.setString(5, dm.cd_clsf);
		cstmt.setString(6, dm.mang_cd_1);
		cstmt.setString(7, dm.mang_cd_2);
		cstmt.setString(8, dm.mang_cd_3);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pr.papmake.ds.PR_PAPMAKE_7013_MDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("job_clsf = [" + getJob_clsf() + "]");
		System.out.println("cd_clsf = [" + getCd_clsf() + "]");
		System.out.println("cd_clsf = [" + getMang_cd_1() + "]");
		System.out.println("cd_clsf = [" + getMang_cd_2() + "]");
		System.out.println("cd_clsf = [" + getMang_cd_3() + "]");
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Dec 28 17:58:28 KST 2015 */