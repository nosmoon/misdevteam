

package chosun.ciis.hd.tmpl.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.tmpl.ds.*;
import chosun.ciis.hd.tmpl.rec.*;

/**
 * 
 */


public class HD_TMPL_1001_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String excel_gbn;

	public HD_TMPL_1001_LDM(){}
	public HD_TMPL_1001_LDM(String cmpy_cd, String excel_gbn){
		this.cmpy_cd = cmpy_cd;
		this.excel_gbn = excel_gbn;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setExcel_gbn(String excel_gbn){
		this.excel_gbn = excel_gbn;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getExcel_gbn(){
		return this.excel_gbn;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_TMPL_1001_L(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_TMPL_1001_LDM dm = (HD_TMPL_1001_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.excel_gbn);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new HD_TMPL_1001_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("excel_gbn = [" + getExcel_gbn() + "]");
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
String excel_gbn = req.getParameter("excel_gbn");
if( excel_gbn == null){
	System.out.println(this.toString+" : excel_gbn is null" );
}else{
	System.out.println(this.toString+" : excel_gbn is "+excel_gbn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String excel_gbn = Util.checkString(req.getParameter("excel_gbn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String excel_gbn = Util.Uni2Ksc(Util.checkString(req.getParameter("excel_gbn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setExcel_gbn(excel_gbn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Aug 16 10:47:49 KST 2010 */