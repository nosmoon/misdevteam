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


package chosun.ciis.mc.budg.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.budg.ds.*;
import chosun.ciis.mc.budg.rec.*;

/**
 * 
 */


public class MC_BUDG_2011_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String dtls_clsf_cd1;
	public String dtls_clsf_cd2;
	public String yymm;
	public String medi_cd;
	public String job_clsf_cd;

	public MC_BUDG_2011_LDM(){}
	public MC_BUDG_2011_LDM(String cmpy_cd, String dtls_clsf_cd1, String dtls_clsf_cd2, String yymm, String medi_cd, String job_clsf_cd){
		this.cmpy_cd = cmpy_cd;
		this.dtls_clsf_cd1 = dtls_clsf_cd1;
		this.dtls_clsf_cd2 = dtls_clsf_cd2;
		this.yymm = yymm;
		this.medi_cd = medi_cd;
		this.job_clsf_cd = job_clsf_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDtls_clsf_cd1(String dtls_clsf_cd1){
		this.dtls_clsf_cd1 = dtls_clsf_cd1;
	}

	public void setDtls_clsf_cd2(String dtls_clsf_cd2){
		this.dtls_clsf_cd2 = dtls_clsf_cd2;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setJob_clsf_cd(String job_clsf_cd){
		this.job_clsf_cd = job_clsf_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDtls_clsf_cd1(){
		return this.dtls_clsf_cd1;
	}

	public String getDtls_clsf_cd2(){
		return this.dtls_clsf_cd2;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getJob_clsf_cd(){
		return this.job_clsf_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_BUDG_2011_L(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_BUDG_2011_LDM dm = (MC_BUDG_2011_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.dtls_clsf_cd1);
		cstmt.setString(5, dm.dtls_clsf_cd2);
		cstmt.setString(6, dm.yymm);
		cstmt.setString(7, dm.medi_cd);
		cstmt.setString(8, dm.job_clsf_cd);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.budg.ds.MC_BUDG_2011_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("dtls_clsf_cd1 = [" + getDtls_clsf_cd1() + "]");
		System.out.println("dtls_clsf_cd2 = [" + getDtls_clsf_cd2() + "]");
		System.out.println("yymm = [" + getYymm() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("job_clsf_cd = [" + getJob_clsf_cd() + "]");
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
String dtls_clsf_cd1 = req.getParameter("dtls_clsf_cd1");
if( dtls_clsf_cd1 == null){
	System.out.println(this.toString+" : dtls_clsf_cd1 is null" );
}else{
	System.out.println(this.toString+" : dtls_clsf_cd1 is "+dtls_clsf_cd1 );
}
String dtls_clsf_cd2 = req.getParameter("dtls_clsf_cd2");
if( dtls_clsf_cd2 == null){
	System.out.println(this.toString+" : dtls_clsf_cd2 is null" );
}else{
	System.out.println(this.toString+" : dtls_clsf_cd2 is "+dtls_clsf_cd2 );
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
String job_clsf_cd = req.getParameter("job_clsf_cd");
if( job_clsf_cd == null){
	System.out.println(this.toString+" : job_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : job_clsf_cd is "+job_clsf_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String dtls_clsf_cd1 = Util.checkString(req.getParameter("dtls_clsf_cd1"));
String dtls_clsf_cd2 = Util.checkString(req.getParameter("dtls_clsf_cd2"));
String yymm = Util.checkString(req.getParameter("yymm"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String job_clsf_cd = Util.checkString(req.getParameter("job_clsf_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dtls_clsf_cd1 = Util.Uni2Ksc(Util.checkString(req.getParameter("dtls_clsf_cd1")));
String dtls_clsf_cd2 = Util.Uni2Ksc(Util.checkString(req.getParameter("dtls_clsf_cd2")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String job_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("job_clsf_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDtls_clsf_cd1(dtls_clsf_cd1);
dm.setDtls_clsf_cd2(dtls_clsf_cd2);
dm.setYymm(yymm);
dm.setMedi_cd(medi_cd);
dm.setJob_clsf_cd(job_clsf_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 15 17:46:46 KST 2009 */