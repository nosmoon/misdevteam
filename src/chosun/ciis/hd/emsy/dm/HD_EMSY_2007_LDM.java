

package chosun.ciis.hd.emsy.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.emsy.ds.*;
import chosun.ciis.hd.emsy.rec.*;

/**
 * 
 */


public class HD_EMSY_2007_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String saly_yy;
	public String saly_no;
	public String suc_yn;

	public HD_EMSY_2007_LDM(){}
	public HD_EMSY_2007_LDM(String cmpy_cd, String saly_yy, String saly_no, String suc_yn){
		this.cmpy_cd = cmpy_cd;
		this.saly_yy = saly_yy;
		this.saly_no = saly_no;
		this.suc_yn = suc_yn;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSaly_yy(String saly_yy){
		this.saly_yy = saly_yy;
	}

	public void setSaly_no(String saly_no){
		this.saly_no = saly_no;
	}

	public void setSuc_yn(String suc_yn){
		this.suc_yn = suc_yn;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSaly_yy(){
		return this.saly_yy;
	}

	public String getSaly_no(){
		return this.saly_no;
	}

	public String getSuc_yn(){
		return this.suc_yn;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_EMSY_2007_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_EMSY_2007_LDM dm = (HD_EMSY_2007_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.saly_yy);
		cstmt.setString(5, dm.saly_no);
		cstmt.setString(6, dm.suc_yn);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new HD_EMSY_2007_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("saly_yy = [" + getSaly_yy() + "]");
		System.out.println("saly_no = [" + getSaly_no() + "]");
		System.out.println("suc_yn = [" + getSuc_yn() + "]");
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
String saly_yy = req.getParameter("saly_yy");
if( saly_yy == null){
	System.out.println(this.toString+" : saly_yy is null" );
}else{
	System.out.println(this.toString+" : saly_yy is "+saly_yy );
}
String saly_no = req.getParameter("saly_no");
if( saly_no == null){
	System.out.println(this.toString+" : saly_no is null" );
}else{
	System.out.println(this.toString+" : saly_no is "+saly_no );
}
String suc_yn = req.getParameter("suc_yn");
if( suc_yn == null){
	System.out.println(this.toString+" : suc_yn is null" );
}else{
	System.out.println(this.toString+" : suc_yn is "+suc_yn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String saly_yy = Util.checkString(req.getParameter("saly_yy"));
String saly_no = Util.checkString(req.getParameter("saly_no"));
String suc_yn = Util.checkString(req.getParameter("suc_yn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String saly_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("saly_yy")));
String saly_no = Util.Uni2Ksc(Util.checkString(req.getParameter("saly_no")));
String suc_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("suc_yn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSaly_yy(saly_yy);
dm.setSaly_no(saly_no);
dm.setSuc_yn(suc_yn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Oct 22 15:28:28 KST 2010 */