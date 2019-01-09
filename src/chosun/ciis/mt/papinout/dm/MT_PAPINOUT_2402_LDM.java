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


package chosun.ciis.mt.papinout.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.papinout.ds.*;
import chosun.ciis.mt.papinout.rec.*;

/**
 * 
 */


public class MT_PAPINOUT_2402_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String magam_yy;
	public String magam_mm;

	public MT_PAPINOUT_2402_LDM(){}
	public MT_PAPINOUT_2402_LDM(String cmpy_cd, String magam_yy, String magam_mm){
		this.cmpy_cd = cmpy_cd;
		this.magam_yy = magam_yy;
		this.magam_mm = magam_mm;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMagam_yy(String magam_yy){
		this.magam_yy = magam_yy;
	}

	public void setMagam_mm(String magam_mm){
		this.magam_mm = magam_mm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMagam_yy(){
		return this.magam_yy;
	}

	public String getMagam_mm(){
		return this.magam_mm;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_PAPINOUT_2402_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_PAPINOUT_2402_LDM dm = (MT_PAPINOUT_2402_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.magam_yy);
		cstmt.setString(5, dm.magam_mm);
		cstmt.registerOutParameter(6, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.papinout.ds.MT_PAPINOUT_2402_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("magam_yy = [" + getMagam_yy() + "]");
		System.out.println("magam_mm = [" + getMagam_mm() + "]");
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
String magam_yy = req.getParameter("magam_yy");
if( magam_yy == null){
	System.out.println(this.toString+" : magam_yy is null" );
}else{
	System.out.println(this.toString+" : magam_yy is "+magam_yy );
}
String magam_mm = req.getParameter("magam_mm");
if( magam_mm == null){
	System.out.println(this.toString+" : magam_mm is null" );
}else{
	System.out.println(this.toString+" : magam_mm is "+magam_mm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String magam_yy = Util.checkString(req.getParameter("magam_yy"));
String magam_mm = Util.checkString(req.getParameter("magam_mm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String magam_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("magam_yy")));
String magam_mm = Util.Uni2Ksc(Util.checkString(req.getParameter("magam_mm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMagam_yy(magam_yy);
dm.setMagam_mm(magam_mm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 24 09:27:24 KST 2009 */