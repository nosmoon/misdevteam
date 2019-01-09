

package chosun.ciis.hd.saly.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.saly.ds.*;
import chosun.ciis.hd.saly.rec.*;

/**
 * 
 */


public class HD_SALY_1351_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String rfl_saly_yy;
	public String rfl_saly_no;

	public HD_SALY_1351_LDM(){}
	public HD_SALY_1351_LDM(String cmpy_cd, String rfl_saly_yy, String rfl_saly_no){
		this.cmpy_cd = cmpy_cd;
		this.rfl_saly_yy = rfl_saly_yy;
		this.rfl_saly_no = rfl_saly_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setRfl_saly_yy(String rfl_saly_yy){
		this.rfl_saly_yy = rfl_saly_yy;
	}

	public void setRfl_saly_no(String rfl_saly_no){
		this.rfl_saly_no = rfl_saly_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getRfl_saly_yy(){
		return this.rfl_saly_yy;
	}

	public String getRfl_saly_no(){
		return this.rfl_saly_no;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_SALY_1351_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_SALY_1351_LDM dm = (HD_SALY_1351_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.rfl_saly_yy);
		cstmt.setString(5, dm.rfl_saly_no);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new HD_SALY_1351_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("rfl_saly_yy = [" + getRfl_saly_yy() + "]");
		System.out.println("rfl_saly_no = [" + getRfl_saly_no() + "]");
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
String rfl_saly_yy = req.getParameter("rfl_saly_yy");
if( rfl_saly_yy == null){
	System.out.println(this.toString+" : rfl_saly_yy is null" );
}else{
	System.out.println(this.toString+" : rfl_saly_yy is "+rfl_saly_yy );
}
String rfl_saly_no = req.getParameter("rfl_saly_no");
if( rfl_saly_no == null){
	System.out.println(this.toString+" : rfl_saly_no is null" );
}else{
	System.out.println(this.toString+" : rfl_saly_no is "+rfl_saly_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String rfl_saly_yy = Util.checkString(req.getParameter("rfl_saly_yy"));
String rfl_saly_no = Util.checkString(req.getParameter("rfl_saly_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String rfl_saly_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("rfl_saly_yy")));
String rfl_saly_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rfl_saly_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setRfl_saly_yy(rfl_saly_yy);
dm.setRfl_saly_no(rfl_saly_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 04 10:30:37 KST 2011 */