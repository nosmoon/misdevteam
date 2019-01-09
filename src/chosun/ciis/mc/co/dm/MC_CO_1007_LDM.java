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


public class MC_CO_1007_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String cd;
	public String cdnm;
	public String evnt_clsf_cd;

	public MC_CO_1007_LDM(){}
	public MC_CO_1007_LDM(String cmpy_cd, String cd, String cdnm, String evnt_clsf_cd){
		this.cmpy_cd = cmpy_cd;
		this.cd = cd;
		this.cdnm = cdnm;
		this.evnt_clsf_cd = evnt_clsf_cd;
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

	public void setEvnt_clsf_cd(String evnt_clsf_cd){
		this.evnt_clsf_cd = evnt_clsf_cd;
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

	public String getEvnt_clsf_cd(){
		return this.evnt_clsf_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_CO_1007_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_CO_1007_LDM dm = (MC_CO_1007_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.cd);
		cstmt.setString(5, dm.cdnm);
		cstmt.setString(6, dm.evnt_clsf_cd);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.co.ds.MC_CO_1007_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("cd = [" + getCd() + "]");
		System.out.println("cdnm = [" + getCdnm() + "]");
		System.out.println("evnt_clsf_cd = [" + getEvnt_clsf_cd() + "]");
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
String evnt_clsf_cd = req.getParameter("evnt_clsf_cd");
if( evnt_clsf_cd == null){
	System.out.println(this.toString+" : evnt_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : evnt_clsf_cd is "+evnt_clsf_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String cd = Util.checkString(req.getParameter("cd"));
String cdnm = Util.checkString(req.getParameter("cdnm"));
String evnt_clsf_cd = Util.checkString(req.getParameter("evnt_clsf_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cd")));
String cdnm = Util.Uni2Ksc(Util.checkString(req.getParameter("cdnm")));
String evnt_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_clsf_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setCd(cd);
dm.setCdnm(cdnm);
dm.setEvnt_clsf_cd(evnt_clsf_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 21 13:40:10 KST 2009 */