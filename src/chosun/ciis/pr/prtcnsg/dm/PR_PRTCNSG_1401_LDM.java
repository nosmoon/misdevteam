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


package chosun.ciis.pr.prtcnsg.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pr.prtcnsg.ds.*;
import chosun.ciis.pr.prtcnsg.rec.*;

/**
 * 
 */


public class PR_PRTCNSG_1401_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String medi_cd;
	public String vat;
	public String issu_dt_yyyy;
	public String issu_dt_mm;

	public PR_PRTCNSG_1401_LDM(){}
	public PR_PRTCNSG_1401_LDM(String cmpy_cd, String medi_cd, String vat, String issu_dt_yyyy, String issu_dt_mm){
		this.cmpy_cd = cmpy_cd;
		this.medi_cd = medi_cd;
		this.vat = vat;
		this.issu_dt_yyyy = issu_dt_yyyy;
		this.issu_dt_mm = issu_dt_mm;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setVat(String vat){
		this.vat = vat;
	}

	public void setIssu_dt_yyyy(String issu_dt_yyyy){
		this.issu_dt_yyyy = issu_dt_yyyy;
	}

	public void setIssu_dt_mm(String issu_dt_mm){
		this.issu_dt_mm = issu_dt_mm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getVat(){
		return this.vat;
	}

	public String getIssu_dt_yyyy(){
		return this.issu_dt_yyyy;
	}

	public String getIssu_dt_mm(){
		return this.issu_dt_mm;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_PR_PRTCNSG_1401_L(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PR_PRTCNSG_1401_LDM dm = (PR_PRTCNSG_1401_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.medi_cd);
		cstmt.setString(5, dm.vat);
		cstmt.setString(6, dm.issu_dt_yyyy);
		cstmt.setString(7, dm.issu_dt_mm);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pr.prtcnsg.ds.PR_PRTCNSG_1401_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("vat = [" + getVat() + "]");
		System.out.println("issu_dt_yyyy = [" + getIssu_dt_yyyy() + "]");
		System.out.println("issu_dt_mm = [" + getIssu_dt_mm() + "]");
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
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String vat = req.getParameter("vat");
if( vat == null){
	System.out.println(this.toString+" : vat is null" );
}else{
	System.out.println(this.toString+" : vat is "+vat );
}
String issu_dt_yyyy = req.getParameter("issu_dt_yyyy");
if( issu_dt_yyyy == null){
	System.out.println(this.toString+" : issu_dt_yyyy is null" );
}else{
	System.out.println(this.toString+" : issu_dt_yyyy is "+issu_dt_yyyy );
}
String issu_dt_mm = req.getParameter("issu_dt_mm");
if( issu_dt_mm == null){
	System.out.println(this.toString+" : issu_dt_mm is null" );
}else{
	System.out.println(this.toString+" : issu_dt_mm is "+issu_dt_mm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String vat = Util.checkString(req.getParameter("vat"));
String issu_dt_yyyy = Util.checkString(req.getParameter("issu_dt_yyyy"));
String issu_dt_mm = Util.checkString(req.getParameter("issu_dt_mm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String vat = Util.Uni2Ksc(Util.checkString(req.getParameter("vat")));
String issu_dt_yyyy = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt_yyyy")));
String issu_dt_mm = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt_mm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMedi_cd(medi_cd);
dm.setVat(vat);
dm.setIssu_dt_yyyy(issu_dt_yyyy);
dm.setIssu_dt_mm(issu_dt_mm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jul 14 19:45:44 KST 2009 */