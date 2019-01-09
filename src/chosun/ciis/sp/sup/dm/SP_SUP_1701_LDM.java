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


package chosun.ciis.sp.sup.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.sp.sup.ds.*;
import chosun.ciis.sp.sup.rec.*;

/**
 * 
 */


public class SP_SUP_1701_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String dlco_nm;
	public String ern;
	public String dlco_no_fr;
	public String dlco_no_to;

	public SP_SUP_1701_LDM(){}
	public SP_SUP_1701_LDM(String cmpy_cd, String dlco_nm, String ern, String dlco_no_fr, String dlco_no_to){
		this.cmpy_cd = cmpy_cd;
		this.dlco_nm = dlco_nm;
		this.ern = ern;
		this.dlco_no_fr = dlco_no_fr;
		this.dlco_no_to = dlco_no_to;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setDlco_no_fr(String dlco_no_fr){
		this.dlco_no_fr = dlco_no_fr;
	}

	public void setDlco_no_to(String dlco_no_to){
		this.dlco_no_to = dlco_no_to;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getErn(){
		return this.ern;
	}

	public String getDlco_no_fr(){
		return this.dlco_no_fr;
	}

	public String getDlco_no_to(){
		return this.dlco_no_to;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_SP_SUP_1701_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SP_SUP_1701_LDM dm = (SP_SUP_1701_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.dlco_nm);
		cstmt.setString(5, dm.ern);
		cstmt.setString(6, dm.dlco_no_fr);
		cstmt.setString(7, dm.dlco_no_to);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.sp.sup.ds.SP_SUP_1701_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("dlco_nm = [" + getDlco_nm() + "]");
		System.out.println("ern = [" + getErn() + "]");
		System.out.println("dlco_no_fr = [" + getDlco_no_fr() + "]");
		System.out.println("dlco_no_to = [" + getDlco_no_to() + "]");
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
String dlco_nm = req.getParameter("dlco_nm");
if( dlco_nm == null){
	System.out.println(this.toString+" : dlco_nm is null" );
}else{
	System.out.println(this.toString+" : dlco_nm is "+dlco_nm );
}
String ern = req.getParameter("ern");
if( ern == null){
	System.out.println(this.toString+" : ern is null" );
}else{
	System.out.println(this.toString+" : ern is "+ern );
}
String dlco_no_fr = req.getParameter("dlco_no_fr");
if( dlco_no_fr == null){
	System.out.println(this.toString+" : dlco_no_fr is null" );
}else{
	System.out.println(this.toString+" : dlco_no_fr is "+dlco_no_fr );
}
String dlco_no_to = req.getParameter("dlco_no_to");
if( dlco_no_to == null){
	System.out.println(this.toString+" : dlco_no_to is null" );
}else{
	System.out.println(this.toString+" : dlco_no_to is "+dlco_no_to );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
String ern = Util.checkString(req.getParameter("ern"));
String dlco_no_fr = Util.checkString(req.getParameter("dlco_no_fr"));
String dlco_no_to = Util.checkString(req.getParameter("dlco_no_to"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dlco_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_nm")));
String ern = Util.Uni2Ksc(Util.checkString(req.getParameter("ern")));
String dlco_no_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no_fr")));
String dlco_no_to = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no_to")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDlco_nm(dlco_nm);
dm.setErn(ern);
dm.setDlco_no_fr(dlco_no_fr);
dm.setDlco_no_to(dlco_no_to);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Aug 21 20:29:56 KST 2012 */