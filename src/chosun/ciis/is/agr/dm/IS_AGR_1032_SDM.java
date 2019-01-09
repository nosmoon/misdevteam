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


package chosun.ciis.is.agr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.agr.ds.*;
import chosun.ciis.is.agr.rec.*;

/**
 * 
 */


public class IS_AGR_1032_SDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String std_cd;
	public String uprc_clsf;

	public IS_AGR_1032_SDM(){}
	public IS_AGR_1032_SDM(String cmpy_cd, String std_cd, String uprc_clsf){
		this.cmpy_cd = cmpy_cd;
		this.std_cd = std_cd;
		this.uprc_clsf = uprc_clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setStd_cd(String std_cd){
		this.std_cd = std_cd;
	}

	public void setUprc_clsf(String uprc_clsf){
		this.uprc_clsf = uprc_clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getStd_cd(){
		return this.std_cd;
	}

	public String getUprc_clsf(){
		return this.uprc_clsf;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_AGR_1032_S(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_AGR_1032_SDM dm = (IS_AGR_1032_SDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.std_cd);
		cstmt.setString(5, dm.uprc_clsf);
		cstmt.registerOutParameter(6, Types.INTEGER);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.agr.ds.IS_AGR_1032_SDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("std_cd = [" + getStd_cd() + "]");
		System.out.println("uprc_clsf = [" + getUprc_clsf() + "]");
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
String std_cd = req.getParameter("std_cd");
if( std_cd == null){
	System.out.println(this.toString+" : std_cd is null" );
}else{
	System.out.println(this.toString+" : std_cd is "+std_cd );
}
String uprc_clsf = req.getParameter("uprc_clsf");
if( uprc_clsf == null){
	System.out.println(this.toString+" : uprc_clsf is null" );
}else{
	System.out.println(this.toString+" : uprc_clsf is "+uprc_clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String std_cd = Util.checkString(req.getParameter("std_cd"));
String uprc_clsf = Util.checkString(req.getParameter("uprc_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String std_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("std_cd")));
String uprc_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("uprc_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setStd_cd(std_cd);
dm.setUprc_clsf(uprc_clsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 04 13:34:37 KST 2012 */