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


package chosun.ciis.pr.prtexec.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pr.prtexec.ds.*;
import chosun.ciis.pr.prtexec.rec.*;

/**
 * 
 */


public class PR_PRTEXEC_6000_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String aply_strt_yymm;
	public String cmpy_cd;
	public String medi_clsf;

	public PR_PRTEXEC_6000_LDM(){}
	public PR_PRTEXEC_6000_LDM(String aply_strt_yymm, String cmpy_cd, String medi_clsf){
		this.aply_strt_yymm = aply_strt_yymm;
		this.cmpy_cd = cmpy_cd;
		this.medi_clsf = medi_clsf;
	}

	public void setAply_strt_yymm(String aply_strt_yymm){
		this.aply_strt_yymm = aply_strt_yymm;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMedi_clsf(String medi_clsf){
		this.medi_clsf = medi_clsf;
	}

	public String getAply_strt_yymm(){
		return this.aply_strt_yymm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMedi_clsf(){
		return this.medi_clsf;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_PR_PRTEXEC_6000_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PR_PRTEXEC_6000_LDM dm = (PR_PRTEXEC_6000_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.aply_strt_yymm);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.medi_clsf);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pr.prtexec.ds.PR_PRTEXEC_6000_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("aply_strt_yymm = [" + getAply_strt_yymm() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("medi_clsf = [" + getMedi_clsf() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String aply_strt_yymm = req.getParameter("aply_strt_yymm");
if( aply_strt_yymm == null){
	System.out.println(this.toString+" : aply_strt_yymm is null" );
}else{
	System.out.println(this.toString+" : aply_strt_yymm is "+aply_strt_yymm );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String medi_clsf = req.getParameter("medi_clsf");
if( medi_clsf == null){
	System.out.println(this.toString+" : medi_clsf is null" );
}else{
	System.out.println(this.toString+" : medi_clsf is "+medi_clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String aply_strt_yymm = Util.checkString(req.getParameter("aply_strt_yymm"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String medi_clsf = Util.checkString(req.getParameter("medi_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String aply_strt_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_strt_yymm")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String medi_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setAply_strt_yymm(aply_strt_yymm);
dm.setCmpy_cd(cmpy_cd);
dm.setMedi_clsf(medi_clsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 30 14:56:35 KST 2009 */