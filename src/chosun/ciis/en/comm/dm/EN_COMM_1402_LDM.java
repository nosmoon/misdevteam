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


package chosun.ciis.en.comm.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.en.comm.ds.*;
import chosun.ciis.en.comm.rec.*;

/**
 * 
 */


public class EN_COMM_1402_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String rcpm_clsf;
	public String rcpm_shet_no_fr;
	public String rcpm_shet_no_to;

	public EN_COMM_1402_LDM(){}
	public EN_COMM_1402_LDM(String cmpy_cd, String rcpm_clsf, String rcpm_shet_no_fr, String rcpm_shet_no_to){
		this.cmpy_cd = cmpy_cd;
		this.rcpm_clsf = rcpm_clsf;
		this.rcpm_shet_no_fr = rcpm_shet_no_fr;
		this.rcpm_shet_no_to = rcpm_shet_no_to;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setRcpm_clsf(String rcpm_clsf){
		this.rcpm_clsf = rcpm_clsf;
	}

	public void setRcpm_shet_no_fr(String rcpm_shet_no_fr){
		this.rcpm_shet_no_fr = rcpm_shet_no_fr;
	}

	public void setRcpm_shet_no_to(String rcpm_shet_no_to){
		this.rcpm_shet_no_to = rcpm_shet_no_to;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getRcpm_clsf(){
		return this.rcpm_clsf;
	}

	public String getRcpm_shet_no_fr(){
		return this.rcpm_shet_no_fr;
	}

	public String getRcpm_shet_no_to(){
		return this.rcpm_shet_no_to;
	}

	public String getSQL(){
		 return "{ call MISENP.SP_EN_COMM_1402_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		EN_COMM_1402_LDM dm = (EN_COMM_1402_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.rcpm_clsf);
		cstmt.setString(5, dm.rcpm_shet_no_fr);
		cstmt.setString(6, dm.rcpm_shet_no_to);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.en.comm.ds.EN_COMM_1402_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("rcpm_clsf = [" + getRcpm_clsf() + "]");
		System.out.println("rcpm_shet_no_fr = [" + getRcpm_shet_no_fr() + "]");
		System.out.println("rcpm_shet_no_to = [" + getRcpm_shet_no_to() + "]");
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
String rcpm_clsf = req.getParameter("rcpm_clsf");
if( rcpm_clsf == null){
	System.out.println(this.toString+" : rcpm_clsf is null" );
}else{
	System.out.println(this.toString+" : rcpm_clsf is "+rcpm_clsf );
}
String rcpm_shet_no_fr = req.getParameter("rcpm_shet_no_fr");
if( rcpm_shet_no_fr == null){
	System.out.println(this.toString+" : rcpm_shet_no_fr is null" );
}else{
	System.out.println(this.toString+" : rcpm_shet_no_fr is "+rcpm_shet_no_fr );
}
String rcpm_shet_no_to = req.getParameter("rcpm_shet_no_to");
if( rcpm_shet_no_to == null){
	System.out.println(this.toString+" : rcpm_shet_no_to is null" );
}else{
	System.out.println(this.toString+" : rcpm_shet_no_to is "+rcpm_shet_no_to );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String rcpm_clsf = Util.checkString(req.getParameter("rcpm_clsf"));
String rcpm_shet_no_fr = Util.checkString(req.getParameter("rcpm_shet_no_fr"));
String rcpm_shet_no_to = Util.checkString(req.getParameter("rcpm_shet_no_to"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String rcpm_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_clsf")));
String rcpm_shet_no_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_shet_no_fr")));
String rcpm_shet_no_to = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_shet_no_to")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setRcpm_clsf(rcpm_clsf);
dm.setRcpm_shet_no_fr(rcpm_shet_no_fr);
dm.setRcpm_shet_no_to(rcpm_shet_no_to);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 15 13:58:54 KST 2009 */