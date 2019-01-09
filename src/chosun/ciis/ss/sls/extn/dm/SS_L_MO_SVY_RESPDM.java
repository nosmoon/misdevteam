/***************************************************************************************************
* 파일명 : SS_L_MO_SVY_RESPDM.java
* 기능 :  문자점검독자관리 설문에 해당하는 독자의 응답리스트를 보여준다.
* 작성일자 : 2015.12.07
* 작성자 : 장선희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 
 */


public class SS_L_MO_SVY_RESPDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String svyid;
	public String rdr_no;
	public String campid;
	public String camptype;

	public SS_L_MO_SVY_RESPDM(){}
	public SS_L_MO_SVY_RESPDM(String svyid, String rdr_no, String campid, String camptype){
		this.svyid = svyid;
		this.rdr_no = rdr_no;
		this.campid = campid;
		this.camptype = camptype;
	}

	public void setSvyid(String svyid){
		this.svyid = svyid;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setCampid(String campid){
		this.campid = campid;
	}

	public void setCamptype(String camptype){
		this.camptype = camptype;
	}

	public String getSvyid(){
		return this.svyid;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getCampid(){
		return this.campid;
	}

	public String getCamptype(){
		return this.camptype;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_MO_SVY_RESP( ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_MO_SVY_RESPDM dm = (SS_L_MO_SVY_RESPDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.svyid);
		cstmt.setString(4, dm.rdr_no);
		cstmt.setString(5, dm.campid);
		cstmt.setString(6, dm.camptype);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_L_MO_SVY_RESPDataSet();
	}



    public void print(){
        System.out.println("svyid = " + getSvyid());
        System.out.println("rdr_no = " + getRdr_no());
        System.out.println("campid = " + getCampid());
        System.out.println("camptype = " + getCamptype());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String svyid = req.getParameter("svyid");
if( svyid == null){
	System.out.println(this.toString+" : svyid is null" );
}else{
	System.out.println(this.toString+" : svyid is "+svyid );
}
String rdr_no = req.getParameter("rdr_no");
if( rdr_no == null){
	System.out.println(this.toString+" : rdr_no is null" );
}else{
	System.out.println(this.toString+" : rdr_no is "+rdr_no );
}
String campid = req.getParameter("campid");
if( campid == null){
	System.out.println(this.toString+" : campid is null" );
}else{
	System.out.println(this.toString+" : campid is "+campid );
}
String camptype = req.getParameter("camptype");
if( camptype == null){
	System.out.println(this.toString+" : camptype is null" );
}else{
	System.out.println(this.toString+" : camptype is "+camptype );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String svyid = Util.checkString(req.getParameter("svyid"));
String rdr_no = Util.checkString(req.getParameter("rdr_no"));
String campid = Util.checkString(req.getParameter("campid"));
String camptype = Util.checkString(req.getParameter("camptype"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String svyid = Util.Uni2Ksc(Util.checkString(req.getParameter("svyid")));
String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
String campid = Util.Uni2Ksc(Util.checkString(req.getParameter("campid")));
String camptype = Util.Uni2Ksc(Util.checkString(req.getParameter("camptype")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setSvyid(svyid);
dm.setRdr_no(rdr_no);
dm.setCampid(campid);
dm.setCamptype(camptype);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Dec 07 10:23:11 KST 2015 */