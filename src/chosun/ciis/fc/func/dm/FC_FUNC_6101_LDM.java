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


package chosun.ciis.fc.func.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.ds.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_6101_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String in_cymd;
	public String deps_isav_clsf_cd;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String order_string;

	public FC_FUNC_6101_LDM(){}
	public FC_FUNC_6101_LDM(String cmpy_cd, String in_cymd, String deps_isav_clsf_cd, String dlco_clsf_cd, String dlco_cd, String order_string){
		this.cmpy_cd = cmpy_cd;
		this.in_cymd = in_cymd;
		this.deps_isav_clsf_cd = deps_isav_clsf_cd;
		this.dlco_clsf_cd = dlco_clsf_cd;
		this.dlco_cd = dlco_cd;
		this.order_string = order_string;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIn_cymd(String in_cymd){
		this.in_cymd = in_cymd;
	}

	public void setDeps_isav_clsf_cd(String deps_isav_clsf_cd){
		this.deps_isav_clsf_cd = deps_isav_clsf_cd;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setOrder_string(String order_string){
		this.order_string = order_string;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIn_cymd(){
		return this.in_cymd;
	}

	public String getDeps_isav_clsf_cd(){
		return this.deps_isav_clsf_cd;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getOrder_string(){
		return this.order_string;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_6101_L(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_6101_LDM dm = (FC_FUNC_6101_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.in_cymd);
		cstmt.setString(5, dm.deps_isav_clsf_cd);
		cstmt.setString(6, dm.dlco_clsf_cd);
		cstmt.setString(7, dm.dlco_cd);
		cstmt.setString(8, dm.order_string);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_6101_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("in_cymd = " + getIn_cymd());
        System.out.println("deps_isav_clsf_cd = " + getDeps_isav_clsf_cd());
        System.out.println("dlco_clsf_cd = " + getDlco_clsf_cd());
        System.out.println("dlco_cd = " + getDlco_cd());
        System.out.println("order_string = " + getOrder_string());
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
String in_cymd = req.getParameter("in_cymd");
if( in_cymd == null){
	System.out.println(this.toString+" : in_cymd is null" );
}else{
	System.out.println(this.toString+" : in_cymd is "+in_cymd );
}
String deps_isav_clsf_cd = req.getParameter("deps_isav_clsf_cd");
if( deps_isav_clsf_cd == null){
	System.out.println(this.toString+" : deps_isav_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : deps_isav_clsf_cd is "+deps_isav_clsf_cd );
}
String dlco_clsf_cd = req.getParameter("dlco_clsf_cd");
if( dlco_clsf_cd == null){
	System.out.println(this.toString+" : dlco_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf_cd is "+dlco_clsf_cd );
}
String dlco_cd = req.getParameter("dlco_cd");
if( dlco_cd == null){
	System.out.println(this.toString+" : dlco_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_cd is "+dlco_cd );
}
String order_string = req.getParameter("order_string");
if( order_string == null){
	System.out.println(this.toString+" : order_string is null" );
}else{
	System.out.println(this.toString+" : order_string is "+order_string );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String in_cymd = Util.checkString(req.getParameter("in_cymd"));
String deps_isav_clsf_cd = Util.checkString(req.getParameter("deps_isav_clsf_cd"));
String dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
String order_string = Util.checkString(req.getParameter("order_string"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String in_cymd = Util.Uni2Ksc(Util.checkString(req.getParameter("in_cymd")));
String deps_isav_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_isav_clsf_cd")));
String dlco_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
String order_string = Util.Uni2Ksc(Util.checkString(req.getParameter("order_string")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIn_cymd(in_cymd);
dm.setDeps_isav_clsf_cd(deps_isav_clsf_cd);
dm.setDlco_clsf_cd(dlco_clsf_cd);
dm.setDlco_cd(dlco_cd);
dm.setOrder_string(order_string);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 04 12:03:51 KST 2009 */