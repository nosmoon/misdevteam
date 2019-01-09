/***************************************************************************************************
* 파일명 : .java
* 기능 :  거래처조회
* 작성일자 : 2010-01-22
* 작성자 : 노상현
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.fc.acct.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.ds.*;
import chosun.ciis.fc.acct.rec.*;

/**
 *  거래처조회
 */


public class FC_ACCT_1181_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String clsf_cd;
	public String cd_f;
	public String cd_t;
	public String cd_abrv_nm;

	public FC_ACCT_1181_LDM(){}
	public FC_ACCT_1181_LDM(String cmpy_cd, String clsf_cd, String cd_f, String cd_t, String cd_abrv_nm){
		this.cmpy_cd = cmpy_cd;
		this.clsf_cd = clsf_cd;
		this.cd_f = cd_f;
		this.cd_t = cd_t;
		this.cd_abrv_nm = cd_abrv_nm;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setClsf_cd(String clsf_cd){
		this.clsf_cd = clsf_cd;
	}

	public void setCd_f(String cd_f){
		this.cd_f = cd_f;
	}

	public void setCd_t(String cd_t){
		this.cd_t = cd_t;
	}

	public void setCd_abrv_nm(String cd_abrv_nm){
		this.cd_abrv_nm = cd_abrv_nm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getClsf_cd(){
		return this.clsf_cd;
	}

	public String getCd_f(){
		return this.cd_f;
	}

	public String getCd_t(){
		return this.cd_t;
	}

	public String getCd_abrv_nm(){
		return this.cd_abrv_nm;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_1181_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_1181_LDM dm = (FC_ACCT_1181_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.clsf_cd);
		cstmt.setString(5, dm.cd_f);
		cstmt.setString(6, dm.cd_t);
		cstmt.setString(7, dm.cd_abrv_nm);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_1181_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("clsf_cd = [" + getClsf_cd() + "]");
		System.out.println("cd_f = [" + getCd_f() + "]");
		System.out.println("cd_t = [" + getCd_t() + "]");
		System.out.println("cd_abrv_nm = [" + getCd_abrv_nm() + "]");
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
String clsf_cd = req.getParameter("clsf_cd");
if( clsf_cd == null){
	System.out.println(this.toString+" : clsf_cd is null" );
}else{
	System.out.println(this.toString+" : clsf_cd is "+clsf_cd );
}
String cd_f = req.getParameter("cd_f");
if( cd_f == null){
	System.out.println(this.toString+" : cd_f is null" );
}else{
	System.out.println(this.toString+" : cd_f is "+cd_f );
}
String cd_t = req.getParameter("cd_t");
if( cd_t == null){
	System.out.println(this.toString+" : cd_t is null" );
}else{
	System.out.println(this.toString+" : cd_t is "+cd_t );
}
String cd_abrv_nm = req.getParameter("cd_abrv_nm");
if( cd_abrv_nm == null){
	System.out.println(this.toString+" : cd_abrv_nm is null" );
}else{
	System.out.println(this.toString+" : cd_abrv_nm is "+cd_abrv_nm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String clsf_cd = Util.checkString(req.getParameter("clsf_cd"));
String cd_f = Util.checkString(req.getParameter("cd_f"));
String cd_t = Util.checkString(req.getParameter("cd_t"));
String cd_abrv_nm = Util.checkString(req.getParameter("cd_abrv_nm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("clsf_cd")));
String cd_f = Util.Uni2Ksc(Util.checkString(req.getParameter("cd_f")));
String cd_t = Util.Uni2Ksc(Util.checkString(req.getParameter("cd_t")));
String cd_abrv_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("cd_abrv_nm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setClsf_cd(clsf_cd);
dm.setCd_f(cd_f);
dm.setCd_t(cd_t);
dm.setCd_abrv_nm(cd_abrv_nm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jan 22 17:26:11 KST 2010 */